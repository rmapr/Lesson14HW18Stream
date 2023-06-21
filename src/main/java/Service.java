import java.util.List;
import java.util.stream.Collectors;

public class Service {

    //1 - Имеется коллекция из Integer, использую стримы посчитать среденее значения всех чисел
    static double averageValue(List<Integer> integers) {
        return integers.stream()
                .mapToInt(i -> i)
                .average().orElse(0);
    }

    //2 - Имеется коллекция из String, привести все стринги в UPPERCASE и вернуть
//коллекцию List<Pair>
//in: "one", "two", ...
//out: {"one":"ONE"}, {"two", "TWO"}, ...
    static List<Pair> getPairList(List<String> stringList) {
        return stringList.stream()
                .map(s -> new Pair(s, s.toUpperCase()))
                .toList();
    }

    //3 - Имеется коллекция из String, отфильтровать и вывести на экран все значения,
//которые написаны в loverCase and length = 4
    static List<String> printLowerCaseLengthFour(List<String> stringList) {
        int len = 4;
        return stringList.stream()
                .filter(s -> s.length() == len && s.equals(s.toLowerCase()))
                .collect(Collectors.toList());
    }
}
