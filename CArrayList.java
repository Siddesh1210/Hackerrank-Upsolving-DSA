import java.util.ArrayList;
import java.util.List;

public class CArrayList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,7);

        // list.remove(Integer.valueOf(2));

        list.clear();

        System.out.println(list);
    }
}
