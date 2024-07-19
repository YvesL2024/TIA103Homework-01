package hw2;

public class Homework {

	public static void main(String[] args) {

		System.out.println("Q1");
		// 計算1～1000的偶數和(2+4+6+8+…+1000)

		int i, sum = 0;
		for (i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1～1000的偶數和=" + sum);

		System.out.println("Q2");
		// 計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int j, sum2 = 1;
		for (j = 1; j <= 10; j++) {
			sum2 *= j;
		}
		System.out.println("1～10的連乘積=" + sum2);

		System.out.println("Q3");
		// 計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int k = 1, sum3 = 1;
		while (k <= 10) {
			sum3 *= k;
			k++;
		}
		System.out.println("1～10的連乘積=" + sum3);

		System.out.println("Q4");
		// 輸出結果為:1 4 9 16 25 36 49 64 81 100
		// 1^2,2^2,3^2,4^2,5^2,6^2,7^2,8^2,9^2,10^2
		int x, y = 1;
		for (x = 1; y < 100; x++) {
			y = (int) Math.pow(x, 2);
			System.out.print(y + " ");
		}

		System.out.println();

		System.out.println("Q5");
	    // 1 ～49 撇除有4的數字有哪些?共幾個?  
		
		 int sum1 = 0, mul1 = 10; 
		 for (int number1 = 1; number1 <= 49 ; number1++) {
		 if (number1 % mul1 == 4) { //剔除14 24 34 44
		 }
		 else if (number1 / mul1 == 4) { 
		 }                     //剔除40 41 42 43 44 45 46 47 48 49
		 else {
		 System.out.print(number1 + " ");
		 sum1++; //總號碼數
		 }
		 }
		 System.out.println();
		 System.out.println("共" + sum1 + "個號碼");

		System.out.println("Q6");
		// 10~1 降冪
		int a, b;
		for (a = 10; a >= 0; a--) {
			for (b = 1; b <= a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		System.out.println("Q7");
		// A~E升冪
		int a1, e;
		for (a1 = 1; a1 <= 6; a1++) {
			for (e = 1; e <= a1; e++) {
				switch (a1
					) {
				case 1:
				System.out.print("A");
					break;
				case 2:
				System.out.print("B");
					break;
				case 3:
				System.out.print("C");
					break;
				case 4:
				System.out.print("D");
					break;
				case 5:
				System.out.print("E");
					break;
				case 6:
				System.out.print("F");
					break;
				}
			}
			System.out.println();

		}
	}
}
