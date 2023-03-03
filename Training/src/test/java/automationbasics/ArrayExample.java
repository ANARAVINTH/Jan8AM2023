package automationbasics;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {

        int []a = new int[2];
        a[0] = 12;
        a[1] =90;

        List<Integer> l = new ArrayList<Integer>();

        l.add(33);
        l.add(56);

        System.out.println(l);

        l.add(77);

        System.out.println(l);

        l.add(1,95);

        System.out.println(l);

        l.add(95);
        System.out.println(l);

        l.remove(2);

        System.out.println(l);





    }


}
