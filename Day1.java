import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day1 {

    int sum = 0;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String token = "";
        int type;
        
        System.out.println("Write the nr of entries you wanna calculate [2-3]: ");
        Scanner extype = new Scanner(System.in); 
        String s = extype.nextLine(); 
        type = Integer.parseInt(s); 
        extype.close();

        // Preluarea datelor din fisier si introducerea acestora intr-un vector
        Scanner sc = new Scanner(new File("D:\\File\\file.txt"));
        List<String> temp = new ArrayList<String>();
          while (sc.hasNext())
          {
              token = sc.next();
              temp.add(token);
          }
              sc.close();
              String[] tempsArray = temp.toArray(new String[0]);
              
      // Calcularea produsului dintre numerele care adunate dau 2020, pt ambele cazuri (cand ni se cere 2 nr, respectiv 3)
          switch(type){
              case 2:
                  
               for (int i=0; i < tempsArray.length;i++)
              {
                  for (int j = i + 1; j < tempsArray.length; j++)
                  {
                      if (Integer.parseInt(tempsArray[i])+Integer.parseInt(tempsArray[j]) == 2020)
                      {
                           System.out.println("The two entries that sum to 2020 are: "+tempsArray[i]+ ", " + tempsArray[j]);
                           System.out.println("The multiplication of the two entries that sum to 2020 is: " + Integer.parseInt(tempsArray[i]) * Integer.parseInt(tempsArray[j]));
                              
                      }
                  }
              }
                     
               break;
              case 3:
                 
                   for (int i=0; i < tempsArray.length;i++)
              {
                  for (int j = i + 1; j < tempsArray.length; j++)
                  {
                      for (int k = j + 1; k < tempsArray.length; k++)
                      {   
                          if (Integer.parseInt(tempsArray[i])+Integer.parseInt(tempsArray[j])+Integer.parseInt(tempsArray[k]) == 2020)
                          {   
                              System.out.println("The 3 entries that sum to 2020 are: "+tempsArray[i]+ ", " + tempsArray[j] + ", "+ tempsArray[k]);
                              System.out.println("The multiplication of the three entries that sum to 2020 is: " + Integer.parseInt(tempsArray[i]) * Integer.parseInt(tempsArray[j]) * Integer.parseInt(tempsArray[k]));
                              
                           }
                      }
                  }
              }
                 break;
              default:
              System.out.println("You have to choose between 2 or 3 (entries)");
      }
      
           
          
          
          
      }
      
  }