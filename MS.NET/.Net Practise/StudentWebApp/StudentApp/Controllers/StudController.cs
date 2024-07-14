using Microsoft.AspNetCore.Mvc;
using StudentApp.Service;
using StudentApp.Models;
using System.Collections.Generic;
using Microsoft.AspNetCore.Authorization;
namespace StudentApp.Controllers
{
    public class StudController : Controller
    {
        public IStudService _studservice;
        public StudController(IStudService studService)
        {
            _studservice = studService;
        }
        public IActionResult Index(string email, string password)
        {
            if (email == "kk@gmail.com" && password == "kk123")
            {
                return RedirectToAction("admin", "stud");
            }
            /*if (email == "pk@gmail.com" && password == "pk123"){

                return RedirectToAction("student","stud");
            }*/
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
        [HttpPost]
        public IActionResult insert(Student student)
        {
            Student student1 = new Student();

            student1.student_id = student.student_id;
            student1.student_email_id = student.student_email_id;
            student1.student_address = student.student_address;
            student1.student_name = student.student_name;
            student1.admission_date = student.admission_date;
            student1.fees = student.fees;
            student1.mobile_no = student.mobile_no;
            student1.status = student.status;

            return Json(_studservice.insert(student1));
        }

        public IActionResult update()
        {
            return View();
        }

        [HttpPost]
        [AllowAnonymous]
        public IActionResult update(Student student)
        {
            Student student1 = new Student();

            student1.student_id = student.student_id;
            student1.student_email_id = student.student_email_id;
            student1.student_address = student.student_address;
            student1.student_name = student.student_name;
            student1.admission_date = student.admission_date;
            student1.fees = student.fees;
            student1.mobile_no = student.mobile_no;
            student1.status = student.status;

            return Json(_studservice.update(student1));

            /*if (ModelState.IsValid)
            {
                return new Student
                {

                    student_id = student.student_id,
                    student_email_id=student.student_email_id,
                    student_address = student.student_address,  
                    student_name = student.student_name,
                    status = student.status,
                    fees = student.fees,
                    admission_date = student.admission_date,   
                    mobile_no = student.mobile_no,

                };*/
        }

        public IActionResult delete() 
        {
            return View(); 
        }
        [HttpPost]
        public IActionResult delete(int id)
        {
            return Json(_studservice.delete(id));
        }
 
        public IActionResult getall()
        {
            //List<Student> studs = _studservice.GetAll();
            //return View(studs);

            return Json(_studservice.GetAll()); 
        }

        public IActionResult getbystatus()
        {
            return View();
        }

        [HttpPost]
        public IActionResult getbystatus(string status) {
            /* List < Student > studs = _studservice.getByStatus(status);
             return View(studs);*/
            return Json(_studservice.getByStatus(status));
        }

        public IActionResult sortstud()
        {
            return Json(_studservice.sortstud());
        }

        //student 
        
        public IActionResult Student()
        {
            return RedirectToAction("stud","stud");
        }
        //[HttpPost]
        /*public IActionResult student(string email,int mob)
        {
            return RedirectToAction("stud","stud");
        }
        */
        public IActionResult stud()
        {
            return View();
        }
        public IActionResult viewstud()
        {
            return View();
        }
        [HttpPost]
        public IActionResult viewstud(string email,int mob)
        {
            return Json(_studservice.viewstud(email,mob));
        }

        public IActionResult editdata()
        {
            return View();
        }
        [HttpPut]
        public IActionResult editdata(Student student)
        {
            Student student1 = new Student();

           // student1.student_id = student.student_id;
            student1.student_email_id = student.student_email_id;
            student1.student_address = student.student_address;
            student1.student_name = student.student_name;
            //student1.admission_date = student.admission_date;
            //student1.fees = student.fees;
            student1.mobile_no = student.mobile_no;
            student1.status = student.status;
            return Json(_studservice.editdata(student1));
        }
    }
}
