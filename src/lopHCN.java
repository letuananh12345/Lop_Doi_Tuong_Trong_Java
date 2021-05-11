//Biết cách khai báo lớp (thuộc tính, phương thức)
//
//        - Biết cách khởi tạo đối tượng
//
//        - Biết cách sử dụng các phương thức của đối tượng
//thuộc tính : width,height
//phương thức khởi tạo : 0 tham số và 2 tham số,
//phương thức : getArea(): tính diện tích, getPerimeter() : chu vi; display() : hien thi

public class lopHCN {
    double width; // kdl + tên thuộc tính
    double height;// kdl + tên thuộc tính

    public lopHCN() {// khởi tạo đối tượng contructor 0 tham số
    }

    public lopHCN(double width, double height) { // contructer có tham số
        this.width = width;
        this.height = height;
    }


    // định nghĩa các phương thức :
    public double getArea() {
        return height * width;
    }

    public double getPerimetter() {
        return 2 * (height + width);
    }

    public static void main(String[] args) {
        lopHCN rect1 = new lopHCN(40, 60);
        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimetter());
    }

}
