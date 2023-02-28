package myapp.service;

import myapp.service.DataProviderServiceI;

public class ImageDataProviderService implements DataProviderServiceI {

    /*public static void main(String[] args) {
        String test = "com.inteli";
        String[] arr = test.split("\\.");
        System.out.println(arr.length);
        System.out.println("----?"+arr.toString());
    }*/

    public String provideData() {
        return "data";
    }
}
