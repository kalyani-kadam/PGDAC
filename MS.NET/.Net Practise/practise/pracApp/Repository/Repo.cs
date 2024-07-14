using pracApp.Models;

namespace pracApp.Repository
{
    public class Repo : IRepo
    {
        public bool delete(int id)
        {
            using (var con = new DBConncs())
            {
                if (con.students.Find(id) == null)
                {
                    return false;
                }
                con.students.Remove(con.students.Find(id));
                con.SaveChanges();
                return true;
                
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
                //var studs = from stud in con.students.Order() select stud;
                //return studs.ToList<Student>();
                return con.students.OrderBy(stud => stud.fees).ToList();
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
                //var foundstud = from stud in con.students where stud.student_name == name select stud;
                // Console.WriteLine("foundstud="+foundstud);
                //return foundstud.ToList();
                /*if (foundstud != null)
                    return foundstud.ToList<Student>();
                else
                    return con.students.ToList<Student>();*/

               return con.students.Where(s => s.student_name == name).ToList();
            }
        }

        public List<Student> viewdata(string email)
        {
            using (var con = new DBConncs())
            {

                //var studdata = from stud in con.students where stud.student_email_id == email select stud;
                //var studdata = con.students.Where(e => e.student_email_id.Equals(email));
                //return studdata.ToList();
                return con.students.Where(s => s.student_email_id == email).ToList();
            }
        }

        public List<Student> findbyId(int id)
        {
            using (var con = new DBConncs())
            {
                return con.students.Where(s  => s.student_Id == id).ToList();
            }
            }

        public List<Student> viewstuddata(string email, int mob)
        {
            using (var con = new DBConncs())
            {
                return con.students.Where(s => s.student_email_id == email).ToList();
                    
            }
        }
    }
}
