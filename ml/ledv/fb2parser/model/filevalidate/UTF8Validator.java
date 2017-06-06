package ml.ledv.fb2parser.model.filevalidate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class UTF8Validator implements FileValidator {
	private String encoding;
	@Override
	public boolean fileIsValid(File filePath) {
		boolean isValid = false;
		try(InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath))){
			encoding = reader.getEncoding(); 
			if(encoding.equals("UTF8"))
			isValid = true;
		}catch(IOException exc){
			exc.printStackTrace();
		}
		return isValid;
	}
	
	public void encodingValidate(File file){
		
		 if(fileIsValid(file))
			return ;
		
		 File fresultFile = new File(getNewFileName(file));
		 String book = null;

		 try(InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), encoding);
				 BufferedReader br = new BufferedReader(inputStreamReader)){
			 System.out.println(encoding);
			 while(br.readLine() != null){
				 book += br.readLine();
			 }
			 
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 
		 try(OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fresultFile), "UTF-8");
				 BufferedWriter br = new BufferedWriter(outputStreamWriter)){
			 br.write(book);
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		
		 file = fresultFile;
		 
	}
		
	
	private String getNewFileName(File file){
		String name = file.getName();
		 name = name.substring(0, name.length()-4);
		 name = name + "(val).fb2";
		 return name;
	}
}
