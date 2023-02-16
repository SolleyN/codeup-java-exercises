/* TODO: create a class called Product with two private properties of name and priceInCents.
    Add a public static method called, find average price that takes in an array of products
    and finds the average price of all products. Add a main method to the class to test some
    values.
 */
public class Product {

    private String name;
    private int priceInCents;

    public Product(String name, int priceInCents) {
        this.name = name;
        this.priceInCents = priceInCents;
    }

    public static double findAveragePrice(Product[] products) {
        int totalCents = 0;
        for (Product product : products) {

            totalCents += product.priceInCents;
        }
        return (double) totalCents / products.length;
    }

    public static void main(String[] args){

 Product[] products = {
         new Product ("EVGA 4070 Ti", 800),
         new Product ("AMD Ryzen 5600x", 250),
         new Product ("Intel Ivy Bridge 3700k", 300)
 };

 double averagePrice = Product.findAveragePrice(products);

        System.out.println("Average price: " + averagePrice);
    }

}

