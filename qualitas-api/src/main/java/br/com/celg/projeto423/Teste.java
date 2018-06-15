package br.com.celg.projeto423;

import java.io.File;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by bruno on 26/09/16.
 */
public class Teste {


   static{
        try {

//            Properties p = System.getProperties();
//            Enumeration keys = p.keys();
//            while (keys.hasMoreElements()) {
//                String key = (String)keys.nextElement();
//                String value = (String)p.get(key);
//                System.out.println(key + ": " + value);
//            }


            System.loadLibrary("OpenDSSDirect");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args){



        //System.loadLibrary("chilkat");
    }
}