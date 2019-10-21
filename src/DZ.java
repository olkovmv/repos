import javax.sound.midi.Soundbank;
import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class DZ {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int num_1,num_2,num_3,num_4;
        num_1 = 10;
        int ost_1 = (num_1 % 2);
        System.out.println(ost_1);
        int ost_2 = ((num_1 / 2) % 2);
        int ost_3 = (((num_1 / 2)/2) % 2);
        int ost_4 = (((num_1 / 2)/2)/2);
        String a = Integer.toString(ost_1);
        String b = Integer.toString(ost_2);
        String c = Integer.toString(ost_3);
        String d = Integer.toString(ost_4);
        String result = d + c + b + a;
        System.out.println("Перевод в двоичную " + result );
        int m_1 = 10;
        String[] m_2 = new String[] {"0", "1", "2", "3", "4", "5" , "6", "7" ,"8", "9","A", "B", "C","D","E","F"};
        String Result = m_2[m_1];
                System.out.println("10 в 16 систему  = " + Result);
          Scanner scanner = new Scanner(System.in);
          int g = scanner.nextInt();
          int m = scanner.nextInt();
        for (int i = 1; i < 100; i++) {
            if (g > m) {
                g %= m;
            }
            else { m %= g;}
            System.out.println(a + b);


            /////////
////


        }
    }
}
