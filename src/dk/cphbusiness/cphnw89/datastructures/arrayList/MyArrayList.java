package dk.cphbusiness.cphnw89.datastructures.arrayList;

public class MyArrayList<E> {

    private E[] array;

    private int size;
    private static final int defaultCapacity = 10;
    public MyArrayList(){
        array = (E[]) new Object[0];
        size = 0;
    }

    public int length(){
        return array.length;
    }
    public int availableSlotsLeft(){
        return length() - size;
    }

    public int getSize(){
        return size;
    }
    public E get(int i){
        return array[i];
    }

    public void add(E element){
        if(array.length == 0){
            array = (E[]) new Object[defaultCapacity];
        }
        if(availableSlotsLeft() <= length()/4){
            E[] tempArray = (E[]) new Object[(length()*3/2)+1]; //new size = availableSlotsLeft() * 3/2 + 1
            for (int i = 0; i < length(); i++) {
                tempArray[i] = array[i];
            }
            array = (E[]) new Object[tempArray.length];
            for(int i = 0; i < tempArray.length-1; i++){
                array[i] = tempArray[i];
            }
        }
        array[size] = element;
        size++;
    }



    public E remove(E element){
        if(availableSlotsLeft() >= length()/4){
            E[] tempArray = (E[]) new Object[((length()/2))];
            for (int i = 0; i < tempArray.length-1; i++) {
                tempArray[i] = array[i];
            }
            array = (E[]) new Object[tempArray.length];
            for(int i = 0; i < tempArray.length-1; i++){
                array[i] = tempArray[i];
            }
        }
        E out = null;
        for(int i = 0; i < array.length; i++){
            if(array[i] != null) {
                if (array[i].equals(element)) {
                    out = array[i];
                    array[i] = null;
                }

            }
            if(i > 0){
                if((array[i-1] == null && array[i] != null)){
                    array[i-1] = array[i];
                    array[i] = null;
                }
            }
        }
        size--;
        return out;
    }
}
