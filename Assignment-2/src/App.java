import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Iterator;

// Create Multiple classes

// Student:
// Properties: studentId, name, email, contactNumber
class Student {
    private int studentId;
    private String name;
    private String email;
    private long contactNumber;

    // Constructor
    public Student(int studentId, String name, String email, long contactNumber) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    // Getters and setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
}

// Assignment:
// Properties: assignmentId, title, description, dueDate, List<Question>

class Assignment {
    private int assignmentId;
    private String title;
    private String description;
    private String dueDate;
    private List<Question> questions;

    // Constructor
    public Assignment(int assignmentId, String title, String description, String dueDate, List<Question> questions) {
        this.assignmentId = assignmentId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.questions = questions;
    }

    // Getters and setters
    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    // Hashcode and equals implementation
    @Override
    public int hashCode() {
        return Objects.hash(assignmentId, title, description, dueDate, questions);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Assignment that = (Assignment) obj;
        return assignmentId == that.assignmentId &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(dueDate, that.dueDate) &&
                Objects.equals(questions, that.questions);
    }
}

// Trainer:
// Properties: trainerId, name, email, contactNumber, List<TechStack>
class Trainer {
    private int trainerId;
    private String name;
    private String email;
    private long contactNumber;
    private List<TechStack> techStack;

    // Constructor
    public Trainer(int trainerId, String name, String email, long contactNumber, List<TechStack> techStack) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.techStack = techStack;
    }

    // Getters and setters
    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public List<TechStack> getTechStack() {
        return techStack;
    }

    public void setTechStack(List<TechStack> techStack) {
        this.techStack = techStack;
    }

    // Hashcode and equals implementation
    @Override
    public int hashCode() {
        return Objects.hash(trainerId, name, email, contactNumber, techStack);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Trainer trainer = (Trainer) obj;
        return trainerId == trainer.trainerId &&
                Objects.equals(name, trainer.name) &&
                Objects.equals(email, trainer.email) &&
                contactNumber == trainer.contactNumber &&
                Objects.equals(techStack, trainer.techStack);
    }
}

// TechStack:
// Properties: techStackId, name, description
class TechStack {
    private int techStackId;
    private String name;
    private String description;

    // Constructor
    public TechStack(int techStackId, String name, String description) {
        this.techStackId = techStackId;
        this.name = name;
        this.description = description;
    }

    // Getters and setters
    public int getTechStackId() {
        return techStackId;
    }

    public void setTechStackId(int techStackId) {
        this.techStackId = techStackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Hashcode and equals implementation
    @Override
    public int hashCode() {
        return Objects.hash(techStackId, name, description);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        TechStack techStack = (TechStack) obj;
        return techStackId == techStack.techStackId &&
                Objects.equals(name, techStack.name) &&
                Objects.equals(description, techStack.description);
    }
}

// Result:
// Properties: resultId, student, assignment, trainer, score, feedback,
// submissionDate

class Result {
    private int resultId;
    private Student student;
    private Assignment assignment;
    private Trainer trainer;
    private double score;
    private String feedback;
    private String submissionDate;

    // Constructor
    public Result(int resultId, Student student, Assignment assignment, Trainer trainer, double score, String feedback,
            String submissionDate) {
        this.resultId = resultId;
        this.student = student;
        this.assignment = assignment;
        this.trainer = trainer;
        this.score = score;
        this.feedback = feedback;
        this.submissionDate = submissionDate;
    }

    // Getters and setters

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    public static List<Result> generateResults(List<Student> students, List<Trainer> trainers,
            List<Assignment> assignments) {
        List<Result> results = new ArrayList<>();
        Random random = new Random();

        for (Student student : students) {
            Trainer trainer = trainers.get(random.nextInt(trainers.size()));
            for (int i = 0; i < 4; i++) {
                Assignment assignment = assignments.get(i);
                double score = generateRandomScore();
                String feedback = generateRandomFeedback();
                String submissionDate = generateRandomSubmissionDate();
                Result result = new Result(results.size() + 1, student, assignment, trainer, score, feedback,
                        submissionDate);
                results.add(result);
            }
        }

        return results;
    }

