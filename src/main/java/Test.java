/**
 * @Description
 * @Author wzh
 * @Date 2019/12/24 9:39
 * @Version 2.10
 **/
public class Test {
    public static void main(String[] args) {
       UserInfo userInfo = new UserInfo() {
           /**
            * default 关键字
            *
            * @return
            */
           @Override
           public String defaultGetUser() {
               return "匿名内部类：defaultGetUser";
           }

           /**
            * 抽象方法
            */
           @Override
           public void addUser() {

           }

           /**
            * FunctionalInterface注解下可以允许该方法
            * Object类里的equals方法
            *
            * @param obj
            * @return
            */
           @Override
           public boolean equals(Object obj) {
               return false;
           }
       };
        String ret = userInfo.defaultGetUser();
        System.out.println("return:"+ret);

    }
}
