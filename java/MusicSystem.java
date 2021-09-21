public class MusicSystem {
    private String name;
    private int no_of_speakers;
    private  boolean subwoofer;
    private int lcdScreenSize;

    public MusicSystem() {
    }

    public MusicSystem(String name, int no_of_speakers, boolean subwoofer, int lcdScreenSize) {
        this.name = name;
        this.no_of_speakers = no_of_speakers;
        this.subwoofer = subwoofer;
        this.lcdScreenSize = lcdScreenSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo_of_speakers() {
        return no_of_speakers;
    }

    public void setNo_of_speakers(int no_of_speakers) {
        this.no_of_speakers = no_of_speakers;
    }

    public boolean isSubwoofer() {
        return subwoofer;
    }

    public void setSubwoofer(boolean subwoofer) {
        this.subwoofer = subwoofer;
    }

    public int getLcdScreenSize() {
        return lcdScreenSize;
    }

    public void setLcdScreenSize(int lcdScreenSize) {
        this.lcdScreenSize = lcdScreenSize;
    }
}
