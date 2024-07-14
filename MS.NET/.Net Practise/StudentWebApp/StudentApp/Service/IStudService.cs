using StudentApp.Models;

namespace StudentApp.Service
{
    public interface IStudService
    {
        List<Student> GetAll();
        bool insert(Student student);
        bool update(Student student);
        bool delete(int id);
        List<Student> sortstud();
        List<Student> getByStatus(string status);
        List<Student> viewstud(string email,int mob);

        bool editdata(Student student);
    }
}
