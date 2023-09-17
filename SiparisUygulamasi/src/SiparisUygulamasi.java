
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;

//checkBox
public class SiparisUygulamasi extends javax.swing.JFrame {
    Map<String,Integer> siparisler=new LinkedHashMap<String,Integer>();

    
    public SiparisUygulamasi() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iskenderAlani = new javax.swing.JCheckBox();
        beytiAlani = new javax.swing.JCheckBox();
        adanaAlani = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        cigerAlani = new javax.swing.JCheckBox();
        salataAlani = new javax.swing.JCheckBox();
        ayranAlani = new javax.swing.JCheckBox();
        siparisAlani = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sipariş Uygulaması");

        iskenderAlani.setText("İskender - 120 TL");

        beytiAlani.setText("Beyti - 100 TL");

        adanaAlani.setText("Adana - 85 TL");

        jLabel1.setText("MENU");

        cigerAlani.setText("Ciğer - 85 TL");

        salataAlani.setText("Salata - 40 TL");

        ayranAlani.setText("Ayran - 20 TL");

        siparisAlani.setText("Siparişleri Göster");
        siparisAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siparisAlaniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iskenderAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ayranAlani, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salataAlani, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cigerAlani, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adanaAlani, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addComponent(beytiAlani, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(siparisAlani, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(iskenderAlani)
                .addGap(18, 18, 18)
                .addComponent(beytiAlani)
                .addGap(18, 18, 18)
                .addComponent(adanaAlani)
                .addGap(18, 18, 18)
                .addComponent(cigerAlani)
                .addGap(18, 18, 18)
                .addComponent(salataAlani)
                .addGap(18, 18, 18)
                .addComponent(ayranAlani)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siparisAlani)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void siparisleriGoster(){
        String message="";
        int tutar=0;
        
        if (siparisler.isEmpty()) {
            message="Siparişiniz bulunmamaktadır ! ";
        }else{
            message+="Siparişler\n";
            for (Map.Entry<String, Integer> entry : siparisler.entrySet()) {
                message+=entry.getKey()+"\n";
                tutar+=entry.getValue();
            }
            message+="Toplam Tutar : "+tutar;
        }
        JOptionPane.showMessageDialog(this, message);
    }
    private void siparisAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siparisAlaniActionPerformed
        if (iskenderAlani.isSelected()) {
            siparisler.put("İskender", 120);
        }else{
            siparisler.remove("İskender");
        }
        if (beytiAlani.isSelected()) {
            siparisler.put("Beyti", 100);
        }else{
            siparisler.remove("Beyti");
        }
        if (adanaAlani.isSelected()) {
            siparisler.put("Adana", 85);
        }else{
            siparisler.remove("Adana");
        }
        if (cigerAlani.isSelected()) {
            siparisler.put("Ciğer", 85);
        }else{
            siparisler.remove("Ciğer");
        }
        if (salataAlani.isSelected()) {
            siparisler.put("Salata", 40);
        }else{
            siparisler.remove("Salata");
        }
        if (ayranAlani.isSelected()) {
            siparisler.put("Ayran", 20);
        }else{
            siparisler.remove("Ayran");
        }
        siparisleriGoster();
    }//GEN-LAST:event_siparisAlaniActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiparisUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox adanaAlani;
    private javax.swing.JCheckBox ayranAlani;
    private javax.swing.JCheckBox beytiAlani;
    private javax.swing.JCheckBox cigerAlani;
    private javax.swing.JCheckBox iskenderAlani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox salataAlani;
    private javax.swing.JButton siparisAlani;
    // End of variables declaration//GEN-END:variables
}
