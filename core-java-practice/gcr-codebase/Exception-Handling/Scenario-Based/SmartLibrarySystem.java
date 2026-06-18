public class SmartLibrarySystem {

    String books[] = {"Java","Python",null,"C++"};

    public int getBookLength(int index) {

        try {

            return books[index].length();

        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Invalid index requested.");
        } catch(NullPointerException e) {

            System.out.println(
                    "Book entry is null.");
        }

        return -1;
    }

    public static void main(String[] args) {

        SmartLibrarySystem s =
                new SmartLibrarySystem();

        System.out.println(s.getBookLength(10));
        System.out.println(s.getBookLength(2));
    }
}