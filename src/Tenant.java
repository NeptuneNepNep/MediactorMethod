public class Tenant extends Person{
    public Tenant(String name, Meditaor meditaor) {
        super(name, meditaor);
    }
    //和中介联系
    public void constant(String message) {
        meditaor.constant(message,this);

    }
    //获取信息方法
    public void getMessage(String message) {
        System.out.println("租房者"+name+"获取到的信息是:"+message);
    }
}
