import jp.ac.uryukyu.ie.e225756.*;

public class Main {
    private static Object hit;
    private static Object answer_size;
    private static int challenge;

    public static void main(String[] args) throws Exception {

        gameMaster.gameMaster1();
        int[] rigth_answer;
        rigth_answer = Num.makeNum();

        while (true) {
            int [] user_answer;
            user_answer = gameMaster.readUserAnswer();
            gameMaster.cheack(rigth_answer, user_answer);
            challenge++;
            if (hit == answer_size) {
                System.out.println("ゲーム終了です");
                break;
            }
        }
    }
}