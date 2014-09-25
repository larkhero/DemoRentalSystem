/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demorentalsystem;

/**
 *
 * @author chiayin
 */
public class Customer {
    private int cusId;
    private String phone;
    private String name;
    private String addr;
    public static int nextId=1;
    
    public int getId(){return cusId;}
    public void setPhone(String ph){phone=ph;}
    public static int getNextId(){return nextId;}
    
    public Customer(String name, String ph, String addr){
    this.name=name; this.addr=addr; phone=ph; cusId=nextId++;
    }
    
    public Customer(){}
    
    public String getDetails(){
    return cusId+","+name+","+addr+","+phone;
    }
}
