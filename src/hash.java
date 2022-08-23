import java.util.concurrent.atomic.AtomicIntegerArray;

public class hash {

    static void createHashMap(int arr[]) {
        AtomicIntegerArray l = new AtomicIntegerArray(arr.length);
//        for (int i =0 ; i < l.size; i++)
//            System.out.println(l.i);

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < l.length(); i++) {
                if (l.get(i) == 0) {
                    l.set(i,arr[j]);
                    break;
                } else if (l.get(i) == arr[j]) {
                    l.set(i,arr[j]);
                    break;
                }
                System.out.println(l);
            }
        }

    }
}
