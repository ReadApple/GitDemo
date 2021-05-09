package rouge;
/*
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriting 
{
    private static final String FILE_NAME = "C:\\Users\\Animesh Bhoj\\Downloads\\chromedriver_win32\\Book1.xlsx";

    public static void readexcel() throws IOException
    {
    	InputStream ExcelFileToRead = new FileInputStream("C:\\Users\\Animesh Bhoj\\Downloads\\chromedriver_win32\\Book1.xlsx");
		XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
		
		XSSFWorkbook test = new XSSFWorkbook(); 
		
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row; 
		XSSFCell cell;

	//	int totalNoOfROws=sheet.getRow(1);
		
		Iterator rows = sheet.rowIterator();

		while (rows.hasNext())
		{
			row=(XSSFRow) rows.next();
			Iterator cells = row.cellIterator();
			while (cells.hasNext())
			{
				cell=(XSSFCell) cells.next();
		
				if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
				{
					System.out.print(cell.getStringCellValue()+" ");
				}
				else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
				{
					System.out.print(cell.getNumericCellValue()+" ");
				}
				else
				{
					//U Can Handel Boolean, Formula, Errors
				}
			}
			System.out.println("Hello !!!!!!!!!!!!");
		}
    			
    }
    
    
    
    public static void main(String[] args) throws IOException
    {
    	readexcel();
	
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("TRY");
        Object[][] datatypes =
        {
                {"Datatype", "Type", "Size(in bytes)"},
                {"int", "Primitive", 2},
                {"float", "Primitive", 4},
                {"double", "Primitive", 8},
                {"char", "Primitive", 1},
                {"String", "Non-Primitive", "No fixed size"}
        };

        int rowNum = 0;
        System.out.println("Creating excel");

        for (Object[] datatype : datatypes)
        {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype)
            {
                Cell cell = row.createCell(colNum++);
                
                if (field instanceof String)
                {
                    cell.setCellValue((String) field);
                }
                else if (field instanceof Integer)
                {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try 
        {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        System.out.println("Done");
    }}
}*/










 





