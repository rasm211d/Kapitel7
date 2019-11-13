package For_fun;

public class Main {
    public static void main(String[] args) {
        int[] source = {3, 4, 5};
        int[] t = new int[3];
        System.arraycopy(source, 0, t, 0, source.length);
        System.out.println(source[0]);
    }
}
