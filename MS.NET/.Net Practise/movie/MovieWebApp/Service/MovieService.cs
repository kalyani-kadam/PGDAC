using MovieWebApp.Models;
using MovieWebApp.Repository;

namespace MovieWebApp.Service
{
    public class MovieService : IMovieService

    {
        public ImovieRepo repository = new MovieRepo();
        public bool delete(int id)
        {
            return repository.delete(id);
        }

        public List<Movie> GetMovies()
        {
            return repository.GetMovies();
        }

        public bool insert(Movie movie)
        {
            return repository.insert(movie);
        }

        public List<Movie> sort()
        {
           return repository.sort(); 
        }

        public bool update(Movie movie)
        {
            return repository.update(movie);
        }
    }
}
