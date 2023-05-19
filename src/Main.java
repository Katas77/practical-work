import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        File my_file_dir = new File("C:/skilbox");
        if (my_file_dir.canWrite())
        {
            System.out.println(my_file_dir.getAbsolutePath() + " can write.\n");
        }
        else
        {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot write.\n");
        }
        if (my_file_dir.canRead())
        {
            System.out.println(my_file_dir.getAbsolutePath() + " can read.\n");
        }
        else
        {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot read.\n");
        }

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

        System.out.println(getF(new File("c:/skilbox")));

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