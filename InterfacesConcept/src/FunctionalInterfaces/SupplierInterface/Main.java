package FunctionalInterfaces.SupplierInterface;

public class Main {
    public static void main(String[] args) {
        Supplier<String> isEvenNumber = () -> "this is the data i am going to return in case of Supplier";

        Supplier<String> isEvenNumber1 = () -> {return "this is the data i am going to return in case of Supplier";};
        System.out.println(isEvenNumber.get());
    }
}
