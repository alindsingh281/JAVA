class UnderAge extends Exception
{
    private int num;
    UnderAge(int age)
    {
        num=age;
    }

    public String toString()
    {
        return "UnderAge[" + num + "]";
    }
}

class exceptionDemo
{
    static void test(int age) throws UnderAge
    {
        System.out.print("Called test(" + age + ")");
        if(age<18)
        {
            throw new UnderAge(age);
        }
    }
    public static void main(String[] args)
    {
        try
        {
            test(19);
            test(29);
            test(16);
        }
        catch(UnderAge e)
        {
            System.out.print("Caught " + e);
        }
    }
}