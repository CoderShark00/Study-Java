package c14_abstraction.interfaces;
/*
    ChannelUpButton, ChannelDownButton 등으로 나누어 각각 Button 클래스를
    상속하도록 작성할 예정.
 */
public class PowerButton extends Button{

    boolean status = false;

    @Override
    public void onPressed() {
        if(status){
            status = false;
            System.out.println("전원을 끕니다.");
        }else {
            status = true;
            System.out.println("전원을 켭니다");
        }
    }
}
