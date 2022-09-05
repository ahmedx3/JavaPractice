import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Search<Integer> search = new SequentialSearch<>();

        if (search.doesExist(list, 6)) {
            System.out.println("Element Found!");
        } else {
            System.out.println("Element Not Found!");
        }
    }
}
