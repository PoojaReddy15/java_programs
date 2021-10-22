class WrapperMethodAndConstructor{
 
 public static void main(String[] wrappers){
	 
	 //Byte constructor
	 byte iceCreamPrice = 50;
	 Byte price = new Byte(iceCreamPrice);
	 System.out.println(price);
	 
	 String ramSize = "6";
	 Byte ram = new Byte(ramSize);
	 System.out.println(ram);
	 
	 //Byte method
	 
	 //byte value
	 Byte money = price.byteValue();
	 System.out.println(money);
	 
	 //compareTo
	 byte age1 = 34;
	 byte age2 = 23;
	 System.out.println(Byte.valueOf(age1).compareTo(Byte.valueOf(age2)));//11
	 
	 //compare
	 int result = Byte.compare(age1,age2);
	 System.out.println(result);
	 
	 //equals
	 System.out.println(price.equals(ram));//false
	 //or
	 Byte byte1=127;  
     Byte byte2=67;  
     //It compares two Byte objects numerically  
     boolean val=byte1.equals(byte2);  
     if(val)
	 {  
     System.out.println(" values are equal");  
     }  
     else
	 {  
     System.out.println("Values are not equal");  
     } 
	 
	 //doubleValue
     Byte penPrice = 10;
     Double priceDouble = penPrice.doubleValue();
	 System.out.println(priceDouble);
	 
	 //Float Value
	 Float priceFloat = penPrice.floatValue();  
     System.out.println(priceFloat);  
	 
	 //toString
	 String str = byte1.toString(); 
     String str1 = byte2.toString(); 		
     System.out.println(str);  
     System.out.println(str1); 
	 
	 //decode
	 Byte decodedValue=Byte.decode(ramSize);  
     System.out.println(decodedValue);
     
	 //parseByte
     int parseval=Byte.parseByte(ramSize);  
     System.out.println(parseval);  	 
	 
     //Short Constructor
	 short kitkatPrice = 50;
	 Short katprice = new Short(kitkatPrice);
	 System.out.println(katprice);
	 
	 String id = "15121";
	 Short idVal = new Short(id);
	 System.out.println(idVal);
	 
	 //Integer Constructor
	 int chocolatePrice = 50;
	 Integer chocoprice = new Integer(chocolatePrice);
	 System.out.println(chocoprice);
	 
	 String bithDay = "15121998";
	 Integer day = new Integer(bithDay);
	 System.out.println(day);
	 
	 //Long Constructor
	 long mobileNo = 6363132564L;
	 Long no = new Long(mobileNo);
	 System.out.println(no);
	 
	 Long bday = new Long(bithDay);
	 System.out.println(bday);
	 
	 //float constructor
	 float pencilPrice = 5.2f;
	 Float pencilMoney = new Float(pencilPrice);
	 System.out.println(pencilMoney);
	 
	 String pillowPrice = "15.22f";
	 Float pillowMoney = new Float(pillowPrice);
	 System.out.println(pillowMoney);
	 
	 //float method
	 //compare
	 int floatCompare=Float.compare(pencilPrice , pillowMoney); 
	 System.out.println(floatCompare);
	 
	 //doubleValue
	 double doubleObj= pillowMoney.doubleValue();  
     System.out.println("New value is = "+doubleObj); 
	 
	 //byte and int value()
	 Float float1= new Float("10");  
     Float float2=new Float("50.44"); 
     byte b1=float1.byteValue();  
     byte b2=float2.byteValue();  
     int d= b1+b2;  
     System.out.println("Sum = " +d); 
 	 
	 //floatToIntBits
	 System.out.println("  Equivalent integer bits = "+Float.floatToIntBits(float1));
     
	 //floatToRawIntBits
     Float object1 = 0.0f/0.0f;  
     System.out.println(object1 + " value in Raw int bits = " + Float.floatToRawIntBits(object1));
	 
     //floatValue
     System.out.println("Result after being converted to float value = "+float1.floatValue());
     
	 //intBitsToFloat
     int intVal1=76;  
     Float f2=Float.intBitsToFloat(intVal1);  
     System.out.println("Float value after conversion = "+f2);
     
	 //intValue
     int multiplication = float1.intValue()*float2.intValue();
  	 System.out.println("multiplication = " +multiplication);
     
	 //isFinite
     System.out.println(Float.isFinite(float2));
     
	 //isInfinite
     System.out.println(Float.isInfinite(float2));	 
	 
	 //double constructor
	 double tabletPrice = 6.99;
	 Double medicinePrice = new Double(tabletPrice);
	 System.out.println(medicinePrice);
	 
	 String dressPrice = "500.2";
	 Double dressPrice1 = new Double(dressPrice);
	 System.out.println(dressPrice1);
	 
	 //double method
	 
	 //compare
	 double compare=Double.compare(medicinePrice, dressPrice1);  
	 System.out.println(compare);
	 
	 //compareTo
	 
	 int compareto=medicinePrice.compareTo(dressPrice1);  
	 System.out.println(compareto);
	  
	 //doubleToLongBits
	  
	 Double obj=5.5;  
     System.out.println(Double.doubleToLongBits(obj)); 
     
	 //doubleToRawLongBits
	 
	 System.out.println(Double.doubleToRawLongBits(obj));
     
	 //double equals

     System.out.println(medicinePrice.equals(dressPrice1));//false
     
	 //floatValue
     float f1= dressPrice1.floatValue();  
     System.out.println(dressPrice1+ " after converted to float becomes : "+f1);  	 
	 
	 //intValue
	 System.out.println("Int value of "+dressPrice1+" = "+ dressPrice1.intValue());  
	 
	 //isFinite
	 System.out.println(Double.isFinite(medicinePrice));
	 
	 //isInfinite
	 System.out.println(medicinePrice+" value for isInfinite() method is : " +Double.isInfinite(medicinePrice)); 
	 
	 //longBitsToDouble
	 int va11=76767127;  
     Double dou1=Double.longBitsToDouble(va11);  
     System.out.println("Float value after conversion = "+dou1); 
	 
	 //charcter constructor
	 char alphabet = 'G';
	 Character letter = new Character(alphabet);
	 System.out.println(letter);
	 
	 //character method
	 
	 //char count
	 int obj1 = 59;    
     int charCnt = Character.charCount(obj1);  
     System.out.println("char count:"+charCnt);//Check the number of char values needed and print the values.  
     
	 //codePointAt
     String input = "This is the first program for the given method"; 
	 int index = 4;  
     System.out.println(input.codePointAt(index));  
     
	 //codePointAt
     System.out.println(input.codePointAt(index));
     
	 //codePointBefore
     int res = input.codePointBefore(1);  
	 System.out.println(res);

     //codePointCount
     CharSequence seq = "Hello";    
     int offset = 2; // Declare offset. 
     int countValue = 4; // Declare count.       
     int result1 = Character.codePointCount(seq, offset, countValue);    
     System.out.println("The result is given as: " + result1);

     //compare
     char firstValue = 'A';  
     char secondValue = 'B'; 
     System.out.println(Character.compare(firstValue, secondValue));
	 
	 //equals
     Character charValue = new Character('A');  
	 Object  objValue = new Character('A');  
     if (charValue.equals(objValue)) {  
     System.err.println("They are equal.");  
      }  
     else {  
     System.err.println("They are not equal.");  
     } 
     
	 //compareTo
     Character firstVal = new Character('g');  
     Character secondVal = new Character('G');  	 
     int compare1= firstVal.compareTo(secondVal);
	 System.out.println(compare1);
	 
	 //codepoint
     int codepoint = 00;       
     String output = Character.getName(codepoint);// Get the Unicode name of the specified character codePoint  
     System.err.println("The first character '" + (char)codepoint + "' has the unicode name as: " + output); 
	 
	 //Boolean constructor
	 boolean weekend = true;
	 Boolean whichDay = new Boolean(weekend);
	 System.out.println(whichDay);
	 
	 String weekday = "false";
	 Boolean weeddayOrNot = new Boolean(weekday);
	 System.out.println(weeddayOrNot);
	 
	 
	 
	 
	 
	 }
}