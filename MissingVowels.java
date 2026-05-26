public class MissingVowels {
    public static void main(String[] args) {
        String s1="AEIOUaeiou";
        String s2="I Love india";
        String s3="";
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(!s2.contains(ch+""))
            {
                s3+=ch;
            }
        }
        System.out.println(s3);
    }
}
