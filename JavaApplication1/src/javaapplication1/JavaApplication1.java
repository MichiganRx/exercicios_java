/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author 974635
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EXERCÍCIO 1
        System.out.println("Hello World!");
        
        // EXERCÍCIO 2
        // THIS IS A SINGLE-LINE COMMENT
        /* THIS IS A MULTI-LINE COMMENT */
        
        // EXERCÍCIO 3
        String carName = "Volvo";
        System.out.println(carName);
        
        // EXERCÍCIO 4
        int maxSpeed = 120;
        System.out.println(maxSpeed);
        
        // EXERCÍCIO 5
        int x = 5;
        int y = 10;
        System.out.println(x + y);
        
        // EXERCÍCIO 6
        int z = x + y;
        System.out.println(z);
        
        // EXERCÍCIO 7
         x = 5;
         y = 6;
         z = 50;
        System.out.println(x + y + z);
        
        // EXERCÍCIO 8
        int myNum = 9;
        System.out.println(myNum);
        float myFloatnum = 8.99f;
        System.out.println(myFloatnum);
        String myLetter = "A";
        System.out.println(myLetter);
        boolean myBool = false;
        System.out.println(myBool);
        String myText = "Hello World!";
        System.out.println(myText);
        
        // EXERCÍCIO 9
        // JAVA DATA TYPES
        
        // EXERCÍCIO 10
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myInt);
        
        // EXERCÍCIO 11
        System.out.println(10 * 5);
        
        // EXERCÍCIO 12
        System.out.println(10 / 5);
        
        // EXERCÍCIO 13
        x = 10;
        x++;
        System.out.println(x);
        
        // EXERCÍCIO 14
        x = 10;
        x += 5;
        System.out.println(x);
        
        // EXERCÍCIO 15
        String greeting = "Hello!";
        System.out.println(greeting);
        
        // EXERCÍCIO 16
        String txt = "hello!";
        System.out.println(txt.toUpperCase());
        
        // EXERCÍCIO 17
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + ' ' + lastName);
        
        // EXERCÍCIO 18
        firstName = "John";
        lastName = "Doe";
        System.out.println(firstName.concat(lastName));
        
        // EXERCÍCIO 19
        txt = "Hello Everybody";
        System.out.println(txt.indexOf("e"));
        
        // EXERCÍCIO 20
        x = 5;
        y = 10;
        System.out.println(Math.max(x,y));
        
        // EXERCÍCIO 21
       x = 16;
       System.out.println(Math.sqrt(x));
       
       // EXERCÍCIO 22
       double rand = Math.random() * 1;
       System.out.println(rand);
       
       //EXERCÍCIO 23
       boolean isJavaFun = true;
       boolean isFishTasty = false;
       System.out.println(isJavaFun);
       System.out.println(isFishTasty);
       
       //EXERCÍCIO 24
       x = 10;
       y = 9;
       System.out.println(x > y);
       
       // EXERCÍCIO 25
       x = 50;
       y = 10;
       
       if (x > y){
        System.out.println("Hello World!");   
       }
       
       // EXERCÍCIO 26
       x = 50;
       y = 50;
       
       if (x == y){
        System.out.println("Hello World!");   
       }
       
       // EXERCÍCIO 27
       x = 50;
       y = 50;
       
       if (x == y){
        System.out.println("Yes!");   
       }else{
           System.out.println("No!");
       }
       
       // EXERCÍCIO 28
       x = 50;
       y = 50;
       
       if (x == y){
        System.out.println("1");   
       }else if (x > y) {
           System.out.println("2");
       }else {
           System.out.println("3");
       }
       
       // EXERCÍCIO 29
       int time = 20;
       String result = (time < 18) ? "Good day." : "Good evening.";
       System.out.println(result);
       
       // EXERCÍCIO 30
       int day = 2;
       switch (day) {
           
           case 1:
           System.out.println("Saturday");
           break;
           
           case 2:
           System.out.println("Sunday");
           break;
       }
       
       // EXERCÍCIO 31
       day = 4;
       switch (day) {
           
           case 1:
           System.out.println("Saturday");
           break;
           
           case 2:
           System.out.println("Sunday");
           break;
           
           default:
           System.out.println("Weekend");    
       }
       
       // EXERCÍCIO 32
       int i = 1;
       while (i < 6){
           System.out.println(i);
           i++;
       }
       
       // EXERCÍOCIO 33
       i = 1;
       do {
           System.out.println(i);
           i++;
       }
       while (i < 6);
       
       // EXERCÍCIO 34
       for ( i = 0; i < 5; i++){
           System.out.println("Sim!");
       }
       
       // EXERCÍCIO 35
       String[] cars = {"Volvo", "BMW", "Ford"};
       for (String c : cars){
           System.out.println(c);
       }
       
       // EXERCÍCIO 36
       for (i = 0; i < 10; i++){
           if (i == 5){
               break;
           }
           System.out.println(i);
       }
       
       // EXERCÍCIO 37
       for (i = 0; i < 10; i++) {
           if (i == 4) {
               continue;
            }
            System.out.println(i);
        }
    
       // EXERCÍCIO 38
       //String[] cars = {"Volvo", "BMW", "Ford"};
       
       // EXERCÍCIO 39
       System.out.println(cars[1]);
       
       // EXERCÍCIO 40
       cars[0] = ("Opel");
       System.out.println(cars[0]);
       
       // EXERCÍCIO 41
       //String[] cars = {"Volvo", "BMW", "Ford"};
       System.out.println(cars.length);
       
       // EXERCÍCIO 42
       //String[] cars = {"Volvo", "BMW", "Ford"};
       for (String c : cars){
           System.out.println(c);
       }
       
       // EXERCÍCIO 43
       int[][] myNumbers = {{1,2,3,4}, {5,6,7}};
      
       /* EXERCÍCIO 44
       RESPOSTA myMethod(); */
       
       /* EXERCÍCIO 45
       RESPOSTA myMethod();
                myMethod();*/
       
       /* EXERCÍCIO 46
       RESPOSTA:
       static void myMethod(String fname) {
            System.out.println(fname + " Doe");
        } */
       
       /* EXERCÍCIO 47
       RESPOSTA:
       static int myMethod(int x) {
           return 5 + x;
        }
       */
       
    }
    
    // EXERCÍCIO 48
       public class MyClass {
         int x =5;  
    
    // EXERCÍCIO 49
    MyClass myObj = new MyClass();
    
    // EXERCÍCIO 50
        //System.out.println(myObj.x);
    
    // EXERCÍCIO 50
    // myObj.myMethod();
    
    /* EXERCÍCIO 51
    public class MyClass {
  int x;
    }
     public MyClass() {
    x = 5;
    }
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
    */
    
    /* EXERCÍCIO 52
    final class MyClass
    */
    
    /* EXERCÍCIO 53
    import java.util.Scanner;
    */
    
    /* EXERCÍCIO 54
    class Car extends Vehicle;
    */
    
    }
     
    }
    
