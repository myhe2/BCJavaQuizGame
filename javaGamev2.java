package teamProject;
import java.io.PrintStream;

import java.util.Scanner.*;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;
	public class javaGamev2 {

		// string for the decision tree for main menu
		private static final String SEE_RULES = "1) See Rules";
		private static final String PLAY_GAME = "2) Play Game";
		private static final String EXIT_GAME = "3) Exit Game";

		public static void main(String[] args)

		{

		//Declaring variables


		String fullName, gameTitle, mainMenu, gameRules;


		gameTitle = "GTX Java Trivia";

		//changed the format of the options to make it useabled within an ifselse statement
		String[] mainMenuOptions;
		mainMenuOptions = new String[3];
		mainMenuOptions[0]= SEE_RULES;
		mainMenuOptions[1]= PLAY_GAME;
		mainMenuOptions [2]= EXIT_GAME;

		gameRules = "1)No cheating. This stimulation is meant for learning purposes, cheating will not help you learn.\n\n"

		   + "" + "2) There are 10 multiple choice questions, with 4 possible answers for each question. If answered incorrectly the correct answer will be displayed." + "\n\n Let's begin!";




		// Using JOptionPane to introduce the game  


		JOptionPane.showMessageDialog(null, "Welcome to GTX Java Trivia!");

		JOptionPane.showMessageDialog(null, "A quiz game to practice the concepts that you learn in your intro to Java class\n" + "The game consist of 10 questions that covers various chapters in the book.\n"

		+ ""+  "Though this is a game to master your concepts, treat this as a real test.\n" +  "The top 3 scores will be posted on our 'All Stars' board, so try your hardest.");


		JOptionPane.showMessageDialog(null, "Good Luck!");

		//Prompt the user their name


		fullName = JOptionPane.showInputDialog(null, "Enter your name:",gameTitle,JOptionPane.PLAIN_MESSAGE);


		// display the following main menu

		JOptionPane.showMessageDialog(null, "Welcome " + fullName + "!" + "\nMain Menu:\n\n" + "1) See Rules\n2) Play Game\n3) Exit Game", gameTitle,JOptionPane.PLAIN_MESSAGE );


		//Prompt the user the following main menu within a message box


		mainMenu = (String) JOptionPane.showInputDialog(null, "Select a Main Menu Choice:",gameTitle,JOptionPane.QUESTION_MESSAGE,null,mainMenuOptions,SEE_RULES);


		if (mainMenu.equals(SEE_RULES))
		JOptionPane.showMessageDialog(null, "Rules:\n\n" + gameRules, gameTitle,JOptionPane.PLAIN_MESSAGE );
		else if (mainMenu.equals(EXIT_GAME))
		System.exit(0);
		else if (mainMenu.equals(PLAY_GAME))
		JOptionPane.showMessageDialog(null, "Let's begin!", gameTitle,JOptionPane.PLAIN_MESSAGE );



		// declaring  variable score
		int score = 0;



		// declaring variables part 2: questions  and answers

		String questions1ask, questions2ask, questions3ask , questions4ask , questions5ask;


		questions1ask = (" What does backslash n do in Java?")+ ("\n\n"+ "A) Causes a backslash to be printed\n"+ "B) Causes the cursor to go to the beginning of the current line, not the next line new line\n"+ "C) Causes the cursor to skip over to the next tab stop\n" + "D) Advances the cursor to the next line for subsequent printing");


		questions2ask = (" What is not a part of the Java Program?")+ ("\n\n"+ "A) Comments\n" +"B) Compiler Review\n"+ "C) Curly Braces\n"+ "D) Class headers");


		questions3ask = (" In java, what will z display:\n" + " int z\n" + "z = 1/2") + ("\n\n" + "A).5\n" + "B) .50\n" + "C) 0\n" + "D) 1");

		questions4ask = ("The conditional operator is a ____ operator")+("\n\n"+ "A) Ternary\n" +"B) Logical\n"+ "C) Arithmetic\n"+ "D) Relational");

		questions5ask = ("Characters can be tested with ____ operators") + ("\n\n"+ "A) Assignment\n" +"B) Arithmetic\n"+ "C) Logical\n"+ "D) Relational");


		String[] questionsans;


		questionsans = new String [] {"A", "B", "C", "D"}; //default available choice. This is an array.



		//display all the answers, in the message box

		//Prompt the user the following questions within a message box

		// declaring variables part 2: questions  and answers  to show in message box

		 

		   String qA1, qA2, qA3, qA4, qA5;




		   qA1= (String) JOptionPane.showInputDialog(null, questions1ask,gameTitle,JOptionPane.QUESTION_MESSAGE,null,questionsans,questionsans[1]);

		 //note , can create one questionsans and use as default since ifelse does check

		if  ( qA1 == "D") {

		JOptionPane.showMessageDialog (null, "1. Correct!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		if (qA1 == "D") {
		             score ++;}}

		else
		JOptionPane.showMessageDialog (null, "1. The answer is D.", gameTitle, JOptionPane.PLAIN_MESSAGE );



		qA2= (String) JOptionPane.showInputDialog(null, questions2ask,gameTitle,JOptionPane.QUESTION_MESSAGE,null,questionsans,questionsans[1]);


		if  ( qA2 == "B") {

		JOptionPane.showMessageDialog (null, "2. Correct!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		score ++;}

		else {

		JOptionPane.showMessageDialog (null, "2. The answer is B.", gameTitle, JOptionPane.PLAIN_MESSAGE );
		score --;}
		 

		 qA3= (String) JOptionPane.showInputDialog(null, questions3ask,gameTitle,JOptionPane.QUESTION_MESSAGE,null,questionsans,questionsans[1]);


		if  ( qA3 == "C") {

		JOptionPane.showMessageDialog (null, "3. Correct!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		score ++;}

		else {

		JOptionPane.showMessageDialog (null, "3. The answer is C.", gameTitle, JOptionPane.PLAIN_MESSAGE );
		score --;}

		qA4= (String) JOptionPane.showInputDialog(null, questions4ask,gameTitle,JOptionPane.QUESTION_MESSAGE,null,questionsans,questionsans[1]);


		if  ( qA4 == "A") {

		JOptionPane.showMessageDialog (null, "2. Correct!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		score ++;}

		else {

		JOptionPane.showMessageDialog (null, "2. The answer is A.", gameTitle, JOptionPane.PLAIN_MESSAGE );
		score --;}

		qA5= (String) JOptionPane.showInputDialog(null, questions5ask,gameTitle,JOptionPane.QUESTION_MESSAGE,null,questionsans,questionsans[1]);


		if  ( qA5 == "D") {

		JOptionPane.showMessageDialog (null, "2. Correct!", gameTitle, JOptionPane.PLAIN_MESSAGE );
		score ++;}

		else {

		JOptionPane.showMessageDialog (null, "2. The answer is D.", gameTitle, JOptionPane.PLAIN_MESSAGE );
		score --;}


		JOptionPane.showMessageDialog( null,"Your score is: " + score + "/5", gameTitle, JOptionPane.PLAIN_MESSAGE) ;
		//Closing message

		JOptionPane.showMessageDialog(null, "Thank you for playing!");

		//updates: made an decision  tree for the for main menu to be activated and not a filler, adding a score keeper for the correct answers, made the layout of the if else to a dialog box.
		}

		}