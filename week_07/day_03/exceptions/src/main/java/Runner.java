public class Runner {
    public static void main(String[] args) {

        try {
        int number1 = 1;
        int number2 = 0;

        int[] myArray = {1,2,3,4};

        int number3 = myArray[10];

        System.out.println( number1 / number2);
        } catch (ArithmeticException ex){
            System.out.println("ERROR: " + ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of bounds error");
        } catch (Exception ex) {

        } finally {
            System.out.println("Got to here, tidy up stuff");
        }

        try {
            connectToDb();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void connectToDb() throws Exception {
        throw new Exception("Sorry something went wrong");
    }
}
