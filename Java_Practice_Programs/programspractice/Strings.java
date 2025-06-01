package programsprac;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "hello java programming ";
String str1 = "JAVA IS FUN";
String str2 ="java is fun";
String str3 ="  java, is, lang  ";
System.out.println("charAt- "+str.charAt(0));//h
System.out.println("FirstIndexof 'j'- "+str.indexOf('j'));//6
System.out.println("LastIndexof 'g'- "+str.lastIndexOf('g'));//21
System.out.println("FirstIndexSubString 'gram' - "+str.lastIndexOf("gram"));//14
System.out.println("toUpperCase- "+str.toUpperCase());//HELLO JAVA PROGRAMMING
System.out.println("toLowerCase- "+str1.toLowerCase());//java is fun
System.out.println("contains 'java' - "+str.contains("java"));//true
System.out.println("Length- "+str.length());//23
System.out.println("Equals- "+str1.equals(str2));//false
System.out.println("equalsIgnoreCase- "+str1.equalsIgnoreCase(str2));//true
System.out.println("concat- "+ str1.concat(str2));//JAVA IS FUNjava is fun
System.out.println("concat space- "+ str1.concat("  ").concat(str2));//JAVA IS FUN java is fun
System.out.println("Replace a/x char - "+str.replace('a', 'x'));//hello jxvx progrxmming 
System.out.println("Replace java / python - "+str.replace("java", "python"));//hello python programming 
System.out.println("Startwith  - "+str.startsWith("java"));//false
System.out.println("EndWith  - "+str2.endsWith("fun"));//true
System.out.println("str2..  - '"+str3+"'");//'  java, is, lang  '
System.out.println("str2 Trim  - '"+str3.trim()+"'");//'java, is, lang'
String[] prog = str3.split(",");//java
for(String s : prog) {			//is
System.out.println(s);			//lang
}
char[] charArray = str1.toCharArray();
for(char c : charArray) {
	System.out.println(c);
}
}
}
