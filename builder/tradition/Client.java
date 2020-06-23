package builder.tradition;
/**
 * 無設計緩存層，在擴展或是維護效果不好。
 * 產品(普通房子)和建造過程(build 方法)封裝在一起，耦合性提高。
 */
public class Client {
    public static void main(String[] args) {
        CommonHourse commonHourse = new CommonHourse();
        commonHourse.build();    
    }
}