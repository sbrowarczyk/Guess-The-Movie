import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {



    static  String randomPick() throws FileNotFoundException {

        int random = 0 ;
        int counter = 0;

        File file = new File("movies.txt");
        Scanner fileScanner = new Scanner(file);

        while(fileScanner.hasNextLine()){
            fileScanner.nextLine();
            counter++;
        }
        random = (int)  (Math.random() * counter) +1;

        int i=1;
        Scanner titleScanner = new Scanner(file);
        String title="";
        while(i<=random){
            if (titleScanner.hasNextLine()) {
                title = titleScanner.nextLine();
            }
            i++;
        }

        return title;
    }









    static void round(String hiddenTitle, String title) {


        boolean hasWon = false;
        int numberGuess = 0;
        String guess;

        Scanner scanner = new Scanner(System.in);

        while (!hasWon && numberGuess<10) {
            System.out.println("You are guessing: " + hiddenTitle);
            System.out.println("You have guessed (" + numberGuess + ") wrong letters:");
            System.out.println("Guess a letter: ");
            guess = scanner.nextLine();
            int poz =(title.indexOf(guess,0));

            if ((poz)!=-1) {

                while ((poz)>=0){
                 hiddenTitle = hiddenTitle.substring(0,poz) + guess + hiddenTitle.substring(poz+1);
                    poz =(title.indexOf(guess,poz+1));

                }

            }
            else {
                numberGuess++;
            }
            if((hiddenTitle.indexOf('_')==-1) ){
                hasWon=true;
            }

        }

        if(hasWon){
            System.out.println("You have guessed '"+title+"' correctly");
        }
        else {
            System.out.println("You have lost. The title  was ''"+title+"''");
        }
    }




}
