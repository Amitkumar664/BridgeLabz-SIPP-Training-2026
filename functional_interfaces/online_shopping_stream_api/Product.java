//package online_shopping_stream_api;

public class Product {
    int productId;
    String productName;
    String category;
    double price;
    String rating;
    boolean inStock;
    Seller seller;
    Product(int productId,String productName,String category,double price,String rating,boolean inStock,Seller seller){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
        this.price=price;
        this.rating=rating;
        this.inStock=inStock;
        this.seller=seller;
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
