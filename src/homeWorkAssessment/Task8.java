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
        int count = 1;
        for (K i : ks) {

            maps.put(i, count++);
        }

        for (Map.Entry<K, Integer> a : maps.entrySet()) {
            System.out.println(a.getKey() + " - " + a.getValue());
        }
        return maps;

    }

    public static void main(String[] args) throws Exception {

        Double[] array = {232.5, 22.5, 575.4, 242341.8};
        arrayToMap(array);

        System.out.println();

        String[] array2 = {"ewqe", "dqdas", "adasdas", "sadasd"};
        arrayToMap(array2);
    }

}