    private static double generateRandomScore() {
        return Math.random() * 100;
    }

    private static String generateRandomFeedback() {
        return "Excellent work!";
    }

    private static String generateRandomSubmissionDate() {
        return "01/05/2024";
    }

    static Map<String, Integer> getting_results(List<Result> results) {
        int total_marks = 0;
        int percentage = 0;
        int count = 0;
        List<String> name_stack = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (Result result : results) {
            String name = result.getStudent().getName();
            String assign_title = result.getAssignment().getTitle();
            String assign_desc = result.getAssignment().getDescription();
            int assign_id = result.getAssignment().getAssignmentId();
            int score = (int) result.getScore();

            if (name_stack.contains(name)) {
                total_marks += score;
                count += 1;
                System.out.println("\n" +
                        "Assignment Title:- " + assign_title + "\nAssignment Description: " +
                        assign_desc
                        + "\nScore of the Assignment-" + assign_id + " is:- " + score + "\nTotal Score:- "
                        + total_marks);
                if (count == 4) {
                    percentage = total_marks / 4;
                    map.put(name, percentage);
                    System.out.println("\nPercentage for the Assignments is:- " + percentage + "%");
                    count = 0;
                    total_marks = 0;
                }

            } else {
                name_stack.add(name);
                count += 1;
                total_marks += score;
                System.out.println("---------------------------");
                System.out.println("Assignment List of " + name);
                System.out.println("---------------------------");
                System.out.println("Assignment Title:- " + assign_title + "\n Assignment Description: " + assign_desc
                        + "\nScore of the Assignment-" + assign_id + " is:- " + score + "\nTotal Score:- "
                        + total_marks);
            }
        }
        return map;
    }

    static Map<String, Integer> sorted_map(Map<String, Integer> hash_map) {
        Map<String, Integer> sortedMap = hash_map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                        LinkedHashMap::new,
                        (map, entry) -> map.put(entry.getKey(), entry.getValue()),
                        LinkedHashMap::putAll);
        return sortedMap;
    }

    static void ranking(Map<String, Integer> hashMap) {
        Map<String, Integer> sortedMap = sorted_map(hashMap);
        int[] count = { sortedMap.size() / 10 };
        sortedMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(element -> {
                    System.out.println("Rank: " + count[0] + " " + element.getKey() + " " + element.getValue() + "%");
                    count[0]++;
                });
    }

    static void highest_performing(Map<String, Integer> hash_map) {
        String highestStudent = null;
        int highestScore = Integer.MIN_VALUE;
        System.out.println(sorted_map(hash_map));
        for (Map.Entry<String, Integer> entry : hash_map.entrySet()) {
            if (entry.getValue() > highestScore) {
                highestScore = entry.getValue();
                highestStudent = entry.getKey();
            }
        }

        // Print the highest performing student
        System.out.println(
                "Highest Performing Student: " + highestStudent + " with a score of " + highestScore);
    }

    static void second_highest(Map<String, Integer> hash_map) {
        String highestStudent = null;
        int highestScore = Integer.MIN_VALUE;
        String secondHighestStudent = null;
        int secondHighestScore = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : hash_map.entrySet()) {
            int score = entry.getValue();
            if (score > highestScore) {
                secondHighestScore = highestScore;
                secondHighestStudent = highestStudent;
                highestScore = score;
                highestStudent = entry.getKey();
            } else if (score > secondHighestScore) {
                secondHighestScore = score;
                secondHighestStudent = entry.getKey();
            }
        }

