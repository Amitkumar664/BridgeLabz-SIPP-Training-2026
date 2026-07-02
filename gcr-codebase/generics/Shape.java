//package generics;

public class Shape<T> {
    int  side;
    void setSide(N side){
        this.side=side;
    }
     T area(){
        // System.out.println("Area of shape with side: "+side);
        return side*side; 
    }
    public static void main(String[] args) {
        Shape<Integer> square =new Shape<>();
        square.setSide(4);
        System.out.println("Area of square: "+square.area());
    }

}
