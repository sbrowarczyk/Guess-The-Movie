import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

     public static void main(String[] args) throws FileNotFoundException {

         String title = Game.randomPick();
         String hashTitle = title.replaceAll("[aA-zZ]","_");

         Game.round(hashTitle,title);








     }

}
