package app;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DataHandler {

    DataRepository dataRepository = new DataRepository();

    public void groupByCategory () {
        Map<String, List<Product>> productsByCategory = dataRepository.getData().stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        productsByCategory.forEach((category, productList) -> {
            System.out.println("\nCategory: " + category);
            productList.forEach(System.out::println);
        });
    }

    private Map<String, Double> findAverageProductPrice() {
        return dataRepository.getData().stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)));
    }

    public void printAverageProductPrice() {
        Map<String, Double> averagePriceByCategory = findAverageProductPrice();

        System.out.println("\nAverage price by category:");
        averagePriceByCategory.forEach((category, avgPrice) ->
                System.out.println(category + ": " + avgPrice));
    }

    public void findCategoryWithHighestPrice() {
        Map<String, Double> averagePriceByCategory = findAverageProductPrice();
        String highestAvgPriceCategory = averagePriceByCategory.entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(entry -> entry.getKey() + " (Avg price: " + entry.getValue() + ")")
                .orElse("No categories available");

        System.out.println("\nCategory with the highest average price: " + highestAvgPriceCategory);
}}
