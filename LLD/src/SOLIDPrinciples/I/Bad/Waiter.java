package SOLIDPrinciples.I.Bad;

public class Waiter implements RestaurantEmployee{
    @Override
    public void cookFood() {

    }

    @Override
    public void serveCustomers() {
        System.out.println("serving customers");
    }

    @Override
    public void washDishes() {

    }
}

// here waiter class has to implement those functions too
// which do not come under its functionalities