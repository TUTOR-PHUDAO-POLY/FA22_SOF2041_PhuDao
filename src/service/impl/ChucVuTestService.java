/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import domainmodel.ChucVu;
import java.util.ArrayList;
import java.util.UUID;
import service.IChucVuService;
import viewmodel.ChucVuViewModel;

/**
 *
 * @author Phong
 */
public class ChucVuTestService implements IChucVuService {

    @Override
    public void themMoiChucVu(ChucVu chucVuMoi) {
        System.out.println("Chưa làm gì cả");
    }

    @Override
    public ArrayList<ChucVuViewModel> layDanhSachChucVu() {
        ArrayList<ChucVuViewModel> dsChucVu = new ArrayList();
        dsChucVu.add(new ChucVuViewModel(UUID.randomUUID().toString(), 
                "CV001 @@ Chủ nhiệm Bộ môn"));
        dsChucVu.add(new ChucVuViewModel(UUID.randomUUID().toString(), 
                "CV002 @@ Trưởng môn"));
        dsChucVu.add(new ChucVuViewModel(UUID.randomUUID().toString(), 
                "CV003 @@ Giảng viên"));
        return dsChucVu;
    }
    
}
