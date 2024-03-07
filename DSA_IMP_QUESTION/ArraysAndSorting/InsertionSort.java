import java.util.Arrays;

public class InsertionSort {

    static void sort(int arr[]){

        for(int i=1;i<arr.length;i++){

            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j] > key ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {15,25,36,98,45,78,23,20,18,49,51,53};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }  
    
}
