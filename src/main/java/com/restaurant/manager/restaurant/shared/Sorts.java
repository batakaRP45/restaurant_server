package com.restaurant.manager.restaurant.shared;

import org.springframework.data.domain.Sort;

// s = sort; f = feild
public final class Sorts {
    public static Sort sort(String s, String f) {
        Sort sortable = null;
        if (s.equals(Constants.SORT_ASC)) {
            sortable = Sort.by(f).ascending();
        }
        if (s.equals(Constants.SORT_DESC)) {
            sortable = Sort.by(f).descending();
        }
        return sortable;
    }
}
