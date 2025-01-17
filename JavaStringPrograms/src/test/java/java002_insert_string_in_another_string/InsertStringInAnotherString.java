package java002_insert_string_in_another_string;

public class InsertStringInAnotherString {
	
	public static String insertString(String originalStr, String strToInsertBeInserted, int index) {
		
		String newStr = new String();
		for(int i=0; i<originalStr.length(); i++) {
			//insert the original string character into the new string
			newStr += originalStr.charAt(i);
			if(i==index) {
				//insert the string to be inserted into the new string
				newStr += strToInsertBeInserted;
			}
		}
		return newStr;
	}

	public static void main(String[] args) {
		String originalStr ="GeeksGeeks";
		String strToInsertBeInserted = "For";
		int index = 4;
		
		System.out.println("originalStr: " + originalStr);
		System.out.println("strToInsertBeInserted: " + strToInsertBeInserted);
		System.out.println("index: " + index);
		
		//insert the string
		System.out.println("New String : " + insertString(originalStr, strToInsertBeInserted, index));

	}

}
