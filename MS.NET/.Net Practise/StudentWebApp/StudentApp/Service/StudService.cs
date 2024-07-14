using StudentApp.Models;
using StudentApp.Repository;

namespace StudentApp.Service
{
    public class StudService : IStudService

    {
        IStudRepository repository = new StudRepository();
        public bool delete(int id)
        {
            return repository.delete(id);
        }

        public List<Student> GetAll()
        {
            return repository.GetAll();
        }

        public List<Student> getByStatus(string status)
        {
             return repository.getByStatus(status);
        }
        
        public bool insert(Student student)
        {
            return repository.insert(student);  
        }

        public bool update(Student student)
        {
            return repository.update(student);
        }

        public List<Student> sortstud()
        {
            return repository.sortstud();
        }

        public List<Student> viewstud(string email,int mob)
        {
            return repository.viewstud(email,mob);
        }

        public bool editdata(Student student)
        {
            return repository.editdata(student);
        }
    }
}
