package ui;


import java.util.Scanner;

import model.HanoiTowers;

public class Main {
	private static Scanner sc =new Scanner(System.in);
	private static HanoiTowers h;

	public static void main(String[] args) {
		h = new HanoiTowers();
		start();
	}
	public static void start() {
		int cases = sc.nextInt();
		sc.nextLine();
		int[] disks = new int[cases];
		int repeat=0;
		while(repeat<cases){
			disks[repeat]=sc.nextInt();
			sc.nextLine();
			repeat++;			
		}
		for (int i=0;i<disks.length;i++) {
			String space=" ";
			System.out.println(disks[i]+space+0+space+0);
			h.setTowers(disks[i]);
			h.hanoiTowers(disks[i]);	
			System.out.println("");

		}
	}




}
