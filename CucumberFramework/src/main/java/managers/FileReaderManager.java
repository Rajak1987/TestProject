package managers;

import dataProviders.ConfigFileReader;
import dataProviders.ExcelFileReader;


public class FileReaderManager {
	
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	 ExcelFileReader excelFileReader;

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance( ) {
		return fileReaderManager;
	}

	public ConfigFileReader getConfigReader() {
		return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	}
	 public ExcelFileReader getExcelReader() {
		
		return (excelFileReader == null) ? new ExcelFileReader() : excelFileReader;
		
	 } 
}

