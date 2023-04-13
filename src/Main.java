import java.io.File;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        System.out.println(getF(new File("c:/Intel")));


    }
static public long getF(File folder)
{if (folder.isFile())
{return folder.length();}
    long sum=0;
File [] files=folder.listFiles();

for (File f:files)
{sum=sum=getF(f);}



return  sum;}



}