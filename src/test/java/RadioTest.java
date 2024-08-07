import netology.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio;

    @BeforeEach
    public void init() {
        radio = new Radio();
    }

    @Test
    public void shouldSetCurrentStation() {
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentStation(9);
        expected = 9;
        actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentStation() {
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentStation(-1);
        actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentStation(10);
        actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void shouldSetNextStation() {
        radio.setCurrentStation(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevStation() {
        radio.setCurrentStation(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldJumpOverWhenSwitchingStationAtLimitValue() {
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentStation(9);
        radio.nextStation();
        expected = 0;
        actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolume() {
        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetVolumeIfMoreOrLessThanLimitValue() {
        radio.setCurrentVolume(50);
        radio.setCurrentVolume(101);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentVolume(-1);
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        radio.setCurrentVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        radio.setCurrentVolume(50);
        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
