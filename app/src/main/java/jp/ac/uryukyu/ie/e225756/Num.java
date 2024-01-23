package jp.ac.uryukyu.ie.e225756;

public class Num {

    public static int answer_size = 3;//当てる数。4にすれば4つの数字を当てるゲームになる。
   
    public static int[] makeNum() {
        int[] answer = new int[answer_size];
        for(int i = 0; i < answer.length; i++) {
        answer[i] = (int)(Math.random()*10);
        for(int j = i-1; j >=0; j--) {
        if(answer[j] == answer[i]) {
        answer[i] = (int)(Math.random()*10);
        }
     }
    }
        return answer;
  }
        
}

