package list_;

import java.util.*;

/**
 * @author 叶磊
 */
public class List排序 {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list2 = new LinkedList();
        List list3 = new Vector();
        list.add(new Book("红楼梦", "曹雪芹", 25));
        list.add(new Book("三国", "罗贯中", 22));
        list.add(new Book("西游记", "吴承恩", 30));
        list.add(new Book("水浒传", "施耐庵", 20));

        System.out.println("=====排序前=====");
        for (Object object : list) {
            System.out.println(object);
        }

        bubbleList2(list);

        System.out.println("=====排序后=====");
        for (Object object : list) {
            System.out.println(object);
        }
    }

    //List集合排序  按价格排序
    public static void bubbleList(List list) {
        if (list != null) {
            int listSize = list.size(); //提高执行效率
            for (int i = 0; i < listSize - 1; i++) {
                for (int j = 0; j < listSize - 1 - i; j++) {
                    //取出book对象
                    Book book = (Book) list.get(j);
                    Book book2 = (Book) list.get(j + 1);
                    if (book.getPrice() < book2.getPrice()) {
                        list.set(j, book2);
                        list.set(j + 1, book);
                    }
                }
            }
        }
    }

    // 按书名排序
    public static void bubbleList2(List list) {
        if (list != null) {
            int listSize = list.size(); //提高执行效率
            for (int i = 0; i < listSize - 1; i++) {
                for (int j = 0; j < listSize - 1 - i; j++) {
                    Book book = (Book) list.get(j);
                    Book book2 = (Book) list.get(j + 1);
                    if (book.getBook().length() < book2.getBook().length()) {
                        list.set(j, book2);
                        list.set(j + 1, book);
                    }
                }
            }
        }
    }
}

class Book {
    private String book;
    private String author;
    private double price;

    public Book(String book, String author, double price) {
        this.book = book;
        this.author = author;
        this.price = price;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "名称:" + book + "\t\t" +
                "作者:" + author + "\t\t" +
                "价格:" + price;
    }
}