public class Count_Letters {
    public static void main(String args[])
    {
        String str = "Welcome to ASDR @ Mumbai on 19-01-2024";
        int capital = 0, Small = 0, Digits = 0, special = 0, space=0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch==' ')
                space++;
            else if (ch >= 'A' && ch <= 'Z')
                capital++;
            else if (ch >= 'a' && ch <= 'z')
                Small++;
            else if (ch >= '0' && ch <= '9')
               Digits++;
            else
                special++;
        }
        System.out.println("Upper case letters : " + capital);
        System.out.println("Lower case letters : " + Small);
        System.out.println("Number of spaces: " + space);
        System.out.println("Number : " + Digits);
        System.out.println("Special characters : " + special);
    }
}
