package StringHandling;

public class Main {
    public static void main(String[] args) {
        String name = "Sri Ramakrishnan";
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "ABC";
        String str4 = "Sri-Ramakrishnan-Srinivasan";
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.substring(4));
        System.out.println(name.substring(4,8));

        if(str1.equals(str2)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(str1.equals(str3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(str1.equalsIgnoreCase(str3)){
            System.out.println("Strings are equal");
        }

        System.out.println(name.indexOf("z"));
        System.out.println(name.lastIndexOf("s"));
        String[] s = str4.split("-");
        System.out.println(s[0]+" "+s[1]+" "+s[2]);
    }
}
