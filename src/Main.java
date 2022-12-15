import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /**
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
        1) Стримди колдонуп жогорудагы листтин элементтердин суммасын, орточо арифметикалык санын жана канча жолу кайталанганын консольго чыгарыныз
         */
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);

        // СУММАСЫ
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());

        // ОРТОЧО АРИФМЕТИКАЛЫК МААНИСИ
        double v = list.stream().mapToInt(value -> value).average().orElse(0);
        int f = 0;
        f += (int) v;
        System.out.println(f);

        // КАНЧА ЖОЛУ КАЙТАЛАНГАН

        Map<Integer,Long> s = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        s.forEach((k,y) -> System.out.println(k + " : кайталанышы -> " + y));

    }
}