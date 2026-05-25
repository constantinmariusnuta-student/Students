package students;

import java.io.*;
import java.util.*;

public class Application {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Map<Integer, Integer> note = new HashMap<>();
        try (BufferedReader br =
                     new BufferedReader(new FileReader("student.csv"))) {

            String line;
            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");
                int nrMatricol = Integer.parseInt(values[0].trim());
                String prenume = values[1].trim();
                String nume = values[2].trim();
                String grupa = values[3].trim();
                int nota = Integer.parseInt(values[4].trim());

                Student s = new Student(
                        nrMatricol,
                        prenume,
                        nume,
                        grupa,
                        nota
                );

                students.add(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        afiseaza(students);

        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter("output.csv"))) {

            for (Student s : students) {
                bw.write(s.toCSV());
                bw.newLine();
            }

            System.out.println("\nFisier exportat!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        ExcelExporter.export(students);
    }


    private static void afiseaza(List<Student> students) {
        System.out.println("Studentii");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\ntudenti cu nota 10:");
        for (Student s : students) {
            if (s.nota() == 10) {
                System.out.println(s);
            }
        }

        System.out.println("\nStudenti cu nota mai mica sau egala cu 4:");
        for (Student s : students) {
            if (s.nota() <= 4) {
                System.out.println(s);
            }
        }
        System.out.println("\nMedia notelor");
        float suma = 0;
        for (Student s : students) {
             suma += s.nota();
        }
        System.out.println("Media notelor: " + suma / students.size());
    }
}