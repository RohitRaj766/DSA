// print 1 to n times

public class Question2 {
    public static void main(String args[]){
        print1toN(1);
    }

    public static void print1toN(int i){
        if(i>10) return;
        System.out.print(i+" ");
        print1toN(i+1);
    }
}
