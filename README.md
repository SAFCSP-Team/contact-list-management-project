# Contact List Management Project

### Objective
Apply fundamental data structures and algorithms to solve real-world problems using a singly linked list.

### Problem
A mobile phone company wants to create a contact management system that allows users to add, delete, and update contacts. Users can also call a contact, ensuring that only one call is active at a time.

### Implementation
- Create a class called `Contact` with the following attributes:
  - `name`: the contact's name.
  - `phoneNumber`: the contact's phone number.
   
- Create a class called `ContactList` that manages contacts as a **linked list**. It must support the following operations:
  - Write a function `add()` that takes a Contact object as a parameter and adds it to the end of the list, and print a confirmation message indicating the contact has been added.
  - Write a function `delete()` that accepts a contact's name as a parameter. If the contact's name is found in the list, remove that contact and print a message indicating the contact has been deleted. If the contact is not found, print a message stating that the contact does not exist.
  - Write a function `update()` that takes the contact’s name and a new phone number as parameters. The function should update the phone number for the given name and print a confirming message.  If the name isn’t found, print a message indicating the contact does not exist. 
  - Write a function `allContacts()` to display all contacts stored in the list. If the list is empty, print a message indicating there are no contacts.
  - Write a function `call()` that takes a contact's name as a parameter. The function should check if there is an active call. If there is no active call, it should search for the specified contact's name, set that contact as the current call, and print a message indicating that the call has started. If the contact is not found or if there is already a call in progress, the function should print a message.
  - Write a function `closeCall()` that ends the current active call if there is one, and print a message indicating the call has ended. If there is no active call, print a message that no call is in progress.

- In the main function:
  - Add 3 contacts to the contact list.
  - Display all contacts.
  - Call one contact.
  - Call another contact while the first call is active.
  - Close the active call.
  - Call another contact.
  - Update the phone number of a contact.
  - Delete one contact.
  - Display all contacts after deletion and update.


#### Output Example

```
Contact Name: Lana
Phone Number: 0600000000

Contact Name: Sara
Phone Number: 0600000000

Contact Name: Samaa
Phone Number: 0611111111

Calling Lana...

Cannot call Sara. Another call is already in progress.

Call ended.

Calling Sara...

Contact Samaa updated.

Contact Lana deleted.

Contact Name: Sara
Phone Number: 0600000000

Contact Name: Samaa
Phone Number: 0622222222
```

### Qualification to pass
- [ ] The code should run successfully.
- [ ] Write all required functions correctly.
- [ ] Completely define the `Contact` class.
- [ ] Completely define the `ContactList` class.
