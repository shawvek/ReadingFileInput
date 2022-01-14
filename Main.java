import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    String token="";
    File fileName=new File("Hail.txt");
    Scanner inputFile=new Scanner(fileName);

    //use while loop to read tokens from the Hail.txt
    int count=0;
    while(inputFile.hasNext())
    {
      token=inputFile.next();
      System.out.println(token);
      count++;
    }
    inputFile.close();
    System.out.println("The number of tokens in Hail.txt is "+count+"\n");
    //read Hail.txt and store in String array
    Scanner inputFile2=new Scanner(fileName);
    String[] hail=new String[count];
    int index=0;
    while(inputFile2.hasNext())
    {
      hail[index]=inputFile2.next();
      index++;
    }
    inputFile2.close();
    for(String i:hail)
    {
      System.out.println(i);
    }

    //read HailCommas.txt file with comma delimiter
    File fileName3=new File("HailCommas.txt");
    Scanner inputFile3=new Scanner(fileName3).useDelimiter(",");
    while(inputFile3.hasNext())
    {
      token=inputFile3.next();
      System.out.println(token);
      
    }
    inputFile3.close();
    //read integers.txt file and calculate an average
    File fileName4=new File("integers.txt");
    Scanner inputFile4=new Scanner(fileName4);
    double sum=0;
    int count4=0;
    while(inputFile4.hasNextInt())
    {
      sum+=inputFile4.nextInt();
      count4++;
    }
    inputFile4.close();
    System.out.println("Average ="+(sum/count4));

    //writing to an output file
    File fileName5=new File("hello.txt");
     PrintWriter outFile = new PrintWriter(fileName5);
   
      for (int loop = 1; loop <= 10; loop++)
      {
         outFile.println(loop + " Hello, World!");
      }//end for loop
   
      outFile.close( );    //close the file when finished
    //read intCommas.txt, calculate avg, write to output file
    File fileName6=new File("intCommas.txt");
    Scanner inputFile6=new Scanner(fileName6).useDelimiter(",");
    File fileName66=new File("intCommasAvg.txt");
    PrintWriter outFile6 = new PrintWriter(fileName66);
    double sum6=0;
    int count6=0;
    while(inputFile6.hasNextInt())
    {
      sum6+=inputFile6.nextInt();
      count6++;
    }
    inputFile6.close();
    outFile6.println("Average ="+(sum6/count6));
    outFile6.close();

      

  }
}