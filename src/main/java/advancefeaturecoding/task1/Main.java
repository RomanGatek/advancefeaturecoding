package advancefeaturecoding.task1;

import java.util.Arrays;
import java.util.List;

import static advancefeaturecoding.task1.SortList.sortListReverseAlphabetically;

public class Main {
    public static void main(String[] args) {

        List<String> exampleList = Arrays.asList("Alena", "Pavel", "Jirka", "Jana", "Pavla", "Roman");
        List<String> sortedList;
        sortedList = sortListReverseAlphabetically(exampleList);

        for (String s : sortedList) {
            System.out.println(s);
        }
    }
}
