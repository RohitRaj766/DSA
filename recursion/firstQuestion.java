// print name 5 time

public class firstQuestion{
    public static void main(String[] args) {
        String name = "Rohit";
        namePrinter(1,name);
    }
    public static void namePrinter(int i,String myname){
        if(i>10) return;
            System.out.println(myname);
            namePrinter(i+1,myname);
    }
}