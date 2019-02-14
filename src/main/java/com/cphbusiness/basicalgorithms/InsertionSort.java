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
public class InsertionSort extends Algorithm
{

    public InsertionSort(String[] data) {
        super(data);
    }
    
    @Override
    protected String[] sorting(String[] data) {
        String temp = "";
        for(int i = 1; i<data.length;i++)
        {
            if(data[i].compareTo(data[i-1]) < 0)
            {
                temp = data[i-1];
                data[i-1] = data[i];
                data[i] = temp;
                
                if(i>1)
                    i-=2;
            }
        }
        return data;
    }
    
}
