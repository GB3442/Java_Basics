package Constructor;


/*
Q.1) What is constructor ?
ans : A constructor is a special type of method whose name is same as class name but it doesn't have a return type.
      It is called automatically when object is created.

Q.2) Why constructor is used ?
ans : A constructor is used to initialize an objects. In other word we can be say that constructor is used to initialize
      non-static variable or instance variables at the time of object creation.

====== Types of Constructor =====
1) Default Constructor :
      It is a constructor which doesn't take any argument and it is placed by compiler automatically if
      our class not having any constructor by programmer. It is used to iniialized instance variables with default value.

2) No arg Constructor :
      This is a constructor which doesn't have parameters and it is placed by programmer.

3) Parameterized Constructor :
      A constructor which takes an arguments are called as Parameterized Constructor.
      This is used to initialize or assign the instance variable at the time of object creation.

=========== Constructor Chaining ============
Q.1) What is Constructor Chaining ?
    ans : Withing a class when one constructor calls other consturcor using the this() keyword,
          This is known as constructor chaining.  Constructor are not inherited by subclass but we can
          call thr superclass consturctor using super().

Q.2) What us this and super ?
     ans : this() is a keyword or reserved word which represent the current class object reference.
           super() is a keyword or reserved word which represent the super class object reference.


 */




class A{
    //creating int arg constructor
    public  A(int x){
        System.out.println("Tdit");
    }
    //crating no arg constructor
    public  A(){
        this(10);
        System.out.println("No arg of A");
    }
}
public class ConstructorTest extends A{
    //no arg constructor
    public ConstructorTest(){
         this("g","g");
        System.out.println("No arg ConstructorTest");
    }
    //int , String args constructor
    public ConstructorTest(int x,String y){
        this();                                             // tdit -> string string -> no arg -> int string -> Main method
        System.out.println("Int , String ConstructorTest");
    }

    public ConstructorTest(String x,String y){
        super(10);
        System.out.println("String , String ConstructorTest");
    }
    public static void main(String[] args) {
        ConstructorTest obj1=new ConstructorTest(10,"b");
        System.out.println("MAin Method of Child class");

    }
}
