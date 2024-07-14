using MovieWebApp.Models;

namespace MovieWebApp.Repository
{
    public class MovieRepo : ImovieRepo
    {
        public bool delete(int id)
        {
            using (var con = new CollectionContext()) {
               var searchid =  con.movies.Find(id);
                if (searchid != null) {
                    con.movies.Remove(searchid);
                    con.SaveChanges();
                    return true;
                }
                return false;
            }
        }

        public List<Movie> GetMovies()
        {
            using (var con = new CollectionContext())
            {
                var list = from m in con.movies select m;
                return list.ToList();
            }
        }

        public bool insert(Movie movie)
        {
            using (var con = new CollectionContext())
            {
                //var serchid = con.movies.Find(movie.Id);
                /*if (serchid.Id == movie.Id && serchid == null)
                {
                    return false;                   
                }*/
                con.Add(movie);
                con.SaveChanges();
                return true;
            }
            
        }

        public List<Movie> sort()
        {
            using (var con = new CollectionContext())
            {
                return con.movies.OrderBy(s => s.Title).ToList();
            }
        }

        public bool update(Movie movie)
        {
            using (var con = new CollectionContext())
            {
                var movieid = con.movies.Find(movie.Id);
                if (movieid != null)
                {
                    movieid.Id = movie.Id;
                    movieid.Title = movie.Title;
                    movieid.Description = movie.Description;

                    con.SaveChanges();
                    return true;
                }
                return false;
            }
        }
    }
}
