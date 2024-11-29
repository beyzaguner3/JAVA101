public class MyList<T>{
    final int initialCapacity = 10;
    T[] myArray = (T[]) new Object[initialCapacity];

    public MyList(){
        System.out.println("Dizinin Kapasitesi : " + myArray.length);
    }
    public MyList(int capacity){
        T[] myArray = (T[]) new Object[capacity];

    }
    public int size(){
        int count = 0;
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] != null){
                count++;
            }
        }

        return count;
    }
    public int getCapacity(){
        return myArray.length;
    }
    public void add(T data){
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == null){
                myArray[i] = data;
                return;
            }
        }
        T[] newArray = (T[]) new Object[myArray.length *2];
        for(int k = 0; k < myArray.length; k++){
            newArray[k] = myArray[k];
        }
        newArray[myArray.length] = data;
        myArray = newArray;
    }
    public T get(int index){
        if (index < 0 || index >= myArray.length) {
            return null;
        }
        for(int j = 0; j < myArray.length; j++){
            if(j == index){
                return myArray[j];
            }
        }
        return myArray[index];
    }
    public String toString(){
        String st = " [" ;
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] != null){
                st += " " + myArray[i];
            }
        }
        return st + " ]";
    }
    public T remove(int index) {
        if (index < 0 || index >= myArray.length) {
            return null;
        }
        T removedElement = myArray[index];
        for (int i = index; i < myArray.length - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
        myArray[myArray.length - 1] = null;
        return removedElement;
        }
    public void set(int index, T data){
        for(int i = 0; i < myArray.length; i++){
            if(i == index){
                myArray[i] = data;
            }
        }
    }
    public int indexOf(T data){
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] != null && myArray[i].equals(data)){
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        return size() == 0;
    }
    public void clear() {
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = null;
        }
        System.out.println("Liste temizlendi. ");
    }
    public boolean contains(T data){
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == data){
                return true;
            }
        }
        return false;
    }
    int lastIndexOf(T data){
        for(int i = myArray.length - 1; i >= 0; i--){
            if(myArray[i] != null  && myArray[i].equals(data) ){
                return i;
            }
        }
        return -1;
    }
    public MyList<T> subList(int start, int finish){
            if (start < 0 || finish > myArray.length || start > finish) {
               return null;
            }
        MyList<T> sublist = new MyList<>();
        for (int i = start; i < finish; i++) {
            sublist.add(myArray[i]);
        }
        return sublist;
    }
}
