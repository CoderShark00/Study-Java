package c14_abstraction.interfaces;

public class AirConditionerController {

    private PowerButton powerButton;
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;

    public AirConditionerController(PowerButton powerButton, TemperatureDownButton temperatureDownButton, TemperatureUpButton temperatureUpButton) {
        this.powerButton = powerButton;
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
    }

    public void powerOn() {
        powerButton.onPressed();
    }
    public void temperatureDown() {
        temperatureDownButton.onDown();
    }
    public void temperatureUp() {
        temperatureUpButton.onPressed();
    }
    public void powerOff() {
        powerButton.onPressed();
    }
    public void onPressedTempUp() {
        temperatureUpButton.onUp();
    }
    public void onPressedTempDown() {
        temperatureDownButton.onPressed();
    }
}