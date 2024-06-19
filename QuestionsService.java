public class QuestionsService {

    Question[] question = new Question[5];

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
        for (Question q : question) {
            System.out.println(q);
        }
    }
}
