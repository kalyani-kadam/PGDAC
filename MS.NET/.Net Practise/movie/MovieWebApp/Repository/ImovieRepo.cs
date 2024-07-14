using MovieWebApp.Models;

namespace MovieWebApp.Repository
{
    public interface ImovieRepo
    {
        List<Movie> GetMovies();
        bool insert(Movie movie);
        bool update(Movie movie);
        bool delete(int id);

        List<Movie> sort();
    }
}
