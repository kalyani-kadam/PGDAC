using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpFeatureApp
{
    internal class StudentManagerRepo
    {

        public static IQueryable<Student> GetStudentsFromDb()
        {
            return new[] {
                new Student() { StudentID = 1, StudentName = "John Nigel", Mark = 73, City ="NYC"} ,
                new Student() { StudentID = 2, StudentName = "Alex Roma",  Mark = 51 , City ="CA"} ,
                new Student() { StudentID = 3, StudentName = "Noha Shamil",  Mark = 88 , City ="CA"} ,
                new Student() { StudentID = 4, StudentName = "James Palatte" , Mark = 60, City ="NYC"} ,
                new Student() { StudentID = 5, StudentName = "Ron Jenova" , Mark = 85 , City ="NYC"}
            }.AsQueryable();
        }
    }
}
