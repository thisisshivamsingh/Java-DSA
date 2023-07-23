// import java.util.*;

// public class ConditionalStatement {
//     public static void main(String[] args){
// int x = 10;
// if(x % 2 == 0){
//     System.out.println(x + " is even.");
// }else{
//     System.out.println(x + " is odd.");
// }
// System.out.println("Hardwork is better than smart work");
//     }
// }

// import java.util.*;

// public class ConditionalStatement {
//     public static void main(String[] args){
//         int n1 = 20;
//         int n2 = 30; 

//         if(n1 == n2){
//             System.out.println(n1 + " is equal to " + n2);
//         }
//         else{
//             if(n1>n2){
//                 System.out.println(n1 + " is greater than " + n2);
//             }else{
//                 System.out.println(n1 + " is smaller than " + n2);
//             }
//         }
//     }
// }

// import java.util.*;
// public class ConditionalStatement{
//     public static void main(String[] args){
//         int n1 = 20;
//         int n2 = 30;

//         if(n1 == n2){
//             System.out.println(n1 + " is equal to " + n2);
//         }else if(n1 > n2){
//             System.out.println(n1 + " is greater to " + n2);
//         }else{
//             System.out.println(n1 + " is smaller to " + n2);
//         }
//     }
// }

import java.util.*;
public class ConditionalStatement{
    public static void main(String[] args){
        // input - don't change this code
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        // input - don't change this code

        // code here
if (marks > 90){
    System.out.println("excellent");
}else if(marks>80 && marks<=90){
    System.out.println("good");
}else if(marks>70 && marks<=80){
    System.out.println("fair");
}else if(marks>60&& marks<=70){
    System.out.println("meets expectations");
}else{
    System.out.println("below par");
}
    }
}