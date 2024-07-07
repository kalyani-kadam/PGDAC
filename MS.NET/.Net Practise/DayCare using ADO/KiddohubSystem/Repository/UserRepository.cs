using KiddohubSystem.Models;
using KiddohubSystem.Services;
using MySql.Data.MySqlClient;
using Org.BouncyCastle.Bcpg.OpenPgp;
using System.Data;
using System.Runtime.InteropServices;

namespace KiddohubSystem.Repository
{
    public static class UserRepository
    {
       public static bool DeleteUser(int id)
        {
                bool status = false;
                string constring = "server=localhost;Port=3306;user=root;password=root123;database=ecommerce;";
                MySqlConnection con = new MySqlConnection();
                con.ConnectionString = constring;
                try
                {
                    string query = "DELETE FROM users WHERE user_id=" + id;
                    MySqlCommand command = new MySqlCommand(query, con);
                    con.Open();
                    command.ExecuteNonQuery();
                }
                catch (Exception e)
                {
                    throw e;
                }
                finally
                {
                    con.Close();
                }
                return status;
        }

        public static User GetUser(int Id)
        {
            User user = null;
            string connstring = "server=localhost;Port=3306;user=root;password=root123;database=ecommerce;";
            string query = "select * from users where user_id=" + Id;
            MySqlConnection conn = new MySqlConnection(connstring);
            try
            {
                conn.Open();
                MySqlCommand cmd = new MySqlCommand(query, conn);
                cmd.CommandText = query;
                MySqlDataReader reader = cmd.ExecuteReader();

                while (reader.Read())
                {
                    Id = int.Parse(reader["Id"].ToString());
                    string email = reader["email"].ToString();
                    string password = reader["password"].ToString();
                    string contactNO = reader["contactNo"].ToString();

                    user = new User
                    {
                        Id = Id,
                        Email = email,
                        // password = password,
                        contact_number = contactNO
                    };
                }
                reader.Close();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                conn.Close();
            }
            return user;
        }

        public static List<User> GetUsers()
        {
            //User u = new User("K", "K", 68389673, "KK@gmail.com");
            List<User> users = new List<User>();
            string connstring = "server=localhost;Port=3306;user=root ;password=root123;database=ecommerce;";
            MySqlConnection conn = new MySqlConnection(connstring);
            try
            {
                conn.Open();
                string query = "select * from users";
                MySqlCommand cmd = conn.CreateCommand();
                cmd.CommandText = query;
                //cmd.ExecuteNonQuery();
                MySqlDataReader reader = cmd.ExecuteReader();

                while (reader.Read())
                {
                    int id = reader.GetInt32("user_id");
                    string email = reader.GetString("email");
                    string password = reader.GetString("password");
                    string contactNo = reader.GetString("contact_number");
                    User user = new User(); 
                    user.Id = id;
                    user.Email = email;
                    user.contact_number = contactNo;
                    users.Add(user);
                   // Console.WriteLine(id + " " + email + " " + password + " " + contactNo);
                }
                reader.Close();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                if(conn.State != ConnectionState.Closed)
                conn.Close();
            }

            //users.Add(u);
            return users;
            //users.Add("K","K",68389673,"KK@gmail.com");
        }

       public static bool InsertUser(User user)
        {
            bool status = false;
            string connstring = "server=localhost;Port=3306;user=root ;password=root123;database=ecommerce;";
           
            string query = "insert into users(user_id,email,password,contact_number) " +
                "values('"+ user.Id+"','" + user.Email+"','"+ user.password+ "','"+ user.contact_number + "')";

            MySqlConnection conn = new MySqlConnection(connstring);

            try
            {
                conn.Open();
                MySqlCommand cmd = new MySqlCommand(query,conn);
                cmd.ExecuteNonQuery();
                status = true;

            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                conn.Close() ;
            }
            return status;
        }

       public static bool UpdateUser(User user)
        {
            bool status = false;

            string connstring = "server=localhost;Port=3306;user=root;password=root123;database=ecommerce;";

            string query = "update users set user_id ='" + user.Id + "', email='" + user.Email + "', " +
                "password= '" + user.password + "', contact_number= '" + user.contact_number + "' where user_id ="
                        + user.Id;

            MySqlConnection conn = new MySqlConnection(connstring);

            try
            {
                conn.Open();
                MySqlCommand cmd = new MySqlCommand(query, conn);
                cmd.ExecuteNonQuery();
                status = true;

            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                conn.Close();
            }
            return status;
        }
    }
}
