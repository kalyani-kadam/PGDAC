﻿namespace WebApplication.Models
{
    public class Student
    {
        public int student_Id { get; set; }
        public string student_name { get; set; }
        public string student_email_id { get; set; }
        public int mobile_no{ get; set; }
        public string student_address {  get; set; }
        public DateTime admission_date { get; set; }
        public int fees {  get; set; }
        public string status { get; set; }
    }
}
