// Q) reverse array with two pointers

public class ReverseArray{
public static void main(String args[]){
int[] arr = {1,2};
int n = arr.length ;
int[] result = reverseArray(arr,0,n-1);
for(int i = 0; i< n; i++){
System.out.print(result[i]+" ");
}
}
public static int[] reverseArray(int[] arr,int i ,int r){
if(i>r) return arr;
int temp = arr[i];
	arr[i] = arr[r];
	arr[r] = temp;
return reverseArray(arr, i+1, r-1);

}

}