import java.util.List;

public abstract class Search<T> {
    public abstract boolean doesExist(List<T> l, T element);
}
