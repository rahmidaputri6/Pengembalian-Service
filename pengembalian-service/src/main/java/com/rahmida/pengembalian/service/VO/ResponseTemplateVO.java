/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rahmida.pengembalian.service.VO;

import com.rahmida.pengembalian.service.entity.Pengembalian;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author asus
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {

  private Pengembalian pengembalian;
    private Peminjaman peminjaman;
}
