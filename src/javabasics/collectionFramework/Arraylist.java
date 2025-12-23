/*
                            Iterable
                               |
                           Collection
         ______________________|_______________________
        |                     |                       |
       [List]                 [ Set]                [Queue]
        |                     |                       |
   ArrayList              HashSet              PriorityQueue
   LinkedList             LinkedHashSet
   Vector                 TreeSet
        |
     Stack

                               Map
                                |
                       __________________
                      |                  |
                 HashMap            TreeMap
                 LinkedHashMap      Hashtable

 */ /*
  Collection Framework

  ava Collection Framework ek predefined architecture hai jo objects ko store aur manipulate karne ke liye use hota hai.
   Isme multiple classes aur interfaces hain jo collections (data structures) ko efficiently handle karte hain, jaise ki list, set, queue, aur map.
   
   Definition: 
   Java Collection Framework ek hierarchy hai jo different types ke objects ko store aur manage karne ke liye data structures aur algorithms provide karta hai.

Simple Words: 
Ye ek set of interfaces, classes, aur algorithms hai jo developers ko help karta hai apne code ko reusable, efficient aur easy-to-maintain banane ke liye.




ey Differences Table
Feature	        Array	                                                Collection
Size	       Fixed	                                                   Dynamic
Type	       Homogeneous	                                       Heterogeneous (with generics)
Performance  	Faster	                                                      Slower
Memory	      Less memory usage	                                        More memory usage
Methods	         Limited (no built-in methods)                   	Rich set of built-in methods
Data Structure	    Linear	                                                 List, Set, Map, Queue

 * 
 */