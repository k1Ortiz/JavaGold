package HelloApp.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection05 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("C");
        set.add("A");
        set.add("B");
        Iterator<String> iter = set.iterator();

        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
