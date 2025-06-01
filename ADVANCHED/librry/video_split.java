import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.IMediaWriter;
import com.xuggle.mediatool.ToolFactory;

public class VideoSplitter {

    public static void main(String[] args) {
        String inputVideo = "input_video.mp4"; // Replace with your input video file
        String outputPrefix = "output_segment"; // Output file prefix
        int numParts = 4; // Number of parts to split

        splitVideo(inputVideo, outputPrefix, numParts);
    }

    public static void splitVideo(String inputFileName, String outputPrefix, int numParts) {
        IMediaReader mediaReader = ToolFactory.makeReader(inputFileName);
        double duration = mediaReader.getContainer().getDuration() / 1000000.0;

        double partDuration = duration / numParts;
        double startTime = 0;
        double endTime = partDuration;

        int segmentNum = 1;
        while (endTime <= duration) {
            String outputFileName = outputPrefix + "_" + segmentNum + ".mp4";
            IMediaWriter mediaWriter = ToolFactory.makeWriter(outputFileName, mediaReader);
            mediaReader.addListener(mediaWriter);

            mediaWriter.open();
            mediaReader.seek(startTime * 1000000); // Convert seconds to microseconds
            while (mediaReader.readPacket() == null && mediaReader.getContainer().getElapsedTime() < endTime * 1000000) {
                // Read packet and write to the output file
            }
            mediaWriter.close();
            startTime += partDuration;
            endTime += partDuration;
            segmentNum++;
        }
        mediaReader.close();
    }
}
