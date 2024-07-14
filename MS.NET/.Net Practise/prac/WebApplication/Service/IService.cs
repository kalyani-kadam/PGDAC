using WebApplication.Models;

namespace WebApplication.Service
{
    public interface IService
    {
        List<Student> getStudents();
        bool insert(Student student);
        bool update(Student student);
        bool delete(int id);

        List<Student> sort();

        List<Student> findbyname(string name);
    }
}
