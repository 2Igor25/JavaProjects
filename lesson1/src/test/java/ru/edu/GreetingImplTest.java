package ru.edu;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GreetingImplTest extends TestCase {

    private GreetingImpl greeting = new GreetingImpl();

    public void testGetFirstName() {
        Assert.assertEquals("Игорь", greeting.getFirstName());
    }

    public void testGetSecondName() {
        Assert.assertEquals("Терехин", greeting.getSecondName());
    }

    public void testGetLastName() {
        Assert.assertEquals("Сергеевич", greeting.getLastName());
    }

    public void testGetBirthYear() {
        Assert.assertEquals("17.11.2002", greeting.getBirthYear());
    }

    public void testGetHobbies() {
        ArrayList hobbies = (ArrayList) greeting.getHobbies();
        Assert.assertEquals("Программирование ", hobbies.get(0));
        Assert.assertEquals("Баскетбол",hobbies.get(1));
        Assert.assertEquals("Математика", hobbies.get(2));

    }

    public void testGetPhone() {
        Assert.assertEquals("8982475....", greeting.getPhone());
    }

    public void testGetEducationInfo() {
        ArrayList educationInfo = (ArrayList) greeting.getEducationInfo();
        Assert.assertEquals("Лицей 9", educationInfo.get(0));
        Assert.assertEquals("Колледж СПО при ПГНИУ", educationInfo.get(1));
    }
}
