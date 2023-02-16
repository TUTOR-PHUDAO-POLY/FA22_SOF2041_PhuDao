/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domainmodel;

/**
 *
 * @author Phong
 * @description Class ánh xạ 1-1 với bảng Chức vụ trong CSDL
 */
public class ChucVu {
    
    //Id - uniqueidentifier -> String
    private String id;
    //Ma - varchar(20) -> String
    private String ma;
    //Ten - nvarchar(50) -> String
    private String ten;

    public ChucVu() {
    }

    public ChucVu(String id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    
}
