public class Eggs extends Eat{
    private int packages;

    protected Eggs(String name, int cost, int quantity, String measure, String date, int packages) {
        super(name, cost, quantity, measure, date);
        this.packages = packages;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цуна: %d; Количество: %d; Единица измерения: %s; Срок годности: %s; Количество в упаковке: %d", super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getDate(), this.packages);
    }
}
