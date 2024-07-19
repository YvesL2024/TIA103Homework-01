package hw3;

import java.util.Scanner;

public class HomeWork3_2 {
	public static void main(String[] args) {
		// 亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息

				int ans;
				ans = (int) (Math.random() * 10);

				Scanner sum = new Scanner(System.in);
				System.out.println("開始猜數字吧(範圍=0~9)：");
				for (int x = 0; x != ans;) {
					if (sum.hasNextInt()) {
						x = sum.nextInt();
					} else {
						System.out.println("請輸入整數！");
						break;
					}
					if (x == ans) {
						System.out.println("答對了！答案就是" + ans);
						break;
					} else {
						System.out.println("猜錯了！");
					}
				}
	}

}
