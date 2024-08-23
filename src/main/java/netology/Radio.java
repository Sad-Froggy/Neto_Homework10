package netology;

public class Radio {

    private int currentVolume;
    private int currentStation;
    private int channelAmount = 10;
    private int maxChannel = channelAmount - 1;
    private final int MAX_VOLUME = 100;
    private final int MIN_VOLUME = 0;

    public Radio() {
    }

    public Radio(int channelAmount) {
        this.channelAmount = channelAmount;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= MAX_VOLUME) {
            this.currentVolume = currentVolume;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation < channelAmount) {
            this.currentStation = currentStation;
        }
    }

    public void nextStation() {
        if (currentStation < maxChannel) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxChannel;
        }
    }

    public void increaseVolume() {
        if (currentVolume < MAX_VOLUME) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > MIN_VOLUME) {
            currentVolume--;
        }
    }
}
