package sda.zadanie11_struktury_danych;

public class ListMain {
    public static void main(String[] args) {
        Element firstElement = new Element();
        MyList myList = new MyList();
        myList.print();
        myList.add(5);
        myList.add(7);
        myList.add(4);
        myList.add(5);
        myList.add(0);
        myList.add(2);
        myList.print();
        myList.removeLast();
        myList.print();
        System.out.println(myList.getElementIndex(4));
        System.out.println(myList.getElementValueAt(2));
        myList.insertAt(0,6);
        myList.insertAt(0,1);
        myList.print();
    }
}
