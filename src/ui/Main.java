package ui;

import java.util.Scanner;

public class Main {
	private static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		int cases = sc.nextInt();
		sc.nextLine();
		int repeat=0;
		do {
			repeat++;
			
		}while(repeat)
	}
	private static void hanoiTowers(int d, int t1, int t2, int t3) {
		String space=" ";
		if(d==1){
			System.out.println(t1+space+t2+space+(t3+1));
			System.out.println("\n");
		}else {
			hanoiTowers(d-1,t1,t3,t2);
			t3++;
			System.out.println(t1+space+t2+space+t3);
			hanoiTowers(d-1,t2,t1,t3);
			
		}
	}
	public static void hanoiTowers(int d) {
		String space=" ";
		hanoiTowers(d,0,0,0);
		System.out.println(d+space+0+space+0);
	}

}
