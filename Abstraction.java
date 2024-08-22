
===================  RULE 1 ==========================
// RULE 1 :  It is not mandetory have abstract method inside abstract class

package Abstraction;

abstract class A{
    //abstract void show();             

    void hello(){                                  // Here we commented show method
        System.out.println("Hello Java");
    }
}
public class Rule1 extends A {
   
}

===================  RULE 2 ==========================
 //  RULE 2 : If class have abstract method then this class must be a abstract class.

package Abstraction;

 abstract class Ab{               
    abstract void print();         // here in Ab class abstract method is present then Ab class must be declared as abstract otherwise CE occoured.
}

class Rule2 extends  Ab{
    void print(){
            System.out.println("Rule2");
    }

    public static void main(String[] args) {
              new Rule2().print();      // Rule 2
    }
}

===================  RULE 3 ==========================
// Rule no 3 : We can not create object of Absract class.

package Abstraction;

public abstract class Rule3 {     
     abstract void display();

    public static void main(String[] args) {
       // Rule3 r=new Rule3();

        /* If we try to create object of abstract class we will get ,
                                   "Rule3 is abstract; cannot be instantiated" .  */
    }
}

===================  RULE 4 ==========================

/*
Rule 4 :  Rules no 4 says that if concrete class extends a abstract class then all methods of parent abstract class
must be Override or implement in Sub class which is Concrete class.
 */

package Abstraction;

abstract class Test1{
    abstract void display();
}
public class Rule4  extends Test1{
      void display(){
          System.out.println("Rule 4");    // < == here in child class we have to give implementation body for abstract method
      }
      public static void main(String[] args){
        Rule4 r=new Rule4();
          r.display();    // Rule4 
    }
}

===================  RULE 5 ==========================
/*
  Rule 5 : - Rule no 5 says that if one abstract class extends another abstract class then there is no need to give
             implementation for parent class abstract methods.
 */
package Abstraction;
abstract class Parent1{
    abstract void show();
}

public abstract class Rule5 extends Parent1{
    // Here no need to give implementation or body to parent class abstract methods.
    // here child class and parent class both are abstract class then no CE .

    public static void main(String[] args){
        
    }
}





