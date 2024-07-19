package hw1;

public class Homework {
	public static void main(String[] args) {
		
	System.out.println("Q1");
	//計算12，6這兩個數值的和與積
		int num1 = 12 ;
	    int num2 = 6 ;
	    
	    System.out.println("12+6= " + (num1 + num2));
	    System.out.println("12x6= " + (num1 * num2));
	    System.out.println();
	    
	System.out.println("Q2");
	//計算200顆蛋共是幾打幾顆？
	
		int eggs = 200 ;
	    int dozen = 12 ;
	    
	    System.out.println("200顆蛋=" + eggs / dozen + "打" + "又"+ eggs % dozen + "顆");
	    System.out.println();

	    
    System.out.println("Q3");
    //算出256559秒為多少天、多少小時、多少分與多少秒
    
	    int secs = 256559;
	    int mins = secs / 60;
	    int hrs = mins / 60;
	    int days = hrs / 24;		
	    
	    //System.out.println((secs % 60) + "秒");
	    //System.out.println((mins % 60) + "分");
	    //System.out.println((hrs % 24) + "小時");
	    //System.out.println(days + "天");
	    
	    System.out.println("256559秒=" + (days + "天") + ((hrs % 24) + "小時")+ ((mins % 60) + "分") + ((secs % 60) + "秒") );
	    System.out.println();

	System.out.println("Q4");
	//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
	
	double pi = 3.1415;
	int r = 5;
	
	System.out.println("圓面積=" + r*r*pi);
	System.out.println("圓周長=" + r*2*pi);
	System.out.println();
	
	System.out.println("Q5");
	//存入150萬，利率2%，每年利息都繼續存入，計算10年後，本金加利息共有多少錢
	
	double money = 1_500_000;
	double rate = 0.02;
	int years = 10;
	
	double amount = money * Math.pow(1 + rate, years);//複利計算公式 money=(1+rate)^years
	
	System.out.println("10年後本金加利息=" + (int)amount);
	//System.out.printf("%.0f",1_500_000*Math.pow(1.02,10));
    System.out.println();

	System.out.println("Q6");
	
	System.out.println(5+5);
	//數值5+數值5，所以結果為數值10
	System.out.println(5+'5');
	//數值5+字元5，字元5對照Unicode為u0035，Unicoe為十六進位值，經十進位換算數值為53，所以結果為數值58
	System.out.println(5+"5");
	//t數值5+字串5，所以結果為字串55

	}
}

    