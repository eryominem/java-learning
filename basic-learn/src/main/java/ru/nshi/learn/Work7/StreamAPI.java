package ru.nshi.learn.Work7;
import java.util.*;
import java.io.*;
import java.net.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    static String url = "https://raw.githubusercontent.com/rassafel/java-learn/master/tasks/data/CAR_DATA.csv";
    static Map<String, Integer> HEADERS = new HashMap<>();
    static String DELIMITER = ",";
    static String pathToFile = "C:\\Temp\\";

    public static void main(String[] args) throws IOException {
        HEADERS = getHeaders();

        //ПУНКТЫ 3-5.
        BufferedReader reader = getReader();
        Car[] cars = convertToOOP(reader); //пункты 3-5
        carsToFile(cars, pathToFile + "Cars.txt");

        //ПУНКТ 6
        Map<String, List<Car>> mapByKeyColor = groupByColor(cars);
        mapByKeyColorToFile(mapByKeyColor, pathToFile+"GroupByColor.txt");

        /*mapByKeyColor.forEach((color, car) -> {
            System.out.println(color);
            car.forEach(System.out::println);
            System.out.println();
        });*/

        //ПУНКТ 7
        Map<CarMaker, List<Car>> mapByCarMaker = groupByMaker(cars);
        List<CarMaker> carMakersList = new ArrayList<>(mapByCarMaker.keySet());
        makersToFile(carMakersList, pathToFile + "Makers.txt");

        System.out.println("CarMakers:");
        carMakersList.forEach( maker -> System.out.println(maker.getCars()));

        //ПУНКТ 8
        List<CarMaker> sortMakers = carMakersList.stream()
            .filter(maker -> maker.getCars().size() > 2)
            .sorted(Comparator.comparing(maker -> maker.getCarMakerName()))
            .collect(Collectors.toList());

        makersToFile(sortMakers, pathToFile + "sortMakers.txt");

    }

    static Car[] convertToOOP(BufferedReader reader) {
        Stream<String> lines = reader.lines();
        Car[] cars;
        cars = lines
            .skip(1)
            .filter(StreamAPI::checkPresenceMaker)
            .map(Car::stringToCar)
            .toArray(Car[]::new);
        return cars;
    }

    static boolean checkPresenceMaker (String row) {
        return (!row.contains(",,"));
    }

    static Map<String, List<Car>> groupByColor(Car[] cars) {
        return Arrays.stream(cars).collect(Collectors.groupingBy(Car::getColor));
    }

    static Map<CarMaker, List<Car>> groupByMaker(Car[] cars) {
        return Arrays.stream(cars).collect(Collectors.groupingBy(Car::getCarMaker));
    }

    static void carsToFile(Car[] cars, String toFile) throws IOException {
        try {
            File file = new File(toFile);
            if (!file.exists())
                file.createNewFile();

            FileWriter fw = new FileWriter(file);
            for (Car car: cars)
                fw.append(car.toString() + '\n');
            fw.close();

        }
        catch (IOException e) {
            System.out.println("Error - " + e);
        }
    }

    static void makersToFile(List<CarMaker> carMakersList, String toFile) throws IOException {
        File file = new File(toFile);
        try {
            if (!file.exists())
                file.createNewFile();
        }
        catch (IOException e) {
            System.out.println("Error - " + e);
        }
        FileWriter fw = new FileWriter(file);
        for (CarMaker maker : carMakersList) {
            fw.append(maker.getCarMakerName() + ":\n");

            List<Car> cars = maker.getCars();
            for (Car car : cars)
                fw.append(car.toString() + "\n");
        }
        fw.close();
    }

    static void mapByKeyColorToFile(Map<String, List<Car>> mapByKeyColor, String toFile) throws IOException {
        File file = new File(toFile);
        try {
            if (!file.exists())
                file.createNewFile();
        }
        catch (IOException e) {
            System.out.println("Error - " + e);
        }

        FileWriter fw = new FileWriter(file);
        mapByKeyColor.forEach((color, cars) -> {
            try {
                fw.append(color + ":\n");
                for (Car car: cars) {
                    fw.append(car.toString() + '\n');
                }
            }
            catch (IOException e) {
                System.out.println("Error - " + e);
            }
        });
        fw.close();
    }

    static BufferedReader getReader() throws IOException {
        URL url = new URL(StreamAPI.url); // сетевой ресурс
        URLConnection urlConnection = url.openConnection(); // связыванье с сетью
        return new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
    }

    static Map<String, Integer> getHeaders() throws  IOException {
        Map<String, Integer> headers = new HashMap<>();

        URL url = new URL(StreamAPI.url);
        URLConnection urlConnection = url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        String header = reader.readLine(); //считываем заголовки
        String[] headersArray = header.split(","); //получаем массив из заголовков, чтобы получить их кол-во

        for (int i = 0; i < headersArray.length; i++) {
            headers.put(headersArray[i], i);
        }
        return headers;
    }
}
