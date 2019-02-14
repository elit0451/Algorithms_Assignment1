package com.cphbusiness.basicalgorithms;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.time.StopWatch;

public abstract class Algorithm {
    StopWatch sw = new StopWatch();
    
    public Algorithm(String[] data)
        {
            start();
            data = sorting(data);
            stop();
            for(String s: data)
            {
                System.out.print(' ' + s);
            }
            System.out.println();
        }
        abstract protected String[] sorting(String[] data);

        private void start()
        {
            sw.start();
        }

        private void stop()
        {
            sw.stop();
            System.out.println("Time in microseconds - " + sw.getTime(TimeUnit.MICROSECONDS)+ " - ");
        }
    }
