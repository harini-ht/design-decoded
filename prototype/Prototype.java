public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("BSTORE");
        bs.loadData();
        System.out.println(bs);

        // instead of creating a new object, we clone the existing object
        // BookShop bs1 = new BookShop();
        // bs1.setShopName("CSTORE");
        // bs1.loadData();
        // System.out.println(bs1);
        System.out.println("\n\n");
        // deep cloning
        BookShop bs1 = bs.clone();
        bs1.setShopName("CSTORE");
        bs.getBooks();
        bs.getBooks().remove(9);
        System.out.println(bs1);

        System.out.println("\n\n");

        System.out.println(bs);
    }

}
