import java.util.*;
import java.io.*;
class CreateFile {
public static void main(String[] args)
{
try 
{
File fo = new File("File");
if(fo.createNewFile())
{
System.out.println("File Created Succesfully");
}
else
{
System.out.println("File already Exits");
}
FileWriter fw = new FileWriter("File");
fw.write("Hello, My name is Abhishek Udiya");
fw.close();
FileReader fr = new FileReader("File");
Scanner sc =new Scanner(fr);
while(sc.hasNextLine())
{
String str = sc.nextLine();
System.out.println(str);
}
FileWriter pw = new FileWriter("File",false);
pw.write("Abhishek is append");
pw.close();
System.out.println("File name is " + fo.getName());
System.out.println("File name is " + fo.getAbsolutePath());
System.out.println("Is file writteble"+ fo.canWrite());
}
catch(IOException e)
{
System.out.println("Umexpected Error");
}
}
}
