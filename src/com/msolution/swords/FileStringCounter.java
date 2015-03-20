package com.msolution.swords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HP on 20.03.2015.
 */
public class FileStringCounter {



    public static int StringCounter() throws Exception
    {
        int lineCount=0;
        String s;
        FilePath path = new FilePath();

        while(true){
            try{
                path.getFilePath();
                BufferedReader buffer = new BufferedReader(new FileReader(path.path));
                break;
            } catch (Exception FileNotFounException){
                System.out.println("Файл не найден!");

                continue;
            }
        }

        BufferedReader buffer = new BufferedReader(new FileReader(path.path));

        while((s = buffer.readLine())!=null)
        {
            lineCount++;
        }
        buffer.close();

        return lineCount;
    }


}
