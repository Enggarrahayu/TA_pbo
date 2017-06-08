/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.control;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import pack.dao.daoHitung;
import pack.dao.implementHitung;
import pack.model.m_hitung;
import pack.view.Hitung_Gaji;
import pack.model.tablemodelhitung;

/**
 *
 * @author Enggar R S
 */
public class controllerHitung {
      Hitung_Gaji hg;
    implementHitung impHitung;
    List<m_hitung> lt;

    public controllerHitung(Hitung_Gaji hg) {
        this.hg = hg;
        impHitung = new daoHitung();
        lt = impHitung.getAll();
    }

    //mengkosongkan isian field     
    public void Reset() {
        hg.getTxtNama().setText("");
        hg.getTxtStatus().setText("");
        hg.getTxtNip().setText("");
        hg.getCbBulan().setSelectedItem(null);
        hg.getTxtAnak().setText("");
        hg.getTxtJml_anak().setText("");
        hg.getTxtKeluarga().setText("");
        hg.getTxtPokok().setText("");
        hg.getTxtStruktural().setText("");
        hg.getTxtTgl().setText("");
        hg.getTxtTotal().setText("");
    }      
    //menghapus data yang dipilih     
    public void Hapus() {
        if (hg.getTxtNip().getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(hg, "");
        } else {
            String kode = (hg.getTxtNip().getText());
            impHitung.HapusData(kode);
            JOptionPane.showMessageDialog(hg, "Data berhasil dihapus");
        }
    }     
    //menyimpan data     
    public void SimpanData() {
        m_hitung hitung = new m_hitung();
        hitung.setnip(hg.getTxtNip().getText());
        hitung.setnama(hg.getTxtNama().getText());
        hitung.settgl_lhr(hg.getTxtTgl().getText());
        hitung.setbulan(hg.getCbBulan().getSelectedItem().toString());
        hitung.setstatus(hg.getTxtStatus().getText());
        hitung.setjml_anak(hg.getTxtJml_anak().getText());
        hitung.setpokok(hg.getTxtPokok().getText());
        hitung.setstruktural(hg.getTxtStruktural().getText());
        hitung.setkeluarga(hg.getTxtKeluarga().getText());
        hitung.setanak(hg.getTxtAnak().getText());
        impHitung.SimpanData(hitung);
    }     
    //mengubah data     
    public void Ubah() {
        m_hitung hitung = new m_hitung();
        hitung.setnip(hg.getTxtNip().getText());
        hitung.setnama(hg.getTxtNama().getText());
        hitung.settgl_lhr(hg.getTxtTgl().getText());
        hitung.setbulan(hg.getCbBulan().getSelectedItem().toString());
        hitung.setstatus(hg.getTxtStatus().getText());
        hitung.setjml_anak(hg.getTxtJml_anak().getText());
        hitung.setpokok(hg.getTxtPokok().getText());
        hitung.setstruktural(hg.getTxtStruktural().getText());
        hitung.setkeluarga(hg.getTxtKeluarga().getText());
        hitung.setanak(hg.getTxtAnak() .getText());
        impHitung.UbahData(hitung);
    }
    public void isiTable() {
        lt = impHitung.getAll();
        tablemodelhitung tmt = new tablemodelhitung(lt);
        hg.getTableData().setModel(tmt);
    }

    public void isiField(int row) {
        hg.getTxtNip().setText(lt.get(row).getnip().toString());
        hg.getTxtNama().setText(lt.get(row).getnama().toString());
        hg.getCbBulan().setSelectedItem(lt.get(row).getbulan().toString());
        hg.getTxtTgl().setText(lt.get(row).gettgl_lhr().toString());
        hg.getTxtStatus().setText(lt.get(row).getstatus().toString());
        hg.getTxtJml_anak().setText(lt.get(row).getjml_anak().toString());
        hg.getTxtPokok().setText(lt.get(row).getpokok().toString());
        hg.getTxtStruktural().setText(lt.get(row).getstruktural().toString());
        hg.getTxtKeluarga().setText(lt.get(row).getkeluarga().toString());
        hg.getTxtTotal().setText(lt.get(row).gettotal().toString());
    }   

    
    
}
