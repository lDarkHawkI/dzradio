package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldGetCurrentStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation(), "Не совпадает дефолтная радиостанция!");
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        assertEquals(6, radio.getCurrentStation(), "Не совпадает текущая радиостанция!");

    }

    @Test
    public void shouldSetWrongMoreStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation(), "Не совпадает текущая радиостанция!");

    }

    @Test
    public void shouldSetWrongLessStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-10);
        assertEquals(0, radio.getCurrentStation(), "Не совпадает текущая радиостанция!");

    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.setNextStation();
        assertEquals(7, radio.getCurrentStation(), "Не совпадает текущая радиостанция после переключения на одну станцию вперед!");
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.setPreviousStation();
        assertEquals(5, radio.getCurrentStation(), "Не совпадает текущая радиостанция после переключения на одну станцию назад!");
    }

    @Test
    public void shouldSetNextStationWithMaxCurrentSt() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();
        assertEquals(0, radio.getCurrentStation(), "Не совпадает текущая радиостанция после переключения на одну станцию вперед!");
    }

    @Test
    public void shouldSetPrevStationWithMinCurrentSt() {
        Radio radio = new Radio();
        radio.setPreviousStation();
        assertEquals(9, radio.getCurrentStation(), "Не совпадает текущая радиостанция после переключения на одну станцию назад!");
    }

    @Test
    public void shouldGetCurrentVolumeLevel() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolumeLevel(), "Не совпадает дефолтная громкость!");
    }

    @Test
    public void shouldSetVolumeLevel() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(6);
        assertEquals(6, radio.getCurrentVolumeLevel(), "Не совпадает текущая громкость!");
    }

    @Test
    public void shouldSetUpVolumeLevel() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(6);
        radio.setVolumeUp();
        assertEquals(7, radio.getCurrentVolumeLevel(), "Не совпадает громкость после увеличения!");
    }

    @Test
    public void shouldSetUpVolumeLevelWithMaxVolumeLevel() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(10);
        radio.setVolumeUp();
        assertEquals(10, radio.getCurrentVolumeLevel(), "Не совпадает громкость после увеличения при максимальном уровне громкости!");
    }

    @Test
    public void shouldSetDownVolumeLevel() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(6);
        radio.setVolumeDown();
        assertEquals(5, radio.getCurrentVolumeLevel(), "Не совпадает громкость после уменьшения!");
    }

    @Test
    public void shouldSetDownVolumeLevelWithMinVolumeLevel() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(0);
        radio.setVolumeDown();
        assertEquals(0, radio.getCurrentVolumeLevel(), "Не совпадает громкость после уменьшения при минимальном уровне громкости!");
    }
}