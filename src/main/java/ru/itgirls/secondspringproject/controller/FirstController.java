package ru.itgirls.secondspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;
import java.io.Console;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

@RestController

public class FirstController {

    @GetMapping("/dayOfWeek")
    public String dayOfWeek() {

        String finalDay = "";
        System.out.println("Enter the day of the week:");
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.next();

        switch(dayOfWeek.toLowerCase()) {
            case "monday":
                finalDay = "Понедельник";
                break;
            case "tuesday":
                finalDay = "Вторник";
                break;
            case "wednesday":
                finalDay = "Среда";
                break;
            case "thursday":
                finalDay = "Четверг";
                break;
            case "friday":
                finalDay = "Пятнциа";
                break;
            case "saturday":
                finalDay = "Суббота";
                break;
            case "sunday":
                finalDay = "Воскресенье";
                break;
        }
        return finalDay;
    }
}
