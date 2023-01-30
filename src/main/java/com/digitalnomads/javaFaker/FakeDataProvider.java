package com.digitalnomads.javaFaker;

import com.github.javafaker.Country;
import com.github.javafaker.Faker;

public class FakeDataProvider {

    static Faker faker = new Faker();
   public static void main(String[] args) {

       System.out.println(generateFakeName());
       System.out.println(generateLastFakeName());
       System.out.println(generateFakeEmailAddress());
       System.out.println(generateFakeFunWords());
       System.out.println(myFake().toString());
    }

    public static String generateFakeName(){
        return faker.name().firstName();
    }

    public static String generateLastFakeName(){
       return faker.name().lastName();
    }
    public static String generateFakeEmailAddress(){
        return faker.internet().emailAddress();
    }
    public static String generateFakeFunWords(){
       return faker.chuckNorris().fact();
    }

    public static Country myFake() {
       return faker.country();
    }



}
