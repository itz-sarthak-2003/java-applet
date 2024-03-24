import java.net.*;
import java.util.*;
class inet
{
	public static void main(String[] args)throws Exception {
		System.out.println("enter hostname");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		InetAddress myIP=InetAddress.getByName(name);
		System.out.println(myIP);
	}
}