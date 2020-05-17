package lab18;

import java.util.Arrays;

public class ArrayExceptionTest
{
    public static void main(String[] args)
    {
        int[] arr = new int[] {1,2,3,4,5};
        int[] arr1 = new int[] {11,22,33,44,55,66};
        printArray(arr1);
        System.out.println();
        printArray(arr);
    }

    static void printArray(int[] array)
    {
        int i = 0;
        try {
            for (i = 6; i > array.length; i++) {
                int s = array [i];
            }
            System.out.print(Arrays.toString(array));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("«Ошибка. Попытка обращения к несуществующему индексу: текущий индекс = " + i + " размер массива = " + array.length);
        }

    }
}
