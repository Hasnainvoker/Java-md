public class StringMethods {
    public static void main(String[] args) {
       String s= "  hello world  ";
        String result = s.replaceAll("\\s+", " ");
        String[] str = result.split(" ");
        String res="";
        String first=null;
        str[0]=str[0].trim();
        first =str[0];
        for(int i= str.length-1;i>=1;i--)
        {
            str[i]=str[i].trim();
           res=res+str[i]+" ";
        }
        System.out.println(res+first);
       String aa= res+first;
        System.out.println(aa.length());
    }
}
