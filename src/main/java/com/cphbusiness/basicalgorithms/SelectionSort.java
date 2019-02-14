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
public class SelectionSort extends Algorithm
{
    public SelectionSort(String[] data) {
        super(data);
    }

    @Override
    protected String[] sorting(String[] data) {
        String temp = "";
        int index = 0;
        
        while(index != data.length -1)
        {
            int posMin=index; 
            for(int i = index; i<data.length; i++)
            {
                if(data[i].compareTo(data[posMin])<0)
                {
                    posMin=i;
                }
            }
            temp = data[posMin];
            data[posMin] = data[index];
            data[index] = temp;
            index++;
        }
        
        return data;
    }
    
}
