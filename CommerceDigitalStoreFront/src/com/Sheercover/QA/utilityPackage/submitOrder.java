package com.Sheercover.QA.utilityPackage;


	
	import java.io.File;

	import org.apache.poi.xssf.usermodel.XSSFCell;					
	import org.apache.poi.xssf.usermodel.XSSFSheet;					
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;					
	import java.io.FileInputStream;

	public class submitOrder {
		
		private static File file;
		private static FileInputStream ExcelFile;
		private static XSSFSheet ExcelWSheet;
		private static XSSFWorkbook ExcelWBook;
		private static XSSFCell cell;

		//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheet name as Arguments to this method

		public static void setFile(String Path,String SheetName) throws Exception {
			try {
				
				file= new File(Path);
				ExcelFile = new FileInputStream(file);
				ExcelWBook = new XSSFWorkbook(ExcelFile);
				ExcelWSheet = ExcelWBook.getSheet(SheetName);
			
			} catch (Exception e) {
				throw(e);
			}
		}

	//**********************************************************************	
		//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
	    public static String getCellData(int RowNum, int ColNum) {
	    	
	    	
	        	try {
					cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
					
					
					return cell.getStringCellValue();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
	    	
	    	
	    }
	    
	 
	//***********************************************************************  

	    
	    
	    
	    
	    
	    //**********************************************
	    
		public static int lastRow() throws Exception {
	    	try {
	    		
	    		return ExcelWSheet.getLastRowNum();    		
	    	
	    	
	    	
	    	} catch (Exception e) {
	    		throw(e);
	    	}    	
	    }
		
		
		
		public static void closeWrokBook() throws Exception {
			ExcelWBook.close();
			
			
		}
	//****************************************************************************

	
	
	
	

}
