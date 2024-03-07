import java.util.Arrays;

public class QuickSort {

    static void sort(int arr[],int s,int e){

        if(s>=e){
            return ;
        }
        int pivot = arr[(s+e)/2];
        int i=s,j=e;

        while(i<=j){

            while(arr[i]<pivot) i++;
            while(arr[j]>pivot) j--;

            if(i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        sort(arr, s,j);
        sort(arr, i, e);
    }

    public static void main(String[] args) {
        
        int arr[] = {15,25,36,98,45,78,23,20,18,49,51,53};
        System.out.println(Arrays.toString(arr));
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
}
