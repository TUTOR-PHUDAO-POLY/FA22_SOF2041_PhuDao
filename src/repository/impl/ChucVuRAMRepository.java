/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.impl;

import domainmodel.ChucVu;
import java.util.ArrayList;
import java.util.UUID;
import repository.IChucVuRepository;

/**
 *
 * @author Phong
 * @description Thao tác với dữ liệu Chức vụ trong CSDL
 */
public class ChucVuRAMRepository implements IChucVuRepository  {
    
    // Lưu trữ tạm thay Database vì chưa làm file kết nối
    private final static ArrayList<ChucVu> DS_CHUC_VU = new ArrayList();
    static {
        DS_CHUC_VU.add(new ChucVu(UUID.randomUUID().toString(), 
                "CV001", "Chủ nhiệm Bộ môn"));
        DS_CHUC_VU.add(new ChucVu(UUID.randomUUID().toString(), 
                "CV002", "Trưởng môn"));
        DS_CHUC_VU.add(new ChucVu(UUID.randomUUID().toString(), 
                "CV003", "Giảng viên"));
    }
//    public ChucVuRepository() {
//        DS_CHUC_VU.add(new ChucVu(UUID.randomUUID().toString(), 
//                "CV001", "Chủ nhiệm Bộ môn"));
//        DS_CHUC_VU.add(new ChucVu(UUID.randomUUID().toString(), 
//                "CV002", "Trưởng môn"));
//        DS_CHUC_VU.add(new ChucVu(UUID.randomUUID().toString(), 
//                "CV003", "Giảng viên"));
//    }
    
    // Hàm này dùng để THÊM MỘT đối tượng Chức vụ mới
    // Nếu return TRUE -> thêm thành công
    //      FALSE -> thêm thất bại
    public Boolean create(ChucVu chucVu) {
        // Thêm vào CSDL đối tượng chức vụ mới
        DS_CHUC_VU.add(chucVu);
        
        // Trả về kết quả là đã thêm thành công
        return true;
    }
    
    // Hàm này dùng để LẤY DANH SÁCH Chức vụ trong CSDL
    public ArrayList<ChucVu> read() {
        return DS_CHUC_VU;
    }
}
