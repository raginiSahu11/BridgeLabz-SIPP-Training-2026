public class OnlineQuizApplication {

    public static void main(String[] args) {

        String answers[] = {"A","B","C","D"};

        for(int i=0;i<7;i++) {

            try {

                if(answers[i].equals("A")) {
                    System.out.println("Correct");
                }

            } catch(ArrayIndexOutOfBoundsException e) {

                System.out.println(
                        "Question index " + i + " does not exist.");

            } catch(NullPointerException e) {

                System.out.println(
                        "Answer at index " + i + " is null.");
            }
        }
    }
}