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
                                        "for (int i = 2; i < size-1; i++)"),
                                new QBuilder(String.format("Which of the following will execute only if both are true?%nx = 5;%ny = 7;"),
                                        "b",
                                        "if (x < 10 || y > 7)",
                                        "if (x < 10 && y < 10)",
                                        "if (x > 10 || y < 10)",
                                        "if (x > 0 && y < 3)"),
                                new QBuilder("Which of the following will instantiate an array with 5 integers?",
                                        "a",
                                        "int[] myArray = new int[5];",
                                        "int[] myArray = new myArray[5];",
                                        "int[] myArray = new int[]{5};",
                                        "int{} myArray = new int{5};"),
                                new QBuilder(String.format("What are the values of a and b?%nint i = 1;%nint a = i++;%nint b = ++i;"),
                                        "c",
                                        "a = 2, b = 3",
                                        "a = 1, b = 2",
                                        "a = 1, b = 3",
                                        "a = 2, b = 2"),
                                new QBuilder(String.format("What is the output of the following code?%nint a = 2;%nint b = 3;%nint c = 4;%nint d = 5;%nSystem.out.println((--b * a) + (c * d--));"),
                                        "d",
                                        "22",
                                        "40",
                                        "20",
                                        "24"),
                                new QBuilder(String.format("Which of the following is the correct way to create a constructor for the code below?%npublic class Person {%n    private int personId;"),
                                        "b",
                                        String.format("public int Person(int personId) {%nthis.personId = personId;%n}"),
                                        String.format("public Person(int personId) {%nthis.personId = personId;%n}"),
                                        String.format("public Person(int personId) {%npersonId = this.personId;%n}"),
                                        String.format("public int Person(personId) {%nint this.personId = personId;%n}")),
                                new QBuilder("What is it called when you have multiple constructors with the same name but different parameters in a class?",
                                        "c",
                                        "Overriding",
                                        "Instantiating",
                                        "Overloading",
                                        "Nothing. It's impossible to have multiple constructors in the same class."),
                                new QBuilder("What is the proper syntax for the main method?",
                                        "d",
                                        "public static main(String[] args) {",
                                        "public void main(String args) {",
                                        "public static void main(String args[]) {",
                                        "public static void main(String[] args) {"),
                                new QBuilder("Which terminal command would you use to see the gits you have already commited and pushed?",
                                        "a",
                                        "git log",
                                        "git status",
                                        "git init",
                                        "git commit")
                        )
                );
        Questions questions = new Questions(new Scanner(new InputStreamReader(System.in, StandardCharsets.UTF_8)), qBuilders);
        System.out.println("Java Test");
        System.out.println(String.format("Enter the letter of the correct answer to move on to the next question.%nThere is only one correct answer per question."));

        questions.question1();

    }
}
