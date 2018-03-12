package com.javarush.task.task14.task1419;


import javax.swing.undo.CannotRedoException;
import java.io.IOException;
import java.math.BigDecimal;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int k[] = new int[1]; k[2] = 1;
        } catch(Exception e){ exceptions.add(e); }
        try { throw new IOException(); } catch (Exception e){ exceptions.add(e); }
        try { throw new ArrayStoreException(); } catch (Exception e){ exceptions.add(e); }
        try { throw new CannotRedoException(); } catch (Exception e){ exceptions.add(e); }
        try { throw new NullPointerException(); } catch (Exception e){ exceptions.add(e); }
        try { throw new SecurityException(); } catch (Exception e){ exceptions.add(e); }
        try { throw new ConcurrentModificationException(); } catch (Exception e){ exceptions.add(e); }
        try { throw new ClassCastException(); } catch (Exception e){ exceptions.add(e); }
        try { throw new ProviderException(); } catch (Exception e){ exceptions.add(e); }


    }
}
