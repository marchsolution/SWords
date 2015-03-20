package com.msolution.swords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by HP on 20.03.2015.
 */
public class TranslateTest {

    public static void SimpleWordTest() throws Exception
    {
        int lineCount = FileStringCounter.StringCounter();
        int answerCount = 0;
        String s;
        String words[] = new String[lineCount];
        FilePath path = new FilePath();
        BufferedReader buffer;

        while(true){
            try{
                path.getFilePath();
                buffer = new BufferedReader( new FileReader(path.path));
                break;
            } catch (Exception FileNotFounException){
                System.out.println("Файл не найден!");

                continue;
            }
        }


        for(int i = 0; i < lineCount;i++){
            words[i]= buffer.readLine();
        }

        for(int i = 0; i < lineCount;i = i +2){
            System.out.println(words[i]);
            BufferedReader stringbuf = new BufferedReader(new InputStreamReader(System.in));
            String string = stringbuf.readLine();
            if(string.equals(words[i+1])){
                answerCount++;
            } else System.out.println("     НЕ ВЕРНО!");

        }

        System.out.println("Ваш результат: " + answerCount + " из " + lineCount/2);


        buffer.close();



    }
}
