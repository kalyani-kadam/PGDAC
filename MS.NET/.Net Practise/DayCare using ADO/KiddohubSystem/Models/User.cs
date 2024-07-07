namespace KiddohubSystem.Models
{
    public class User
    {
        public int Id { get; set; }
        public string FName { get; set; }
        public string LName { get; set; }
        public string Email { get; set; }

        public string contact_number { get; set; }

        public string password {  get; set; }
        public User()
        {

        }
        public User(int id,string FName, string LName, string Contact,string Email,string password)
        {
            this.Id = id;
            this.FName = FName;
            this.LName = LName;
            this.contact_number = Contact;
            this.Email = Email;
            this.password = password;
        }
    }
}
