package otus.java.pro;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@SuppressWarnings({"java:S106", "java:S3457"})
public class HelloOtus {
    public static void main(String[] args) {

        List<Integer> randomList = Arrays.asList(1, 2, 3);
        List<Integer> reverseRandomList = Lists.transform(randomList, n -> n + 1);

        System.out.println(randomList);
        System.out.println(reverseRandomList);
    }
}
