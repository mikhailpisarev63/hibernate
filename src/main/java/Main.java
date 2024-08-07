import hibernate.HibernateExp;
import hibernate.Sessions;
import mysqllibrary.ConnectionSQL;
import mysqllibrary.RequestStringSQL;
import mysqllibrary.SQLExp;

public class Main {
    private static final RequestStringSQL requestStringSQL = new RequestStringSQL();
    private static final ConnectionSQL connectionSQL = new ConnectionSQL();
    private static final SQLExp sqlExp = new SQLExp();
    private static final String SQLList = "data/listSQL.txt";
    private final static HibernateExp hibernateExp = new HibernateExp();

    public static void main(String[] args) {
        /*Select * From Courses where price >= '100000'*/
        sqlExp.writeSQLResultInList(sqlExp.resultSql(connectionSQL.connectionSQL(),
                requestStringSQL.getCoursesWherePrice()));
        System.out.println(sqlExp.readTxtFile(SQLList));

        /*SELECT pl.course_name, pl.subscription_date " +
           "FROM PurchaseList pl " +
           "WHERE pl.course_name = \"Веб-разработчик c 0 до PRO\" " +
           "ORDER BY pl.subscription_date;*/
        sqlExp.resultSqlStudents(connectionSQL.connectionSQL(),
                requestStringSQL.getStudentsCourseName());

        /*SELECT * FROM Students s " +
            "WHERE MONTH(s.registration_date ) = 4;*/
        sqlExp.resultSqlRegistrationDate(connectionSQL.connectionSQL(),
                requestStringSQL.getResultSqlRegistrationDate());

        hibernateExp.resultOfTheProgrammingCourse();
        hibernateExp.resultRegistrationDateStudents();
        Sessions.getSessionFactory().close();
    }
}