package QuizConsoleApp;

public class Main {
    public static void main(String[] args) {
        
        QuestionService service = new QuestionService();

        // service.displayQuestions();
        service.playQuiz();
    }
}
