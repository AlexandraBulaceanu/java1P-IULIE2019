public class Exemplu4{
    public static void main(String [] args){
        DatabaseManagerFactory manager1 = DatabaseManagerFactory.create(DatabaseManagerFactory.DataType.ORACLE);
        manager1.select();
        manager1 = DatabaseManagerFactory.create(DatabaseManagerFactory.DataType.MySQL);
        manager1.insert();
    }
}