package QuizConsoleApp;

import java.util.Arrays;

public class Questions {
    private String question;
    private String options[];
    private String answer;
    
    public Questions(String question, String[] options, String answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Questions{");
        sb.append("question=").append(question);
        sb.append(", options=").append(Arrays.toString(options));

        // sb.append(", options = ").append(String.join(", ", options)); //Has a cleaner look 
        // Can be used only if all the elements in array are String type
        
        sb.append(", answer=").append(answer);
        sb.append('}');
        return sb.toString();
    }


    
}
