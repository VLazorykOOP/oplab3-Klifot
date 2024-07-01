import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення фабрик
        ProductFactory electronicsFactory = new ElectronicsFactory();
        ProductFactory clothingFactory = new ClothingFactory();

        // Створення продуктів
        Product laptop = electronicsFactory.createProduct("Laptop", 1500);
        Product tShirt = clothingFactory.createProduct("T-Shirt", 20);

        // Використання фасаду
        InventoryFacade inventory = new InventoryFacade();
        inventory.addProduct(laptop);
        inventory.addProduct(tShirt);

        // Збереження стану
        InventoryCaretaker caretaker = new InventoryCaretaker();
        caretaker.addMemento(new InventoryMemento(inventory.getProducts()));

        // Видалення продукту
        inventory.removeProduct(laptop);

        // Відновлення стану
        InventoryMemento memento = caretaker.getMemento(0);
        List<Product> restoredProducts = memento.getProducts();

        // Вивід інформації
        for (Product product : restoredProducts) {
            System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());
        }
    }
}
