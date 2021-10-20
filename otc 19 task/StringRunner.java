class StringRunner{
	public static void main(String[] args){
		
		String name = new String();
		name = "Pooja Reddy";
		System.out.println(name);
		
		String company = new String("xworkz");
		System.out.println(company);
		
		char data[] = {'a','b','c'};
		String alphabet = new String(data);
		System.out.println(alphabet);
		
		char country[] = {'I','n','d','i','a','n'};
		String countryName = new String(country,2,4);
		System.out.println(countryName);
		
		int[] code = {1,2,3,4,5,6,7,8,9};
		String code1 = new String(code,3,4);
		System.out.println(code1);
		
		byte[] asciiValue = {74,75};
		String ascii = new String(asciiValue);
		System.out.println(ascii);
		
		String str = new String("Xworkz");
        String str0 = new String(str);
        System.out.println(str0);
		
		String s="hello";
        String substr = s.substring(0,2);		
        System.out.println(substr); 
		
		String s1="pooja";
        String upperCase = s1.toUpperCase();
        String lowerCase = s1.toLowerCase();		
        System.out.println(upperCase);    
        System.out.println(lowerCase);    
        System.out.println(s1);
		
		//concatenating string with 10 
		int value=30;  
        String stringValueOf = String.valueOf(value);  
        System.out.println(stringValueOf+10); 
  
		
		//chatAt
		String string = "Bengalore";
		char charat = string.charAt(3);
        System.out.println("Char at index 3 in string: " + charat);
		
		//compare
		String str1="X-workZ";  
        String str2="ODC";    
        System.out.println(str1.compareTo(str2)); 
		System.out.println(str1.compareTo(str2));
	 
	    //trim
        String str3 = "Pooja Priya Vikrant";
		System.out.println(str3.trim()); //trim removes white space (PoojaPriyaVikrant)
		
		//replace
		String message="I like to eat Icecream";      
        String replaceString=message.replace("Icecream","Chocolate");//replaces all occurrences of "Icecream" to "Chocolate"      
        System.out.println(replaceString);
		
		//replaceAll
		String replaceStringAll =message.replaceAll("a","e");
		System.out.println(replaceStringAll);

        //Ends with
        System.out.println(message.endsWith("m"));//  true
        System.out.println(message.endsWith("Icecream"));//true

        //format
        String language="Java";  
        String sf1=String.format("name is %s",language);  
        String sf2=String.format("value is %f",32.33434);  
        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
        System.out.println(sf1);  
        System.out.println(sf2);  
        System.out.println(sf3);  		
		
		//starts with
	    System.out.println(message.startsWith("J")); //false
		
		//splits
		String[] words=message.split("\\s");//splits the string based on whitespace  
        System.out.println(replaceStringAll);
		
       	//isEmpty
        System.out.println(str1.isEmpty());  
        System.out.println(str2.isEmpty()); 
		
		//Length
		System.out.println(str1.length());
		
		//intern
		String stringIntern = new String("Pooja");    
        String str5 = stringIntern.intern();    
        System.out.println(str5);//Pooja
		
	}
  }