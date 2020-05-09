package lab8;

public class Book {

        public String BookName;
        public String Author;
        public String PublishedYear;
        public int SheetNumber;
        public String[] arr;
        public int[] chapters;

        public String[] getArr() {
            return arr;
        }

        public void setArr(String[] arr) {
            this.arr = arr;
        }

        public int[] getChapters() {
            return chapters;
        }

        public void setChapters(int[] chapters) {
            this.chapters = chapters;
        }

        public String getBookName() {
            return BookName;
        }

        public void setBookName(String bookName) {
            BookName = bookName;
        }

        public String getAuthor() {
            return Author;
        }

        public void setAuthor(String author) {
            Author = author;
        }

        public String getPublishedYear() {
            return PublishedYear;
        }

        public void setPublishedYear(String publishedYear) {
            PublishedYear = publishedYear;
        }

        public int getSheetNumber() {
            return SheetNumber;
        }

        public void setSheetNumber(int sheetNumber) {
            SheetNumber = sheetNumber;
        }

        public String[] pageTurning (int count) {
            String[] pages = new String[count];
            for (int i = 0; i < count; i++) {
                pages[i] = (i + 1) + " стр.";
            }
            return pages;
        }

        public static String[][] generateChaptersBySheets (String[] sheets, int chaptersCount) {
//        if(nonNull(sheets)) {
//            throw new RuntimeException("глав не должно быть меньше чем 1");
//        }
//        if(chaptersCount <= 0) {
//            throw new RuntimeException("глав не должно быть меньше чем 1");
//        }
            int size = sheets.length/chaptersCount;
            String[][] chapters = new String[chaptersCount][size];
            for (int i = 0; i < size; i++) {
                for (int j = i; j < size; j++) {
                    chapters[i][j] = sheets [j+size*i];
                }
            }
            return chapters;
        }
    }
