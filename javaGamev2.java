package teamProject;
import java.io.PrintStream;

import java.util.Scanner.*;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;
	public class javaGamev2 {

		// Global variables  
		private static final String SEE_RULES = "1) See Rules";
		private static final String PLAY_GAME = "2) Play Game";
		private static final String EXIT_GAME = "3) Exit Game";
		private static int score = 0, antiScore = 0;
		

		public static void main(String[] args)

		{

		//Part 1: Declaring and setting variables


		String fullName, gameTitle, mainMenu, gameRules;
		boolean option = true ; 


		gameTitle = "GTX Java Trivia";

		String[] mainMenuOptions;
		mainMenuOptions = new String[3];
		mainMenuOptions[0]= SEE_RULES;
		mainMenuOptions[1]= PLAY_GAME;
		mainMenuOptions [2]= EXIT_GAME;

		gameRules = "1)No cheating. This stimulation is meant for learning purposes, cheating will not help you learn.\n\n"

		 + "" + "2) There are 10 multiple choice questions, with 4 possible answers for each question. \tIf answered incorrectly you will be able to try again until you get the answer right. \n\nYour overall score is based on the amount times you get the answer right and wrong!" ;




		//Part 1 : introduce the game  


		JOptionPane.showMessageDialog(null, "Welcome to GTX Java Trivia!");

		JOptionPane.showMessageDialog(null, "A quiz game to practice the concepts that you learn in your intro to Java class\n" + "The game consist of 10 questions that covers various chapters in the book.\n"

		+ ""+  "Though this is a game to master your concepts, treat this as a real test.\n" +  "The top 3 scores will be posted on our 'All Stars' board, so try your hardest.");


		JOptionPane.showMessageDialog(null, "Good Luck!");

		// Part 1: Prompt the user their name and then display it 


		fullName = JOptionPane.showInputDialog(null, "Enter your name:",gameTitle,JOptionPane.PLAIN_MESSAGE);



		JOptionPane.showMessageDialog(null, "Welcome " + fullName + "!" + "\nMain Menu:\n\n" + "1) See Rules\n2) Play Game\n3) Exit Game", gameTitle,JOptionPane.PLAIN_MESSAGE );


		//Part 1 : validiation check of user choice 

do {
		mainMenu = (String) JOptionPane.showInputDialog(null, "Select a Main Menu Choice:",gameTitle,JOptionPane.QUESTION_MESSAGE,null,mainMenuOptions,SEE_RULES);


		if (mainMenu.equals(SEE_RULES))
			
			JOptionPane.showMessageDialog(null, "Rules:\n\n" + gameRules, gameTitle,JOptionPane.PLAIN_MESSAGE );
	
		else if (mainMenu.equals(EXIT_GAME))
			{JOptionPane.showMessageDialog(null, "Thank you for playing!");
			option = false; 
			System.exit(0);}
	
		else if (mainMenu.equals(PLAY_GAME))
			{JOptionPane.showMessageDialog(null, "Let's begin!", gameTitle,JOptionPane.PLAIN_MESSAGE );
			option = false;}

		}
while (option);


		// Declaring and settings variables Part 2: questions  and answers

		String questions1ask, questions2ask, questions3ask , questions4ask , questions5ask, questions6ask, questions7ask;


		questions1ask = ("1. What does backslash n do in Java?")+ ("\n\n"+ "A) Causes a backslash to be printed\n"+ "B) Causes the cursor to go to the beginning of the current line, not the next line new line\n"+ "C) Causes the cursor to skip over to the next tab stop\n" + "D) Advances the cursor to the next line for subsequent printing");


		questions2ask = ("2. What is not a part of the Java Program?")+ ("\n\n"+ "A) Comments\n" +"B) Compiler Review\n"+ "C) Curly Braces\n"+ "D) Class headers");


		questions3ask = ("3. In java, what will z display:\n" + " int z\n" + "z = 1/2") + ("\n\n" + "A).5\n" + "B) .50\n" + "C) 0\n" + "D) 1");

		questions4ask = ("4. The conditional operator is a ____ operator")+("\n\n"+ "A) Ternary\n" +"B) Logical\n"+ "C) Arithmetic\n"+ "D) Relational");

		questions5ask = ("5. Characters can be tested with ____ operators") + ("\n\n"+ "A) Assignment\n" +"B) Arithmetic\n"+ "C) Logical\n"+ "D) Relational");

		questions6ask = ("6. What import is needed in order to use the PrintWriter feature?") + ("\n\n"+ "A) java.util.Scanner\n" +"B) java.util.Scanner*\n"+ "C) java.io\n"+ "D) java.io*");
				
		questions7ask = ("7. Which one is not correct?") + ("\n\n"+ "A) .nextDouble()\n" +"B) .nextFloat()\n"+ "C) .nextString()\n"+ "D) .nextInt()");


		String[] questionsans;


		questionsans = new String [] {"A", "B", "C", "D"}; //default available choice. This is an array.

		 

		   String qA1, qA2, qA3, qA4, qA5,qA6,qA7;

// Validation of Part 2:

do {
		   qA1= (String) JOptionPane.showInputDialog(null, questions1ask,gameTitle,JOptionPane.QUESTION_MESSAGE,null,questionsans,questionsans[1]);

		 //note , can create one questionsans and use as default since ifelse does check

		if  ( qA1 == "D")
		{

		JOptionPane.showMessageDialog (null, "1. Correct!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		      score ++;overAllScore();}
		
		

		else
		{
		JOptionPane.showMessageDialog (null, "Wrong answer. Try agian!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		
		antiScore --;}

}
while (qA1 != "D");	
		
		
		
		
		
		
		
		
do {

		qA2= (String) JOptionPane.showInputDialog(null, questions2ask,gameTitle,JOptionPane.QUESTION_MESSAGE,null,questionsans,questionsans[1]);


		if  ( qA2 == "B") {

		JOptionPane.showMessageDialog (null, "2. Correct!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		score ++ ; overAllScore();}

		else {

		JOptionPane.showMessageDialog (null, "Wrong answer. Try agian!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		antiScore --;}
}	 

		
while  (qA2 != "B") ;		
		


		

do {
		 qA3= (String) JOptionPane.showInputDialog(null, questions3ask,gameTitle,JOptionPane.QUESTION_MESSAGE,null,questionsans,questionsans[1]);


		if  ( qA3 == "C") {

		JOptionPane.showMessageDialog (null, "3. Correct!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		score ++;overAllScore();}

		else {

		JOptionPane.showMessageDialog (null, "Wrong answer. Try agian!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		antiScore --;}
}
		
while (qA3 != "C");				
		
		
		
		
		
		
do {		
		
		qA4= (String) JOptionPane.showInputDialog(null, questions4ask,gameTitle,JOptionPane.QUESTION_MESSAGE,null,questionsans,questionsans[1]);


		if  ( qA4 == "A") {

		JOptionPane.showMessageDialog (null, "4. Correct!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		score ++;overAllScore();}

		else {

		JOptionPane.showMessageDialog (null, "Wrong answer. Try agian!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		antiScore --;}
		
		
		
		
}

while (qA4 != "A");				
		

do {

		qA5= (String) JOptionPane.showInputDialog(null, questions5ask,gameTitle,JOptionPane.QUESTION_MESSAGE,null,questionsans,questionsans[1]);


		if  ( qA5 == "D") {

		JOptionPane.showMessageDialog (null, "5. Correct!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		score ++; overAllScore();}

		else {

		JOptionPane.showMessageDialog (null, "Wrong answer. Try agian!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		antiScore --;}
		
}

while (qA5 != "D");

	
	
do {

		qA6= (String) JOptionPane.showInputDialog(null, questions6ask,gameTitle,JOptionPane.QUESTION_MESSAGE,null,questionsans,questionsans[1]);


		if  ( qA6 == "D") {

		JOptionPane.showMessageDialog (null, "5. Correct!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		score ++; overAllScore();}

		else {

		JOptionPane.showMessageDialog (null, "Wrong answer. Try agian!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		antiScore --;}
		
	}

 while (qA6 != "D");	
	
	
	
do {

		qA7= (String) JOptionPane.showInputDialog(null, questions7ask,gameTitle,JOptionPane.QUESTION_MESSAGE,null,questionsans,questionsans[1]);


		if  ( qA7 == "C") {

		JOptionPane.showMessageDialog (null, "5. Correct!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		score ++; overAllScore();}

		else {

		JOptionPane.showMessageDialog (null, "Wrong answer. Try agian!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		antiScore --;}
		
	}

while (qA7 != "C");					

		//Closing message
		overAllScore ();
		JOptionPane.showMessageDialog(null, "That's the end of the game. Thank you for playing!");



		}
		
		
static void  overAllScore ()	
		{
			int totalScore = (int) (((score+antiScore)*.10)*100);	
					
			JOptionPane.showMessageDialog( null,"Your score is: " + totalScore  ) ;
		}

		}

	// Updates: Added new global variables for score tracking purposes: score and antiScore. Remove some comments and added more white space for readability purposes. . Added a do -while to main menu and each question. 
	//Created a calling menthod called overall score, which include a new local varialbe within: totalscore.Change the format of grade and updated the rules.
	// Added two more questions
