package ProjetosJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class LeituraDeArquivo {
	
   public static void main(String[] args) {
	   
	   
	   File arquivo = new File("src/ProjetosJava/A.txt");
	   
	   try {
		   
		   FileWriter fileWriter = new FileWriter(arquivo);
		   BufferedWriter escrever = new BufferedWriter(fileWriter);
		   escrever.write("A");
		   escrever.write("\n1.1");
		   escrever.write("\n2.2");
		   escrever.write("\n1.5");
		   escrever.write("\n1.2");
		   
		   escrever.close();
		   fileWriter.close();
		   
		   
		   
		   FileReader ler = new FileReader(arquivo);
		   BufferedReader lerb = new BufferedReader(ler);
		   String linha = lerb.readLine();
		   
		   while(linha !=null) {
			   System.out.println(linha);
			   linha = lerb.readLine();
		   }
	   } catch (IOException ex) {
	   }
	  
	   File arquivo2 = new File("src/ProjetosJava/B.txt");
		 
	   try {
		   
		   FileWriter fileWriter = new FileWriter(arquivo2);
		   BufferedWriter escrever = new BufferedWriter(fileWriter);
		   escrever.write("\nB");
		   escrever.write("\n1.1");
		   escrever.write("\n2.1");
		   escrever.write("\n1.5");
		   escrever.write("\n1.3");
		   
		   escrever.close();
		   fileWriter.close();
		   
		   
		   
		   FileReader ler = new FileReader(arquivo2);
		   BufferedReader lerb = new BufferedReader(ler);
		   String linha = lerb.readLine();
		   
		   
		   while(linha !=null) {
			   System.out.println(linha);
			  
			   linha = lerb.readLine();
		   }
	   } catch (IOException e) {
		  		   	   }
	   
	   File arquivo3 = new File("src/ProjetosJava/C.txt");
	   
	   try {
	   
	   
	   BufferedWriter grava = new BufferedWriter(new FileWriter(arquivo3));
	   BufferedWriter escrever = new BufferedWriter(grava);
	   grava.write(","); 
	   grava.newLine();
	   } catch (IOException e) {
	   e.printStackTrace();
	   }
	   
	  
	   
	   
	   System.out.println("\nGravação Concluida!" );
	   
   }

	   
	   }

