package SOLIDPrinciples.O.Wrong;

public class InvoiceDao {
    Invoice invoice;
    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // save to db
    }

    // now till above function and constructor,
    // this class is tested and live

    // but what if a new functionality comes
    // to save the invoice to a file or mongodb database

    // adding this below method after production is wrong thus, opening this class for modification
    // it becomes prone to bugs
    public void saveToFilename() {
        // save the invoice in given filename
    }
}

// This class does not follow 'Open for Extension, Closed for modification' principle.
