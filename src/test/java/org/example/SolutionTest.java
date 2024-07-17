package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void threeSumTest() {
        Solution solution = new Solution();
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(-1,-1,2));
        output.add(Arrays.asList(-1,0,1));
        assertEquals(output, solution.threeSum(new int[]{-1,0,1,2,-1,-4}));
        output = new ArrayList<>();
        assertEquals(output, solution.threeSum(new int[]{0,1,1}));
        output = new ArrayList<>();
        output.add(Arrays.asList(0,0,0));
        assertEquals(output, solution.threeSum(new int[]{0,0,0}));
    }

}