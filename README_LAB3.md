**Project Topic: Architectural Firm - Behavioral Design Patterns**

**Project author:** Ana Petranis

**Objectives:**

  1. Study and understand the Behavioral Design Patterns.

  2. As a continuation of the previous laboratory work, think about what communication between software entities might be involed in your system.

  3. Implement some additional functionalities using behavioral design patterns.
  
  
**Theory:**

In software engineering, a Design Pattern describes an established solution to the most commonly encountered problems in software design. Behavioral design patterns identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication.
In this laboratory work is used the Chain of Responsibility. The pattern chains the receiving objects together, and then passes any request messages from object to object until it reaches an object capable of handling the message. The number and type of handler objects isn't known a priori, they can be configured dynamically.


**Implementation:**

New Year is coming! So, it's time to make the clients happy with a #MegaWinterSale! Of course, the old clients should be rewarded for their loyality twice.
Thus, the project has been enlarged with a pseudo-database, presented by an ArrayList clients, and, if the client's name is presented there, he/she can have a discount.
Behavioral design pattern "Chain of Responsibility" helped in the realization of the checking a particular client is old or new and what type of building he/she wants to construct. These factors affect the total price. In Chain of Responsibility take part handler classes (one basic and two specific) and an interface (IHandler).
- BasicHandler sets the clients, defined in ClientDB
- HandleClient checks, if the current client is presented in ClientDB list. If yes, sends the request to HandleDiscount; if no, gives a discount for new clients

  @Override
  
      public void handle(Request request){
      
          clients.setClients();
          
          if (clients.getClients().contains(request.client)){
          
              BasicHandler h2 = new HandleDiscount();
              
              h2.handle(request);
              
          } else {
          
              request.discount = 2;
              
              System.out.println("For our new clients we have a Christmas sale -2%");
              
          }
          
      }
      
- HandleDiscount checks the type of building the client wants to order

  @Override
  
      public void handle(Request request){
      
          if (request.building.equals("School")){
          
              request.discount = 5;
              
              System.out.println("For our old clients who want to build a school we have a Christmas sale -5%");
              
          } else if (request.building.equals("Business Center")){
          
              request.discount = 3;
              
              System.out.println("For our old clients who want to build a business center we have a Christmas sale -3%");
              
          } else if (request.building.equals("Private House")){
          
              request.discount = 10;
              
              System.out.println("For our old clients who want to build a private house we have a Christmas sale -10%");
              
          }
          
      }

Results:

The result of the program execution is attached in the Lab3_old.png and Lab3_new.png file. Here you can see the demo of the operations that executes the algorithm. In conclusion, it is possible to say that Design Patterns ease the process of software development and help developers to maintain the code clean and clear.
