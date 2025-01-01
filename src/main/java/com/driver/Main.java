package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwonly = new RWOnly();
        // Try setting a value to name by directly accessing it using obj and also try printing it
        // rwonly.name = "Sanket";
        // 'name' has private access in 'com.driver.RWOnly'

        rwonly.setName("Sanket");
        System.out.println(rwonly.getName());
    }
}