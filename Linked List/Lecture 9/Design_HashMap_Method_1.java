//  Design HashMap : Using a large size Array
//  NOTE : This method is applicable only to create pre-defined size maps 
//  NOTE : This method cant store -1 as a value for a key (as -1 indicates the key is not assigned with a value)
//  NOTE : This method cant store a negative key (as negative index is out of bounds for an Array)

class MyHashMap {
    
    //  Array to store the mapping of key and value (index is the key and value stored in the index is the value)
    int map[];  
    
    public MyHashMap() 
    {
        //  Size of array is the maximum input value (as per the constraints)
        int size = 1000001;  
        
        //  Creating the array
        map = new int[size];   
        
        //  Initialising the map array with -1 indicating the key does not have a value
        Arrays.fill(map,-1);   
    }
    
    //  Function to store the key and value in the map
    public void put(int key, int value) 
    {
        //  Updating the value assigned in the key (It overwrites any exisiting value (if present) with the current value)
        map[key] = value; 
    }
    
    //  Function to get the value using the key
    public int get(int key) 
    {
        //  Index of the array indicates the value assigned (if no value assigned then it return -1 as its the default initial value)
        int value = map[key];  
        return value;  
    }
    
    //  Function to remove the key from the map
    public void remove(int key) 
    {
        //  key is removed simply by changing the value to -1 (as -1 indicates that key is not assigned to any value)
        map[key] = -1;  
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
