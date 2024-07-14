using Microsoft.AspNetCore.Mvc;
using WebApplication.Models;
using WebApplication.Service;
namespace WebApplication.Controllers
{
    public class StudController : Controller
    {
        public IService _service {  get; set; }
        public StudController(IService service) { 
            _service = service;
        }
        public IActionResult Index()
        {
            return View();
        }
        [HttpPost]
        public IActionResult Index(string email,string pwd)
        {
            if(email=="kk@gmail.com" && pwd == "kk1")
            {
                return RedirectToAction("admin", "stud");
            }
            return View();
        }

        public IActionResult admin()
        {
            return View();
        }
        public IActionResult insert() { 
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
        public IActionResult insert(Student  student)
        {
            Student student2 = new Student();
            student2.student_Id = student.student_Id;
            student2.student_email_id = student.student_email_id;   
            student2.student_name = student.student_name;  
            student2.student_address = student.student_address;
            student2.student_name = student.student_name;
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
            student2.student_name = student.student_name;
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

    }
}
