import java.io.*;
import java.net.*;
public class client1
{
	public static void main(String[] args)throws IOException{
		Socket s=new Socket("LocalHost",1234);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter User and Pass");
		String user=br.readLine();
		String pass=br.readLine();
		OutputStream os=s.getOutputStream();
		PrintStream ps=new PrintStream(os);
		ps.println(user);
		ps.println(pass);
		BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String res=br1.readLine();
		System.out.println(res);
	}
}