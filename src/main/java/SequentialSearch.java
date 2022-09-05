import java.util.List;

public class SequentialSearch<T> extends Search<T> {
    @Override
    public boolean doesExist(List<T> l, T element) {
        for (T item : l) {
            if (item == element) {
                return true;
            }
        }
        return false;
    }
}