/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

/**
 *
 * @author hilbe
 */
public class name_display {
 String name="gavaskar";
 int times=0;
 void print_name()
 { 
     System.out.println("Name is " + name);
     times=times+1;
     if(times<10)
     {
     print_name();
     }
     
 }
}
