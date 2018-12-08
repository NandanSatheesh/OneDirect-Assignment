/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.LinkedHashSet;

/**
 *
 * @author Nandan
 */
public class TreeNode 
{
    
    private int mnodeValue ;
    private String mnodeId ;
    
    LinkedHashSet<TreeNode> nodeParents ;
    LinkedHashSet<TreeNode> nodeChildren ;
    
    public String getNodeId()
    {
        return this.mnodeId ;
    }
    
    public int getNodeValue()
    {
        return this.mnodeValue ;
    }
    
    
    
    
    TreeNode()
    {
        mnodeValue = 0 ;
        mnodeId = null ;
        nodeParents = new LinkedHashSet<TreeNode>() ;
        nodeChildren = new LinkedHashSet<TreeNode>() ;
        
    }
    
    void setNodeValue(int value)
    {
        this.mnodeValue = value ;
    }
    
    void setNodeId(String id)
    {
        this.mnodeId = id ;
    }
    
    void addParent(TreeNode parent)
    {
        if(this.nodeParents.contains(parent))
        {
            System.out.println("already a parent");
        }
        else
        {
            this.nodeParents.add(parent) ;
        }
    }
    
    void addChildren(TreeNode child)
    {
        if(this.nodeChildren.contains(child))
        {
            System.out.println("already a child ");
        }
        else
        {    
            this.nodeChildren.add(child) ;
        }
    }
    
    
    @Override
    public String toString()
    {
        return("node id -> "+this.getNodeId()+"\nnode value -> "+this.getNodeValue()) ;
    }
    
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

