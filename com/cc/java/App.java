package com.cc.java;

public class App 
{

    public static void main(String[] args) 
    {
        Cat cat = new Cat("Bernhard", "white", 29, false);

        output("Name: " + cat.getStringAttributes("#name"));
        output("Fellfarbe: " + cat.getStringAttributes("#color"));
     
        output("Alter: " + cat.getAge());  
        output("Alter: " + cat.getAge());  
        output("Alter: " + cat.getAge());  
        output("Alter: " + cat.getAge());  
              
        output("----------------");

       
        Cat cat1 = new Cat("Christina", "pluti full", 32, thrue);

        output("Name: " + cat1.getStringAttributes("#name"));
        output("Fellfarbe: " + cat1.getStringAttributes("#color"));
   
   
        output("Alter: " + cat1.getAge());        
        output("----------------");
    }

    public static void output(String outputStr) 
    {
         System.out.println(outputStr);
    }

}



