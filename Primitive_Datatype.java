public class Primitive_Datatype {
    public static void main(String[] args) {
        String s="200";
        int i=Integer.parseInt(s); //Converting String into int using Integer.parseInt()
        System.out.println(i);
        long l=Long.parseLong(s); //Converting String into long
        System.out.println(l);

        String s1="23.6";
        float f=Float.parseFloat(s1);//Converting String into float
        System.out.println(f);
        double d=Double.parseDouble(s1);////Converting String into double
        System.out.println(d);

        //Character
        String s3="hello";
        char c=s3.charAt(0);//returns h
        System.out.println("1st character is: "+c);

        // Boolean
        String s4="true";
        boolean b1=Boolean.parseBoolean(s4);
        System.out.println(b1);
    }
}
