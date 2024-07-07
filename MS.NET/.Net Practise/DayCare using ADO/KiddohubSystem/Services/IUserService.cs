using KiddohubSystem.Models;
namespace KiddohubSystem.Services
{
    public interface IUserService
    {
        List<User> GetUsers();
        User GetUser(int id);
        bool UpdateUser(User user);

        bool DeleteUser(int id);

        bool InsertUser(User user);

    }
}
