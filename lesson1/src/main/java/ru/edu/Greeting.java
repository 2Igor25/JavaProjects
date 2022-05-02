package ru.edu;
import java.util.Collection;

public interface Greeting {
    /**
     * Get first name.
     */
    String getFirstName();

    /**
     * Get second name
     */
    String getSecondName();

    /**
     * Get last name.
     */
    String getLastName();

    /**
     * Get birth year.
     */
    String getBirthYear();

    /**
     * Get hobbies.
     */
    Collection<String> getHobbies();


    /**
     * Get phone number.
     */
    String getPhone();



    /**
     * Print your university and faculty here.
     */
    Collection<String> getEducationInfo();

}

