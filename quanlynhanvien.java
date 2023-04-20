/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt1;

import java.io.Serializable;

/**
 *
 * @author ACER
 */
public class Customer implements Serializable{
    private String name;
    private double DoanhSo;

    public Customer(String name, double DoanhSo) {
        this.name = name;
        this.DoanhSo = DoanhSo;
    }

    
    
    public void setDoanhSo(double DoanhSo) {
        this.DoanhSo = DoanhSo;
    }
    //tạo ra đối tượng mới với các thuộc tính đc nhập từ người dùng
    public static Customer input(){
        //nhập từ bàn phím
        //sử dụng phương thức getString và getDouble từ lớp Common để nhận dữ liệu từ người dùng
        String name = Common.getStrings("Nhập tên: ");
        double DoanhSo=Common.getDouble("Nhập doanh số: ");
        return new Customer(name,DoanhSo);
    } 
    //phương thức toString được ghi đè Override
    //trả về 1 chuỗi mô tả cho đối tượng Customer
    @Override
    public String toString() {
        //sử dụng String.format để định dạng và in ra chuỗi mô tả của đối tượng 
        //trong đó tên của đối tượng đc định dạng với khoảng trắng 20 ký tự
        return String.format("%20s %20s", this.name,this.DoanhSo);
    }
}
