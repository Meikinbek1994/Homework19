import java.util.Objects;
import java.util.Scanner;

public enum Days {

    MONDAY("Study Java on Monday."),
    TUESDAY("Study English language on Tuesday."),
    WEDNESDAY("Study Mathematics on Wednesday."),
    THURSDAY("Study Biology on Thursday."),
    FRIDAY("Study Chemistry on Friday."),
    SATURDAY("Study Physics on Saturday."),
    SUNDAY("Study Russian language on Sunday.");



    private String learningLessonsByDays;


    Days(String learningLessonsByDays) {
        this.learningLessonsByDays = learningLessonsByDays;
    }


    public String getLearningLessonsByDays() {
        return learningLessonsByDays;
    }

    public void setLearningLessonsByDays(String learningLessonsByDays) {
        this.learningLessonsByDays = learningLessonsByDays;
    }

    @Override
    public String toString() {
        return "Days{" +
                "learningLessonsByDays='" + learningLessonsByDays + '\'' +
                '}';
    }
}

