import java.io.*;
import java.net.*;
public class server1
{
	public static void main(String[] args)throws IOException {
		ServerSocket s=new ServerSocket(1234);
		Socket s1=s.accept();
		System.out.println("server is ready but wait for client");
		BufferedReader br=new BufferedReader(new InputStreamReader(s1.getInputStream()));
		String user=br.readLine();
		String pass=br.readLine();
		OutputStream out=s1.getOutputStream();
		PrintStream ps=new PrintStream(out);
		if(user.equals("sagar")&&pass.equals("1234"))
		{
			ps.println("valid successfully");
		}
		else
		{
			ps.println("invalid");
		}
	}
}