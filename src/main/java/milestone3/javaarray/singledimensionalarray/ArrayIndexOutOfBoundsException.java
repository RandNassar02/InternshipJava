package milestone3.javaarray.singledimensionalarray;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] arr ={50,60,70,80};
        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
//Exception in thread "main" java.lang