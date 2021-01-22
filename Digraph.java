
import java.util.HashMap;

public class Digraph <T>{
      HashMap<T, LikedList<T>> map;
      
    public Digraph() {
		map=new HashMap<T, LikedList<T>>();
    }
    
    public void addNode(T val) {
    	if(!map.containsKey(val))
    	map.put(val, new LikedList<T>());
    	
    }
    
    public void addFromTo(T vi,T vf) {
    	if(map.containsKey(vi)&&map.containsKey(vf))
    	map.get(vi).add(vf);
    	else System.out.println("First you must add both vertex");
    	
    }
    
    public void show() {
    	for (T elm : map.keySet()) {
			System.out.println(elm+": "+map.get(elm).myToString());
		}
    }
    	 
    	  
 	  
      }
        
      
    	   
    	  
       
       
       
        
    
        
        
	
