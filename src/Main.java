import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        File file=new File("C:/");
        String[] fL=file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.contains("s"))
                {return  true;}
                return false;
            }
        });
        Arrays.stream(fL).forEach(f-> System.out.println(f));

        System.out.println(getF(new File("c:/")));

    }
static public long getF(File folder)
{if (folder.isFile())
{return folder.length();}
    long sum=0;
File [] files=folder.listFiles();

for (File f:files)
{sum=sum+getF(f);}



return  sum;}

    File file=new File("C:/");
    String[] fL=file.list(new FilenameFilter() {
        @Override
        public boolean accept(File dir, String name) {
            if (name.contains("s"))
            {return  true;}
            return false;
        }
    });



}