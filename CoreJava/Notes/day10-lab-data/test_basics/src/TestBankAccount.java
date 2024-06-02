class TestBankAccount
{
 public static void main(String[] args)
 { 
   //create bank acct instance n display it's details
//acctNo, String firstName, String lastName, double balance   
   BankAccount acct=new BankAccount(101,"a1","b1",12345);
   System.out.println(acct);//toString
 }
}