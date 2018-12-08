/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Array of TreeNodes are used to achieve the 
 * Data Structure Dependency Graph 
 * 
 * @author Nandan
 */

public class DependencyTree 
{   
    ArrayList<TreeNode> nodes = new ArrayList<>() ;
    /*
    This function returns a new TreeNode object
    */
    
    static TreeNode createNode(String id , int value )
    {   
        TreeNode node = new TreeNode() ;
        node.setNodeId(id);
        node.setNodeValue(value);
        
        return node ;
        
        
    }
    
    /*
    This function returns the parents to a particular TreeNode
    */
    void showParents(TreeNode node)
    {
        
        LinkedHashSet<TreeNode> parents = node.nodeParents ;
        Iterator<TreeNode> iterator = parents.iterator() ;
        while(iterator.hasNext())  
        {
            System.out.println(iterator.next());
            
        }
     
    }
    /*
    This function returns the children of a particular TreeNode 
    */
    void showChildren(TreeNode node)
    {
        LinkedHashSet<TreeNode> children = node.nodeChildren ;
        Iterator<TreeNode> iterator = children.iterator() ;
        while(iterator.hasNext())  
        {
            System.out.println(iterator.next());
            
        }
        
    }
    
    /*
    A Depth First Approach is used to find the ancestors of a TreeNode 
    */
    
    void showAncestors(TreeNode node )
    {
        
        Stack<TreeNode> stack = new Stack<>() ;
        LinkedHashSet<TreeNode> parents = node.nodeParents ;
        LinkedHashSet<String> ancestors = new LinkedHashSet<>() ;
        Iterator<TreeNode> iterator = parents.iterator() ;
        while(iterator.hasNext())  
        {
            TreeNode temp = iterator.next() ;
            
            stack.add(temp);
            
        }
        
        while(!stack.isEmpty())
        {
            TreeNode temp = stack.pop() ;
            iterator = temp.nodeParents.iterator() ;
            
            while(iterator.hasNext())  
            {
                TreeNode t1 = iterator.next() ;
                try{
                    
                    if(!stack.contains(t1))
                    {
                        stack.add(iterator.next());
                    }
                    
                }
                catch(NoSuchElementException e)
                {
                    
                }
                
                
            
            }
            
            ancestors.add(temp.toString());
        }
        System.out.println(ancestors);
    
    
        
    }
    

    
    void showDecendents(TreeNode node )
    {
        
        Stack<TreeNode> stack = new Stack<>() ;
        LinkedHashSet<TreeNode> children = node.nodeChildren ;
        LinkedHashSet<String> decendents = new LinkedHashSet<>() ;
        Iterator<TreeNode> iterator = children.iterator() ;
        while(iterator.hasNext())  
        {
            TreeNode temp = iterator.next() ;
            
            stack.add(temp);
            
        }
        
        while(!stack.isEmpty())
        {
            TreeNode temp = stack.pop() ;
            iterator = temp.nodeChildren.iterator() ;
            
            while(iterator.hasNext())  
            {
                TreeNode t1 = iterator.next() ;
                try{
                    
                    if(!stack.contains(t1))
                    {
                        stack.add(iterator.next());
                    }
                    
                }
                catch(NoSuchElementException e)
                {
                    
                }
                
                
            
            }
            
            decendents.add(temp.toString());
        }
        System.out.println(decendents);
    
    
        
    }
    
  
    
    
    
    
   
}