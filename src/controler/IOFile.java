/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class IOFile {
    public static void writeFile(List ob, String s){
        ObjectOutputStream w;
        try{
            w= new ObjectOutputStream(new FileOutputStream(s));
            for(Object o1:ob){
                w.writeObject(o1);
            }
            w.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public static void readFile(List ob, String s){
        ObjectInputStream r;
        try{
            r= new ObjectInputStream(new FileInputStream(s));
            Object obj= null;
            try{
                while((obj= r.readObject())!=null){
                    Object o1= (Object)obj;
                    ob.add(o1);
                }
                r.close();
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
            }
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
