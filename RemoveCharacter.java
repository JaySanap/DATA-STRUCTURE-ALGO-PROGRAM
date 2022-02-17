package com.company;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str="$%jav*$4$$4a";
        String Removed=str.replaceAll("[^a-zA-Z]","");
        System.out.println(Removed);
    }
}
