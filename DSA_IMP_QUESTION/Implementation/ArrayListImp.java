class ArrayList{

    private int count;
    Object a[];

    ArrayList(){
        a =new Object[5];
        count=0;
    }
    public void add(int data){

        if(count >= size() ){
            increseSize();
        }
        a[count]=data;
        count++;
    }

    public void increseSize(){

        Object temp[]=new Object[a.length+3];
        for(int i=0;i<a.length;i++){
            temp[i]=a[i];
        }
        a=temp;
    }

    public void add(int index,int data){

        if(index <= -1 || index >=size()){
            throw new IndexOutOfBoundsException();
        }

        if(count >= a.length){
            increseSize();
        }

        for(int i=size()-1;i>=index;i--){
            a[i+1]=a[i];
        }
        a[index]=data;
        count++;
    }

    int size(){
        return count;
    }

    public void remove(int index){

        if(index <= -1 || index >=size()){
            throw new IndexOutOfBoundsException();
        }

        for(int i=index+1 ;i<size(); i++){
            a[i-1]=a[i];
        }
        count--;
        a[count]=null;
    }

    public Object get(int index){

       if(index <= -1 || index >=size()){
        throw new IndexOutOfBoundsException();
       }
       return a[index];
    }

}
public class ArrayListImp{
    public static void main(String[] args) {
        
        ArrayList ls = new ArrayList();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);

        ls.add(4, 51);

        for(int i=0;i<ls.size();i++){

            System.out.print(ls.get(i)+" ");
        }

    }
}