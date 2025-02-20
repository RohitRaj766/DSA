public class Question4{

	public static void main(String args[]){
		printNto1(1);
	}
	public static void printNto1(int i){
		if(i>10)return;
		printNto1(i+1);
		System.out.print(i+" ");
		
	}


}