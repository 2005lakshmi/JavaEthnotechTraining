public class MultipleCatch {
    public static void main(String[] args) {

        try {

            int a = 10 / 0;

            String s = null;
            System.out.println(s.length());

            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);

            int n = Integer.parseInt("ABC");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");

        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");

        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
}