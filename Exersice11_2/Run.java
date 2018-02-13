package Exersice11_2;
import java.util.*;
// Write a method called alternate that accepts two Lists as its parameters and returns a
// new List containing alternating elements from the two lists, in the following order: • First element from first list
// • First element from second list • Second element from first list
// • Second element from second list
// • Third element from first list
// • Third element from second list
// • . . . If the lists do not contain the same number of elements, the remaining elements from the longer list
// should be placed consecutively at the end. For example, for a first list of [1, 2, 3, 4, 5] and a
// second list of [6, 7, 8, 9, 10, 11, 12], a call of alternate(list1, list2) should return a list containing
// [1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12].

public class Run
{
    public static void main(String[] args)
    {

        List<Integer> list1 = new LinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        List<Integer> list2 = new LinkedList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);

        System.out.println(alternate(list1, list2));

    }


    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2)
    {

        Iterator itr1 = list1.iterator();
        Iterator itr2 = list2.iterator();
        List<Integer> list = new ArrayList<>();

       while (itr1.hasNext() || itr2.hasNext())
       {
           if (itr1.hasNext())
           {
               list.add((Integer)itr1.next());
           }
           if(itr2.hasNext())
           {
               list.add((Integer) itr2.next());
           }
       }
        return list;
    }

}

