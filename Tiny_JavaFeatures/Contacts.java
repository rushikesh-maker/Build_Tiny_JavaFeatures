class Contact{

   String name;
   String email;
   String phoneNumber;
}

class ContactsManager {

   // Fields:
   Contact myFriends [];
   int friendsCount;
   
   // Constructor:
   ContactsManager() {

      this.friendsCount = 0;
      this.myFriends = new Contact[500];
   }

   //Adding contact in Array of Object
   void addContact(Contact contact) {

      myFriends[friendsCount] = contact;
      System.out.println("Contact added named : "+ myFriends[friendsCount].name);
      friendsCount++;
   }

   //Searching name of contact in Contact Array of Object
    Contact searchContact(String searchName) {
        for(int i=0; i<friendsCount; i++) {
            if(myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}

class Ex {

    public static void main(String[] args) {

        ContactsManager myContactManager = new ContactsManager();

        //Creaate new contact object for Rushikesh
        Contact rushi = new Contact();
        rushi.name = "Rushikesh";
        rushi.email = "rushi@gmail.com";
        rushi.phoneNumber = "09834303930";
        myContactManager.addContact(rushi);

        //Creaate new contact object for Ayush
        Contact ayush = new Contact();
        ayush.name = "Ayush";
        ayush.email = "ayush@gmail.com";
        ayush.phoneNumber = "03234303930";
        myContactManager.addContact(ayush);

        //Creaate new contact object for Harshdeep
        Contact harsh = new Contact();
        harsh.name = "Harshdeep";
        harsh.email = "harsh@gmail.com";
        harsh.phoneNumber = "04434303930";
        myContactManager.addContact(harsh);

        //Creaate new contact object for Pankaj
        Contact pankaj = new Contact();
        pankaj.name = "Pankaj";
        pankaj.email = "pankaj@gmail.com";
        pankaj.phoneNumber = "05634303930";
        myContactManager.addContact(pankaj);

        // Now let's try to search of a contact and display their phone number
        Contact result = myContactManager.searchContact("Rushikesh");

        System.out.println("Name : " + result.name);
        System.out.println("Email : " + result.email);
        System.out.println("Phone No. : " + result.phoneNumber);
       
    }
}
