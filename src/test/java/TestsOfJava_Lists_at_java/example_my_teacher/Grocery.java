package TestsOfJava_Lists_at_java.example_my_teacher;

import java.util.ArrayList;

public class Grocery {
    private final String name;
    private final ArrayList<Product> products;

    /**
     * <b>constructor</b>
     *
//     * @param name./
     */
    public Grocery(String name) {
        this.name = name;
        this.products = new ArrayList<Product>();

    }



    public void print() {
        for (Product product : products) {
//            System.out.printf("[%d , %s]",product.getId(),product.getName());
            System.out.println(product);
        }

    }

    /**
     * with index
     * @param Item
     */
    public void remove(Product Item) {
        int position = findItem(Item);
        if (position == -1) {
            throw new FontFoundException("can not find element");
        }
        products.remove(position);
    }

    /**
     * with element
     * @param Item
     */
    public void removeItem(Product Item) {
        products.remove(Item);
    }

    public boolean addItem(Product item) {
        int position = findItem(item);
        if (position >= 0) {
            return false;
        }
        products.add(item);
        return true;
    }


    private int findItem(Product item) {
        return products.indexOf(item);
    }

    public static class FontFoundException extends RuntimeException {
        public FontFoundException() {
        }

        public FontFoundException(String message) {
            super(message);
        }
    }

}
