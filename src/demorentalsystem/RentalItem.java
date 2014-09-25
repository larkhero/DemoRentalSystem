/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demorentalsystem;

import java.util.Date;
/**
 *
 * @author chiayin
 */
public class RentalItem {
    private int itemId; 
    protected String title;
    private String producer; 
    protected int year;
    private double rentalRate;
    private double latefeesPerDay = 1;
    private Date dueDate;
    
    public RentalItem(String t, int y) {
             title = t; year = y; }
    public RentalItem(){}
    
    public void print() {
         System.out.println( title +" "+ year+" "+dueDate);
    }
}

