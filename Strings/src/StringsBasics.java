public class StringsBasics {
    public static void main(String[] args) {
        String name1= new String("UwU");
        String name2= new String("UwU");
        String name3 = "UwU";
        String name4 = "UwU";
        System.out.println(name1==name2); // not true we have explicitly defined to create each different objects of Strings
        System.out.println(name1.equals(name2)); // .equals only checks for the value not the mem loc . so even if different objs the value is same
        System.out.println(name3==name4); // true as using same object loc to save space
        // StringBuilder Class
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<26;i++)
        {
            char ch = (char)('a'+i);
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
