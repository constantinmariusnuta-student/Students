package students;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.List;

public class ExcelExporter {

    public static void export(List<Student> students) {

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Students");

        int rowIndex = 0;

        // header
        Row header = sheet.createRow(rowIndex++);
        header.createCell(0).setCellValue("Matricol");
        header.createCell(1).setCellValue("Prenume");
        header.createCell(2).setCellValue("Nume");
        header.createCell(3).setCellValue("Grupa");
        header.createCell(4).setCellValue("Nota");

        // data
        for (Student s : students) {
            Row row = sheet.createRow(rowIndex++);

            row.createCell(0).setCellValue(s.numarMatricol());
            row.createCell(1).setCellValue(s.prenume());
            row.createCell(2).setCellValue(s.nume());
            row.createCell(3).setCellValue(s.formatieDeStudiu());
            row.createCell(4).setCellValue(s.nota());
        }

        try (FileOutputStream fos = new FileOutputStream("output.xlsx")) {
            workbook.write(fos);
            workbook.close();
            System.out.println("Excel creat!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}