package 实训的代码;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class shixunzhifile {

	public static void main(String[] args) {
			File encodeingfile=new File("e:/lol.txt");
			File encodedfile=new File("e:/lol1.txt");
			encodeFile(encodeingfile,encodedfile);
			}
			private static void encodeFile(File encodeingfile,File encodedfile) {
				try(FileReader fr=new FileReader(encodeingfile);
						FileWriter fw=new FileWriter(encodedfile)) {
					char[]c=new char[(int)encodeingfile.length()];
					fr.read(c);
					System.out.println("加密前的内容="+new String(c));
					encode(c);
					System.out.println("加密后的内容="+new String(c));
					fw.write(c);
					
							
						} catch (IOException e) {
							
						}
			
			}
				
		
			private static void encode(char[] c) {
				// TODO Auto-generated method stub
				 for(int i=0;i<c.length;i++) {
					  char ch=c[i];
					  if(isLetterOrDifit(ch)) {
						  switch(ch) {
						  case'9':
							  ch='0';
							  break;
						  case'z':
							  ch='a';
							  break;
							  case'Z':
								  ch='A';
								  break;
								  default:
								  ch++;
								  break;
						  }
					  }
				  c[i]=ch;
				  
			  }
			}
			private static boolean isLetterOrDifit(char ch) {
				// TODO Auto-generated method stub
				String str ="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				return -1==str.indexOf(ch)? false:true;
			}
			
	
	}


