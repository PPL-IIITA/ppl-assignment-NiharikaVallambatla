
package ppl_assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ppl_assignment {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        boy[] boy = new boy[100];
        girl[] girl = new girl[50];
        int i;
        rand_generator g= new rand_generator(girl,boy);
        matching.matchup(girl, boy);
        PrintStream out1;
        out1 = new PrintStream(new FileOutputStream("output1.txt"));
        System.setOut(out1);
        System.out.println("S.no"+"  "+"girl.id"+"  "+"boy.id");
        for(i=0;i<50;i++){
            System.out.println(i+"    "+girl[i].name+"    "+girl[i].bf);
        }
    }
}
