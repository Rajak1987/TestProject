package dataProviders;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import managers.FileReaderManager;
public class ExcelFileReader {

	public Sheet readExcel(String filePath,String fileName,String sheetName) throws IOException{
		//Create a object of File class to open xlsx file
		File file =    new File(filePath+""+fileName);
		//Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		Workbook TmuWorkbook = null;
		//Find the file extension by spliting file name in substing and getting only extension name
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		//Check condition if the file is xlsx file
		if(fileExtensionName.equals(".xlsx")){
			//If it is xlsx file then create object of XSSFWorkbook class
			try {
			TmuWorkbook = new XSSFWorkbook(inputStream);
			}catch(Exception e) {
			}
		}
		//Check condition if the file is xls file
		else if(fileExtensionName.equals(".xls")){
			//If it is xls file then create object of XSSFWorkbook class
			try {
			TmuWorkbook = new HSSFWorkbook(inputStream);
		}catch(Exception e) {
		}
		}
		//Read sheet inside the workbook by its name
		Sheet TmuSheet = TmuWorkbook.getSheet(sheetName);
		return TmuSheet;    
	}
	
	
	public String getExcelData(String TestDataName) {
		Sheet TmuSheet = null;
		try {
		TmuSheet = FileReaderManager.getInstance().getExcelReader().readExcel(System.getProperty("user.dir")+FileReaderManager.getInstance().getConfigReader().getExcelFilePath(),FileReaderManager.getInstance().getConfigReader().getExcelFileName(),FileReaderManager.getInstance().getConfigReader().getExcelSheetName());
		//Sheet TmuSheet = new ExcelFileReader().readExcel(System.getProperty("user.dir")+"/configs/","platformConfiguration.xlsx","Sheet2");
		}catch(Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		//Find number of rows in excel file
		int RowCount = TmuSheet.getLastRowNum()-TmuSheet.getFirstRowNum();
		System.out.println("RowCount:--------"+RowCount);
		
		//To find Test data row
		char Rownum = TestDataName.charAt(TestDataName.length()-1);
		int DataRow = Integer.parseInt(String.valueOf(Rownum));
		System.out.println("DataRow:--------"+DataRow);
		String ActualTestDataName = TestDataName.substring(0,TestDataName.length()-1);
		System.out.println("TestData:............."+ActualTestDataName);
		
		
		//To find test data cell
		Row row = TmuSheet.getRow(0);;
		short DataCell = 0;
		short minColIx = row.getFirstCellNum();
		 short maxColIx = row.getLastCellNum();
		 for(short colIx=minColIx; colIx<maxColIx; colIx++) {
			 DataCell = colIx;
		   Cell cell = row.getCell(colIx);
		   if(cell.getStringCellValue().equalsIgnoreCase(ActualTestDataName)) {
		     break;
		   }
		   //... do something with cell
		 }
		
//		for (int i=0; i<TmuSheet.getRow(0).getLastCellNum(); i++) {
//			DataCell = i;
//			String value = TmuSheet.getRow(0).getCell(i).toString();
//			if(value.equalsIgnoreCase(ActualTestDataName));
//			break;	
//		}
		return TmuSheet.getRow(DataRow).getCell(DataCell).toString();
		
		
	}
}

 
