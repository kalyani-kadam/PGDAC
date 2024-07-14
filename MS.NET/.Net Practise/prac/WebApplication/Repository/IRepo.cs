using WebApplication.Models;

namespace WebApplication.Repository
{
    public interface IRepo
    {
        List<Student> getStudents();
        bool insert(Student student);
        bool update(Student student);
        bool delete(int id);

        List<Student> sort();

        List<Student> findbyname(string  name);

    }
}
