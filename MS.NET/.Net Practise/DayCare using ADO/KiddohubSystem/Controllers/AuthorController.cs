using KiddohubSystem.Services;
using Microsoft.AspNetCore.Mvc;
using KiddohubSystem.Models;

namespace KiddohubSystem.Controllers
{
    public class AuthorController : Controller
    {

        private IUserService _userService;

        public AuthorController(IUserService userService)
        {
            _userService = userService;
        }
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult Login()
        {
            return View();
        }

        [HttpPost]
       public IActionResult Login(string email,string password)
        {
            if(email == "kk@gmail.com" && password == "kk123"){
                return RedirectToAction("index", "Contact");
            }
            return View();
        }
        public IActionResult Register()
        {
            return View();
        }

        [HttpPost]

        public IActionResult Register(int id, string fname,string lname,string contactNo, string email,string password) {
            User user = new User();
            user.Id = id;
            user.FName = fname;
            user.LName = lname;
            user.contact_number = contactNo;
            user.Email = email;
            user.password = password;
           //bool status =  _userService.InsertUser(user);
            return Json(_userService.InsertUser(user)) ;
        }

        public IActionResult Users()
        {
            return Json(_userService.GetUsers());
        }
        public IActionResult User(int id)
        {
            return Json(_userService.GetUser(id));
        }

        public IActionResult UpdateUser()
        {
            return View();
        }
        [HttpPost]
        public IActionResult UpdateUser(int id, string fname, string lname, string contactNo, string email, string password)
        {
            User user = new User();
            user.Id = id;
            user.FName = fname;
            user.LName = lname;
            user.contact_number = contactNo;
            user.Email = email;
            user.password = password;
            //bool status =  _userService.InsertUser(user);
            return Json(_userService.UpdateUser(user));
        }
        public IActionResult DeleteUser()
        {
            return View();
        }
        [HttpPost]
        public IActionResult DeleteUser(int ID) { 
            return Json(_userService.DeleteUser(ID));
        }
    }
}
