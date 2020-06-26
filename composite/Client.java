package composite;

public class Client {
    public static void main(String[] args) {
        OrganizationComponent university =  new University("清大", "新竹");

        OrganizationComponent computerCollege = new College("圖資學院", "CSIE");
        OrganizationComponent managementCollege = new College("管理學院", "COM");

        computerCollege.add(new Department("軟體工程", "soft"));
        computerCollege.add(new Department("網路工程", "network"));

        managementCollege.add(new Department("休閒", "funny"));
        managementCollege.add(new Department("金融", "金融"));

        university.add(computerCollege);
        university.add(managementCollege);

        university.print();
    }
}