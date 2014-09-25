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
public class Video extends RentalItem{
    private String producer;
    private String cast;
    private String genre;
    private String storyLine;
    
    public Video(String t, int y, String g){
        title = t; year = y; genre = g;
    }
    public Video(){}
    
    public void print() {
       super.print();
       System.out.println(genre+" is a Video");
    }
    
}
