import java.util.*;
import java.io.*;
class ReaderFile{
public static void main(String args[])
{
try{

FileReader fr = new FileReader("File.txt");
Scanner sc = new Scanner(fr);
while(sc.hasNextLine())
{
String s = sc.nextLine();
System.out.println(s);
}
}
catch (IOException e)
{
System.out.println("error");
}
}

}
