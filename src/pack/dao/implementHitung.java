/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.dao;

import java.util.List;
import pack.model.m_hitung;

/**
 *
 * @author Enggar R S
 */
public interface implementHitung {

    public List<m_hitung> getAll();

    public void HapusData(String kode);

    public void UbahData(m_hitung hitung);

    public void SimpanData(m_hitung hitung);
    
}
