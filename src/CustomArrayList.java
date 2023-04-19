import java.util.*;

public class CustomArrayList<T> {
    Object[] dataArray;
    int size = 0;
    static final int DEFAULT_SIZE = 10;

    public CustomArrayList() {
        dataArray = new Object[DEFAULT_SIZE];
    }

    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public boolean contains(Object o) {
        for (Object o1 : dataArray) {
            if (o1.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public void add(T t) {
        dataArray[size] = t;
        size++;
        if (size == dataArray.length) {
            dataArray = Arrays.copyOf(dataArray, dataArray.length + DEFAULT_SIZE);
        }
    }

    public Object[] getAll() {
        return Arrays.copyOf(dataArray, size);
    }

    public Object get(int index) {
        return dataArray[index];
    }

    public boolean remove(int index) {
        if (index < size) {
            if (index == 0) {
                dataArray = Arrays.copyOfRange(dataArray, 1, size - 1);
            } else if (index == size - 1) {
                dataArray = Arrays.copyOfRange(dataArray, 0, size - 2);
            } else {
                Object[] part1 = Arrays.copyOfRange(dataArray, 0, index);
                Object[] part2 = Arrays.copyOfRange(dataArray, index + 1, size);
                dataArray = new Object[part1.length + part2.length];
                System.arraycopy(part1, 0, dataArray, 0, part1.length);
                System.arraycopy(part2, 0, dataArray, index, part2.length);
            }
            return true;
        }
        return false;
    }

}
