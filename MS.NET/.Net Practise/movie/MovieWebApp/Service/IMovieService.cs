using MovieWebApp.Models;

namespace MovieWebApp.Service
{
    public interface IMovieService
    {
        List<Movie> GetMovies();
        bool insert(Movie movie);
        bool update(Movie movie);
        bool delete(int id);
        List<Movie> sort();
    }
}
