package lab16;

import org.w3c.dom.ls.LSOutput;

import javax.xml.transform.sax.SAXResult;

public class StringTest {

    public static void main(String[] args) {

/**
 *  1 task.
 *
 *  Create String different variables.
 */

        String corona = "COVID-19";         // literal

        String corona1 = new String("COVID-19");        // new

        char virus[] = {'C', 'O', 'V', 'I', 'D', '-', '1', '9'};        // arrays
        String corona19 = new String(virus);

        String virus1 = "C-19";
      //  String virus2 = new String(virus1.getBytes);        // bytes

        StringBuilder coronavirus = new StringBuilder("COVID-19");      // StringBuilder
        String virus19 = new String(coronavirus);


        /**
         *  2 task.
         *  Work with the String.
         *
         */

        String fruits = "Апельсин,Яблоко,Гранат,Груша";

    }
}
