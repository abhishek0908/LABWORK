//import java.lang.*;
import java.io.*;
//import java.io.IOException;
class CreateFile{
public static void main(String args[])
{

try{
File fo = new File("Fi.txt");
FileWriter fw = new FileWriter("File.txt");
if(fo.createNewFile())
{

System.out.println("File is created Successfully");
fw.write("Hello, My name is Abhishek Udiya Student of NITK");
     fw.close();  
}
else
{
System.out.println("File is alredy exits");
}
}
catch (IOException e) {
System.out.println("An unexpected error is occurred.");
}
}

}
