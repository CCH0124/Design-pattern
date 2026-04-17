package design.builder;

import design.builder.improve.CommonHourse;
import design.builder.improve.HighBuilding;
import design.builder.improve.Hourse;
import design.builder.improve.HourseDirector;
import org.junit.jupiter.api.Test;

public class ClientTest {
    @Test
    void improveTest() {
        CommonHourse commonHourse = new CommonHourse();
        HourseDirector hourseDirector = new HourseDirector(commonHourse);
        Hourse hourse = hourseDirector.constructHourse();

        System.out.println("---------------------------------------------------");

        HighBuilding highBuilding = new HighBuilding();
        hourseDirector.setHourseBuilder(highBuilding);
        hourseDirector.constructHourse();
    }
}
