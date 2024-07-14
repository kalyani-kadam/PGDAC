using WebApplication.Models;
using WebApplication.Repository;

namespace WebApplication.Service
{
    public class Service : IService
    {
        IRepo repo = new Repo();

        public bool delete(int id)
        {
            return repo.delete(id);
        }

        public List<Student> findbyname(string name)
        {
            return  repo.findbyname(name);
        }

        public List<Student> getStudents()
        {
            return repo.getStudents();
        }

        public bool insert(Student student)
        {
            return repo.insert(student);
        }

        public List<Student> sort()
        {
            return repo.sort();
        }

        public bool update(Student student)
        {
            return repo.update(student);    
        }
    }
}
