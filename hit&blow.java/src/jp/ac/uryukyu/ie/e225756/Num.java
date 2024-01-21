package jp.ac.uryukyu.ie.e225756;

public class Num {
    public static void mkdirnum(){
        //配列を定義
        int num[] = new int[10];

        //配列を１から連番を格納
        for (int i=0;i<num.length; ++i)
            num[i] = i+1;
        
        //シャッフル
        for (int i=0;i<num.length;++i){
            //0~(配列numの個数-1)の乱数を発生
            int rnd = (int)(Math.random()*(double)num.length);
             //num[i]とnum[rnd]を入れ替える
            int w = num[i];
            num[i] = num[rnd];
            num[rnd] = w;
        }

        //結果を表示
        for (int i = 0;i<num.length;++i)
        System.out.println(num[i]);
    }
}

