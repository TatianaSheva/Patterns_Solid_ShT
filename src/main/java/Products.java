import java.util.HashMap;
import java.util.Map;

public class Products {

    /**
     * Класс отвечает за список список возможных к покупке продуктов:
     * - массив с наименованием продукта и ценой
     * - метод получения массива
     * - метод вывода на экран споска продуктов к покупке
     * - метод добавления покупок в корзирну (массив purchases)
     * - метод опредеелния общей суммы покупки (всех товаров в корзине)
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

    //Магическое число 4 заменим на размер массива продуктов, из которых покупатель сможет произвести покупку
    protected Purchase[] purchases = new Purchase[Products.getProducts().size()];

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.title)) + " руб.");
            sum += purchase.count * prices.get(purchase.title);
        }
        return sum;
    }
}
