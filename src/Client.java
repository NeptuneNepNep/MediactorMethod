public class Client {
    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();
        //创建租房对象
        Tenant tenant = new Tenant("李四",mediator);
        //创建房主对象
        HouseOwner houseOwner = new HouseOwner("张三",mediator);

        //中介者要知道具体的房主和租房者
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);

        tenant.constant("我操你妈！");
        houseOwner.constant("你就是个几把");
    }
}
