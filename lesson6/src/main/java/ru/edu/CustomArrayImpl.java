package ru.edu;
import java.util.Arrays;
import java.util.Collection;

public class CustomArrayImpl<T> implements CustomArray<T>{

    private static final int INIT_CAPACITY = 10;

    private T[] array;
    private int size;
    private int capacity;

    private void createArray(int capacity) {
        this.array = (T[]) new Object[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public CustomArrayImpl() {
        createArray(INIT_CAPACITY);
    }

    public CustomArrayImpl(int capacity) {
        if (capacity <= 0 ) {
            throw new IllegalArgumentException("invalid array size");
        }
        createArray(capacity);
    }

    public CustomArrayImpl(Collection<T> collection) {
        if (collection == null ) {
            throw new IllegalArgumentException("Collection is null");
        }

        createArray(Math.max(collection.size()*2, INIT_CAPACITY));
        System.arraycopy((T[]) collection.toArray(), 0, array, 0, collection.size());
        this.size = collection.size();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean add(T item) {
        try {
            if (size == getCapacity()) {
                ensureCapacity(capacity);
            }
            array[size++] = item;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean addAll(T[] items) {
        if (items == null) {
            throw new IllegalArgumentException("Array is null");
        }
        try {
            ensureCapacity(items.length);
            System.arraycopy(items, 0, array, size, items.length);
            size += items.length;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<T> items) {
        if (items == null) {
            throw new IllegalArgumentException("Collection is null");
        }
        return addAll((T[]) items.toArray());
    }

    @Override
    public boolean addAll(int index, T[] items) {
        if (items == null) {
            throw new IllegalArgumentException("Array is null");
        }
        try {
            ensureCapacity(items.length);
            T[] tmpArray = Arrays.copyOf(array, this.size);
            System.arraycopy(items, 0, array, index, items.length);
            System.arraycopy(tmpArray, index, array, index+items.length, size-items.length+1);
            size += items.length;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public T get(int index) {
        if (index > size - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException("invalid index");
        }
        return array[index];
    }

    @Override
    public T set(int index, T item) {
        if (index > size - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException("invalid index");
        }
        T tmp = array[index];
        array[index] = item;
        return tmp;
    }

    @Override
    public void remove(int index) {
        if (index > size - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException("invalid index");
        }
        System.arraycopy(array, index+1, array, index, size-index);
        size--;
    }

    @Override
    public boolean remove(T item) {
        if (contains(item)) {
            remove(indexOf(item));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(T item) {
        int id = indexOf(item);
        return id != -1;
    }

    @Override
    public int indexOf(T item) {

        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void ensureCapacity(int newElementsCount) {
        this.capacity += newElementsCount;
        this.array = Arrays.copyOf(array, getCapacity());
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public void reverse() {
        T item;

        for (int i = 0; i < size/2; i++) {
            item = array[i];
            array[i] = array[size-i-1];
            array[size-i-1] = item;
        }
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(this.array, this.size);
    }

    @Override
    public String toString() {
        return toArray().toString();
    }
}
