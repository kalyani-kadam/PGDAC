using KiddohubSystem.Models;
using KiddohubSystem.Repository;
namespace KiddohubSystem.Services
{
    public class UserService : IUserService
    {

        public UserService() { }

         User IUserService.GetUser(int id)
        {
            User user = UserRepository.GetUser(id);
            return user;
        }

         List<User> IUserService.GetUsers()
        {
            //User u = new User("K", "K", 68389673, "KK@gmail.com");
           List<User> users = UserRepository.GetUsers();

            //users.Add(u);
            return users;
            //users.Add("K","K",68389673,"KK@gmail.com");
        }

         bool IUserService.InsertUser(User user)
        {
            return UserRepository.InsertUser(user);
        }

         bool IUserService.UpdateUser(User user)
        {
            return UserRepository.UpdateUser(user);
        }

        bool IUserService.DeleteUser(int id)
        {
            return UserRepository.DeleteUser(id);
        }
    }
}
