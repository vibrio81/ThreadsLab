2. The application should print out "Mares do eat oats."

- Is it guaranteed to always do this?
    No
- If not, why not?
  For the most part his result will send back "Key Statement 1" but not always. 
  


3. Would it help to change the parameters of the two invocations of Sleep?
   Yes and no. This can reverse which statement is more likely to return, 
   but it still can not be guaranteed.


4. How would you guarantee that all changes to message will be visible in the main thread?
   Encapsulate "message" in an object with synchronized methods (as shown at the top of the code).
   System.out.println(message.getMessage) for both Key statements. 