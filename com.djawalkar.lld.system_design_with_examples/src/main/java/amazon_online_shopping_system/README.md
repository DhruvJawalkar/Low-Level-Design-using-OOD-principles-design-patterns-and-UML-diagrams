# Amazon Online Shopping System

## Requirements:

- R1: A customer can either be an authenticated user or a guest. The authenticated user is one with a registered account on the Amazon online shopping system, whereas a guest does not have a registered account.
- R2: An authenticated user should be able to buy, sell, and search the products via the product name or category. A guest is only able to search for products.
- R3: A product can have multiple reviews and ratings from multiple customers.
- R4: An authenticated user should be able to add, remove, or modify product items in their shopping cart. The authenticated user can further check out and buy the items.
- R5: The authenticated user should be able to specify a shipping address at the time of order.
- R6: Payment can be made through credit cards, electronic bank transfers, or through cash on delivery.
- R7: An order can be canceled, only in the case that it hasn’t been shipped.
- R8: Notifications are sent whenever there is a change in the order or shipping status.
- R9: Shipment can be tracked to see the current status and the estimated time of arrival for the order.
- R10: An admin should exist that can add, modify, or remove product categories and block users.

## Use Case Diagram:
![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/b8dffe1777219ef80b3033fd3f0adc984e61357a/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/use-case-diagram.png](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/b8dffe1777219ef80b3033fd3f0adc984e61357a/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/use-case-diagram.png)

## Class Diagram:
![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/b8dffe1777219ef80b3033fd3f0adc984e61357a/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/class-diagram.png](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/b8dffe1777219ef80b3033fd3f0adc984e61357a/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/class-diagram.png)

## Sequence Diagrams:

### Checkout And Pay
![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/b8dffe1777219ef80b3033fd3f0adc984e61357a/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/sequence-diagram-checkout-and-pay.png](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/b8dffe1777219ef80b3033fd3f0adc984e61357a/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/sequence-diagram-checkout-and-pay.png)

### Search And Add Item
![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/b8dffe1777219ef80b3033fd3f0adc984e61357a/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/sequence-diagram-search-and-add-item.png](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/b8dffe1777219ef80b3033fd3f0adc984e61357a/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/sequence-diagram-search-and-add-item.png)
