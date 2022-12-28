import java.util.HashMap;
import java.util.Map;

public class Products {

    /**
     * Класс отвечает за список список возможных к покупке продуктов:
     * - массив с наименованием продукта и ценой
     * - метод получения массива
     * - метод вывода на экран споска продуктов к покупке
     */
    private static HashMap<String, Integer> products = new HashMap<>();

    static {
        products.put("Хлеб", 56);
        products.put("Масло", 153);
        products.put("Колбаса", 211);
        products.put("Пирожок", 45);
    }

    public static HashMap<String, Integer> getProducts() {
        return products;
    }

    public static void showProducts() {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }
}
