Project Topic: Architectural Firm - Structural Design Patterns

Project author: Ana Petranis

Objectives:

1. Study and understand the Structural Design Patterns.
2. As a continuation of the previous laboratory work, think about the functionalities that your system will need to provide to the user.
3. Implement some additional functionalities using structural design patterns.

Theory:

In software engineering, a Design Pattern describes an established solution to the most commonly encountered problems in software design. Structural patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient. In this project are included three Structural Patterns:

Bridge - Lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.
Composite – Lets you compose objects into tree structures and then work with these structures as if they were individual objects.
Proxy – Controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

Implementation:

--Bridge-- It is constructed by using the IDesigner interface and DesignSketch, Table, Curtain, Mirror and Armchair classes. DesingSketch has a role of the remote control over Table, Curtain, Mirror and Armchair through the IDesigner. Thus, it is possible to set the material and color of the objects after verifying if these properties have not been set yet.
--Composite-- This SDP allows to check the total cost of the designed objects. CompoundDesigner class has a method add, that gathers prices of the Table, Mirror, Curtain and Armchair together and transmits the total sum to the client for the next payment operations through the interface IDesigner.
--Proxy-- In this project it is used for payment operations. A potential client has cash and a card. Card is a proxy class. If there is not enough money on it, client can perform a transaction and add transfer some amount of cash to card. In these operations are involved classes Cash and Card and their common interface IMoney. 

Results:

The result of the program execution is attached in the Result_screen1.png and Result_screen2.png files. Here you can see the demo of the operations that executes the algorithm. In conclusion, it is possible to say that Structural Patterns ease the process of software development and help developers to maintain the code clean and clear.
