import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public  class LineItem {
    public String item;
    public double price;
    public int unit;

    public LineItem() {
    }

    public LineItem(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public LineItem(String item, double price, int unit) {
        this.item = item;
        this.price = price;
        this.unit = unit;
    }

    public ArrayList<LineItem> getLineItems() {
        return new ArrayList<LineItem>();
    }
}
