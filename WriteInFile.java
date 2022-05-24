import java.io.*;
class WriteInFile{
public static void main(String args[])
{
try{
FileWriter fw = new FileWriter("File.txt");
fw.write("Hello My name is Abhishek");
 fw.close();   
}
catch(IOException e)
{
System.out.println("Error");
}
}
}
