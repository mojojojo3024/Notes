import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class TreeRunner{
     
     public static void main(String[] args){
          
          Tree treeA = new Tree();
          System.out.println(treeA);
          
          ArrayList<Branch> branches = new ArrayList<Branch>();
          branches.add(new Branch());
          System.out.println(branches);
          
          
          ArrayList<String> animals1 = new ArrayList<String>();
          animals1.add("cat");
          animals1.add("whale");
          animals1.add("biting goat");
          System.out.println(animals1);
          
          
          Tree treeB = new Tree(200, false, "aspen", 15.4, animals1, branches ); 
          System.out.println(treeB);
          Tree treeC = new Tree(treeB);
          treeC.setHeight(100.0);
          
          System.out.println( treeB.equals(treeC));
          
          ArrayList<Tree> ob = new ArrayList<Tree>();
          ob.add(treeA);
          ob.add(treeB);
          ob.add(treeC);`
         /* 
          System.out.print(ob);
          Collections.sort(ob);
          System.out.print(ob);
          */
          Tree[] array = new Tree[3];
          array[0] = treeA;
          array[1] = treeB;
          array[2] = treeC;
          Arrays.sort(array);
          System.out.println(Arrays.toString(array));
          
          
          
          //treeC.getBranchArray().get(0).getLeafArray().add(new Leaf("hey", "up"));
          
         // System.out.println( treeB.equals(treeC));
          
          
          // (#1) write a line here that would print "whale" starting from a call to the treeB object
          //System.out.println(treeB.getInhabitants().get(1));
          
          // ///////////////////////////////////////////////////////////////////////////////////////////
          //(#2) the next line has a run-time error... why?  how could you fix it?
           //System.out.println( treeB.getBranchArray().get(0).getLeafArray().get(0) );
          
          
          // ///////////////////////////////////////////////////////////////////////////////////////////
          // (#3)  Write some lines which sets the instance variables of treeA to values other than default 
          //       (be sure to also set the branch and leaf instance variables for treeA)
          
          
          
          
          // ///////////////////////////////////////////////////////////////////////////////////////////
          // (#4)  Most trees have more than one branch.  What is a way that you could allow a Tree object to have more than one Branch object?
          //       After you check your idea with Mr. Simpson, implement your idea.  Then, create a Tree object with multiple branches and print it.
          
          
          
          // ///////////////////////////////////////////////////////////////////////////////////////////
          // (#5)  Right now, all of these classes have no special methods other than constructors/accessor and mutator/toString()
          //       Write a method which belongs to the Tree class which will strip a tree branch of its leaves if it is called.

     }
     
     
}