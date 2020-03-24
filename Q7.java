import java.io.*;

class displayFile
{
    public static void main(String[] args)
    {
        int i;
        int j;
        String str;

        if(args.length!=1)
        {
            System.out.print("Usage: ShowFile filename");
            return;
        }

        try(BufferedReader buff = new BufferedReader(new FileReader(args[0])))
        {
            str=buff.readLine();
            while(str!=null)
            {
                if(str.charAt(0)=='/'&&str.charAt(1)=='/')
                {
                    System.out.print(str);
                }
                str=buff.readLine();
            }
        }
        catch(IOException e)
        {
            System.out.print("Error Reading File!");
        }
    }
}