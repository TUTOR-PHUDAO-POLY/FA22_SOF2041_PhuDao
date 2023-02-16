/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import domainmodel.ChucVu;
import java.util.ArrayList;
import repository.impl.ChucVuRAMRepository;
import repository.impl.ChucVuSQLRepository;
import viewmodel.ChucVuViewModel;
import repository.IChucVuRepository;
import service.IChucVuService;

/**
 *
 * @author Phong
 * @description Xử lý logic, usecase của bài toán
 */
public class ChucVuService implements IChucVuService {
    
    // Khai báo đối tượng phụ trách quản lý dữ liệu Chức vụ
    private IChucVuRepository repository = new ChucVuSQLRepository();
    
    // Hàm này dùng để thêm một chức vụ mới
    public void themMoiChucVu(ChucVu chucVuMoi) {
        // Gọi repository để thêm mới vào CSDL
//        repository.create(chucVuMoi);
    }
    
    // Hàm này dùng để lấy danh sách các chức vụ
    public ArrayList<ChucVuViewModel> layDanhSachChucVu() {
        ArrayList<ChucVuViewModel> dsChucVuViewModel = new ArrayList();
        
        // Gọi repository để lấy một danh sách Chức vụ
        ArrayList<ChucVu> dsChucVu = repository.read();
        
        // Duyệt ds chức vụ để thêm dữ liệu vào ds chức vụ view model
        for(ChucVu chucVu : dsChucVu) {
            // Tạo view model
            ChucVuViewModel chucVuViewModel = new ChucVuViewModel();
            chucVuViewModel.setId(chucVu.getId().toUpperCase());
            
            String maTen = chucVu.getTen() + " - " + chucVu.getMa();
            chucVuViewModel.setMaTen(maTen);
            
            // Thêm vào ds
            dsChucVuViewModel.add(chucVuViewModel);
        }
        
        // Trả về danh sách chức vụ
        return dsChucVuViewModel;
    }
}
