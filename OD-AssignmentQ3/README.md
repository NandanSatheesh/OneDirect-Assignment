# ASSIGNMENT #3

## Topics Covered: Java Collections.

Design a Data Structure using Java’s Collection Framework that represents a dependency graph.
Dependency Graph is an acyclic multi root directional graph with the exception of a root node, which has no parents.
  
Real Life Scenario:
Family Tree 

Terminology used:
Parent: For edge A->B, A is a parent of B. There may be multiple parents for a child.
Child: For edge A->B, B is a child of A. There may be multiple children of a parent.
Ancestor: parent or grand-parent or grand-grand-parent and so on
Descendant: child or grand-child or grand-grand-child and so on
 
Basically, the data structure should allow, you to store the parent child relationship and this can go to the nth level.
 
Design:
The node information, which we will store, is:
Node Id --- This has to be unique.
Node Name. Need not be distinct.
Additional Information --- In the form of a key value pairs and this can be different for each node.
 
Operations of each function:

showParents() -> Get the immediate parents of a node, passing the node as input parameter. 

showChildren() -> Get the immediate children of a node, passing the node id as input parameter.    

showAncestors() -> Get the ancestors of a node, passing the node as input parameter.

showDecendents() -> Get the descendants of a node, passing the node as input parameter.    

Operations not implemented: 

Delete dependency from a tree, passing parent node id and child node id.  
  
Delete a node from a tree, passing node id as input parameter. This should delete all the dependencies of the node.
  
Add a new dependency to a tree, passing parent node id and child node id. This should check for cyclic dependencies.
  
Add a new node to tree. This node will have no parents and children. Dependency will be established by calling the 7 number API.  

TDD Methodology was not used. Test Cases were written and called from the main class only. 

### Future Impoovements 

- Improved Class Design  


