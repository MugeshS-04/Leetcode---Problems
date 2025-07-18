class RandomizedSet {

    private HashMap <Integer, Integer> myhash;
    private List <Integer> mylist;
    private Random rand;

    public RandomizedSet() {
        mylist = new ArrayList();
        myhash = new HashMap();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(myhash.containsKey(val))
        {
            return false;
        }
        myhash.put(val, mylist.size());
        mylist.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(myhash.containsKey(val))
        {
            int index = myhash.get(val);
            int lastelement = mylist.get(mylist.size() - 1);

            myhash.put(lastelement, index);
            mylist.set(index, lastelement);

            mylist.remove(mylist.size() - 1);
            myhash.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        return mylist.get( rand.nextInt(mylist.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */