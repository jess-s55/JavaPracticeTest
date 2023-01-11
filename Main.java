package JavaPracticeTest;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<QBuilder> qBuilders =
                new ArrayList<>(
                        Arrays.asList(
                                new QBuilder("How many gits can you have?",
                                        "c",
                                        "1",
                                        "2",
                                        "As many as you want",
                                        "0"),
                                new QBuilder(String.format("What is the output of the following code?%nfor (int i = 0; i < 10; i++) {%nSystem.out.println(i);%n}"),
                                        "b",
                                        "0-9 printed on the same line",
                                        "0-9 printed on separate lines",
                                        "0-10 printed on separate lines",
                                        "1-10 printed on separate lines"),
                                new QBuilder("What is the terminal command to create a new empty file?",
                                        "d",
                                        "pwd",
                                        "cd",
                                        "echo",
                                        "touch"),
                                new QBuilder("Which of these is NOT a primitive data type?",
                                        "a",
                                        "String",
                                        "byte",
                                        "long",
                                        "boolean"),
                                new QBuilder("In a UML diagram, how do you know if the variables or methods are public or private?",
                                        "c",
                                        "Public is shown with a minus sign (-) or a green circle, while private is shown with a plus sign (+) or a red square.",
                                        "Public is shown with a plus sign or a red square, while private is shown with a minus sign or a green circle.",
                                        "Public is shown with a plus sign or a green circle, while private is shown with a minus sign or a red square.",
                                        "Public is shown with a minus sign or a red square, while private is shown with a plus sign or a green circle."),
                                new QBuilder(String.format("Unscramble the following code:%n(1)System.out.println(\"odd\");%n(2)}%n(3)public void printEvenOrOdd(int[] listOfNums) {%n(4)} else if (listOfNums[i] %% 3 == 0) {%n(5)}%n(6)System.out.println(\"even\");%n(7)int size = listOfNums.length;%n(8)}%n(9)if (listOfNums[i] %% 2 == 0) {%n(10)for (int i = 0; i < size; i++) {"),
                                        "d",
                                        "3, 10, 7, 9, 6, 4, 8, 2, 5, 1",
                                        "3, 7, 10, 9, 1, 2, 6, 4, 8, 5",
                                        "1, 10, 8, 6, 2, 5, 9, 7, 3, 4",
                                        "3, 7, 10, 9, 6, 4, 1, 2, 5, 8"),
                                new QBuilder(String.format("Which loop will ignore the first and last elements of the following array?%nint size = array.length;"),
                                        "a",
                                        "for (int i = 1; i < size-1; i++)",
                                        "for (int i = 0; i < size; i++)",
                                        "for (int i = 1; i < size; i++)",
                                        "for (int i = 2; i < size-1; i++)")
                        )
                );
        Questions questions = new Questions(new Scanner(new InputStreamReader(System.in, StandardCharsets.UTF_8)), qBuilders);
        System.out.println("Java Test");
        System.out.println("Enter the letter of the correct answer to move on to the next question.");
        questions.question1();

    }
}
