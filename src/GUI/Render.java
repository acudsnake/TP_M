package GUI;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;



public class Render extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if(value instanceof JCheckBox){
          JCheckBox jCheckBox=(JCheckBox) value;
          return jCheckBox;
        }
        return super.getTableCellRendererComponent(jtable, value, isSelected, hasFocus, row, column);
    }
    
}
