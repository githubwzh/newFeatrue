@FunctionalInterface
public interface FunctionalUserInfo {
    String printUserInfo(String username,String password);
    default void printDefaultUserInfo(String username){
        System.out.println("default方法打印:"+username);
    };
}
