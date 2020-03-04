package principle.ocp;
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle(){
        super.m_type = 1;
    }
}
class Circle extends Shape {
    Circle(){
        super.m_type = 2;
    }
}
class Triangle extends Shape {
    Triangle(){
        super.m_type = 3;
    }
}

class GraphicEditor{
    public void drawShape(Shape s){
        if(s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2){
            drawCircle(s);
        } else if (s.m_type == 3) {
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("drawRectangle");
    }
    public void drawCircle(Shape r) {
        System.out.println("drawCircle");
    }
    public void drawTriangle(Shape r) {
        System.out.println("drawTriangle");
    }
}
public class Ocp{
    /**
     * 新增 Triangle 時要對 GraphicEditor 進行修改，新增 drawTriangle 和修改 drawShape
     * 當新增圖形時要修改的事情很多
     * @param args
     */
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}