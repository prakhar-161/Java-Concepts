package SOLIDPrinciples.S.Right;

public class InvoiceCalculator {
    private Marker marker;
    private int quantity;

    public InvoiceCalculator(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        int price = ((marker.price) * quantity);
        return price;
    }
}
