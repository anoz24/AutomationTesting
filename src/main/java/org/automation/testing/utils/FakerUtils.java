package org.automation.testing.utils;

import net.datafaker.Faker;

public class FakerUtils {

    private static final Faker faker = new Faker();

    public static String generateRandomFirstName() {
        return faker.name().firstName();
    }

    public static String generateRandomLastName() {
        return faker.name().lastName();
    }

    public static String generateRandomEmail(String firstName, String lastName) {
        return firstName.toLowerCase() + "_" + lastName.toLowerCase() + "@gmail.com";
    }

    public static String generateRandomStreetAddress() {
        return faker.address().streetAddress();
    }

    public static String generateRandomCity() {
        return faker.address().cityName();
    }

    public static String generateRandomState() {
        return faker.address().state();
    }

    public static String generateRandomZipCode() {
        return faker.address().zipCode();
    }

    public static String generateRandomPhoneNumber() {
        return faker.phoneNumber().subscriberNumber(10);
    }

    public static String generateRandomDay() {
        return String.valueOf(faker.number().numberBetween(1, 28));
    }

    public static String generateRandomMonth() {
        String[] months = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        return months[faker.number().numberBetween(0, 12)];
    }

    public static String generateRandomYear() {
        return String.valueOf(faker.number().numberBetween(1970, 2004));
    }
}
