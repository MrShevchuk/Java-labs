package lab16;

import org.w3c.dom.ls.LSOutput;

import javax.xml.transform.sax.SAXResult;
import java.util.Arrays;

public class StringTest {

    public static void main(String[] args) {

        /**
         *  1 task.
         *  Create String different variables.
         */

        String corona = "COVID-19";                                     // literal

        String corona1 = new String("COVID-19");                // new

        char virus[] = {'C', 'O', 'V', 'I', 'D', '-', '1', '9'};        // arrays
        String corona19 = new String(virus);

        String virus1 = "C-19";
      //  String virus2 = new String(virus1.getBytes);                  // bytes

        StringBuilder coronavirus = new StringBuilder("COVID-19");      // StringBuilder
        String virus19 = new String(coronavirus);


        /**
         *  2 task.
         *  Work with the String.
         */

        String fruits = "Апельсин,Яблоко,Гранат,Груша";                 // use method SPLIT
        String fruit1 = new String("Апельсин");
        String fruit2 = new String("Яблоко");
        String fruit3 = new String("Гранат");
        String fruit4 = new String("Груша");

        String[] splitString = fruits.split(" ", 4);
        System.out.println(Arrays.toString(splitString));

        fruits = fruits.toLowerCase();                                  //creations
        fruit1 = fruit1.substring(0,3);
        fruit2 = fruit2.substring(0,3);
        fruit3 = fruit3.substring(0,3);
        fruit4 = fruit4.substring(0,3);


        System.out.println(fruits);
        System.out.println(fruits.length());
        System.out.println(fruit1 + "\n" + fruit2 + "\n" .concat(fruit3) + "\n".concat(fruit4));


    }


}
