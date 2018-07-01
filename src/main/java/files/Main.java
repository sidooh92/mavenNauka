package files;

import com.google.common.base.Charsets;
import com.google.common.io.CharSink;
import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String... args) throws IOException {
        //wyjatki ->  //testMethodTryCatch(args);
        //zapisywanie i czytanie pliku txt
        //zapisywanie i czytalnie pliku csv
        //wyniki bedziemy przechowywac w tablicy
        //sciezka C:\Pliki\plik_csv  C:\Pliki\plik_tekstowy
        //try with resources -> try catch + finally z zamknieciem
        //  readWithBuffer(fileName);
        //tryWithScanner();
        //readWithStream();
        ///writeToFileOld();
        //writeNewWay();

//        //guava
//        String fileName = "C:\\Pliki\\nowyPlikGuava.txt";
//        File file = new File(fileName);
//        CharSink chs = Files.asCharSink(file, Charsets.UTF_8,
//                FileWriteMode.APPEND);
//        chs.write("TEST");
//
//        //apache commons
//
//        FileUtils.writeStringToFile(
//                file, "Spain\r\n", StandardCharsets.UTF_8, true);
//
        String csvFile = "C:\\Pliki\\plik_csv.csv";
        String line = "";
        String csvSplitBy = ",";
        List<Person> myPersonList = new ArrayList<>();
        try (BufferedReader br =
                     new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] personRecord = line.split(csvSplitBy);
                String id = personRecord[0];
                String name = personRecord[1];
                Person newPerson = new Person(id,name);
                myPersonList.add(newPerson);
            }
        }


    }
//
//    private static void writeNewWay() {
//        String tekst = "HELLO WORLD DO PLIKU";
//        try {
//            Files.write(
//                    Paths.get("C:\\Pliki\\pisanie8.txt"),
//                    tekst.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void writeToFileOld() {
//        Path path = Paths.get("C:\\Pliki\\nowyPlik.txt");
//        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
//            writer.write("PISZE DO PLIKU");
//
//        } catch (Exception e) {
//            System.out.println("BLAD");
//        }
//    }
//
//    private static void readWithStream() {
//        String fileName = "C:\\Pliki\\plik_tekstowy.txt";
//        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
//
//            stream.forEach(System.out::println);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void tryWithScanner() {
//        String fileName = "C:\\Pliki\\plik_tekstowy.txt";
//        try (Scanner scanner =
//                     new Scanner(new File(fileName))) {
//            while (scanner.hasNext()) {
//                System.out.println(scanner.nextLine());
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//
//
//        }
//    }
//
//    private static void readWithBuffer(String fileName) {
//        try (BufferedReader br =
//                     new BufferedReader(new FileReader(fileName))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("BLAD");
//        }
//    }
//
//    private static void testMethodTryCatch(String[] args) {
//        int a = Integer.valueOf(args[0]);
//        int b = Integer.valueOf(args[1]);
//        try {
//            int zmienna = a / b;
//            System.out.println("NAPIS PO ZMIENNEJ");
//        } catch (ArithmeticException error) {
//            System.out.println("mamy blad dzielenia przez zero");
//        } catch (Exception error) {
//            System.out.println("tutaj blad ogolny");
//        } finally {
//            System.out.println("TO sie wykona zawsze");
//        }
//        System.out.println("Koniec programu");
//    }

}
