using StudentApp.Models;

namespace StudentApp.Repository
{
    public interface IStudRepository
    {
        List<Student> GetAll();
        bool insert(Student student);
        bool update(Student student);
        bool delete(int id);

        List<Student> getByStatus(string status);
        List<Student> sortstud();
        List<Student> viewstud(string email, int mob);
        bool editdata(Student student); 
    }
}
