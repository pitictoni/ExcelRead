package com.example.demo;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;
import java.util.*;

public class Imports {

    public static List<Facultate> getFaculties() { // TODO add unique param??
        try {
            Workbook workbook = new XSSFWorkbook("src/main/resources/facultati.xlsx");

            Sheet sheet = workbook.getSheet("Foaie1");
            Iterator<Row> rows = sheet.iterator();

            HashSet<Facultate> facultati = new HashSet<>();

            rows.next(); // skip header
            int rowNumber = 1;
            while (rows.hasNext()) {
                Row currentRow = rows.next();
                int coloanaDenumireFaculate = 7;
                String numeFacultate = currentRow.getCell(coloanaDenumireFaculate).getStringCellValue();
                facultati.add(new Facultate(rowNumber++,numeFacultate));
            }
            return new ArrayList<>(facultati);
        } catch (Exception e) {
            throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
        }
    }
}

