package dailyTask;

public class encryptString {
	public static String getEncryptString(String input) {
		String str= "";
		char[] chArray= input.toCharArray();
		for(int i=0;i<chArray.length;i++) {
		int ch =chArray[i];
		int ascii= (int)ch;
		
		if(ascii>=65 && ascii<=90) {
			int value =ascii+9;
		   	if(value>90) {
				 value = value-26;
		}
		   	char character=(char)value;
         	str = str+character;
		}
		else if(ascii>=97 && ascii<=122) {
			int values=ascii+9;
			if(values>122) {
				values= values-26;
			}	
				char character=(char)values;
				str = str+character;
				
		}else {
			return "enter proper character";
		}
		
	//	System.out.println(c);  
	}
	return str;
		}
	public static void main(String[] args) {
		String input = "Aisu";
		System.out.println(getEncryptString(input));

	}

}
