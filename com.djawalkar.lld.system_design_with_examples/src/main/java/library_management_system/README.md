# Library management System

## Requirements:

- R1: The system should be able to store the information about books and members of the library. Moreover, the complete log of the book borrowing process should also be stored.
- R2: Every book is supposed to have a unique identification number and other details including a rack number to help locate the book physically.
- R3: Every book should have an associated ISBN, title, author name, subject, and publication date.
- R4: There can be multiple copies of the book. Each copy will be recognized as a book item.
- R5: There can be two types of users, i.e., the librarian and the members.
- R6: Every user must have a library card with a unique card number.
- R7: One member can issue a maximum of 10 books at a time.
- R8: The member can issue a book for a maximum of 15 days.
- R9: Each book item can only be reserved by a single member.
- R10: The system should be able to keep a record of who issued or reserved a particular book and on which date.
- R11: The system should allow the user to renew the reserved book.
- R12: The system should send a notification if the book is not returned within the due date.
- R13: If the book is currently not available, then the member should be able to reserve it for whenever it is available.
- R14: The system should allow the user to search a book by its title, author name, subject, or publication date.

## Use Case Diagram:

![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/assets/5371976/e0334ff6-621f-49c5-a83c-44a073565350](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/489667dbe2f5b4a970ff5e5116df0472910539ee/com.djawalkar.lld.system_design_with_examples/src/main/java/library_management_system/uml-diagrams/use-case-diagram.png)

## Class Diagram:

![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/489667dbe2f5b4a970ff5e5116df0472910539ee/com.djawalkar.lld.system_design_with_examples/src/main/java/library_management_system/uml-diagrams/class-diagram.png](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/489667dbe2f5b4a970ff5e5116df0472910539ee/com.djawalkar.lld.system_design_with_examples/src/main/java/library_management_system/uml-diagrams/class-diagram.png)

## Sequence Diagrams:

### Issue Book
![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/d8b3a5001f5e498c7c32d999a5beb0b5f9c6c289/com.djawalkar.lld.system_design_with_examples/src/main/java/library_management_system/uml-diagrams/sequence-diagram-issue-book.png](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/d8b3a5001f5e498c7c32d999a5beb0b5f9c6c289/com.djawalkar.lld.system_design_with_examples/src/main/java/library_management_system/uml-diagrams/sequence-diagram-issue-book.png)

### Return Book (with opt Pay Fine) 
![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/d8b3a5001f5e498c7c32d999a5beb0b5f9c6c289/com.djawalkar.lld.system_design_with_examples/src/main/java/library_management_system/uml-diagrams/sequence-diagram-return-book-opt-pay-fine.png](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/d8b3a5001f5e498c7c32d999a5beb0b5f9c6c289/com.djawalkar.lld.system_design_with_examples/src/main/java/library_management_system/uml-diagrams/sequence-diagram-return-book-opt-pay-fine.png)

## Activity Diagrams:

### Checkout Book
![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/d8b3a5001f5e498c7c32d999a5beb0b5f9c6c289/com.djawalkar.lld.system_design_with_examples/src/main/java/library_management_system/uml-diagrams/activity-diagram-checkout-book.png](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/d8b3a5001f5e498c7c32d999a5beb0b5f9c6c289/com.djawalkar.lld.system_design_with_examples/src/main/java/library_management_system/uml-diagrams/activity-diagram-checkout-book.png)

### Return Book
![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/d8b3a5001f5e498c7c32d999a5beb0b5f9c6c289/com.djawalkar.lld.system_design_with_examples/src/main/java/library_management_system/uml-diagrams/activity-diagram-return-book.png](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/d8b3a5001f5e498c7c32d999a5beb0b5f9c6c289/com.djawalkar.lld.system_design_with_examples/src/main/java/library_management_system/uml-diagrams/activity-diagram-return-book.png)

### Renew Book
![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/d8b3a5001f5e498c7c32d999a5beb0b5f9c6c289/com.djawalkar.lld.system_design_with_examples/src/main/java/library_management_system/uml-diagrams/activity-diagram-renew-book.png](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/d8b3a5001f5e498c7c32d999a5beb0b5f9c6c289/com.djawalkar.lld.system_design_with_examples/src/main/java/library_management_system/uml-diagrams/activity-diagram-renew-book.png)