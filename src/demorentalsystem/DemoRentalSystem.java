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
public class DemoRentalSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer c1,c2;
        c1=new Customer();
        c2=new Customer("lark","3522784799","1015 NW 21st AVE");
        Customer c3=new Customer("mark","3522784646","UF");
        
        System.out.println(c3.getDetails());
        System.out.println(c2.getDetails());
        
        System.out.println(c1.getNextId());
        System.out.println(c3.getNextId());
        System.out.println(Customer.getNextId());
        
        RentalItem v1,v3;
        v1=new Video();
        RentalItem v2=v1;
        v1.print();
        v3=new RentalItem();
        System.out.println(v1.equals(v3));
        
        RentalItem[] items = new RentalItem[20];
            Video v4 = new Video();
            items[0] = v4;
            
        for (int i = 0; i < items.length; i++){
            if(items[i]!= null) {
                items[i].print();
            }
        }
        
        Video v = new Video("Thor", 2004, "action");
        v.print();
        
        System.out.println(v.toString());
    }
}