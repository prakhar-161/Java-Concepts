package FunctionalInterfaces.FunctionInterface;

public class Main {
    public static void main(String[] args) {
        Function<Integer,String> integerToString = (Integer num) -> {
            String output = num.toString();
            return output;
        };

        System.out.println(integerToString.apply(8));
    }
}
