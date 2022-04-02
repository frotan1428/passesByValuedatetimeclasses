package day19passesByValuedatetimeclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {

    static int x=1000;

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        List<String> product=new ArrayList<>();
        int i=0;
        do {
            System.out.println("Enter" + (i+1)+ ".product name");
            product.add(scan.next());
            i++;
        }while (i<3);
        System.out.println(product);
        List<String> productID=new ArrayList<>();
        for (String w:product){
            product.add("" +w.charAt(0)+w.charAt(1)+x);
            x++;
        }
        System.out.println(productID);
       // scan.close();




    }
}
