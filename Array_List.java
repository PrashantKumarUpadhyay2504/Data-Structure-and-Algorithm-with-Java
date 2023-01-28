import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> lst=new ArrayList<>(); // default capacity is 10.
        System.out.print("before: ");
        System.out.println(lst.size());
        System.out.println("After Add some element to Array ");
        lst.add(34); // It is used to add the element in the list (list.add(element);)
        lst.add(21);
        lst.add(12);
        lst.add(2,45); // It is also used to add the element in the list by the index no. (list.add(index,element);).
        System.out.println("Size : "+lst.size());
        System.out.println(lst.get(2)); // It isplays the element of the list by the index no. (list.get(index);).
        for(int i=0 ; i<lst.size(); i++) {
            System.out.print(lst.get(i) + " ");
        }
        System.out.println();
        lst.remove(0); //it is used remove the element from the list (list.remove(index);).
        for(int i=0 ; i<lst.size(); i++) {
            System.out.print(lst.get(i) + " ");
        }
        lst.set(1,100); // it replaces the element to another element by the index no.(list.set(index,element);)
        System.out.println();
        for (int i:lst)
            System.out.print(i + " ");
        }
    }
