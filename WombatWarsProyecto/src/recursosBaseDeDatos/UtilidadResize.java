package recursosBaseDeDatos;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class UtilidadResize {
    
    public static void resizeColumnWidth(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width +1 , width);
                width = Math.max(width, table.getColumnModel().getColumn(column).getPreferredWidth());

            }
            if(width > 700)
                width=700;
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
}
