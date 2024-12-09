package c12_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    while 반복문을 돌려서 5번 로또 번호 추출을 가능하게 하는 프로그램을 작성할 예정입니다.

    1-45까지의 숫자를 임의로 생성한 후, lottoNumbers라는 배열에 저장할 겁니다.
    로또 번호 6-> index 6개인 배열 : 게임 한 번
            5개 만들어져야 함. -> 총 5000원치

       중복 제거와 관련된 부분이 걸릴 수 있다. -> getter / setter

       실행 예

       로또 번호 추첨기에 오신 것을 환영합니다. 5 게임을 시작합니다. -> '5'는 String이 아닐 것
       이번 로또 당첨 번호는 다음과 같습니다.
       [ 3, 12, 25 , 13, 24, 21]
       이런식

 */
public class ArrayTest07 {
    public static void main(String[] args) {
        // 필요한 객체 생성
        Random random = new Random();

        // 필요한 변수 선언
        int[] lottoNumbers = new int[6];

        System.out.println("""
                
                   ,--,                         ,----,       ,----,            \s
                ,---.'|       ,----..         ,/   .`|     ,/   .`|  ,----..   \s
                |   | :      /   /   \\      ,`   .'  :   ,`   .'  : /   /   \\  \s
                :   : |     /   .     :   ;    ;     / ;    ;     //   .     : \s
                |   ' :    .   /   ;.  \\.'___,/    ,'.'___,/    ,'.   /   ;.  \\\s
                ;   ; '   .   ;   /  ` ;|    :     | |    :     |.   ;   /  ` ;\s
                '   | |__ ;   |  ; \\ ; |;    |.';  ; ;    |.';  ;;   |  ; \\ ; |\s
                |   | :.'||   :  | ; | '`----'  |  | `----'  |  ||   :  | ; | '\s
                '   :    ;.   |  ' ' ' :    '   :  ;     '   :  ;.   |  ' ' ' :\s
                |   |  ./ '   ;  \\; /  |    |   |  '     |   |  ''   ;  \\; /  |\s
                ;   : ;    \\   \\  ',  /     '   :  |     '   :  | \\   \\  ',  / \s
                |   ,/      ;   :    /      ;   |.'      ;   |.'   ;   :    /  \s
                '---'        \\   \\ .'       '---'        '---'      \\   \\ .'   \s
                              `---`                                  `---`     \s
                                                                               \s
                                                                               \s
                
                
                """);
        System.out.println("로또 번호 추첨기에 오신 것을 환영합니다.");

        System.out.println("이번 로또 추천 번호는 다음과 같습니다.");

        for (int i = 1; i <= 5; i++) {
            int count = 0;

            while (count < 6) {
                int number = random.nextInt(45) + 1;

                boolean duplicate = false;
                for (int j = 0; j < count; j++) {
                    if (lottoNumbers[j] == number) {
                        duplicate = true;
                        break;
                    }
                }

                if (!duplicate) {
                    lottoNumbers[count] = number;
                    count++;
                }
            }

            Arrays.sort(lottoNumbers);

            System.out.println(Arrays.toString(lottoNumbers));


        }
    }
}
