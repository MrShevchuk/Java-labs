package lab8;

import java.util.Arrays;

import static lab8.Book.generateChaptersBySheets;

public class Main {

        public static void main(String[] args) {

            Book TheGreatGatsby = new Book();
            TheGreatGatsby.setArr(TheGreatGatsby.pageTurning(174));
            System.out.println(Arrays.toString(TheGreatGatsby.getChapters()));
            String[][] result = generateChaptersBySheets(TheGreatGatsby.getArr(), 9);
            System.out.println("Книга разбита на главы: " + result);

            TheGreatGatsby.BookName = "The Great Gatsby";
            TheGreatGatsby.Author = "F.Scott Fitzgerald";
            TheGreatGatsby.PublishedYear = "1925";
            TheGreatGatsby.SheetNumber = 174;
        }
    }

