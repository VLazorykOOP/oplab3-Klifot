// Продукти
interface Product {
    String getName();
    double getPrice();
}

class Electronics implements Product {
    private String name;
    private double price;

    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Clothing implements Product {
    private String name;
    private double price;

    public Clothing(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Абстрактна фабрика
interface ProductFactory {
    Product createProduct(String name, double price);
}

// Конкретні фабрики
class ElectronicsFactory implements ProductFactory {
    public Product createProduct(String name, double price) {
        return new Electronics(name, price);
    }
}

class ClothingFactory implements ProductFactory {
    public Product createProduct(String name, double price) {
        return new Clothing(name, price);
    }
}
