package dk.cphbusiness.cphnw89.datastructures.arrayList;

public class Main {
    public static void main(String[] args){

        MyArrayList<Integer> arrayList = new MyArrayList<>();
        System.out.println("This is the length of the arraylist prior to any changes: "+arrayList.length());
        arrayList.add(0);
        System.out.println("As soon as we add something the arraylist length is now: "+arrayList.length());
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        System.out.println("This is the half of the length of the arraylist: "+arrayList.length()/2);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.length());
        System.out.println(arrayList.getSize());
        System.out.println(arrayList.availableSlotsLeft());
        arrayList.remove(7);
        System.out.println("Current length: "+arrayList.length());
        for(int i = 0; i < arrayList.length(); i++){
            System.out.println(arrayList.get(i));
        }


    }
}
