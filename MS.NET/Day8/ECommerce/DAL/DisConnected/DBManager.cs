namespace DAL.ORM;
using BOL;
using System.Data;
using MySql.Data.MySqlClient;

public class DBManager{

    public static string conString=@"server=localhost;port=3306;user=root; password=password;database=transflower";       
    public  static List<Department> GetAllDepartments(){
        List<Department> allDepartments=new List<Department>();
     
        // Entity Framework Code


        return allDepartments;
    }
    }
           

//

            //DisConnected Data Access Mode
             //MySqlConnection  : establishing connection
            //MySqlCommand      : query execution
            //MySqlDataApater
            //DataSet
            //DataTable
            //DataRow
            //DataColumn
            //DataRealtion
