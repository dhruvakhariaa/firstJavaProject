package QuizConsoleApp;
import java.util.*;

public class QuestionService {
    Questions[] questions = new Questions[5];
    String answer[] = new String[5];
    public QuestionService() {
        questions[0] = new Questions("What is the capital of India?", new String[]{"1. New Delhi", "2. Mumbai", "3. Chennai", "4. Kolkata"}, "New Delhi");
        questions[1] = new Questions("What is the capital of USA?", new String[]{"1. Washington DC", "2. Toronto", "3. Ohio", "4. Hawaii"}, "Washington DC");
        questions[2] = new Questions("Which city is in south India?", new String[]{"1. New Delhi", "2. Mumbai", "3. Chennai", "4. Kolkata"}, "Chennai");
        questions[3] = new Questions("Where do you get best rajma chawal ?", new String[]{"1. New Delhi", "2. Mumbai", "3. Chennai", "4. Kolkata"}, "New Delhi");
        questions[4] = new Questions("Which city is called city of dreams ?", new String[]{"1. New Delhi", "2. Mumbai", "3. Chennai", "4. Kolkata"}, "Mumbai");
    }

    public void displayQuestions() {
        for(Questions q : questions) {
            System.out.println(q);
        }
    }

    public void playQuiz() {
        int i =0;
        for (Questions q: questions){
            System.out.println(q.getQuestion());
            System.out.println(Arrays.toString(q.getOptions()));
            Scanner sc = new Scanner(System.in);
            answer[i] = sc.nextLine();
            i++;
            // String answer = sc.nextLine();
            // if(q.getAnswer().equals(answer)) {
            //     System.out.println("Correct answer!");
            //     score += 1;
            // } else {
            //     System.out.println("Wrong answer!");
            // }

            // System.out.println("Your score is " + score);
        }
    }

    public void CalculateScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Questions q = questions[i];
            String userAnswer = q.getAnswer();
            String actualAnswer = answer[i];
            if (userAnswer.equals(actualAnswer)) {
                score ++;
            }
        }
        System.out.println("Your score is " + score);
    }

}
