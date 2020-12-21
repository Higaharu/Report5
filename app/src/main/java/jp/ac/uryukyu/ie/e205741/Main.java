package jp.ac.uryukyu.ie.e205741;

public class Main {
    public static void main (String[] args){
        try{
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException n) {
            System.out.println("NullPointerException");
            System.out.println(n.getMessage());
        }
    }
}