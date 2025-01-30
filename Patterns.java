// public class Patterns{
//     public static void main(String[] args){
//         int i,j,row=4;
//         for(i=0;i<row;i++){
//             for(j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         System.out.println(-5>>1);
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         System.out.println(-5<<1);
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         String str1="Hello";
//         String str2=" World!";
//         System.out.println(str1.concat(str2));
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         String str="Hello World";
//         System.out.println(str.toLowerCase());
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         String str="Hello World";
//         System.out.println(str.toUpperCase());
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         String str=" Hello World ";
//         System.out.println(str.trim());
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         String str="Hello";
//         System.out.println(str.replace("Hello","World"));
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         String str="Hello World";
//         System.out.println(str.substring(6,11));
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         String str="Hello World";
//         System.out.println(str.indexOf("Hello"));
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         String str="Hello World , World";
//         System.out.println(str.lastIndexOf("World"));
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         String str="I love cats, cats are very cute";
//         String ReplaceString=str.replaceAll("cats","dogs");
//         System.out.println(ReplaceString);
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         String str1="Hello";
//         String str2="hello";
//         System.out.println(str1.equals(str2));
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         String str1="Hello";
//         String str2="hello";
//         System.out.println(str1.equalsIgnoreCase(str2));
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         String str1="Hello";
//         System.out.println(str1.isEmpty());
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         String str="Hello World";
//         System.out.println(str.length());
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         String str="Hello";
//         System.out.println(str.contains("Hel"));
//         System.out.println(str.contains("Hi"));
//     }
// }


// public class Patterns{
//     private String name;
//     private int age;
//     public Patterns(String name, int age){
//         this.name=name;
//         this.age=age;
//     }
//     public String toString(){
//         return name +","+age+" years old";
//     }
//     public static void main(String[] args){
//         Patterns person=new Patterns("John", 30);
//         System.out.println(person.toString());
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         String str="Hello";
//         byte[] result=str.getBytes();
//         System.out.println(result[0]);
//     }
// }


import java.util.Scanner;
public class Patterns{
    public static void main(String[] args) {
        int i,j,row;
        System.out.println("Enter row:");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        for(i=0;i<row;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
