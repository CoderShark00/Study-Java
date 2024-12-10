package c14_abstraction.interfaces;

public class ChannelUpButton extends Button {

    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 올립니다.");
    }

    @Override
    public void onUp(){
        System.out.println("채널을 계속 올립니다.");
    }

    // ChannelDownButton 클래스를 생성하고, onPressed()와 onDown()을 재정의하세요.
}
