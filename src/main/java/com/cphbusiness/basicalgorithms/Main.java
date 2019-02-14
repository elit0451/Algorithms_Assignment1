/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cphbusiness.basicalgorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *
 * @author Kast
 */
public class Main {
    
    public static void main(String[] args) throws IOException
        {
            new Main().run();
        }
    
private static final Pattern UNDESIRABLES = Pattern.compile("[\\[\\]\\*\\#\\:(){},.;!?<>%]");

    public void run() throws IOException {
        String[] msgArr = readFile("LOCATION TO THE FILE.txt");
        new InsertionSort(msgArr);
        new SelectionSort(msgArr);
        new MergeSort(msgArr);
    }
    
    public String[] readFile(String filepath) throws FileNotFoundException,IOException
    {
        ArrayList<String> fileContent = new ArrayList<String>();
        File file = new File(filepath);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            //process the line
            String msg = processWord(line).toLowerCase();
            fileContent.addAll(Arrays.asList(msg.split(" ")));
        }
        
        /* https://stackoverflow.com/a/4042464 */
        return fileContent.toArray(new String[0]);
    }
    
    private static String processWord(String x) {
        return UNDESIRABLES.matcher(x).replaceAll("");
    }
}
