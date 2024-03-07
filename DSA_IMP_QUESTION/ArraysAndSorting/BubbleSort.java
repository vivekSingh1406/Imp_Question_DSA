import java.util.Arrays;

public class BubbleSort {

     static void sort(int arr[]){

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length-1-i;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {15,25,36,98,45,78,23,20,18,49,51,53};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }  
    
}
