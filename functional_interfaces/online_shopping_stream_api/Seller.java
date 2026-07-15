//package online_shopping_stream_api;

public class Seller extends Person {

    String companyName;
    String sellerRating;
    Seller(int id,String name,String email,String companyName,String sellerRating){
        super(id,name,email);
        this.companyName=companyName;
        this.sellerRating=sellerRating;
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

    
}
