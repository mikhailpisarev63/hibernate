package hibernate;

import tablehibernate.Courses;
import tablehibernate.Students;

public class StringHQLRequest {
    public final static String programmingCourseHQL = "from " + Courses.class.getSimpleName() +
            " Where price > 100000 and type = 'PROGRAMMING'";
    public final static String registrationDateStudents = "from " + Students.class.getSimpleName() +
            " WHERE MONTH(registration_date) = 4";
}
