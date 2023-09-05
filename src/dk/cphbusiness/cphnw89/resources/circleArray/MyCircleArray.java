package dk.cphbusiness.cphnw89.resources.circleArray;

import java.util.NoSuchElementException;

public class MyCircleArray<E> {

    private int head;
    private int size;
    private int tail;
    private E[] array;

    public MyCircleArray(int cap){
        array = (E[]) new Object[cap];
        head = 0;
        tail = 0;
        size = 0;
    }

    public int length(){
        return array.length;
    }

    public int size(){
        return size;
    }

    public int availableSlotsLeft(){
        return length() - size();
    }

    public void addFirst(E element){
        if(availableSlotsLeft() < 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        head = (head + length() - 1) % length();
        array[head] = element;
        size++;
    }

    public E removeFirst(){
        if(size < 1){
            throw new NoSuchElementException();
        }
        E element = array[head];
        array[head] = null;
        head = (head++) % length();
        size--;
        return element;
    }

    public void addLast(E element){
        if(availableSlotsLeft() < 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        array[tail] = element;
        tail = (tail++) % length();
        size++;
    }

    public E removeLast(){
        if(size < 1){
            throw new NoSuchElementException();
        }
        tail = (tail + length() - 1) % length();
        E element = array[tail];
        array[tail] = null;
        size--;
        return element;
    }

    public E get(int i){
        return array[i];
    }

    public String show()
    {
        StringBuilder res = new StringBuilder();
        res.append("   ");
        for(int i = 0; i < array.length; ++i)
        {
            res.append( ((array[i] == null) ? "0" : "X") );
        }
        res.append(System.lineSeparator());
        res.append("H: ");
        for(int i = 0; i < head; ++i)
        {
            res.append(" ");
        }
        res.append("^").append(System.lineSeparator());
        res.append("T: ");
        for(int i = 0; i < tail; ++i)
        {
            res.append(" ");
        }
        res.append("^").append(System.lineSeparator());
        res.append("Size = ").append(size).append(System.lineSeparator());
        return res.toString();
    }
}
