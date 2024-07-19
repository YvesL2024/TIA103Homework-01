package hw2;

public class TestNineNine {

	public static void main(String[] args) {

		// for + while
		int i;
		for (i = 1; i <= 9; i++) {

			int j = 1;
			while (j <= 9) {

				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();

		}
		System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––-");

		//for + do while
		for (int k = 1; k <= 9; k++) {
			int m = 1;
			do {
				System.out.print(k + "*" + m + "=" + k * m + "\t");
				m++;
			} while (m <= 9);
			System.out.println();
		}
		
		System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––-");

		//while + do while
		int n = 1;
		while (n <= 9) {
			int o = 1;
			do {
				System.out.print(n + "*" + o + "=" + n * o + "\t");
				o++;
			} while (o <= 9);
			System.out.println(); n++;
		}
		
		}
	
	}

