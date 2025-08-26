package org.example;

import java.util.*;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

    //手の数を指定
    private static final int HAND_COUNT = 3;

    //勝ち判定で使われる数字を指定
    private static final int WIN_FIGURE = 2;

    public static void main(String[] args) {

        System.out.println("私とじゃんけんしましょう！");

        // 手の対応表
        List<String> hands = List.of("グー","チョキ","パー");

        //コンピュータ側の手を決定する。(0=グー,1=チョキ,2=パー)
        int cpuHand = new Random().nextInt(HAND_COUNT);

        //ユーザ側の手を決定する。
        System.out.println("グー、チョキ、パーのどれかを入力してください。");
        String userHand = new Scanner(System.in).nextLine();

        //入力が誤っている際に再度入力を促す
        while (!userHand.matches("グー|チョキ|パー")) {
            System.out.println("入力が間違っています！もう一度入力しなおしてください");
            userHand = new Scanner(System.in).nextLine();
        }

        //ユーザの手を数値に変換
        int userHandNum = hands.indexOf(userHand);

        // 勝敗判定
        System.out.println("私は" + hands.get(cpuHand) + "を出しました！");
        if (cpuHand == userHandNum) {
            System.out.println("引き分けです");
        } else if ((userHandNum - cpuHand + HAND_COUNT) % HAND_COUNT == WIN_FIGURE) {
            System.out.println("あなたの勝ちです！");
        } else {
            System.out.println("あなたの負けです！");
        }
    }
}