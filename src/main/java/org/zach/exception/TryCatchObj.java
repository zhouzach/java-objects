package org.zach.exception;

public class TryCatchObj {
    public static void main (String[] args) {
        int n = getValue();
        System.out.println("n is " + n);

    }

    public static int getValue() {
        int ret;
        try{
            throw new Exception();
        }
        catch(Exception e){
            ret = 1;
            return ret;
        }
        finally{
            ret = 2;
        }
    }
}
