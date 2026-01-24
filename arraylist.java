import java.util.ArrayList;
import java.util.Collections;

//reverse the array list

public class arraylist {
    static void reverseList(ArrayList<Integer> List) {
        int i = 0, j = List.size() - 1;

        while (i < j)
            ;
        /*
         * temp=a
         * a=b;
         * b=temp;
         */
        Integer temp = Integer.valueOf(List.get(i));
        List.set(i, List.get(j));
        List.set(j, temp);

        i++;
        j--;
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(6);
        List.add(8);
        List.add(7);
        List.add(10);
        List.add(9);
        System.out.println("original list" + List);
        // reverseList(List);
        Collections.reverse(List);
        System.out.println("reverselist" + List);
        Collections.sort(List);
        System.out.println("ascendign order" + List);
        Collections.sort(List, Collections.reverseOrder());
        System.out.println("descending order" + List);

        ArrayList<String> s1 = new ArrayList<>();
        s1.add("welcome");
        s1.add("To");
        s1.add("Physics");
        s1.add("wallah");
        Collections.sort(s1);
        System.out.println("asc" + s1);
        Collections.sort(s1, Collections.reverseOrder());
        System.out.println("desc" + s1);
    }
}