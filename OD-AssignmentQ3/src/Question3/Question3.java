/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Nandan
 */
/*
    Main class for achieveing functionality from TreeNode and DependencyTree classes
*/
public class Question3 
{
    
    
    
    
    public static void main(String[] args)
    {
        DependencyTree object = new DependencyTree() ;
        TreeNode nodeA = DependencyTree.createNode("A", 1);
        TreeNode nodeB = DependencyTree.createNode("B", 2);
        TreeNode nodeC = DependencyTree.createNode("C", 3);
        
        TreeNode nodeD = DependencyTree.createNode("D", 4) ;
        
        
        nodeA.addChildren(nodeB);
        nodeA.addChildren(nodeC);
        nodeA.addChildren(nodeD);
        
        nodeB.addParent(nodeA);
        
        nodeC.addParent(nodeA);
        nodeC.addChildren(nodeD);
        
        nodeD.addParent(nodeA);
        nodeD.addParent(nodeC);
        
        object.showChildren(nodeA);
        
        object.showParents(nodeD);
        
        object.showAncestors(nodeD);
        
        object.showAncestors(nodeA);
        
        object.showDecendents(nodeA);
        
        
    }
    
    
}
