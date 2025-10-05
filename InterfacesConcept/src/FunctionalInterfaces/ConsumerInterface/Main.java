package FunctionalInterfaces.ConsumerInterface;

public class Main {
    public static void main(String[] args) {
        Consumer<Integer> loggingObject = (Integer val) -> {
            if(val > 10) {
                System.out.println("Logging");
            }
        };

        loggingObject.accept(11);
    }
}
