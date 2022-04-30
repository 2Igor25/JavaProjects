package ru.edu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class GreetingImpl implements Greeting{
    @Override
    public String getFirstName() {
        return "Игорь";
    }

    @Override
    public String getSecondName() {
        return "Терехин";
    }

    @Override
    public String getLastName() {
        return "Сергеевич";
    }

    @Override
    public String getBirthYear() {
        return "17.11.2002";
    }

    @Override
    public Collection<String> getHobbies() {
        return new LinkedList<>(List.of("Программирование","Баскетбол", "Математика"));
    }


    @Override
    public String getPhone() {
        return "8982475ю...";
    }


    @Override
    public Collection<String> getEducationInfo() {
        return new LinkedList<>(List.of("Лицей 9","Колледж СПО при ПГНИУ"));
    }
}
