package seminars.first.hw;

import org.assertj.core.api.Assertions;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    */
    public static void main(String[] args) {
        Product product1 = new Product(25, "Хлеб");
        Product product2 = new Product(100, "Минералка");
        Product product3 = new Product(20, "Кетчуп");
        Product product4 = new Product(5, "Колбаса");
        Product product5 = new Product(35, "Котлета");

        Shop shop = new Shop();

        shop.add(product1);
        shop.add(product2);
        shop.add(product3);
        shop.add(product4);
        shop.add(product5);


        System.out.println("Изначальный список продуктов:");
        for (Product product : shop.getProducts()) {
            System.out.println(product);
        }

        System.out.println();
        System.out.println("Отсортированный список продуктов:");
        for (Product product : shop.getSortedListProducts()) {
            System.out.println(product);
        }
        System.out.println();
        System.out.println(shop.getMostExpensiveProduct());

        // Проверка ожидаемого исключения с использованием утверждений AssertJ:
        // магазин хранит верный список продуктов (количество продуктов, состав корзины)
        Assertions.assertThat((shop.getProducts().contains(product1)));
        Assertions.assertThat((shop.getProducts().contains(product2)));
        Assertions.assertThat((shop.getProducts().contains(product3)));
        Assertions.assertThat((shop.getProducts().contains(product4)));
        Assertions.assertThat((shop.getProducts().contains(product5)));
        Assertions.assertThat(shop.getProducts().contains(shop.getProducts()));

        // магазин возвращает верный самый дорогой продукт из метода getMostExpensiveProduct
        assertThat(shop.getMostExpensiveProduct().getCost()).isEqualTo(120);

    }
}




