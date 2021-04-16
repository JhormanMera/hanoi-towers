package model;

public class HanoiTowers {
	private int origin;
	private int aux;
	private int dest;

	public HanoiTowers() {
	}
	public void hanoiTowers(int d) {
		hanoiTowers(d,"A","B","C");
	}
	
	public void setTowers(int d) {
		origin=d;
		aux=0;
		dest=0;
	}
	
	private void hanoiTowers(int d, String o, String a, String des) {
		String space=" ";	
		if(d==1){	
			hanoiTowers(o,des);
			System.out.println(origin+space+aux+space+dest);
		}else{		
			hanoiTowers(d-1,o,des,a);
			hanoiTowers(o,des);
			System.out.println(origin+space+aux+space+dest);
			hanoiTowers(d-1,a,o,des);
		}
	}
	
	private void hanoiTowers(String o, String des) {
		switch(o) {
		case "A":
			origin--;
		break;
		case "B":
			aux--;
		break;	
		case "C":
			dest--;
		break;
		}
		switch(des) {
		case "A":
			origin++;
		break;
		case "B":
			aux++;
		break;
		case "C":
			dest++;
		break;
		}
	}

	/*
	public void hanoiTowers(int d) {
		hanoiTowers(d,1,2,3);		
	}	

	private void hanoiTowers(int d, int t1, int t2, int t3) {
		int torre1=t1;
		int torre2=t2;
		int torre3=t3;
		if(d==1) {
			System.out.println("Mover disco de torre "+t1+" a torre "+t3);		
		}else {
			hanoiTowers((d-1),torre1,torre3,torre2);			
			System.out.println("Mover disco de torre "+t1+" a torre "+t3);
			hanoiTowers((d-1),torre2,torre1,torre3);		
		}
	}
	 */

}
