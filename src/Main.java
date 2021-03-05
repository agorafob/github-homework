public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static void print(String line) {
        System.out.println(line);
    }

    public static void print(String line, int numberOfLines) {
        while (numberOfLines != 0) {
            System.out.println(line);
            numberOfLines--;
        }
    }
}
