public class mainChallenge{    
    public static void main(String[] args){

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highscore is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The Next highScore is " + 
            calculateScore(gameOver, highScore, levelCompleted, bonus));
        }
    

    // New method must be outside other method but inside class
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        int finalScore = score;

        if(gameOver == true){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        return finalScore;
    }
}
