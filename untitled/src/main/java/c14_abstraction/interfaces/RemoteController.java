package c14_abstraction.interfaces;

public class RemoteController {
    // 필드 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public RemoteController(ChannelDownButton channelDownButton, PowerButton powerButton, ChannelUpButton channelUpButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.channelDownButton = channelDownButton;
        this.powerButton = powerButton;
        this.channelUpButton = channelUpButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    // 메서드 정의
    // PowerButton의 메서드 구현
    public void onPressedPowerButton() {
        powerButton.onPressed(); // 필드로 powerButton 객체를 지니고 있기 때문에 사용 가능
    }

    //ChannelDownButton 메서드 구현
    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }
    public void channelDown(){
        channelDownButton.onDown();
    }
    // ChannelUpbutton 메서드 구현
    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }

    public void channelUp(){
        channelUpButton.onUp();
    }

    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }
    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }

    public void volumeDown(){
        volumeDownButton.onDown();
    }
    public void volumeUp(){
        volumeUpButton.onUp();
    }

}
