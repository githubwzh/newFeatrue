/**
 * @Description
 * @Author wzh
 * @Date 2019/12/24 11:23
 * @Version 2.10
 **/
public class Test003 {
    public static void main(String[] args) {
        SmsService smsService = new SmsService();
        new Thread(smsService::sendMsg).start();
        new Thread(SmsService::new).start();
        new Thread(SmsService::staticMethodSendMsg).start();
    }
}
