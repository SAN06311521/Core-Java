import java.io.*;
class Test
{
public static void main(String[] args)
{
File file = new File("D:/49_Sanya-Java/Hello.txt");
if(file.delete())
{
System.out.println("File deleted successfully");
}
else
{
System.out.println("Failed to delete the file");
}
}
}