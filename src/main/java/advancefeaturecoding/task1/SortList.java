package advancefeaturecoding.task1;

import java.util.Collections;
import java.util.List;

public class SortList {
    public static List<String> sortListReverseAlphabetically(List<String> list) {
        Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
        return list;
    }
}
