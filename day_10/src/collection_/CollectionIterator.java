package collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 叶磊
 */
public class CollectionIterator {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Book("三国演义","罗贯中",20));
        collection.add(new Book("红楼梦","曹雪芹",25));
        collection.add(new Book("水浒传","施耐庵",20));

        //1.通过 Iterator 迭代器遍历取值（快捷键itit）
        // Ctrl + j 查看所有快捷键的快捷键
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            // 2.返回下一个元素,类型是Object的，因为这里采用了动态绑定机制,
            // 最后找的是运行类型,而不是编译类型
            Object obj =  iterator.next();
            System.out.println("obj = " + obj);
        }
        //3.当退出while循环后，这时的iterator迭代器,指向最后的元素
        //iterator.next();   //报错：NoSuchElementException
        //4.如果我们希望再次遍历,需要重置我们的迭代器，如下：
        System.out.println("第二次遍历：");
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj = " + obj);
        }
    }
}

class Book{
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
        return "Book{" +
                "book='" + book + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}