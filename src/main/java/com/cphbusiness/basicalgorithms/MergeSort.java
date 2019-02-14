/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cphbusiness.basicalgorithms;

/**
 *
 * @author Kast
 */
public class MergeSort extends Algorithm
{

    public MergeSort(String[] data) {
        super(data);
    }

    @Override
    protected String[] sorting(String[] data) {
        return mergeSorting(data);
    }
    
    private String[] mergeSorting(String[] data)
    {
        int indexMiddle = data.length / 2;
            String[] left = new String[indexMiddle];
            String[] right = new String[indexMiddle];
            
            System.arraycopy(data, 0, left, 0, left.length);
            System.arraycopy(data, left.length, right, 0, right.length);

            if (left.length > 1)
                left = mergeSorting(left);
            if (right.length > 1)
                right = mergeSorting(right);

            int lIndex = 0;
            int rIndex = 0;
            int count = 0;
            boolean leftFinished = false;
            boolean rightFinished = false;
            while (!leftFinished || !rightFinished)
            {
                if (((left[lIndex].compareTo(right[rIndex]) < 0) || rightFinished) && !leftFinished)
                {
                    data[count] = left[lIndex];
                    lIndex++;
                    count++;

                    if (lIndex >= left.length)
                    {
                        leftFinished = true;
                        lIndex = left.length - 1;
                    }
                }
                else
                {
                    data[count] = right[rIndex];
                    rIndex++;
                    count++;

                    if (rIndex >= right.length)
                    {
                        rightFinished = true;
                        rIndex = right.length - 1;
                    }
                }
            }

            return data;
    }

}
