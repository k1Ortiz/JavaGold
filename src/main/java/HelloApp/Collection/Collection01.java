package HelloApp.Collection;

import java.util.ArrayList;

public class Collection01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer i1 = 1;
        int i2 = 2;
        Integer i3 = i1;
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(1, 5);
        System.out.println("Size: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        //拡張for文
        for (Integer i : list) {
            System.out.println(i + " ");
        }

    }
}
