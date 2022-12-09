import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File f=new File("abc.txt");
//		FileOutputStream fos=new FileOutputStream(f,true);
//		String data="I am writing in the file again";
//		byte[] bytedata=data.getBytes();
//		fos.write(bytedata);
//		
//		FileInputStream fis=new FileInputStream(f);
//		int x;
//		while(( x=fis.read())!=-1) {
//			System.out.println((char)x);
//		}

//		FileWriter fw = new FileWriter(f, true);
//		
//		fw.write("Passed using filewriter!!");
//		System.out.println("File is written ");
//		fw.close();
		
		//FileReader fr=new FileReader(new File("abc.txt"));
		BufferedReader br=new BufferedReader(new FileReader(new File("abc.txt")));
//		int x;
//		while((x=fr.read())!=-1) {
//			
//			System.out.print((char)x);
//			
//		}
		String line=null;
		ArrayList<String> myfileList=new ArrayList<String>();
		while((line=br.readLine())!=null) {
			String[] strarray=line.split(" ");
				
			Arrays.asList(strarray);
		}
		
		br.close();
		
		
		//File f=new File("abc.txt");
		Path path=Paths.get("abc.txt");
		Files.readAllLines(path);
		
		//Files.copy(path, null)
		
		
		
		
		
		
		
		
		
	}

}
