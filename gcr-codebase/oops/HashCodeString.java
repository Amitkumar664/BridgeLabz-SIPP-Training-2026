class Student{
    String name;
    int age;
    String college;

    Student(String name,int age,String college){
        this.name=name;
        this.age=age;
        this.college=college;
    }

    public boolean equals(Student s){
        if((name.equals(s.name)) && (age==s.age) && (college.equals(s.college)) ){
            return true;
        }
        return false;

    }

    public int HashCodeString(){
        return age;

    }

    public String toString(){
        return age+" "+name+" "+ college;
    }
}

public class HashCodeString {
    public static void main(String[] args) {
        Student s1=new Student("Amit",22,"GLA");
        Student s2=new Student("Amit", 22, "GLA");

        System.out.println(s1);

        System.out.println(s2);

        //   // Calls equals() method
        // System.out.println("Equal: " + s1.equals(s2));

        // Calls hashCode() method
        System.out.println("HashCode s1: " + s1.hashCode());

        // Calls hashCode() method
        System.out.println("HashCode s2: " + s2.hashCode());

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()==s2.hashCode());
    }
}
