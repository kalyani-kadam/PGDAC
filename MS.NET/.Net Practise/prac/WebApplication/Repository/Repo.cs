using WebApplication.Models;

namespace WebApplication.Repository
{
    public class Repo : IRepo
    {
        public bool delete(int id)
        {
            using (var con = new DBConncs()) {
                if (con.students.Find(id) != null)
                {
                    con.students.Remove(con.students.Find(id));
                    con.SaveChanges();
                    return true;
                }
                return false;
            }
        }

        public List<Student> getStudents()
        {
            using (var con = new DBConncs())
            {
                var studs = from stud in con.students select stud;
                return studs.ToList<Student>();
            }
        }

        public bool insert(Student student)
        {
            using (var con = new DBConncs())
            {
                con.students.Add(student);
                con.SaveChanges();
                return true;
            }
        }
        public List<Student> sort()
        {
            using (var con = new DBConncs())
            {
                var studs = from stud in con.students.Order() select stud;
                return studs.ToList<Student>();
            }
        }

        public bool update(Student student)
        {
            using (var con = new DBConncs())
            {

                var stud = con.students.Find(student.student_Id);
                if (stud != null)
                {
                    stud.student_Id = student.student_Id;
                    stud.student_email_id = student.student_email_id;
                    stud.student_address = student.student_address;
                    stud.student_name = student.student_name;
                    stud.mobile_no = student.mobile_no;
                    stud.status = student.status;
                    stud.admission_date = student.admission_date;
                    stud.fees = student.fees;
                    con.SaveChanges();
                    return true;
                }
                return false;
            }
        }

        public List<Student> findbyname(string name)
        {
            using (var con = new DBConncs())
            {
                var foundstud = from stud in con.students where stud.student_name == name select stud;
                if (foundstud != null)
                    return foundstud.ToList<Student>();
                else
                    return con.students.ToList<Student>();
            }
        }
    }
}
