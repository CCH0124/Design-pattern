package design.proxy.remote;

import design.proxy.Service;

public class RemoteServiceProxy implements Service {
    private String serverAddress;

    public RemoteServiceProxy(String address) {
        this.serverAddress = address;
    }

    @Override
    public void request() {
        System.out.println("代理：正在打包請求數據 (Serialization)...");
        System.out.println("代理：透過網路傳輸請求至伺服器 [" + serverAddress + "]");

        // 模擬伺服器端處理
        simulateRemoteExecution();

        System.out.println("代理：收到伺服器回應，正在解析結果。");
    }

    private void simulateRemoteExecution() {
        System.out.println("  [伺服器端] 收到封包，執行邏輯中...");
    }
}