        // Print the second highest performing student
        System.out.println(
                "Second Highest Performing Student: " + secondHighestStudent + " with a score of "
                        + secondHighestScore);
    }

    static void improvements(Map<String, Integer> hash_map) {
        hash_map.entrySet().stream().filter(element -> element.getValue() < 60).forEach(
                element -> System.out.println("\nList of students need improvement are:- " + element.getKey() + " got "
                        + element.getValue()));
    }

    static void Prashant_Rohan(Map<String, Integer> hash_map) {
        hash_map.entrySet().stream().filter(element -> element.getKey() == "Prashant" || element.getKey() == "Rohan")
                .forEach(element -> System.out.println("\n" + element.getKey() + " got " + element.getValue()));
    }

    // Hashcode and equals implementation
    @Override
    public int hashCode() {
        return Objects.hash(resultId, student, assignment, trainer, score, feedback, submissionDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Result result = (Result) obj;
        return resultId == result.resultId &&
                Double.compare(result.score, score) == 0 &&
                Objects.equals(student, result.student) &&
                Objects.equals(assignment, result.assignment) &&
                Objects.equals(trainer, result.trainer) &&
                Objects.equals(feedback, result.feedback) &&
                Objects.equals(submissionDate, result.submissionDate);
    }
}

// ResultsData:
// Properties: List<Result>
class ResultsData {
    private List<Result> results;

    // Constructor
    public ResultsData(List<Result> results) {
        this.results = results;
    }

    // Getter and setter for the list of results
    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    void addResult(Result result) {
        results.add(result);
    }

    void getResultsByStudent(Student student) {

    }
}

// Question:
// QuestionId, List<Answer>, answerkey, score of Question, techstackid,
// assignmentid
class Question {
    private int questionId;
    private List<Answer> answers;
    private String answerKey;
    private int scoreOfQuestion;
    private int techStackId;
    private int assignmentId;

    // Constructor
    public Question(int questionId, List<Answer> answers, String answerKey, int scoreOfQuestion,
            int techStackId, int assignmentId) {
        this.questionId = questionId;
        this.answers = answers;
        this.answerKey = answerKey;
        this.scoreOfQuestion = scoreOfQuestion;
        this.techStackId = techStackId;
        this.assignmentId = assignmentId;
    }

    // Getters and setters
    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public String getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(String answerKey) {
        this.answerKey = answerKey;
    }

    public int getScoreOfQuestion() {
        return scoreOfQuestion;
    }

    public void setScoreOfQuestion(int scoreOfQuestion) {
        this.scoreOfQuestion = scoreOfQuestion;
    }

    public int getTechStackId() {
        return techStackId;
    }

    public void setTechStackId(int techStackId) {
        this.techStackId = techStackId;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

}

// Answer:
// answerId, content, answerkey
// assignmentid
class Answer {
    private int answerId;
    private String content;

    public Answer(int answerId, String content) {
        this.answerId = answerId;
        this.content = content;
    }

