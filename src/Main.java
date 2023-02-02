import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
            Integer[] sortedArray = {1, 2, 3, 4, 5};
            List<Integer> list = Arrays.asList(sortedArray);
            Collections.shuffle(list, new Random());
            System.out.println(list);
        }
    }
