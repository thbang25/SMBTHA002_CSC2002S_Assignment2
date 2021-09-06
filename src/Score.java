package assignment2;
public class Score {

  private int missedWords;
  private int caughtWords;
  private int gameScore;
  private int highScore;

  // all getters and setters must be synchronized
  synchronized public int getMissed(){
  return missedWords;}

  synchronized public int getCaught(){
   return caughtWords;}
   
  synchronized public int getTotal(){
   return (missedWords+caughtWords);}

  synchronized public int getScore(){ 
   return gameScore;}

 synchronized public void updateHighScore(){
   if (gameScore>highScore) 
   highScore = gameScore;}
 
 synchronized public void resetHighScore(){
  highScore = 0;}

 synchronized public void missedWord(){ 
 missedWords ++;}
 
 synchronized public void caughtWord (int length){
 caughtWords ++;
 gameScore += length;}

 synchronized public void resetScore(){
 caughtWords =0;
 missedWords =0;
 gameScore =0;}

public String toString(){
 return " Caught : " + caughtWords +"\n Missed : " + missedWords +"\n Score : " + gameScore +"\n High Score : " + highScore ;}
}