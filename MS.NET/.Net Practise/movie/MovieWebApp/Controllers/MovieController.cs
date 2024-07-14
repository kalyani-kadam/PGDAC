using Microsoft.AspNetCore.Mvc;
using MovieWebApp.Service;
using MovieWebApp.Models;

namespace MovieWebApp.Controllers
{
    public class MovieController : Controller
    {
        public IMovieService _movieService { get; set; }

        public MovieController(IMovieService movieService) { 
            _movieService = movieService;
        }
        public ActionResult Index()
        {
            return View();
        }
        [HttpPost]
        public IActionResult Index(string email,string password)
        {
            if (email == "kk@gmail.com" && password=="kk123")
            {
                return RedirectToAction("admin", "movie");
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
        [HttpPost]
        public IActionResult insert(Movie movie)
        {
            Movie movie1 = new Movie();
            movie1.Id = movie.Id;
            movie1.Title = movie.Title;
            movie1.Description = movie.Description;
            return Json(_movieService.insert(movie1));   
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
        public IActionResult update(Movie movie)
        {
            Movie movie1 = new Movie();
            movie1.Id = movie.Id;
            movie1.Title = movie.Title;
            movie1.Description = movie.Description;
            return Json(_movieService.update(movie1));
        }

        [HttpPost]
        public IActionResult delete(int id)
        {
            return Json(_movieService.delete(id));
        }

        public IActionResult getall(Movie movie) 
        {
            return Json(_movieService.GetMovies());
        }

        public IActionResult sort() {
            return Json(_movieService.sort());
        }
    }
}
