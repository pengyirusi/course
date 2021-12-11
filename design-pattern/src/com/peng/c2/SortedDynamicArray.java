package com.peng.c2;

/**
 * @author weiyupeng
 * @create 2021/12/11 21:04
 */
public class SortedDynamicArray extends DynamicArray{
    @Override
    public void add(Integer e) {
        ensureCapacity();
        int i = size - 1;
        for ( ; i >= 0; i--) {
            if (elements[i] > e) {
                elements[i + 1] = elements[i];
            } else {
                break;
            }

        }
        elements[i + 1] = e;
        size++;
    }
}
