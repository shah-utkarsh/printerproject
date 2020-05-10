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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Printer printer = new Printer(50,0,false);
//        printer.filltoner();
//        System.out.println(printer.getTonerLevel());
//        
//        for(int i=0; i<6 ; i++){
//            printer.printpage();
//        }
//        System.out.println(printer.getPagesPrinted());
//        System.out.println(printer.getTonerLevel());
//        
        Printer printer =new Printer(45,6,true);
        printer.filltoner();
        System.out.println(printer.getTonerLevel());
        printer.printpage();
        System.out.println(printer.getPagesPrinted());
    }
    
}
