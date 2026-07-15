//package online_shopping_stream_api;

public class Customer  extends Person{
    
    String city;
    String primeMinister;
    Customer(int id,String name,String email,String city,String primeMinister){
        super(id,name,email);
        this.city=city;
        this.primeMinister=primeMinister;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getPrimeMinister() {
        return primeMinister;
    }
    public void setPrimeMinister(String primeMinister) {
        this.primeMinister = primeMinister;
    }

    public String toString() {
        return "Customer [city=" + city + ", primeMinister=" + primeMinister + ", id=" + id + ", name=" + name
                + ", email=" + email + "]";
    }

    
}
