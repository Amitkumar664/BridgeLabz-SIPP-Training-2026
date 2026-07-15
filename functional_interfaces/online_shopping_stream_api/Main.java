//package online_shopping_stream_api;

import java.util.ArrayList;

public class Main {

    public class Person {
        int id;
        String name;
        String email;

        Person(int id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String toString() {
            return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
        }

    }

    public class Customer extends Person {

        String city;
        boolean primeNumber;

        Customer(int id, String name, String email, String city, boolean primeNumber) {
            super(id, name, email);
            this.city = city;
            this.primeNumber = primeNumber;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getPrimeNumber() {
            return primeNumber;
        }

        public void setPrimeMinister(String primeNumber) {
            this.primeNumber = primeNumber;
        }

        public String toString() {
            return "Customer [city=" + city + ", primeMinister=" + primeMinister + ", id=" + id + ", name=" + name
                    + ", email=" + email + "]";
        }

    }
    // package online_shopping_stream_api;

    public class Product {
        int productId;
        String productName;
        String category;
        double price;
        String rating;
        boolean inStock;
        Seller seller;

        Product(int productId, String productName, String category, double price, String rating, boolean inStock,
                Seller seller) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
            this.price = price;
            this.rating = rating;
            this.inStock = inStock;
            this.seller = seller;
        }

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public boolean inStock() {
            return inStock;
        }

        public void setInStock(boolean inStock) {
            this.inStock = inStock;
        }

        public Seller getSeller() {
            return seller;
        }

        public void setSeller(Seller seller) {
            this.seller = seller;
        }

        public String toString() {
            return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
                    + ", price=" + price + ", rating=" + rating + ", inStock=" + inStock + ", seller=" + seller + "]";
        }

    }

    // package online_shopping_stream_api;

    public class Seller extends Person {

        String companyName;
        String sellerRating;

        Seller(int id, String name, String email, String companyName, String sellerRating) {
            super(id, name, email);
            this.companyName = companyName;
            this.sellerRating = sellerRating;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getSellerRating() {
            return sellerRating;
        }

        public void setSellerRating(String sellerRating) {
            this.sellerRating = sellerRating;
        }

        public String toString() {
            return "Seller [companyName=" + companyName + ", sellerRating=" + sellerRating + ", id=" + id + ", name="
                    + name + ", email=" + email + "]";
        }

    }

    public static void main(String[] args) {
        // ArrayList<Product> products = new ArrayList<>();
        // Customers
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(101, "Amit", "amit@gmail.com", "Delhi", true));
        customers.add(new Customer(102, "Rahul", "rahul@gmail.com", "Mumbai", false));
        customers.add(new Customer(103, "Priya", "priya@gmail.com", "Delhi", true));
        customers.add(new Customer(104, "Sneha", "sneha@gmail.com", "Pune", false));

        // Sellers
        ArrayList<Seller> sellers = new ArrayList<>();

        Seller s1 = new Seller(201, "Rakesh", "rakesh@gmail.com",
                "TechWorld", 4.8);

        Seller s2 = new Seller(202, "Mohit", "mohit@gmail.com",
                "MobileHub", 4.3);

        Seller s3 = new Seller(203, "Ankit", "ankit@gmail.com",
                "FashionStore", 4.7);

        sellers.add(s1);
        sellers.add(s2);
        sellers.add(s3);

        // Products
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", "Electronics", 65000, 4.9, true, s1));
        products.add(new Product(2, "Mobile", "Electronics", 25000, 4.7, true, s2));
        products.add(new Product(3, "Headphones", "Electronics", 2000, 4.4, true, s1));
        products.add(new Product(4, "Shoes", "Fashion", 3500, 4.5, false, s3));
        products.add(new Product(5, "T-Shirt", "Fashion", 1200, 4.3, true, s3));
        products.add(new Product(6, "Watch", "Accessories", 5000, 4.8, true, s2));
        products.add(new Product(7, "Keyboard", "Electronics", 1500, 4.2, false, s1));
        products.add(new Product(8, "Bag", "Accessories", 1800, 4.6, true, s3));

        // Display Customers
        System.out.println("Customers:");
        customers.forEach(System.out::println);

        // Display Sellers
        System.out.println("\nSellers:");
        sellers.forEach(System.out::println);

        // Display Products
        System.out.println("\nProducts:");
        products.forEach(System.out::println);

    }
}
