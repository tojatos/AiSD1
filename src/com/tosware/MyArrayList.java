package com.tosware;
import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {

    private final int resizeModifier = 3;
    private final int defaultSize = 10;

    private T _array[] = (T[])new Object[defaultSize];
    private int _currentElementCount = 0;
    public MyArrayList() {

    }

    public int size() {
        return _currentElementCount;
    }

    public boolean isEmpty() {
        for(T x : _array) if(x!=null) return false;
        return true;
    }

    public boolean contains(T o) {
        for(T x : _array) if(x!=null && x.equals(o)) return true;
        return false;
    }

    public T get(int i) {
        assert (i >= 0 && i < _currentElementCount);
        return _array[i];
    }
    public void set(int i, T item) {
        assert (i >= 0 && i < _currentElementCount);
        _array[i] = item;
    }
    public void add(T t) {
        int arrLength = _array.length;
        if (arrLength == _currentElementCount+1)
            resizeArray(arrLength + resizeModifier);
        _array[_currentElementCount++] = t;
    }

    private void resizeArray(int newSize) {
        int oldLength = _array.length;
        assert(newSize > oldLength);
        T[] newArr = (T[]) new Object[newSize];
        System.arraycopy(_array, 0, newArr, 0, oldLength);
        _array = newArr;
    }

    public void remove(int i) {
        assert (i >= 0 && i < _currentElementCount);
        System.arraycopy(_array, i + 1, _array, i, _currentElementCount - i - 1);
        _currentElementCount--;
    }

    public void clear() {
        _currentElementCount = 0;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {
            private int _currentIndex = 0;
            @Override
            public boolean hasNext() {
                return _currentIndex < _currentElementCount;
            }

            @Override
            public T next() {
                return _array[_currentIndex++];
            }
        };
        return iterator;
    }
}
