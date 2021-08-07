package task5.com.home.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import task1.com.home.utils.Printer;
import task5.com.home.model.Car;
import task5.com.home.utils.JsonReader;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Car car = JsonReader.readJson();
        Printer.print(car.toString());
    }
}
