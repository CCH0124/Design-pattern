package design.proxy.virtual;

import design.proxy.Service;
public class VirtualProxy implements Service {
    private RealHeavyService realService;

    @Override
    public void request() {
        // 只有在真正需要時才建立對象 (Lazy Initialization)
        if (realService == null) {
            System.out.println("代理：檢測到首次請求，開始實例化真實服務...");
            realService = new RealHeavyService();
        }
        System.out.println("代理：轉發請求給真實服務。");
        realService.request();
    }
}
