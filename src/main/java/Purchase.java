import java.util.Map;

public class Purchase {

    /**
     * Класс отображает сущность покупки
     */
    protected String title;
    protected int count;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase() {
    }

    //Геттеры и сеттеры
    public void setTitle() {
        this.title = title;
    }

    public void setCount() {
        this.count = count;
    }

    public String getTitle() {
        return this.title;
    }

    public int getCount() {
        return this.count;
    }

}
