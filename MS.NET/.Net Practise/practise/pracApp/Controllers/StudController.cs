using Microsoft.AspNetCore.Mvc;


using pracApp.Models;
using pracApp.Service;

namespace pracApp.Controllers
{
    public class StudController : Controller
    {
        public IService _service { get; set; }
        public StudController(IService service)
        {
            _service = service;
        }
        /*public IActionResult Index()
        {
            return View();
        }*/


        public IActionResult Index(string email, string pwd)
        {
            if (email == "kk@gmail.com" && pwd == "kk1")
            {
                return RedirectToAction("admin", "stud");
            }
            return View();
        }

        public IActionResult admin()
        {
            return View();
        }
        public IActionResult insert()
        {
            return View();
        }
        public IActionResult delete()
        {
            return View();
        }

        public IActionResult update()
        {
            return View();
        }
        [HttpPost]
        public IActionResult insert(Student student)
        {
            Student student2 = new Student();
            student2.student_Id = student.student_Id;
            student2.student_email_id = student.student_email_id;
            student2.student_name = student.student_name;
            student2.student_address = student.student_address;
            student2.mobile_no = student.mobile_no;
            student2.fees = student.fees;
            student2.status = student.status;
            student2.admission_date = student.admission_date;

            return Json(_service.insert(student2));
        }
        [HttpPost]
        public IActionResult update(Student student)
        {
            Student student2 = new Student();
            student2.student_Id = student.student_Id;
            student2.student_email_id = student.student_email_id;
            student2.student_name = student.student_name;
            student2.student_address = student.student_address;
            student2.mobile_no = student.mobile_no;
            student2.fees = student.fees;
            student2.status = student.status;
            student2.admission_date = student.admission_date;

            return Json(_service.update(student2));
        }

        [HttpPost]
        public IActionResult delete(int id)
        {
            return Json(_service.delete(id));
        }

        public IActionResult getall()
        {
            return Json(_service.getStudents());
        }

        public IActionResult sort()
        {
            return Json(_service.sort());
        }

        public IActionResult findbyname()
        {
            return View();
        }
        [HttpPost]
        public IActionResult findbyname(string name)
        {
            return Json(_service.findbyname(name));
        }
        public IActionResult findbyId()
        {
            return View();
        }
        [HttpPost]
        public IActionResult findbyId(int id)
        {
            return Json(_service.findbyId(id));
        }

        public IActionResult stud()
        {
            return View();
        }
        public IActionResult studaction(string email, int mob)
        {
            return RedirectToAction("stud", "stud");
        }
        public IActionResult viewdata()
        {
            return View();
        }
        [HttpPost]
        public IActionResult viewdata(string email, int mob)
        {
            //List<Student> student =_service.viewdata(email, mob);
            //return Json(student.ToList());
            //return RedirectToAction("stud","stud");
            return Json(_service.viewdata(email));
        }

        public IActionResult loginn(string email, string password)
        {
            {
                if (email == "pk@gmail.com" && password == "pk1")
                {
                    return RedirectToAction("student", "stud");
                }
                return View();
            }
        }

        public IActionResult student()
        {
            return View();
        }

        public IActionResult viewstuddata()
        {   
            return View();
        }

        [HttpPost]
        public IActionResult viewstuddata(string email,int mob)
        {
            return Json(_service.viewstuddata(email, mob));
        }


    }
}

