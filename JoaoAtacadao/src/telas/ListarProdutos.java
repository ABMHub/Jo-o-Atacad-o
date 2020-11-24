/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import joaoatacadao.BancoDeDados;
import joaoatacadao.JoaoAtacadao;

/**
 *
 * @author lucas
 */
public class ListarProdutos extends javax.swing.JFrame {

    private int pagina = 0;
    private String arquivo = new String("dados/celulares.txt");
    
    public ListarProdutos() {
        initComponents();
        carregaDepartamentos();
        
        try {
            BancoDeDados.criaArquivos();
        } catch (IOException ex) {
            Logger.getLogger(ListarProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void carregaDepartamentos () {
        cmbDepartamentos.removeAllItems();
        
        cmbDepartamentos.addItem("Selecione um Departamento");
        cmbDepartamentos.addItem("Livros");
        cmbDepartamentos.addItem("Filmes");
        cmbDepartamentos.addItem("Periféricos");
        cmbDepartamentos.addItem("Celulares");
        cmbDepartamentos.addItem("Computadores");
        cmbDepartamentos.addItem("Eletroeletrônicos");
        cmbDepartamentos.addItem("Vestuário");
        
    }
    
    public void updateArquivo () {
        if (cmbDepartamentos.getSelectedIndex() == 0) return;
        arquivo = "dados/" +  Normalizer.normalize(((String) cmbDepartamentos.getSelectedItem())
                .toLowerCase(), Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "") + ".txt";
    }
    
    private void criaTabela(ArrayList<String[]> produtos) {
        DefaultTableModel modelo = new DefaultTableModel( new Object[] { "Código", "Nome", "Marca", "Preço" } , 0);
        
        for (int i = 0; i < produtos.size(); i++ ){
            Object linha[] = new Object[] {
                produtos.get(i)[0],
                produtos.get(i)[1],
                produtos.get(i)[2],
                produtos.get(i)[3]
            };
            
            modelo.addRow(linha);
        }
        tblProdutos.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPesquisar = new javax.swing.JTextField();
        lblPesquisar = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnPesquisarTodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnEsquerda = new javax.swing.JButton();
        btnDireita = new javax.swing.JButton();
        lblPesquisaDeProdutos = new javax.swing.JLabel();
        cmbDepartamentos = new javax.swing.JComboBox<>();
        lblDepartamento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtPesquisar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        lblPesquisar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPesquisar.setText("Código");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnPesquisarTodos.setText("Listar Todos");
        btnPesquisarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarTodosActionPerformed(evt);
            }
        });

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Preço", "Marca"
            }
        ));
        jScrollPane1.setViewportView(tblProdutos);

        btnEsquerda.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEsquerda.setText("🡄");
        btnEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsquerdaActionPerformed(evt);
            }
        });

        btnDireita.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDireita.setText("🡆");
        btnDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDireitaActionPerformed(evt);
            }
        });

        lblPesquisaDeProdutos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblPesquisaDeProdutos.setText("Pesquisa de Produtos");

        cmbDepartamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblDepartamento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDepartamento.setText("Departamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDepartamento)
                            .addComponent(btnPesquisarTodos))
                        .addGap(162, 162, 162))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(btnEsquerda)
                                .addGap(18, 18, 18)
                                .addComponent(btnDireita))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(lblPesquisaDeProdutos)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblPesquisaDeProdutos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(lblDepartamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnPesquisarTodos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDireita)
                    .addComponent(btnEsquerda))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btnPesquisarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarTodosActionPerformed
        updateArquivo();
        ArrayList lista = new ArrayList();
        pagina = 0;
        try {
            lista = BancoDeDados.leitura(arquivo, pagina);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListarProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (lista != null)
            criaTabela(lista);
    }//GEN-LAST:event_btnPesquisarTodosActionPerformed

    private void btnDireitaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        ArrayList lista = null;
        pagina += 1;
        try {
            lista = BancoDeDados.leitura(arquivo, pagina);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListarProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (lista != null)
            criaTabela(lista);
        else
            pagina -= 1;
    }                                        

    private void btnEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        ArrayList lista = null;
        if (pagina <= 0)
            return;
        pagina -= 1;
        try {
            lista = BancoDeDados.leitura(arquivo, pagina);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListarProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (lista != null)
            criaTabela(lista);
        else
            pagina += 1;
    }                                        

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        updateArquivo();
        String codigo = txtPesquisar.getText();
        String[] lista = null;
        try {
            lista = BancoDeDados.pesquisa(arquivo, codigo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListarProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ArrayList arraylist = new ArrayList();
        arraylist.add(lista);
        if (lista != null)
            criaTabela(arraylist);
            
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDireita;
    private javax.swing.JButton btnEsquerda;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarTodos;
    private javax.swing.JComboBox<String> cmbDepartamentos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblPesquisaDeProdutos;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
