package principle.invervion.improve;
/**
 * 依賴關係傳遞三種方式
 * 接口傳遞
 * 建構方法傳遞
 * setter 傳遞
 */
/**
 * 接口傳遞
 */
interface IOpenAndClose {
    public void open(ITV tv);
}

interface ITV {
    public void play();
}
class Taiwan implements ITV {

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Open TV");
    }
    
}
class OpenAndClose implements IOpenAndClose {

    @Override
    public void open(ITV tv) {
        // TODO Auto-generated method stub
        tv.play();
    }
    
}
/**
 * 建構方法傳遞
 */
interface IOpenAndCloseMethod2 {
    public void open();
}

interface ITVMethod2 {
    public void play();
}
class Taiwan2 implements ITVMethod2 {

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Open TV Taiwan2");
    }
    
}
class OpenAndCloseMethod2 implements IOpenAndCloseMethod2 {
    public ITVMethod2 tv;
    public OpenAndCloseMethod2(ITVMethod2 tv) {
        this.tv = tv;
    }
	@Override
	public void open() {
        // TODO Auto-generated method stub
        this.tv.play();
		
	}
    
}

/**
 * setter 傳遞
 */
interface IOpenAndCloseMethod3 {
    public void open();
    public void setTv(ITVMethod3 tv);
}

interface ITVMethod3 {
    public void play();
}

class Taiwan3 implements ITVMethod3 {

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Open TV Taiwan3");
    }
    
}
class OpenAndCloseMethod3 implements IOpenAndCloseMethod3 {
    private ITVMethod3 tv;
    @Override
    public void setTv(ITVMethod3 tv) {
        this.tv = tv;
    }
	@Override
	public void open() {
        // TODO Auto-generated method stub
        this.tv.play();
		
	}
    
}

 public class DependecyInversionType {
    public static void main(String[] args) {
        new OpenAndClose().open(new Taiwan());
        new OpenAndCloseMethod2(new Taiwan2()).open();
        OpenAndCloseMethod3 o3 = new OpenAndCloseMethod3();
        o3.setTv(new Taiwan3());
        o3.open();
    }
}