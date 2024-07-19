package hw3;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {

		// 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三 角形、其它三角形或不是三角形
		int[] l = new int[3];
		Scanner tri = new Scanner(System.in);
		System.out.println("請輸入三邊長：");
		if (tri.hasNextInt()) {
			l[0] = tri.nextInt();
			l[1] = tri.nextInt();
			l[2] = tri.nextInt();
		}
		if (l[0] * l[1] * l[2] != 0) {
			if (l[0] == l[1] && l[1] == l[2]) {
				System.out.println("正三角形");
			}

			else if (l[0] == l[1] || l[1] == l[2]) {
				System.out.println("等腰三角形");
			}

			else if (l[0] + l[1] > l[2] && l[1] + l[2] > l[0] && l[0] + l[2] > l[1]) {
				System.out.println("其他三角形");
			} else {
				System.out.println("不是三角形");
			}
		} else {
			System.out.println("不是三角形");
		}

		

		
	}
}
