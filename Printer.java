/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utkarsh.printerchallenge;

/**
 *
 * @author Utkarsh
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    // duplex printer prints onn the both side of the page

    public Printer() {
    }

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100){
        this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted=0;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
    
    public void filltoner(){
        
        int needtofull = 100 - getTonerLevel();
        if(needtofull > 0){
            this.tonerLevel += needtofull;
            System.out.println("TonerLevel is increased by " + needtofull  + " and now it's Full.");
        }else{
            System.out.println("TonerLevel is Already at 100% ");
        }
    }
    public void printpage(){
        if(duplex){
            this.pagesPrinted += 2;
            this.tonerLevel -= 2;
        }else{
            this.pagesPrinted += 1;
            this.tonerLevel -= 1;
        }
    }
    
}
