package TestsOfJava_Lists_at_java.example_my_teacher;

import java.util.Objects;

public class Product {
    private final int id;
    private final String name ;

    public Product(int id , String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    /**
     * <ul>helloo sholsgols klfjlslsls</ul>
     * lskfjlsglknglkssg
     * <li>this method id important</li>
     * @return
     */

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
