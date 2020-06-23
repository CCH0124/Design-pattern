package builder.improve;

public class HourseDirector {
    HourseBuilder hourseBuilder = null;

    /**
     * @param hourseBuilder
     * method 1
     */
    public HourseDirector(HourseBuilder hourseBuilder) {
        this.hourseBuilder = hourseBuilder;
    }

    /**
     * @param hourseBuilder the hourseBuilder to set
     * method 2，可用來重置
     */
    public void setHourseBuilder(HourseBuilder hourseBuilder) {
        this.hourseBuilder = hourseBuilder;
    }

    // 建構流程交給指揮者
    public Hourse constructHourse(){
        hourseBuilder.buildBasic();
        hourseBuilder.buildWalls();
        hourseBuilder.roofed();

        return hourseBuilder.buildHourse();
    }
    
    
}