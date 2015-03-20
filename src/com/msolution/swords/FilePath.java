package com.msolution.swords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HP on 20.03.2015.
 */
public class FilePath  {

    String path;

    public void getFilePath() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) try {
            System.out.print("Выберите файл: ");
            this.path = reader.readLine();
            break;

        } catch (Exception FileNotFoundException) {
            System.out.print("Файл не найден!");
        }


    }

    public String toString(){
        return path;
    }
}
