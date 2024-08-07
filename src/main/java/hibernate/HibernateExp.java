package hibernate;

import tablehibernate.Courses;
import tablehibernate.Students;

import java.util.List;

public class HibernateExp extends StringHQLRequest {
    private List sessionsCreateQuery(String stringHQL) {
        return Sessions.getSessionFactory().createQuery(stringHQL).getResultList();
    }

    public void resultOfTheProgrammingCourse() {
        List<Courses> coursesList;
        coursesList = sessionsCreateQuery(programmingCourseHQL);
        for (Courses courses : coursesList) {
            System.out.println(System.lineSeparator() + "Преподаватель курса: "
                    + courses.getTeacher().getName());
            for (Students students : courses.getStudents()) {
                System.out.println(students.getName() + " | "
                        + courses.getName());
            }
        }
    }

    public void resultRegistrationDateStudents() {
        List<Students> studentsList;
        studentsList = sessionsCreateQuery(registrationDateStudents);
        for (Students students : studentsList) {
            System.out.println("id: " + students.getId() + " | " +
                    students.getName() + " | " +
                    students.getRegistrationDate());
        }
    }
}
