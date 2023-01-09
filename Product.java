import java.util.*;

public class Product implements Comparable<Product> {
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private int price;

    @Override
    public int compareTo(Product p) {
        return this.name.compareTo(p.name);
    }

    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product("Milk", 5));
        list.add(new Product("Pillow", 8));
        list.add(new Product("Juice", 1));
        list.add(new Product("Anglie", 4));
        Collections.sort(list);

        for (Product p : list)
            System.out.println(p.name + " " + p.price);
    }

}
