import java.util.ArrayList;
import java.util.List;

public class RandomList {

    public static List<Integer> getIntegerArrayList(int countNumbers) {
        List<Integer> integerArrayList = new ArrayList<>();
        int minRange = -50;
        int maxRange = 50;
        for (int i = 0; i < countNumbers; i++) {
            integerArrayList.add((int) Math.round(((Math.random() * ((maxRange - minRange) + 1)) + minRange) * 100) / 100);
        }
        return integerArrayList;
    }
}
