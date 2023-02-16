/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.impl;

import domainmodel.ChucVu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.IChucVuRepository;
import utilities.DBContext;

/**
 *
 * @author Phong
 */
public class ChucVuSQLRepository implements IChucVuRepository {

    // Hàm này dùng để LẤY DANH SÁCH Chức vụ trong CSDL
    public ArrayList<ChucVu> read() {
        ArrayList<ChucVu> dsChucVu = new ArrayList();

        try {
            // B1. Nhờ anh DBContext tạo kết nối đến CSDL
            //  Tương đương với việc ấn nút New Query
            Connection connection = DBContext.getConnection();

            // B2. Viết câu truy vấn
            String query = "SELECT Id, Ten, Ma FROM ChucVu";
            PreparedStatement ps = connection.prepareStatement(query);

            // B3. Truy vấn và hứng kết quả
            //  Tương đương với việc ấn nút Execute
            ResultSet rs = ps.executeQuery();
            // Đi từng dòng cho đến khi không còn bản ghi nào phía trước
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");

                ChucVu chucVu = new ChucVu(id, ma, ten);
                dsChucVu.add(chucVu);
            }
            
            rs.close();
            ps.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println("Lỗi kết nối");
            Logger.getLogger(ChucVuSQLRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dsChucVu;
    }
}
