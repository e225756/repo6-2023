package jp.ac.uryukyu.ie.e225756;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gameMaster {

 final static int answer_size = 3;//当てる数。4にすれば4つの数字を当てるゲームになる。
 static int hit = 0;
 static int blow = 0;
 static int challenge = 1;

    public static void gameMaster1() {
        String game = "ゲームを開始します。\n"
        + "これから0~9のつの数字を当ててもらいます。\n"
        + "同じ数字が使用されていることはありません。\n"
        + "数字と位置が合っていた場合、\"hit\"\n"
        + "数字が合っていて位置が間違っていた場合、\"blow\"とカウントされます。\n\n";
        
        System.out.println(game);
        }

    public static int[] readUserAnswer() {
            hit = 0;
            blow = 0;
            int[] answer = new int[answer_size];
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\n"+challenge+"回目のチャレンジ");
            for(int i = 0; i < answer.length; i++) 

            try {
            System.out.print((i+1)+"つ目の数字:");
            String a = reader.readLine();
            int b = Integer.parseInt(a);
            answer[i] = b;
            }catch (NumberFormatException e) {
            System.out.println("数字を入力してください。");
            i--;
            }catch (IOException e) {
            System.out.println("error");
            i--;
            }
       return answer;
    }

    public static void cheack(int [] rigth_answer,int [] user_answer) {
        for (int i=0; i<rigth_answer.length;i++){
            for (int j=0; j < user_answer.length; j++){
                if (rigth_answer[j] == user_answer[i]) {
                    if (j==i) {
                        hit++;
                    }else{
                        blow++;
                    }
                }
            }
        }
        System.out.println(hit+"hit" + blow + "blow");
    }
}