import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = RandomList.getIntegerArrayList(10);

        System.out.println(integerList);
        System.out.println(Service.averageValue(integerList));
        System.out.println(Service.averageValue(Arrays.asList(1, 2, 3, 4, 5)));

        List<String> stringList = Arrays.asList("one", "two", "three");
        System.out.println(Service.getPairList(stringList));

        stringList = Arrays.asList("Clock", "Banana", "Time", "date", "lamp");
        System.out.println(Service.printLowerCaseLengthFour(stringList));
    }

}
