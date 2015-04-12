/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import jssc.SerialPort;
import jssc.SerialPortException;

/**
 *
 * @author Oscar
 */
public class PruebaCom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SerialPort serialPort = new SerialPort("COM3");
        
        try {
            System.out.println("Port opened: " + serialPort.openPort());
            System.out.println("Params setted: " 
                + serialPort.setParams(9600, 8, 1, 0));
                 
             try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            
            System.out.println("\"Hello World!!!\" successfully writen to port: " 
               // + serialPort.writeBytes("Hello World!!!".getBytes()));
                    + serialPort.writeBytes("100".getBytes()));
           
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
                 
            System.out.println("Port closed: " 
                + serialPort.closePort());
        }
        catch (SerialPortException ex){
            System.out.println(ex);
        }
    }
    
}
