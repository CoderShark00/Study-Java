package c12_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayLotto {
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
            int index = 0;

            while (index < 6) {
                int number = random.nextInt(45) + 1;

                boolean duplicate = false;
                for (int j = 0; j < index; j++) {
                    if (lottoNumbers[j] == number) {
                        duplicate = true;
                        break;
                    }
                }

                if (!duplicate) {
                    lottoNumbers[index] = number;
                    index++;
                }
            }

            Arrays.sort(lottoNumbers);

            System.out.println(Arrays.toString(lottoNumbers));


        }
    }
}
