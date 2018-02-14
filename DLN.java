package PJ1;

public class DLN {
	public int[] ary = new int[4];
	public DLN next;
	public DLN prev;
	
	DLN(){
		for (int x = 0; x<4;x++){
			ary[x] = 0;
		}
		prev = null;
		next = null;
	}
	
	DLN(int[] a){
		ary = a;
		prev = null;
		next = null;
	}
	
	
}
