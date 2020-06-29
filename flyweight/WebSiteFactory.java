package flyweight;

import java.util.HashMap;

public class WebSiteFactory {
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();
    // 根據網站類型，返回一個網站，如果沒有就創建一個，並放入到池中且返回
    public WebSite getWebSiteCactegory(String type){
        if(!pool.containsKey(type)){
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite)pool.get(type);
    }

    public int getWebSiteSize(){
        return pool.size();
    }
}