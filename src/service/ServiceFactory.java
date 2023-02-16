/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import service.impl.ChucVuService;
import service.impl.ChucVuTestService;

/**
 *
 * @author Phong
 */
public class ServiceFactory {
    
    public static IChucVuService getChucVuService() {
        return new ChucVuService();
    }
}
