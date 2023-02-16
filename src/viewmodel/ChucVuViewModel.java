/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewmodel;

/**
 *
 * @author Phong
 * @description Class này chứa dữ liệu cho Giao diện Chức vụ
 */
public class ChucVuViewModel {
    
    private String id;
    private String maTen;

    public ChucVuViewModel() {
    }

    public ChucVuViewModel(String id, String maTen) {
        this.id = id;
        this.maTen = maTen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaTen() {
        return maTen;
    }

    public void setMaTen(String maTen) {
        this.maTen = maTen;
    }
    
}
