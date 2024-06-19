import java.util.Scanner;
public class QuestionsService {

    Question[] question = new Question[5];
    String selection[] = new String[5];
    public QuestionsService() {
        question[0] = new Question(1, "What is the best programing language?", "Java", "Python", "JavaScript", "PHP",
                "Java");
        question[1] = new Question(2, "Which language is known for its use in web development?", "C++", "Ruby",
                "JavaScript", "Swift", "JavaScript");
        question[2] = new Question(3, "Which language is primarily used for Android development?", "Python", "Java",
                "PHP", "C#", "Java");
        question[3] = new Question(4, "Which language is known for its simplicity and readability?", "C++", "Python",
                "Java", "Go", "Python");
        question[4] = new Question(5, "Which language is widely used for server-side scripting?", "PHP", "Swift",
                "Kotlin", "HTML", "PHP");
    } 

    public void displayQuestions() {
        int i = 0;
        for (Question q : question) {
            System.out.println("Question no. "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println("i) "+q.getOpt1());
            System.out.println("ii) "+q.getOpt2());
            System.out.println("iii) "+q.getOpt3());
            System.out.println("iv) "+q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        for(String s : selection){
            System.out.println(s);
        }
    }
}
