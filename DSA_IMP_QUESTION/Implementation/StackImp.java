import java.util.EmptyStackException;

public class StackImp {

    private int a[] = new int[5];
    int p=0;

    public void push(int data){

        if(p>=a.length){
            increseSize();
        }
        a[p++]=data;
    }

    public void increseSize(){

        int temp[] = new int[a.length+3];
        for(int i=0;i<a.length;i++){
            temp[i]=a[i];
        }
        a=temp;
    }

    public boolean isEmpty(){
        return p==0;
    }

    public int size(){
        return p;
    }
    public int peek(){
        
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return a[p-1];
    }
    public int pop(){

        if (isEmpty()) {
            throw new EmptyStackException();
        }
        p--;
        int ans = a[p];
        a[p]=0;
        return ans;
    }


    public static void main(String[] args) {
        
        StackImp st = new StackImp();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st.size());
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }
    
}
