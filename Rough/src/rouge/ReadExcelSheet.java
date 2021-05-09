package rouge;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelSheet 
{

	public static final String Sample_XLSX="C:\\Users\\Animesh Bhoj\\Downloads\\chromedriver_win32\\Book1.xlsx";
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		Workbook workbook=WorkbookFactory.create(new File(Sample_XLSX));
	    System.out.println(workbook.getNumberOfSheets());

	}

}
