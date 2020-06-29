package flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite webSite = webSiteFactory.getWebSiteCactegory("新聞");
        webSite.use(new User("Itachi"));

        WebSite webSite2 = webSiteFactory.getWebSiteCactegory("Blog");
        webSite2.use(new User("Naruto"));

        WebSite webSite3 = webSiteFactory.getWebSiteCactegory("Blog");
        webSite3.use(new User("Madara"));

        WebSite webSite4 = webSiteFactory.getWebSiteCactegory("Blog");
        webSite4.use(new User("Jack"));

        System.out.println("網站分類共 " + webSiteFactory.getWebSiteSize() + " 個");

    }
}