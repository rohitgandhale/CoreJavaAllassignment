package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListProductDemo2 {
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<>();
        Product product1=new Product(1,"laptop",65000);
        Product product2=new Product(2,"computer",56000);
        Product product3=new Product(3,"mobile",23000);
        Product product4=new Product(4,"tablet",10000);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);


        Comparator<Product> referenceOfTypeComparator=new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return
                p1.getProductPrice()-p2.getProductPrice()        ;
            }
        };
        Collections.sort(productList,referenceOfTypeComparator);
        for (Product product:productList) {
            System.out.println(product);
        }
    }
}
