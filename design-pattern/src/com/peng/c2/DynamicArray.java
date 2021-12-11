package com.peng.c2;

/**
 * @author weiyupeng
 * @create 2021/12/11 20:58
 */
public class DynamicArray {
    private static final int DEFAULT_CAPACITY = 10;
    protected int size = 0;
    protected int capacity = DEFAULT_CAPACITY;
    protected Integer[] elements = new Integer[DEFAULT_CAPACITY];

    public int size() {
        return this.size;
    }

    public Integer get(int index) {
        return elements[index];
    }

    public void add(Integer e) {
        ensureCapacity();
        elements[size++] = e;
    }

    protected void ensureCapacity() {
        if (size == DEFAULT_CAPACITY) {
            // 扩容操作
            capacity *= 2;
        }
    }
}
