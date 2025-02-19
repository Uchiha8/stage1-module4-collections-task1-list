package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        int f_x = 5 * x * x + 3;
        int f_y = 5 * y * y + 3;

        if (f_x != f_y) {
            return Integer.compare(f_x, f_y);
        }
        return Integer.compare(x, y);
    }
}
