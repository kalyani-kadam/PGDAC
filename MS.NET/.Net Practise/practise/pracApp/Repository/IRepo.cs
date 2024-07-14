using pracApp.Models;

namespace pracApp.Repository
{
    public interface IRepo
    {
        List<Student> getStudents();
        bool insert(Student student);
        bool update(Student student);
        bool delete(int id);

        List<Student> sort();

        List<Student> findbyname(string name);
        List<Student> findbyId(int id);
        List<Student> viewdata(string email);
        List<Student> viewstuddata(string email, int mob);
    }
}
