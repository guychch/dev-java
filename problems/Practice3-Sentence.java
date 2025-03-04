 /*
      this method asks the user to enter a pronoun, a verb and a noun
      create a sentence of the user input and 
      return the sentences

      Need to put the code in main method to run. you know what to do.
   */
Scanner kb = new Scanner(System.in);
      String sentence = getSentence(kb);
      System.out.print(sentence);

public static String getSentence(Scanner kb)
   {
      System.out.print("Enter a pronoun, a verb, an article and a noun : ");
      String pronoun = kb.next();
      String verb = kb.next();
      String article = kb.next();
      String noun = kb.next();
      return (pronoun + " " + verb + " " + article + " " + noun);
   }

/*
  Another way to do it
   public static String getSentence(Scanner kb)
   {
      String s = "";
      System.out.print("Enter a pronoun : ")
       s = s+ kb.next() + " ";;
      System.out.print("Enter a verb : ")
       s = s+ kb.next() + " ";
       System.out.print("Enter a article : ")
       s = s+ kb.next() + " ";
       System.out.print("Enter a noun : ")
       s = s+ kb.next() + " ";
       return s;
   }

  */

