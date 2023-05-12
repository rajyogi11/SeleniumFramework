package lib;

public class readExclDataFrOtherClass {
	
	public static void main(String[] args) {
		
		ExcelDataConfig excell = new ExcelDataConfig("D:\\Book1.xlsx");
		
		System.out.println(excell.getData(1, 1, 1)); // 1st sheet index 0 row and 0 column
		
		
	}

}
