import java.io.*;

class CopyText
{
    public static void main(String[] args)
    {
        int i;
        FileInputStream fin;
        FileOutputStream fout;

        if(args.length!=2)
        {
            System.out.print("Usage: ShoFile filename");
            return;
        }

        try
        {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
        }
        catch(FileNotFoundException e)
        {
            System.out.print("Error Opening File");
            return;
        }

        try
        {
            do
            {
                i=fin.read();
                if(i!=-1)
                {
                    fout.write((char)i);
                }
            }while(i!=-1);
        }
        catch(IOException e)
        {
            System.out.print("Error Reading File");
        }

        try
        {
            fin.close();
            fout.close();
        }
        catch(IOException e)
        {
            System.out.print("Error Closing File");
        }
    }
}