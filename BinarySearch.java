/*
 *  there are two type binary search
 *  1- Liner binary search time complexity- O(n)
 *  2- Binary search time complexity- O(NlogN)
 */
public class BinarySearch {
    
    static int LinerSearch(int arr[],int key){

        for(int i=0;i<arr.length;i++){

            if(arr[i]==key){
                return i;
            }
        }
        return -1;  
    }

    static int BinarySearchElement(int arr[],int s,int e,int key){

        if(s>e){
            return -1;
        }
        int mid = (s+e)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key){
            return BinarySearchElement(arr, s, mid-1, key);
        }
        else{
            return BinarySearchElement(arr, mid+1, e, key);
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {10,20,30,40,50,60,70,80,90,100,110,120,130};
        // System.out.println(LinerSearch(arr,90));

        System.out.println(BinarySearchElement(arr,0,arr.length-1,10));
    }
}
