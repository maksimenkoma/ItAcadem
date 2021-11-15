package homeWorkAssessment;

import java.util.HashMap;
import java.util.Map;


public class Task8<K> {
    private K[] ks;

    public Task8(K[] ks) {
        this.ks = ks;
    }

    public static <K> Map<K, Integer> arrayToMap(K[] ks) {

        Map<K, Integer> maps = new HashMap<>();

        for (int i = 0; i < ks.length; i++) {
            int count = 1;
            for (int j = i+1; j < ks.length; j++) {

                if (ks[i].equals(ks[j])) {
                    count++;
                }
            }
            maps.putIfAbsent(ks[i], count);
        }

        for (Map.Entry<K, Integer> a : maps.entrySet()) {
            System.out.println(a.getKey() + " - " + a.getValue());
        }
        return maps;

    }

    public static void main(String[] args) throws Exception {

        Double[] array = {575.4, 22.5, 575.4, 223.5, 575.4, 22.5, 22.5, 4342.3};
        arrayToMap(array);

        System.out.println();

        String[] array2 = {"ewqe", "dqdas", "ewqe", "sadasd"};
        arrayToMap(array2);
    }

}
