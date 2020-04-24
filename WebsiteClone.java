import java.io.*;
import java.net.*;
import java.util.*;
public class WebsiteClone
{
	public static void main(String args[])throws Exception
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the URL of the website you want to clone: ");
		String input;
		while(true)
		{
			input=scan.nextLine();
			if(input.startsWith("http://")||input.startsWith("https://"))break;
			System.out.println("YourURL must start with http:// or https:// (whichever is applicable). Please try again!");
		}
		URL url=new URL(input);
		BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
		FileWriter fw=new FileWriter("Index.html");
		BufferedWriter bw=new BufferedWriter(fw);
		String inputLine;
		while((inputLine=br.readLine())!=null)
		{
			bw.write("\n"+inputLine);
		}
		System.out.println("Your webpage is created successfully.");
		bw.flush();
		bw.close();
		br.close();
	}
}