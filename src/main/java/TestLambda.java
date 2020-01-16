/**
 * @Description
 * @Author wzh
 * @Date 2019/12/24 10:22
 * @Version 2.10
 **/
public class TestLambda {
    public static void main(String[] args) {
        /**
         * lambda 方式代替匿名内部类
         */
        FunctionalUserInfo userInfo=(username,password) ->{
            System.out.println("Lambda表达式方法：username:"+username+"密码："+password);
            return "ceshi";
        };
        String ret =  userInfo.printUserInfo("用户名","密码");
        System.out.println("ret:"+ret);
        /**
         * lambda简洁的写法
         */
        FunctionalUserInfo userInfo1=(username,password)->"lambda-directly-return-test";
        String lambdaRet = userInfo1.printUserInfo("", "");
        System.out.println(lambdaRet);

    }

}
