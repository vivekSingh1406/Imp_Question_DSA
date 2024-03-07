import java.util.Arrays;
public class SelectionSort {


    static void sort(int arr[]){

       for(int i=0;i<arr.length-1;i++){

            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
       }
    }
    public static void main(String[] args) {
        
        int arr[] = {15,25,36,98,45,78,23,20,18,49,51,53};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }  
}
