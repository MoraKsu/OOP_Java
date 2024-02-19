package Seminar06HW.work1;

// Квадрат
public class Square extends Shape {

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }
}
