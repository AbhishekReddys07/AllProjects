import java.util.Scanner;

public class A_test2 {
//private static final String String = ncp;
static void cal(String n,String p)throws logexception{
	String name="user05";
	String pass="qwerty";
	if(name.equals(n)&&pass.equals(p)){
		System.out.println("Login Successful");
	}
	else{
		throw new logexception("Please create new Login ID");
	}
}
	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name");
		String name=sc.next();
		String n=name;
		System.out.println("enter Password");
		String pass=sc.next();
		String p=pass;
		try{
			cal(n,p);
		}
		catch(logexception e){
			System.out.println(e.getmsg());
		}

	sc.close();}

}
class logexception extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	logexception(String msg){ 
		 this.msg=msg;
	 }
	 public String getmsg(){
		 return msg;
	 }
}
