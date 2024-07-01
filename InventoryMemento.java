import java.util.ArrayList;
import java.util.List;

class InventoryMemento {
    private List<Product> products;

    public InventoryMemento(List<Product> products) {
        this.products = new ArrayList<>(products);
    }

    public List<Product> getProducts() {
        return products;
    }
}

class InventoryCaretaker {
    private List<InventoryMemento> mementoList = new ArrayList<>();

    public void addMemento(InventoryMemento memento) {
        mementoList.add(memento);
    }

    public InventoryMemento getMemento(int index) {
        return mementoList.get(index);
    }
}