    // Getters and setters
    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

public class App {
    public static void main(String[] args) throws Exception {

        // Create 10 students Objects
        List<Student> student = new ArrayList<>();
        student.add(new Student(1, "Aakarshak", "aakarshak@google.com", 1234567890L));
        student.add(new Student(2, "Vinit", "vinit@google.com", 2345678901L));
        student.add(new Student(3, "Dwij", "dwij@google.com", 3456789012L));
        student.add(new Student(4, "fenil", "fenil@google.com", 4567890123L));
        student.add(new Student(5, "gopi", "gopi@google.com", 5678901234L));
        student.add(new Student(6, "fidyan", "fidyan@google.com", 6789012345L));
        student.add(new Student(7, "yash", "yash@google.com", 7890123456L));
        student.add(new Student(8, "Rohan", "Rohan@google.com", 8901234567L));
        student.add(new Student(9, "Prashant", "Prashant@google.com", 9012345678L));
        student.add(new Student(10, "Kiran", "Kiran@google.com", 1234567890L));

        // System.out.println(student.get(0).getStudentId());
        // Create 5 tech stacks
        // TechStack:
        // Properties: techStackId, name, description
        List<TechStack> techStack = new ArrayList<>();
        techStack.add(new TechStack(1, "Python", "General-purpose programming language"));
        techStack.add(new TechStack(2, "Java", "Object-oriented programming language"));
        techStack.add(new TechStack(3, "C++", "General-purpose programming language"));
        techStack.add(new TechStack(4, "Django", "Web development framework for Python"));
        techStack.add(new TechStack(5, "Spring", "Application development framework for Java"));

        // Create 3 trainers
        List<Trainer> trainer = new ArrayList<>();
        // Properties: trainerId, name, email, contactNumber, List<TechStack>
        trainer.add(new Trainer(1, "Ritu", "ritu.s@brudite.com", 9023258962L, techStack));
        trainer.add(new Trainer(2, "Krishna", "krishna.t@brudite.com", 9028238962L, techStack));
        trainer.add(new Trainer(3, "Rishabh", "rishabh.t@brudite.com", 9229258962L, techStack));

        // Answers
        List<Answer> answers = new ArrayList<>();
        answers.add(new Answer(1, "What is Python"));
        answers.add(new Answer(2, "What is Java"));
        answers.add(new Answer(3, "What is C++"));
        answers.add(new Answer(4, "What is Django"));
        answers.add(new Answer(5, "What is Spring"));
        // System.out.println(answers.get(0));

        // Create 4 questions in each assignment
        List<Question> question = new ArrayList<>();
        // Question:
        // QuestionId, List<Answer>, answerkey, score of Question,
        // techstackid,assignmentid

        // Questions for Assignment-1
        question.add(new Question(1, answers, "General-purpose programming language", 10, 1, 1));
        question.add(new Question(2, answers, "Object-oriented programming language", 10, 2, 1));
        question.add(new Question(3, answers, "Web development framework for Python", 10, 4, 1));
        question.add(new Question(4, answers, "Application development framework for Java", 10, 5, 1));

        // Questions for Assignment-2
        question.add(new Question(1, answers, "Object-oriented programming language", 10, 2, 2));
        question.add(new Question(2, answers, "General-purpose programming language", 10, 1, 2));
        question.add(new Question(3, answers, "Application development framework for Java", 10, 5, 2));
        question.add(new Question(4, answers, "Web development framework for Python", 10, 4, 2));

        // Questions for Assignment-3
        question.add(new Question(1, answers, "Application development framework for Java", 10, 5, 3));
        question.add(new Question(2, answers, "General-purpose programming language", 10, 3, 3));
        question.add(new Question(3, answers, "Object-oriented programming language", 10, 2, 3));
        question.add(new Question(4, answers, "General-purpose programming language", 10, 1, 3));

        // Questions for Assignment-4
        question.add(new Question(1, answers, "General-purpose programming language", 10, 3, 4));
        question.add(new Question(2, answers, "Web development framework for Python", 10, 4, 4));
        question.add(new Question(3, answers, "Object-oriented programming language", 10, 2, 4));
        question.add(new Question(4, answers, "General-purpose programming language", 10, 3, 4));

        // Create 4 Assignments
        List<Assignment> assignments = new ArrayList<>();
        // Assignment:
        // Properties: assignmentId, title, description, dueDate, List<Question>

        assignments.add(new Assignment(1, "Data Types", "Study data types in programming languages", "05/01/2024",
                question.subList(0, 3)));
        assignments.add(new Assignment(2, "OOPS", "Explore Object-Oriented Programming concepts", "15/01/2024",
                question.subList(4, 7)));
        assignments.add(new Assignment(3, "Caching", "Learn about caching mechanisms in software development",
                "25/01/2024", question.subList(8, 11)));
        assignments.add(new Assignment(4, "Development Strategies",
                "Understand different development strategies and methodologies", "1/02/2024",
                question.subList(12, 15)));

        // Result Geneartion
        List<Result> results = Result.generateResults(student, trainer, assignments);

        // Display the results
        Map<String, Integer> map = Result.getting_results(results);

        // create a method to Find the highest performing Student by adding all
        // techStack(Subjects) marks and finding percentages.
        Result.highest_performing(map);

        // create a method to Find the second-highest student by adding all
        // techStack(Subjects) marks/Assignments and finding percentages.
        Result.second_highest(map);

        // Create a method to find the overall ranking of students by Scores.
        Result.ranking(map);

        // Get all the Students who need improvements and scored less than 60%.
        Result.improvements(map);

        // Get all the Results of one Student named “Rohan/Prashant“ of all his
        // Assignments and questions scores.
        Result.Prashant_Rohan(map);

    }
}
