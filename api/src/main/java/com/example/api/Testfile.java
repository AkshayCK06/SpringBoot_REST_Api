package com.example.api;

public class Testfile {
    
    public static void main(String[] args){
        String str= "abcabcbba";
        int i=0;
        StringBuilder strbuilder = new StringBuilder();
        strbuilder.append(str.charAt(0));
        for(int j=0 ; j< str.length(); j++){
            if(str.charAt(i) != str.charAt(j)){
                strbuilder.append(str.charAt(i));
                i++;
            }
        }
        System.out.println(strbuilder.toString());

    }
}
