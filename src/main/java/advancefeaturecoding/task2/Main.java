package advancefeaturecoding.task2;

import java.util.Arrays;
import java.util.List;

import static advancefeaturecoding.task2.SortListIgnoreCase.sortListReverseAlphabeticallyIgnoreCase;


public class Main {
    public static void main(String[] args) {

        List<String> exampleList = Arrays.asList("Alena", "jablko", "Jirka", "dvere", "Pavla", "kolo");
        List<String> sortedList = sortListReverseAlphabeticallyIgnoreCase(exampleList);

        for (String s : sortedList) {
            System.out.println(s);
        }
    }
}
