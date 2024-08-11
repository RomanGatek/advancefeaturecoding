package advancefeaturecoding.task2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListIgnoreCase {
    public static List<String> sortListReverseAlphabeticallyIgnoreCase(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareToIgnoreCase(s1);
            }
        });
        return list;
    }
}
