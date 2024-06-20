public class HouseKey {
    private static HouseKey instance;
    
    private HouseKey() {
        
    }
    
    public static HouseKey getInstance() {
        if (instance == null) {
            instance = new HouseKey();
        }
        return instance;
    }
    
    public void unlock() {
        System.out.println("House unlocked.");
        
    }
    
    public void lock() {
        System.out.println("House locked.");
      
    }
}
