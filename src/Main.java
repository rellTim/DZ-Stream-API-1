import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
    public static void main(String[] args) {
       System.out.println(positiveNumber(multiplesAndPositiveNumbers(sort(intList)))); // смешно самому))
    }
    static List<Integer> positiveNumber(List<Integer> q){
        List<Integer> w = new ArrayList<>();
        for (int i = 0; i < q.size(); i++) {
            if (q.get(i)>0){
                w.add(q.get(i));
            }
        }
        return w;
    }
    static List<Integer> multiplesAndPositiveNumbers (List<Integer> q){
        List<Integer> w = new ArrayList<>();
        for (int i = 0; i < q.size(); i++) {
            if (q.get(i)>0)
                w.add(q.get(i));
                }
        for (int i = 0; i < w.size(); i++) {
            while (w.get(i)%2!=0){
                w.remove(i);
            }
        }
        return w;
    }
    static List<Integer> sort (List<Integer>q){
        Collections.sort(q);
        return q;
    }
}