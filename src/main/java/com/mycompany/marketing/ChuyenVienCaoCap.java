/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.marketing;

/**
 *
 * @author allec
 */
public final class ChuyenVienCaoCap extends ChuyenVienMarketing{
    public static int count = 0; //đếm số lượng đối tượng được tạo
    
    @Override
    public String work(){
        return "Thông báo phối hợp đội ngũ quản lý";
    }
}
