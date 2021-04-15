package ui;


import java.util.Scanner;

public class Main {
	private static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		int cases = sc.nextInt();
		sc.nextLine();
		int[] disks = new int[cases];
		System.out.println("Número de casos leído");
		int repeat=0;
		while(repeat<cases){
			disks[repeat]=sc.nextInt();
			sc.nextLine();
			repeat++;			
		}
		System.out.println("Terminó la lecura de número de discos ");
		for (int i=0;i<disks.length;i++) {
			hanoiTowers(disks[i]);
			System.out.println("\n");
		}
	}
	private static void hanoiTowers(int d, int t1, int t2, int t3) {
		String space=" ";
		int torre1=t1;
		int torre2=t2;
		int torre3=t3;
		if(d==1) {
			System.out.print("Entró al caso base "+"\n");
			System.out.print("Mover disco de torre "+t1+" a torre "+t3+"\n");
		
		}else {
			hanoiTowers((d-1),torre1,torre3,torre2);			
			System.out.print("Mover disco de torre "+t1+" a torre "+t3+"\n");
			hanoiTowers((d-1),torre2,torre1,torre3);		
			
		}
	}
	/*private static void hanoiTowers(int d, int t1, int t2, int t3) {
		String space=" ";
		int torre1=t1;
		int torre2=t2;
		int torre3=t3;
		if(d==1){
			System.out.print("Entró al caso base "+"\n");
			System.out.print(torre1+space+torre2+space+torre3+"\n");		
			System.out.print("Hpta "+"\n");
		}else{	
			torre1--;
			torre3++;
			hanoiTowers((d-1),torre1,torre3,torre2);			
			System.out.print(torre1+space+torre2+space+torre3+"\n");
			torre2--;
			torre3++;
			hanoiTowers((d-1),torre1,torre2,torre3);
		}
	}
	*/
	public static void hanoiTowers(int d) {
		String space=" ";
		System.out.println(d+space+0+space+0);
		hanoiTowers(d,1,2,3);
		
	}

}
