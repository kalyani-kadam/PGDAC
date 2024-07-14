using Microsoft.VisualStudio.Web.CodeGenerators.Mvc.Templates.BlazorIdentity.Pages.Manage;
using StudentApp.Models;

namespace StudentApp.Repository
{
    public class StudRepository : IStudRepository
    {
        public bool delete(int id)
        {
            using (var context = new ClollectionContext())
            {
                if (context.stud.Find(id) == null)
                {
                    return false;
                }
                context.stud.Remove(context.stud.Find(id));
                context.SaveChanges();
                return true;
            }
        }

        public List<Student> GetAll()
        {
            using(var context = new ClollectionContext())
            {
                var students = from stud in context.stud select stud;
                return students.ToList<Student>();
            }   
        }

        public bool insert(Student student)
        {
            using (var context = new ClollectionContext())
            {
                context.stud.Add(student);
                context.SaveChanges();
                return true;
            }
        }

        public bool update(Student student)
        {
            using(var context = new ClollectionContext()) 

            {
                var stud = context.stud.Find(student.student_id);
                if (stud != null)
                {
                    stud.student_id = student.student_id;
                    stud.student_email_id = student.student_email_id;
                    stud.student_address = student.student_address;
                    stud.status = student.status;
                    stud.admission_date = student.admission_date;
                    stud.fees = student.fees;
                    stud.student_name = student.student_name;
                    stud.mobile_no = student.mobile_no;

                    context.SaveChanges();
                    return true;
                }
            }
            return false;
        }

        public List<Student> getByStatus(string status)
        {
            using(var context = new ClollectionContext())
            {
                    var student = from stud in context.stud where stud.status == status select stud;
                    return student.ToList();               
            }
        }

        public List<Student> sortstud()
        {
            using(var context = new ClollectionContext())
            {
                return context.stud.OrderBy(stud => stud.status).ToList();
            }
        }

        public List<Student> viewstud(string email,int mob)
        {
            using(var context = new ClollectionContext())
            {
                var student=  from stud in context.stud where stud.student_email_id == email && stud.mobile_no == mob select stud;
                return student.ToList();
            }
        }

        public bool editdata(Student student)
        {
            using (var context = new ClollectionContext())
            {
                //var existstud = from stud in context.stud where stud.student_email_id == student.student_email_id select stud;
                ///var stud = context.stud.Find(student.student_id);
                Student studentupdate = context.stud.FirstOrDefault(s => s.student_email_id.Equals(student.student_email_id));
                if (studentupdate != null)
                {
                    //stud.student_id = student.student_id;
                    studentupdate.student_email_id = student.student_email_id;
                    studentupdate.student_address = student.student_address;
                    studentupdate.status = student.status;

                    //stud.admission_date = student.admission_date;
                    //stud.fees = student.fees;
                    studentupdate.student_name = student.student_name;
                    studentupdate.mobile_no = student.mobile_no;

                    context.SaveChanges();
                    return true;
                }
                return false;
            }
        }
    }
}
