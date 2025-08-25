package org.example;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {

        System.out.println("私とじゃんけんしましょう！");

        // 手の対応表
        String[] hands = {"グー", "チョキ", "パー"};

        //コンピュータ側の手を決定する。(0=グー,1=チョキ,2=パー)
        int cpuHand = new java.util.Random().nextInt(3);

        //ユーザ側の手を決定する。
        System.out.println("グー、チョキ、パーのどれかを入力してください。");
        String userHand = new java.util.Scanner(System.in).nextLine();

        //入力が誤っている際に再度入力を促す
        while (!userHand.matches("グー|チョキ|パー")) {
            System.out.println("入力が間違っています！もう一度入力しなおしてください");
            userHand = new java.util.Scanner(System.in).nextLine();
        }

        //ユーザの手を数値に変換
        int userHandNum = java.util.Arrays.asList(hands).indexOf(userHand);

        // 勝敗判定
        System.out.println("私は" + hands[cpuHand] + "を出しました！");
        if (cpuHand == userHandNum) {
            System.out.println("引き分けです");
        } else if ((userHandNum - cpuHand + 3) % 3 == 2) {
            System.out.println("あなたの勝ちです！");
        } else {
            System.out.println("あなたの負けです！");
        }

    }
}