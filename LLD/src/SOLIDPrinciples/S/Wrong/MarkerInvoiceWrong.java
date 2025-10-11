package SOLIDPrinciples.S.Wrong;

class Marker {
    String name;
    String color;
    int year;
    int price;

    public Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}

class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        int price = ((marker.price) * this.quantity);
        return price;
    }

    public void printInvoice() {
        // print invoice
    }

    public void saveToDB() {
        // save to DB
    }
}

// Here, in the Invoice class there are 3 reasons to change i.e. calculateTotal(), printInvoice() and saveToDB()
// logic can be changed in the future which can affect and therefore, force unnecessary change for Marker clas too

// Therefore, it is not following the Single-Responsibility Principle
