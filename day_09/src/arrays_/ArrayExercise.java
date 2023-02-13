package arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 叶磊
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] book = new Book[4];
        book[0] = new Book("红楼梦",28);
        book[1] = new Book("西游记新版",25);
        book[2] = new Book("三国演义",42);
        book[3] = new Book("Java从入门到放弃",99);

        Arrays.sort(book, new Comparator<Book>() {
            @Override

            public int compare(Book o1, Book o2) {
                double priceValue =  o1.getPrice() - o2.getPrice();
                if (priceValue > 0){
                    return -1;
                }else if (priceValue < 0){
                    return 1;
                }else {
                    return 0;
                }
            }
        });

        System.out.println("==从大到小排序==");
        System.out.println(Arrays.toString(book));

        Arrays.sort(book, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        System.out.println("==从小到大按书名长度排序==");
        System.out.println(Arrays.toString(book));
    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
