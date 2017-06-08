/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pack.control.c_koneksi;
import pack.model.m_hitung;

/**
 *
 * @author Enggar R S
 */
public class daoHitung implements implementHitung{
    Connection connection;
    public String TampilData = "SELECT * FROM `tb_hitung_gaji`";
    public String UbahData = "UPDATE `tb_hitung_gaji` SET `bulan_gaji`=?, `nip`=?, `nama_pegawai`=?, `tgl_lahir`=? , `status`=?, 'jumlah_anak'=?, 'gaji_pokok'=?, 'jabatan_struktural'=?, 'keluarga'=?, 'anak'=?, 'total_gaji'=?"
            + " Where `nip`=?;";
    public String SimpanData = "INSERT INTO `tb_hitung_gaji` VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public String HapusData = "DELETE FROM `tb_hitung_gaji` WHERE nip=?";
   

    public daoHitung() {
        connection = c_koneksi.setKoneksi();
    }

    

    @Override
    public void UbahData(m_hitung a) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(UbahData);
            statement.setString(11, a.getnip());
            statement.setString(1, a.getbulan());
            statement.setString(2, a.getnama());
            statement.setString(3, a.gettgl_lhr());
            statement.setString(4, a.getstatus());
            statement.setString(5, a.getjml_anak());
            statement.setString(6, a.getpokok());
            statement.setString(7, a.getstruktural());
            statement.setString(8, a.getkeluarga());
            statement.setString(9, a.getanak());
            statement.setString(10, a.gettotal());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(daoHitung.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void SimpanData(m_hitung a) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SimpanData);
            statement.setString(1, a.getnip());
            statement.setString(2, a.getbulan());
            
            statement.setString(3, a.getnama());
            statement.setString(4, a.gettgl_lhr());
            statement.setString(5, a.getstatus());
            statement.setString(6, a.getjml_anak());
            statement.setString(7, a.getpokok());
            statement.setString(8, a.getstruktural());
            statement.setString(9, a.getkeluarga());
            statement.setString(10, a.getanak());
            statement.setString(11, a.gettotal());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                a.setnip(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(daoHitung.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    
    //menampilkan data ke Tabel     
    @Override
    public List<m_hitung> getAll() {
        List<m_hitung> lt = null;
        try {
            lt = new ArrayList<m_hitung>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(TampilData);
            while (rs.next()) {
                m_hitung hitung = new m_hitung();
                hitung.setnip(rs.getString("nip"));
                hitung.setnama(rs.getString("nama_pegawai"));
                hitung.setbulan(rs.getString("bulan_gaji"));
                hitung.settgl_lhr(rs.getString("tgl_lahir"));
                hitung.setstatus(rs.getString("status"));
                hitung.setjml_anak(rs.getString("jumlah_anak"));
                hitung.setpokok(rs.getString("gaji_pokok"));
                hitung.setstruktural(rs.getString("jabatan_struktural"));
                hitung.setkeluarga(rs.getString("keluarga"));
                hitung.setanak(rs.getString("anak"));
                hitung.settotal(rs.getString("total"));
                lt.add(hitung);
            }
        } catch (SQLException ex) {
            Logger.getLogger(daoHitung.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lt;
    }    
    //hapus data     
    @Override    
    public void HapusData(String nip) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(HapusData);
            statement.setString(1, nip);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(daoHitung.class
                    .getName()
            ).log(Level.SEVERE, null, ex);
        }
    }     
    //pencarian data     
 
    
}
