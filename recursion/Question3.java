// printing 1 to N using backtracking

public class Question3 {
	public static void main(String args[]){
		backtracting1toN(10);
	}    

	public static void backtracting1toN(int i){
		if(i<1) return;
		backtracting1toN(i-1);
		System.out.print(i+" ");
	}
}
