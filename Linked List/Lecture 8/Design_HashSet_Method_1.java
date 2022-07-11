//  Design HashSet : Using a large size Array
//  NOTE : This method is applicable only to create pre-defined size sets
//  NOTE : This method cannot be use to store negative numbers (as negative index is out of bounds for an Array)

class MyHashSet {
    
    //  Array to store the keys (Index of array represents the key and their value reprsents whether they are present or not)
    int[] set;
    
    public MyHashSet() 
    {
        //  Size of the Array is the maximum input value (as per the constraints)
        int size = 1000001;
        
        //  Creating the Array
        set = new int [size];
        
        // By default all the values in the array are 0 (0 represents the key is not present in the set)
    }
    
    //  Function to store the key in the set
    public void add(int key) 
    {
        //  Key is added by changing the value to 1 (1 represents the key is present in the set)
        set[key] = 1;
    }
    
    //  Function to remove the key from the set
    public void remove(int key) 
    {
        //  Key is removed by changing the value to 0 (as 0 means the key is not present in the set)
        set[key] = 0;
    }
    
    // Function to check whether the key is present or not
    public boolean contains(int key) 
    {
        int value = set[key];
        
        //  The value stored in the key is checked using the if statement to determine it is present or not
        if(value == 0)
            return false;
        else
            return true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
