public class HelloApp {
    public static void main(String[] args) {

        // UC1: Hello World
        if (args.length == 0) {
            System.out.println("Hello World");
        }

        // UC2: Hello with namegit push origin --all
        else {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        }
    }
}