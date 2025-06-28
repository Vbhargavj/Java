import javax.sound.sampled.*;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Scanner;

class BassBoostedMusicEditor {

    public static void playMusicWithBass(String filePath) {
        try {
            File file = new File(filePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);

            AudioFormat audioFormat = audioInputStream.getFormat();
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            // Bass effect: reduce amplitude of lower frequencies
            float bassFactor = 0.8f; // Adjust this factor based on your preference

            byte[] audioData = new byte[(int) (audioFormat.getFrameSize() * clip.getFrameLength())];
            int bytesRead = audioInputStream.read(audioData, 0, audioData.length);

            ByteBuffer buffer = ByteBuffer.wrap(audioData).order(ByteOrder.LITTLE_ENDIAN);

            // Apply bass effect to the audio data
            for (int i = 0; i < bytesRead; i += audioFormat.getFrameSize()) {
                for (int channel = 0; channel < audioFormat.getChannels(); channel++) {
                    float sample = buffer.getShort(i + channel * 2) * bassFactor;
                    buffer.putShort(i + channel * 2, (short) sample);
                }
            }

            clip.open(audioFormat, audioData, 0, bytesRead);

            clip.start();
            clip.drain();
            clip.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path to the audio file: ");
        String filePath = scanner.nextLine();

        playMusicWithBass(filePath);

        scanner.close();
    }
}
