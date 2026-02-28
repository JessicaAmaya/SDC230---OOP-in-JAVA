/*
Jessica Willis
2/27/2026
4.4
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis 4.2");
        System.out.println();
        try {
            throwException();
        } catch (Exception e) {
            System.out.println("Exception Handled in Main");
        }
        doesNotThrowException();
    }

    public static void throwException() throws Exception{
        try {
            System.out.println("Method throwException");
            throw new Exception();
        } catch (Exception e) {
            System.err.println("Exception handled in method throwException");
            throw e;
        } finally {
            System.err.println("Finally executed in throwException");
        }
    }

    public static void doesNotThrowException() {
        try {
            System.out.println("Mehtod doesNotThrowException");
        } catch (Exception e){
            System.err.println(e);
        } finally {
            System.err.println("Finally executed in doesNotThrowException");
        }
        System.out.println("End of the method: doesNotThrowException");
    }
}
