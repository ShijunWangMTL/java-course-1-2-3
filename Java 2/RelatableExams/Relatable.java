package RelatableExams;

public interface Relatable
{
    // abstract method
    boolean equals(GradedActivity g);
    boolean isGreater(GradedActivity g);
    boolean isLess(GradedActivity g);

} // end interface
