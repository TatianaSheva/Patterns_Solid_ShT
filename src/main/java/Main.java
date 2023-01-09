import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Логику отображения товара в наличии и вывода его на экран лучше перенести в отдельный класс
        для соблюдения принципа единой ответственности: класс Products.
        */
        Products.showProducts();

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        Products products = new Products();
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            products.addPurchase(product, count);
        }

        long sum = products.sum(Products.getProducts());
        System.out.println("ИТОГО: " + sum);
    }
}

