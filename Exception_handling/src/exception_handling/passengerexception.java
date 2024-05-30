package exception_handling;

public class passengerexception extends Exception {
String p;
 public passengerexception(String p){
	this.p=p;
}

public String getmsg(){
	
	return p;
}
}
