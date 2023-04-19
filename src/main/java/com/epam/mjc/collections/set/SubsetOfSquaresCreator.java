package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
         TreeSet<Integer> treeSet = new TreeSet<>();
        for (Integer element : sourceList) {
            treeSet.add(element * element);
        }
        return treeSet.subSet(lowerBound, true, upperBound, true);
        
    }
}
