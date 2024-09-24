package com.fileexel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String FILE_NAME = "C:\\Users\\91886\\Desktop\\AsuDesk\\Input-Output\\MyFirstExcel.xlsx";

	public static void main( String[] args )
    {
       
        // excel ke workbook represent kane ke liye hai
        XSSFWorkbook workbook = new XSSFWorkbook();
        //caling factory method and return object of xssfheet class 
        XSSFSheet sheet = workbook.createSheet();
        // make data which you want to write in object Array
        
        Object[][] datatypes = {
                {"Datatype", "Type", "Size(in bytes)"},
                {"int", "Primitive", 2},
                {"float", "Primitive", 4},
                {"double", "Primitive", 8},
                {"char", "Primitive", 1},
                {"String", "Non-Primitive", "No fixed size"}
        };
        
        int rowNum = 0;
        System.out.println("Creating excel");
        // for each loop one by one data insert into cell 
        for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
        
        
        
        
        
    }

