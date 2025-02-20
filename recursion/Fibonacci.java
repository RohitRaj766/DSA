public class Fibonacci{
	public static void main(String args[]){
	System.out.print(Fibon(10));
	}

	public static int Fibon(int n){
		if(n==0 || n==1) return n;
		int sum = n + Fibon(n-1);
		return sum;
	}

}