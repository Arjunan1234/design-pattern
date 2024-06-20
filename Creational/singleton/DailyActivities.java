public class DailyActivities {
    public static void main(String[] args) {
        HouseKey key1 = HouseKey.getInstance();
        HouseKey key2 = HouseKey.getInstance();
        
        key1.unlock(); 
        key2.lock(); 
    }
}
