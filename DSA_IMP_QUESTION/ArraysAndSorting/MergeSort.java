import java.util.Arrays;

public class MergeSort {

    static void merge(int arr[],int left[],int right[]){

        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else{
                arr[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<left.length){
            arr[k]=left[i];
            i++;
            k++;
        }

        while(j<right.length){
            arr[k]=right[j];
            j++;
            k++;
        }
    }

    static void sort(int arr[]){

        if(arr.length==1){
            return;
        }

        int left[] = new int[arr.length/2];
        int rigth[] = new int[arr.length-left.length];

        for(int i=0;i<left.length;i++){  // store the left array
            left[i]=arr[i];
        }

        for(int j=0;j<rigth.length;j++){  // store the right arrays
            rigth[j]=arr[left.length+j];
        }

        sort(left);
        sort(rigth);
        merge(arr,left,rigth);
    }

    public static void main(String[] args) {
        
        int arr[] = {15,25,36,98,45,78,23,20,18,49,51,53};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
