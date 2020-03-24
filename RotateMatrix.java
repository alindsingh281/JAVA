import java.util.Scanner;

class RotateMatrix
{
    public static void main(String arg[])
    {
        System.out.println("Input number of rows and columns of the array.");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int Arr[][] = new int[r][c];

        if(r<=0||c<=0)
        {
         System.out.println("Row or Column cannot be less than or equal to 0.");
         System.exit(0);
        }
        else
        {
        System.out.println("Enter elements of the array");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) 
            {
                Arr[i][j] = sc.nextInt();
            }
        
        System.out.println("Main Menu:");
        System.out.println("1. Rotate CLOCKWISE.");
        System.out.println("2. Rotate ANTI-CLOCKWISE.");
        System.out.println("3. Do BOTH.");
        System.out.println("Enter your choice.");
        int ch = sc.nextInt();
        switch (ch) 
        {
            case 1:Clockwise(Arr, r, c);
                    break;
            case 2: AntiClockwise(Arr, r, c);
                    break;
            case 3: Clockwise(Arr, r, c);
                    AntiClockwise(Arr, r, c);
                    break;
            default: System.out.println("Invalid Choice!!!");
        }
       sc.close();
    }
    }

    static void AntiClockwise(int ar[][], int row, int col)
    {
        int result[][]= new int [col][row];
        int temp[][]= new int [col][row];
        for(int i=0; i<row; i++)
          for(int j=0; j<col; j++)
          {
              temp[j][i]=ar[i][j];
          }
        
        for(int i=0; i<col; i++)
          for(int j=0; j<row; j++)
          {
              result[i][j]=temp[col-1-i][j];
          }

        System.out.println("Matrix when rotated ANTI-CLOCKWISE will be:");

        for(int i=0;i<col;i++)
         {  System.out.println(" ");
              for(int j=0; j<row;j++)
            {
                System.out.print(result[i][j]+" ");
            }
        }
        System.out.println(" ");
    }

    static void Clockwise(int ar[][], int row, int col)
    {
        int result[][]= new int [col][row];
        int temp[][]= new int [col][row];
        for(int i=0; i<row; i++)
          for(int j=0; j<col; j++)
          {
              temp[j][i]=ar[i][j];
          }
        
        for(int i=0; i<col; i++)
          for(int j=0; j<row; j++)
          {
              result[i][j]=temp[i][row-1-j];
          }
        
        System.out.println("Matrix when rotated CLOCKWISE will be:");

        for(int i=0;i<col;i++)
         {  System.out.println(" ");
              for(int j=0; j<row;j++)
            {
                System.out.print(result[i][j]+" ");
            }
        }
        System.out.println(" ");
    }
}