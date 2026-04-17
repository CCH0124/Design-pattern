package design.proxy.virtual;

import design.proxy.Service;

public class RealHeavyService implements Service {
    public RealHeavyService() {
        System.out.println("系統：正在執行沉重的初始化（例如：建立資料庫連線、載入 1GB 索引...）");
        try { Thread.sleep(2000); } catch (InterruptedException e) {} // 模擬耗時操作
    }

    @Override
    public void request() {
        System.out.println("系統：真實重型服務正在處理請求。");
    }
}
