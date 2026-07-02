//package generics;

public class Extra<T> {
    T data;
    void setItem (T data) {
        this.data = data;
    }
    T getItem() {
        return data;
    }
    public static void main(String[] args) {
        Extra<Integer> ex=new Extra<>();
        ex.setItem(45);
        System.out.println(ex.getItem());
    }

    

}
