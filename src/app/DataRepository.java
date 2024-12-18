package app;


import java.util.Arrays;
import java.util.List;

public class DataRepository {

    public List<Product> getData() {
        return Arrays.asList(
                new Product("MacBook", "Electronics", 1500.00),
                new Product("iPhone", "Mobile", 1000.00),
                new Product("Samsung S24", "Mobile", 700.00),
                new Product("TV", "Electronics", 1200.00),
                new Product("Banana", "Groceries", 1.50),
                new Product("Apple", "Groceries", 2.00),
                new Product("Milk", "Groceries", 1.00),
                new Product("Chair", "Furniture", 50.00),
                new Product("Table", "Furniture", 150.00)
        );
    }

}
