import java.net.*;
import java.util.*;
import java.io.*;
class long1
{
public static void main(String[] args)throws Exception{
	URL hp=new URL("www.msbte.com");
	URLConnection con=hp.openConnection();
	long d=con.getDate();
	if(d==0)
		System.out.println("no date information");
	else
}System.out.println("date:"+new Date(d));
System.out.println("Content Type"+con.getContentType());
int len=con.getContentLength();
if(len==1)
System.out.println("content length unavailable");
else
System.out.println("content length"+len);
}