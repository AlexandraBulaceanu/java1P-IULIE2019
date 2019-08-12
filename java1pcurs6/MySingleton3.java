public class MySingleton3{
    private MySingleton3(){}
    private static class MySingletonHolder{
        private static final MySingleton3 instance = new MySingleton3();
    }
    public static MySingleton3 getInstance(){
        return MySingletonHolder.instance;
    }
}