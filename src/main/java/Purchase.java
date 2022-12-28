import java.util.Map;

public class Purchase {

    /**
     * Класс отвечает за покупки
     * - метод добавления покупок в корзирну (массив purchases)
     * - метод опредеелния общей суммы покупки (всех товаров в корзине)
     */
    protected String title;
    protected int count;

    //Магическое число 4 заменим на размер массива продуктов, из которых покупатель сможет произвести покупку
    protected Purchase[] purchases = new Purchase[Products.getProducts().size()];

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase() {
    }

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
