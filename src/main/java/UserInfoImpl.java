/**
 * @Description
 * @Author wzh
 * @Date 2019/12/24 9:26
 * @Version 2.10
 **/
public class UserInfoImpl implements UserInfo {
    /**
     * 抽象方法
     */
    @Override
    public void addUser() {

    }

    @Override
    public String defaultGetUser() {
        return "child:defaultGetUser";
    }

}
