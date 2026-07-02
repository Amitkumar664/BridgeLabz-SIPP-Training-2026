//package generics;
class Fruit<T>{
    T data ;
    void setItem(T data){
        this.data=data;
    }
    T getItem(){
        return data;
    }
    class Banana extends Fruit<String>{
        String name;
        void setName(String name){
            this.name=name;
        }
        String getName(){
            return name;
        }
    } 
    class Mango extends Fruit<Integer>{
        Integer price;
        void setPrice(Integer price){
            this.price=price;
        }
        Integer getPrice(){
            return price;
        }
    }

    //extend in bananam and mango


    // T item;
    // void setItem(T item){
    //     this.item=item;
    // }
    // T getItem(){
    //     return item;
    // }
    // public static void main(String[] args) {
    //     Fruit<String> fruit=new Fruit<>();
    //     fruit.setItem("Apple");
    //     System.out.println(fruit.getItem());
    // }
}
class Box<T> extends Fruit{
    private T item;
    public void setItem(T item) {
     this.item = item;
    }
    public T getItem() {
        return item;
    }
   
    public static void main(String[] args) {
        
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Apple");
        System.out.println("Fruit name : " + stringBox.getItem());

        Box<Integer> integerBox = new Box<>();
        // integerBox.setItem("helo");
        integerBox.setItem(80);

        System.out.println("Fruit price : " + integerBox.getItem());

    }
}


// class Flight<T> {
//     private T flightNumber;
//     public Flight(T flightNumber) {
//          this.flightNumber = flightNumber;
//     }
//     public T getFlightNumber() {
//         return flightNumber;
//     }
//     public static void main(String[] args) {
        
//         Flight<String> flight1 = new Flight<>("AI-202");
//         Flight<Integer> flight2 = new Flight<>(101);
//         System.out.println("Flight 1 Number: " + flight1.getFlightNumber());
//         System.out.println("Flight 2 Number: " + flight2.getFlightNumber());
//     }

// }

// class Fruit<T> {

//     T item;

//     void setItem(T item) {
//         this.item = item;
//     }

//     T getItem() {
//         return item;
//     }

//     class Banana extends Fruit<String> {
//         String name;

//         void setName(String name) {
//             this.name = name;
//         }

//         String getName() {
//             return name;
//         }
//     }

//     class Mango extends Fruit<Integer> {
//         Integer price;

//         void setPrice(Integer price) {
//             this.price = price;
//         }

//         Integer getPrice() {
//             return price;
//         }
//     }
// }

// class Box<T> extends Fruit<T> {

//     public static void main(String[] args) {

//         Box<String> stringBox = new Box<>();
//         stringBox.setItem("Hello, Generics!");
//         System.out.println("String Box: " + stringBox.getItem());

//         Box<Integer> integerBox = new Box<>();
//         integerBox.setItem(42);
//         System.out.println("Integer Box: " + integerBox.getItem());

//         Fruit<String> fruit = new Fruit<>();
//         Fruit<String>.Banana banana = fruit.new Banana();
//         banana.setName("Banana");
//         System.out.println("Banana Name: " + banana.getName());

//         Fruit<Integer> fruit2 = new Fruit<>();
//         Fruit<Integer>.Mango mango = fruit2.new Mango();
//         mango.setPrice(150);
//         System.out.println("Mango Price: " + mango.getPrice());
//     }
// }