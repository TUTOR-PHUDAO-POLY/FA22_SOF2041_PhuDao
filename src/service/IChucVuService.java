/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domainmodel.ChucVu;
import java.util.ArrayList;
import viewmodel.ChucVuViewModel;

/**
 *
 * @author Phong
 * @description Xử lý logic, usecase của bài toán
 */
public interface IChucVuService {
    
    // USECASE Thêm chức vụ mới
    void themMoiChucVu(ChucVu chucVuMoi);
    
    // USECASE Lấy danh sách chức vụ
    ArrayList<ChucVuViewModel> layDanhSachChucVu();
}
