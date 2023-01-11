package JavaPracticeTest;

import JavaPracticeTest.QBuilder;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Questions {
    private Scanner scanner;
    private ArrayList<QBuilder> qBuilders;
    public Questions(Scanner scanner, ArrayList<QBuilder> qBuilders) {
        this.scanner = scanner;
        this.qBuilders = qBuilders;
    }

    private String getNextStringLineFromUser() {
        //scanner.nextLine();
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    void question1() {
        Collections.shuffle(qBuilders);
        for (QBuilder qBuilder : qBuilders) {
            String question1 =
                    String.format("%s%nA. %s%nB. %s%nC. %s%nD. %s",
                            qBuilder.getTestQuestion(),
                            qBuilder.getAnswerA(),
                            qBuilder.getAnswerB(),
                            qBuilder.getAnswerC(),
                            qBuilder.getAnswerD()
                    );
            System.out.println(question1);
            String userResponse = getNextStringLineFromUser();
            while (!userResponse.equalsIgnoreCase(qBuilder.getCorrectAnswer())) {
                System.out.println("Incorrect, please try again.");
                userResponse = getNextStringLineFromUser();
                
            }
            if (userResponse.equalsIgnoreCase(qBuilder.getCorrectAnswer())) {
                System.out.println("Correct!");
            }
        }
    }
}


/*
    void question1() {
        String code = String.format("for (int i = 0; i < 10; i++) {%nSystem.out.println(i);%n}");
        String answerA = "A. 0-9 printed on the same line";
        String answerB = "B. 0-9 printed on separate lines"; //correct answer
        String answerC = "C. 1-10 printed on the same line";
        String answerD = "D. 1-10 printed on separate lines";
        String question1 =
                String.format("Question 1:%nWhat is the output of the following code?%n%s%n%s%n%s%n%s%n%s",
                        code, answerA, answerB, answerC, answerD);
        System.out.println(question1);
        String userResponse = getNextStringLineFromUser();
        while (!userResponse.equalsIgnoreCase("B")) {
            System.out.println("Incorrect, please try again.");
            userResponse = getNextStringLineFromUser();
        }
        if (userResponse.equalsIgnoreCase("B")) {
            System.out.println("Correct!");
        }
    }

 */