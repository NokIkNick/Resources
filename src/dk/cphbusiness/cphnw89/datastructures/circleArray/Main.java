package dk.cphbusiness.cphnw89.datastructures.circleArray;

import javax.lang.model.element.Element;

public class Main {
    public static void main(String[] args){
        MyCircleArray<Integer> array = new MyCircleArray<Integer>(5);
        array.addFirst(0);
        array.addFirst(1);
        array.addFirst(2);
        array.addFirst(3);
        array.addFirst(4);
        System.out.println(array.get(1));
        System.out.println(array.show());
    }
}
