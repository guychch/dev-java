/*
      this method asks the user to enter a pronoun, a verb and a noun
      create a sentence of the user input and 
      return the sentences

      You know what to do to put the method in main class to run.
   */

 //create a for loop to calculate salary for few person
      for (int i=1; i<=4; i++)
      {
         double salary = getSalary(kb);
         System.out.print("Your salary is : $" + salary);
         System.out.println();
      }

   public static String getSentence(Scanner kb)
   {
      System.out.print("Enter a pronoun, a verb, an article and a noun : ");
      String pronoun = kb.next();
      String verb = kb.next();
      String article = kb.next();
      String noun = kb.next();
      return (pronoun + " " + verb + " " + article + " " + noun);
   }
