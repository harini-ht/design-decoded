import java.util.*;

// Cloneable is a marker interface - it has no methods
// It is used to indicate that an object can be cloned
public class BookShop implements Cloneable {
    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {
        for (int i = 0; i < 10; i++) {
            Book b = new Book();
            b.setBid(i);
            b.setBname("Book" + i);
            getBooks().add(b);
        }
    }
    // shallow cloning
    // @Override
    // protected Object clone() throws CloneNotSupportedException {
    //     // TODO Auto-generated method stub
    //     return super.clone();
    // }

    // deep cloning
    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        for (Book b : this.getBooks()) {
            bs.getBooks().add(b);
        }
        return bs;
    }

    @Override
    public String toString() {
        return "BookShop [shopName=" + shopName + ", books="
                + books + "]";
    }
}
