package pages;

import java.text.NumberFormat;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RiosHenao
 */
public class shopping_cart extends javax.swing.JFrame {

    /**
     * Creates new form shopping_cart
     */
    public shopping_cart() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        calcularButtom = new javax.swing.JLabel();
        facturaTxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        bebidaIn = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        empanadaIn = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        hotDogIn = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        salchipapaIn = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        hamburguerIn = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        iceCreamIn = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jSplitPane1.setDividerLocation(1);
        jSplitPane1.setDividerSize(50);
        jSplitPane1.setForeground(new java.awt.Color(255, 125, 18));
        jSplitPane1.setContinuousLayout(true);
        jSplitPane1.setOneTouchExpandable(true);

        jPanel2.setBackground(new java.awt.Color(255, 169, 0));
        jPanel2.setLayout(null);

        jPanel16.setBackground(new java.awt.Color(255, 169, 0));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FACTURA");
        jPanel16.add(jLabel9, java.awt.BorderLayout.PAGE_START);

        calcularButtom.setBackground(new java.awt.Color(255, 255, 255));
        calcularButtom.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        calcularButtom.setForeground(new java.awt.Color(255, 187, 0));
        calcularButtom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calcularButtom.setText("CALCULAR");
        calcularButtom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        calcularButtom.setOpaque(true);
        calcularButtom.setPreferredSize(new java.awt.Dimension(102, 200));
        calcularButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcularButtomMouseClicked(evt);
            }
        });
        jPanel16.add(calcularButtom, java.awt.BorderLayout.PAGE_END);

        facturaTxt.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        facturaTxt.setForeground(new java.awt.Color(255, 255, 255));
        facturaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        facturaTxt.setText(".");
        jPanel16.add(facturaTxt, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);
        jPanel16.setBounds(0, 0, 800, 790);

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(3, 3, 10, 10));

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(153, 153, 0));
        jPanel6.setMaximumSize(new java.awt.Dimension(200, 210));
        jPanel6.setMinimumSize(new java.awt.Dimension(200, 210));
        jPanel6.setPreferredSize(new java.awt.Dimension(200, 250));
        jPanel6.setLayout(new java.awt.BorderLayout());

        bebidaIn.setMaximumSize(new java.awt.Dimension(200, 25));
        bebidaIn.setMinimumSize(new java.awt.Dimension(200, 25));
        bebidaIn.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel6.add(bebidaIn, java.awt.BorderLayout.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/Bebida.jpg"))); // NOI18N
        jPanel6.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(153, 153, 0));
        jPanel7.setMaximumSize(new java.awt.Dimension(200, 210));
        jPanel7.setMinimumSize(new java.awt.Dimension(200, 210));
        jPanel7.setLayout(new java.awt.BorderLayout());

        empanadaIn.setMaximumSize(new java.awt.Dimension(200, 25));
        empanadaIn.setMinimumSize(new java.awt.Dimension(200, 25));
        empanadaIn.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel7.add(empanadaIn, java.awt.BorderLayout.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/Empanadas.jpg"))); // NOI18N
        jPanel7.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(153, 153, 0));
        jPanel9.setMaximumSize(new java.awt.Dimension(200, 210));
        jPanel9.setMinimumSize(new java.awt.Dimension(200, 210));
        jPanel9.setLayout(new java.awt.BorderLayout());

        hotDogIn.setMaximumSize(new java.awt.Dimension(200, 25));
        hotDogIn.setMinimumSize(new java.awt.Dimension(200, 25));
        hotDogIn.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel9.add(hotDogIn, java.awt.BorderLayout.CENTER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/HotDog.jpg"))); // NOI18N
        jPanel9.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jPanel8.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel8);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(153, 153, 0));
        jPanel11.setMaximumSize(new java.awt.Dimension(200, 210));
        jPanel11.setMinimumSize(new java.awt.Dimension(200, 210));
        jPanel11.setLayout(new java.awt.BorderLayout());

        salchipapaIn.setMaximumSize(new java.awt.Dimension(200, 25));
        salchipapaIn.setMinimumSize(new java.awt.Dimension(200, 25));
        salchipapaIn.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel11.add(salchipapaIn, java.awt.BorderLayout.CENTER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/Salchipapa.jpg"))); // NOI18N
        jPanel11.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jPanel10.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel10);

        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(153, 153, 0));
        jPanel13.setMaximumSize(new java.awt.Dimension(200, 210));
        jPanel13.setMinimumSize(new java.awt.Dimension(200, 210));
        jPanel13.setLayout(new java.awt.BorderLayout());

        hamburguerIn.setMaximumSize(new java.awt.Dimension(200, 25));
        hamburguerIn.setMinimumSize(new java.awt.Dimension(200, 25));
        hamburguerIn.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel13.add(hamburguerIn, java.awt.BorderLayout.CENTER);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/hamburguesas.jpg"))); // NOI18N
        jPanel13.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jPanel12.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel12);

        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel15.setBackground(new java.awt.Color(153, 153, 0));
        jPanel15.setMaximumSize(new java.awt.Dimension(200, 210));
        jPanel15.setMinimumSize(new java.awt.Dimension(200, 210));
        jPanel15.setLayout(new java.awt.BorderLayout());

        iceCreamIn.setMaximumSize(new java.awt.Dimension(200, 25));
        iceCreamIn.setMinimumSize(new java.awt.Dimension(200, 25));
        iceCreamIn.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel15.add(iceCreamIn, java.awt.BorderLayout.CENTER);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/Helado.jpg"))); // NOI18N
        jPanel15.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        jPanel14.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel14);

        jScrollPane1.setViewportView(jPanel3);

        jSplitPane1.setRightComponent(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularButtomMouseClicked
        // TODO add your handling code here:
        String Factura = "";
        //
        int bebidaCan = (int)bebidaIn.getValue();
        int empanadaCan  = (int)empanadaIn.getValue();
        int hotDogCan = (int)hotDogIn.getValue();
        int salchipapaCan = (int)salchipapaIn.getValue();
        int hamburgerCan = (int)hamburguerIn.getValue();
        int iceCreamCan = (int)iceCreamIn.getValue();
        //
        long bebidaLong = bebidaCan*1000;
        long empanadaLong = empanadaCan*800;
        long hotDogLong = hotDogCan*3000;
        long salchipapaLong = salchipapaCan*2000;
        long hamburgerLong = hamburgerCan*5000;
        long iceCreamLong = iceCreamCan*1100;
        //
        Factura = "<html><body>"+
                +bebidaCan+"x"+" BEBIDA: $"+(FormatearDinero(bebidaLong))+"\n<br>"
                + empanadaCan+"x"+" EMPANADA: $"+(FormatearDinero(empanadaLong))+"\n<br>"
                + hotDogCan+"x"+" HOTDOG: $"+(FormatearDinero(hotDogLong))+"\n<br>"
                + salchipapaCan+"x"+" SALCHIPAPA: $"+(FormatearDinero(salchipapaLong))+"\n<br>"
                + hamburgerCan+"x"+" HAMBURGUESA: $"+(FormatearDinero(hamburgerLong))+"\n<br>"
                + iceCreamCan+"x"+" HELADO: $"+(FormatearDinero(iceCreamLong))+"\n<br>"
                + "TOTAL: $"+FormatearDinero((bebidaLong+empanadaLong+hotDogLong+salchipapaLong+hamburgerLong+iceCreamLong))+"\n<br>"
                +"</html></body>";
        //
        facturaTxt.setText(Factura);
    }//GEN-LAST:event_calcularButtomMouseClicked

    public static String FormatearDinero(long Dinero) {
        String NumeroFinalString = "";
        NumberFormat formatoNumero = NumberFormat.getNumberInstance(new Locale("es", "COL"));
        NumeroFinalString = (formatoNumero.format(Dinero).toString());
        return NumeroFinalString;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(shopping_cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shopping_cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shopping_cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shopping_cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shopping_cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner bebidaIn;
    private javax.swing.JLabel calcularButtom;
    private javax.swing.JSpinner empanadaIn;
    private javax.swing.JLabel facturaTxt;
    private javax.swing.JSpinner hamburguerIn;
    private javax.swing.JSpinner hotDogIn;
    private javax.swing.JSpinner iceCreamIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSpinner salchipapaIn;
    // End of variables declaration//GEN-END:variables
}
