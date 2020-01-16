/**
 * @Description
 * @Author wzh
 * @Date 2019/12/24 11:22
 * @Version 2.10
 **/
public class SmsService {
    public SmsService() {
        System.out.println("构造函数");
    }
    static void staticMethodSendMsg(){
        System.out.println("静态方法");
    };

    void sendMsg(){
        System.out.println("msg:");
    };

}

