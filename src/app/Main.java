package app;

public class Main {

    public static void main(String[] args) {

        DataHandler dataHandler = new DataHandler();
        dataHandler.groupByCategory();
        dataHandler.printAverageProductPrice();
        dataHandler.findCategoryWithHighestPrice();
    }
}

