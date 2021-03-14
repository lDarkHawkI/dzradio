package ru.netology;

public class Radio {
    private int currentStation;
    private final int firstStation = 0;
    private final int lastStation = 9;
    private int currentVolumeLevel;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int stationNumber) {
        if ((stationNumber > lastStation) || (stationNumber < firstStation)) {
            return;
        }
        currentStation = stationNumber;
    }

    public void setNextStation() {
        if (++currentStation > lastStation) {
            currentStation = firstStation;
        }
        this.currentStation = currentStation++;
    }

    public void setPreviousStation() {
        if (--currentStation < firstStation) {
            currentStation = lastStation;
        }
        this.currentStation = currentStation--;
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public void setCurrentVolumeLevel(int volumeLevel) {
        this.currentVolumeLevel = volumeLevel;
    }

    public void setVolumeUp() {
        int maxVolume = 10;
        if (currentVolumeLevel >= maxVolume) {
            return;
        }
        this.currentVolumeLevel = ++currentVolumeLevel;
    }

    public void setVolumeDown() {
        int minVolume = 0;
        if (currentVolumeLevel <= minVolume) {
            return;
        }
        this.currentVolumeLevel = --currentVolumeLevel;
    }
}