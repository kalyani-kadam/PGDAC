using CSharpFeatureApp;

MathEngine math=new MathEngine();
int num1 = 16;
int num2 = 2;

int result=math.Multiply(num1, num2);
Console.WriteLine("Multipllication Result="+ result);

string name = "Ravi Tambade";
 result=name.Division(25, 5);
Console.WriteLine("Division Result="+result);


var studentList = StudentManagerRepo.GetStudentsFromDb();
//var highPerformingStudents = from student in studentList where student.Mark > 80 orderby student.Mark select student;
var highPerformingStudents = studentList.Where(s => s.Mark > 80);

foreach ( var std  in highPerformingStudents)
{
    Console.WriteLine(std.StudentName + " " + std.Mark);
}

Console.ReadLine();


