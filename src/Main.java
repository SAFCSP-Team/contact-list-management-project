public class Main {
    public static void main(String[] args) {
        ContactList myContacts = new ContactList();
        myContacts.add(new Contact("Lana", "0600000000"));
        myContacts.add(new Contact("Sara", "0607777777"));
        myContacts.add(new Contact("Samaa", "0611111111"));

        myContacts.allContacts();

        myContacts.call("Lana");
        myContacts.call("Sara"); 

        myContacts.closeCall();

        myContacts.call("Sara");

        myContacts.update("Samaa","0622222222"));
        myContacts.delete("Lana");

        myContacts.allContacts();
    }

}
