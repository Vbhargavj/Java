// package LEARN;

class computer {
    private String ComName;

    public String getComName() {
        return ComName;
    }

    public void setComName(String comName) {
        ComName = comName;
    }

    public void play() {
        System.out.println("I am only give music command");
    }

}

class speaker extends computer {
    private String SpeakerName;

    public String getSpeakerName() {
        return SpeakerName;
    }

    public void setSpeakerName(String speakerName) {
        SpeakerName = speakerName;
    }

    public void play() {
        System.out.println("I am only follow instruction");
    }

}

public class vbj_19_dynamic_memory_dispatch {
    computer s = new speaker();
}
