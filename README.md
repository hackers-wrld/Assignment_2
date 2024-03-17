# Assignment_2

### TASKS
1. Create an **abstract** **NewspaperSubscription** class 
2. with fields for the **subscriber name**, **address**, and **rate**. 
3. Include **get** and **set** methods for the name field and get methods for the address and subscription rate
4. the **setAddress()** method is **abstract**. 
5. Create two **subclasses** named **PhysicalNewspaperSubscription** and **OnlineNewspaperSubscription**. 
6. The **parameter** for the **setAddress()** method of the PhysicalNewspaperSubscription class must **contain** at least one digit;
	1. otherwise, an error message is displayed and the **subscription rate** is set to 0. 
	2. If the address is valid, the subscription rate is assigned R15. 
7. The parameter for the **setAddress()** method of the OnlineNewspaperSubscription class must **contain**
	1. an at sign (@) or an **error message** is displayed. 
	2. If the address is valid, the subscription rate is assigned R9. 
8. Finally, write an **application** that **declares** several objects of both subscription subtypes and **displays** their data fields. 
9. Save the files as **NewspaperSubscription**.java, **PhysicalNewspaperSubscription**.java, **OnlineNewspaperSubscription**.java, and **DemoSubscriptions**.java.
