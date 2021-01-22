
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Digraph <T>{
      HashMap<T, LikedList<T>> map;
      private ArrayList<PairNode<T>> sides=new ArrayList<PairNode<T>>();
      
    public Digraph() {
		map=new HashMap<T, LikedList<T>>();
    }
    
    public void addNode(T val) {
    	if(!map.containsKey(val))
    	map.put(val, new LikedList<T>());
    	
    }
    
    public void addFromTo(T vi,T vf) {
    	sides.add(new PairNode<T>(vi, vf));
    	if(map.containsKey(vi)&&map.containsKey(vf))
    	map.get(vi).add(vf);
    	else System.out.println("First you must add both vertex");
    	
    }
    
    public void show() {
    	for (Map.Entry<T, LikedList<T>> entry : map.entrySet()) {
    	   
			System.out.println(entry.getKey()+": "+entry.getValue().myToString());
		}
    }
    
    public void substract(Digraph<T> G2) {
    	  ArrayList<T> removedNodes=new ArrayList<T>();
    	for (Map.Entry<T, LikedList<T>> entry : G2.map.entrySet()) {
    		T node=entry.getKey();
     	     if(map.containsKey(node)) {
     	    	 map.remove(node);
     	    	 removedNodes.add(node);
     	    	 
     	     } 	     
			
		}
    	if(removedNodes.size()>0) {
    	for (Map.Entry<T, LikedList<T>> entry : map.entrySet()) {
     	   
			LikedList<T> l=entry.getValue();
			for(int i=0 ;i<removedNodes.size();i++) {
				l.removeAll(removedNodes.get(i));
			}
		}
    	}
    	
    	
    }
    	 
    public Digraph<PairNode<T>> cartesian(Digraph<T> G2) {
    	  Digraph<PairNode<T>> rez= new Digraph<PairNode<T>>();
    	  for (Map.Entry<T, LikedList<T>> entry : map.entrySet()) {
    		  for (Map.Entry<T, LikedList<T>> entry2 : G2.map.entrySet()) {

       	   PairNode<T> pair=new PairNode<T>(entry.getKey(),entry2.getKey());
       	   rez.addNode(pair);
  			
  		}
    		  }
    	  
    	
    	  
    	  for (Entry<PairNode<T>, LikedList<PairNode<T>>> entry: rez.map.entrySet()) {
    	       
    		  for (Entry<PairNode<T>, LikedList<PairNode<T>>> entry2: rez.map.entrySet()) {
      
       	          PairNode<T> t1=entry.getKey();
       	          PairNode<T> t2=entry2.getKey();
       	          if( ((t1.x==t2.x) && G2.map.get(t1.y).contain(t2.y)) || ((t1.y==t2.y) && map.get(t1.x).contain(t2.x)) )
       	          {
       	        	  rez.addFromTo(t1, t2);
       	          }
    	    	  
        	  }
    	  }
    	  
 	  return rez;
    }
    
  
    
}
        
      
    	   
    	  
       
       
       
        
    
        
        
	

