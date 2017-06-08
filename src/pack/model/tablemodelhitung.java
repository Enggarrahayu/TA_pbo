/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Enggar R S
 */
public class tablemodelhitung extends AbstractTableModel{
    List<m_hitung>lh;
    
   public tablemodelhitung(List<m_hitung> lh){
       this.lh=lh;
   }

    @Override
    public int getRowCount() {
        return lh.size();
    }

    @Override
    public int getColumnCount() {
        return 11;
    }
    
    public String getColumnName(int column) {
     switch (column){   
            case 0:      
                return"bulan_gaji";   
            case 1:     
                return"nip";    
            case 2:       
                return"nama_pegawai";     
            case 3:        
                return"tgl_lahir";    
            case 4:          
                return"status";   
            case 5:          
                return"jumlah_anak"; 
            case 6:          
                return"gaji_pokok"; 
            case 7:          
                return"jabatan_struktural"; 
            case 8:          
                return"keluarga"; 
             case 9:          
                return"anak"; 
             case 10:          
                return"total_gaji"; 
            default:      
                return null; 
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
