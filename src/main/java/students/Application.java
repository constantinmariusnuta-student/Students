package students;

import java.io.*;
import java.util.*;

public class Application {

    static void main() {

        List<Student> students = new ArrayList<>();
        try (BufferedReader br =
                     new BufferedReader(new FileReader("student.csv"))) {

            String line;
            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");
                int nrMatricol = Integer.parseInt(values[0].trim());
                String prenume = values[1].trim();
                String nume = values[2].trim();
                String grupa = values[3].trim();

                Student s = new Student(
                        nrMatricol,
                        prenume,
                        nume,
                        grupa
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

        for (Student s : students) {
            System.out.println(s);
        }
    }
}