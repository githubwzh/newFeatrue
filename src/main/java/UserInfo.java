/**
 * @Description
 * @Author wzh
 * @Date 2019/12/23 17:28
 * @Version 2.10
 **/
@FunctionalInterface
public interface UserInfo {
    /**
     * 抽象方法
     */
    void addUser();
    /** FunctionalInterface注解下可以允许该方法
     * Object类里的equals方法
     * @param obj
     * @return
     */
    public  boolean equals(Object obj) ;

    /**
     * default 关键字
     * @return
     */
    default String defaultGetUser(){
      return "default-UserInfo";
    };

    /**
     * static 关键字
     */
    static void staticGetUser(){
        System.out.println("staticGetUser");
    };
}
