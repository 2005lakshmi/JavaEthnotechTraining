public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        System.out.println(sb);

        sb.append(" Programming");
        System.out.println(sb);

        sb.insert(5, "Core ");
        System.out.println(sb);

        sb.delete(5, 10);
        System.out.println(sb);

        sb.replace(0, 4, "Python");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}