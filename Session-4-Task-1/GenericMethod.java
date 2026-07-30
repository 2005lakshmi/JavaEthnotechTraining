class GenericMethod {

    public static <T> void printArray(T[] array) {

        for (T i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] num = {10, 20, 30, 40};

        String[] name = {"Java", "Python", "C"};

        Character[] ch = {'A', 'B', 'C', 'D'};

        printArray(num);
        printArray(name);
        printArray(ch);
    }
}