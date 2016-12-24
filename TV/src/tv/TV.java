
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv;

/**
 *
 * @author Emad
 */
public class TV {

    /**
     * @param args the command line arguments
     */
    //Data fileld that identify variables
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    
    //create default constructor
    public TV(){
        
    }
 
    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV();
        TV tv3 = new TV();
        
        tv1.turnOn();
        tv1.setChannel(1);
        tv1.setVolume(1);
        tv1.printDetails();
        
        tv2.turnOn();
        tv2.setChannel(120);
        tv2.setVolume(7);
        tv2.printDetails();
        
        tv3.turnOn();
        tv3.setChannel(30);
        tv3.setVolume(3);
        tv3.printDetails();
    }
    //turn on method use to check if the tv is on or not if it off it turns on
    public void turnOn(){
        if(on==false){
           on=true; 
        } 
    }
    //turn off method use to check if the tv is on or not if it off it turns off
    public void turnOff(){
        if(on==true){
            on=false;
        }
    }
    //setChannel method use to set new channel 
    public void setChannel(int newChannel){
        this.channel=newChannel;
    }
    //setVolume use to change volume up or down
    public void setVolume(int newVolume){
        this.volumeLevel=newVolume;
    }
    public void channelUp(){
        if(on == true && channel >= 1 && channel <= 120){
            channel++;
        }else{
            channel = 1;
        }
        
    }
    public void channelDown(){
        if(on == true && channel >= 1 && channel <= 120){
            channel--;
        }else{
            channel = 1;
        }
    }
    public void volumeUp(){
        if(on == true && volumeLevel >= 1 && volumeLevel <= 7){
            volumeLevel++;
        }else{
            volumeLevel = 1;
        }
    }
    public void volumeDown(){
        if(on == true && volumeLevel >= 1 && volumeLevel <= 7){
            volumeLevel--;
        }else{
            volumeLevel = 1;
        }
    }
    public void printDetails(){
        System.out.println("Tv is "+on);
        System.out.println("Tv Channel is "+channel);
        System.out.println("Tv Volume is "+volumeLevel);
        System.out.println("----------------------------------");
    }
    
}
