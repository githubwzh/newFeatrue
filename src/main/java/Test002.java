import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Description
 * @Author wzh
 * @Date 2019/12/24 11:07
 * @Version 2.10
 **/
public class Test002 {
    public static void main(String[] args) {
        /**
         * 代替传统复杂循环
         */
        List<String> list=new ArrayList<>();
        list.add("xiaoming");
        list.add("zhangsan");
        list.add("zhaoliu");
        for (String name:list){
            System.out.println("name:"+name);
        }
        /**
         * foreach             System.out.println("foreach-name:"+name);
         */
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("foreach---Sting:"+s);
            }
        });
        list.forEach((name)->{
            System.out.println("foreach-lambda--Sting:"+name);
        });



    }
}
