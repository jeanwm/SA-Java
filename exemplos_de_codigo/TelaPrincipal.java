package appfazenda;
import javax.swing.JOptionPane;

/*
 * Desenvolvedor: Jean Ernani Witt Meier
 * Objetivo: Tela principal do software.
*/

public class TelaPrincipal extends javax.swing.JFrame{

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal(){
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

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        menuUser = new javax.swing.JMenuItem();
        menuCultura = new javax.swing.JMenuItem();
        menuRoca = new javax.swing.JMenuItem();
        menuFuncionario = new javax.swing.JMenuItem();
        menuFerramenta = new javax.swing.JMenuItem();
        menuVeiculo = new javax.swing.JMenuItem();
        menuReboque = new javax.swing.JMenuItem();
        menuProduto = new javax.swing.JMenuItem();
        menuPedido = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuVerPedidos = new javax.swing.JMenuItem();
        menuVerEstoque = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        jMenuCadastro.setText("Cadastrar");

        menuUser.setText("Usu??rio");
        menuUser.setEnabled(false);
        menuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserActionPerformed(evt);
            }
        });
        jMenuCadastro.add(menuUser);

        menuCultura.setText("Cultura");
        menuCultura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCulturaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(menuCultura);

        menuRoca.setText("Ro??a");
        menuRoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRocaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(menuRoca);

        menuFuncionario.setText("Funcion??rio");
        menuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(menuFuncionario);

        menuFerramenta.setText("Ferramenta");
        menuFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFerramentaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(menuFerramenta);

        menuVeiculo.setText("Ve??culo");
        menuVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVeiculoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(menuVeiculo);

        menuReboque.setText("Reboque");
        menuReboque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReboqueActionPerformed(evt);
            }
        });
        jMenuCadastro.add(menuReboque);

        menuProduto.setText("Produto");
        menuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(menuProduto);

        menuPedido.setText("Pedido");
        menuPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPedidoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(menuPedido);

        menuCliente.setText("Cliente");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(menuCliente);

        jMenuBar1.add(jMenuCadastro);

        jMenu2.setText("Verificar");

        menuVerPedidos.setText("Ver Pedidos");
        menuVerPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerPedidosActionPerformed(evt);
            }
        });
        jMenu2.add(menuVerPedidos);

        menuVerEstoque.setText("Ver Estoque");
        menuVerEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerEstoqueActionPerformed(evt);
            }
        });
        jMenu2.add(menuVerEstoque);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Op????es");

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu3.add(menuSair);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //A partir daqui o c??digo abre todas as outras telas.
    private void menuCulturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCulturaActionPerformed
        TelaCultura telacultura = new TelaCultura();
        telacultura.setVisible(true);
        desktop.add(telacultura);
    }//GEN-LAST:event_menuCulturaActionPerformed

    private void menuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutoActionPerformed
        TelaProduto telaproduto = new TelaProduto();
        telaproduto.setVisible(true);
        desktop.add(telaproduto);
    }//GEN-LAST:event_menuProdutoActionPerformed

    private void menuVerPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerPedidosActionPerformed
        TelaVerPedidos telaverpedidos = new TelaVerPedidos();
        telaverpedidos.setVisible(true);
        desktop.add(telaverpedidos);
    }//GEN-LAST:event_menuVerPedidosActionPerformed

    private void menuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserActionPerformed
        TelaUsuario telausuario = new TelaUsuario();
        telausuario.setVisible(true);
        desktop.add(telausuario);
    }//GEN-LAST:event_menuUserActionPerformed

    private void menuRocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRocaActionPerformed
        TelaRoca telaroca = new TelaRoca();
        telaroca.setVisible(true);
        desktop.add(telaroca);
    }//GEN-LAST:event_menuRocaActionPerformed

    private void menuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionarioActionPerformed
        TelaFuncionario telafuncionario = new TelaFuncionario();
        telafuncionario.setVisible(true);
        desktop.add(telafuncionario);
    }//GEN-LAST:event_menuFuncionarioActionPerformed

    private void menuFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFerramentaActionPerformed
        TelaFerramenta telaferramenta = new TelaFerramenta();
        telaferramenta.setVisible(true);
        desktop.add(telaferramenta);
    }//GEN-LAST:event_menuFerramentaActionPerformed

    private void menuVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVeiculoActionPerformed
        TelaVeiculo telaveiculo = new TelaVeiculo();
        telaveiculo.setVisible(true);
        desktop.add(telaveiculo);
    }//GEN-LAST:event_menuVeiculoActionPerformed

    private void menuReboqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReboqueActionPerformed
        TelaReboque telareboque = new TelaReboque();
        telareboque.setVisible(true);
        desktop.add(telareboque);
    }//GEN-LAST:event_menuReboqueActionPerformed

    private void menuPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPedidoActionPerformed
        TelaPedido telapedido = new TelaPedido();
        telapedido.setVisible(true);
        desktop.add(telapedido);
    }//GEN-LAST:event_menuPedidoActionPerformed

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
        TelaCliente telacliente = new TelaCliente();
        telacliente.setVisible(true);
        desktop.add(telacliente);
    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que quer sair?", "Aten????o", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuVerEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerEstoqueActionPerformed
        TelaEstoque telaestoque = new TelaEstoque();
        telaestoque.setVisible(true);
        desktop.add(telaestoque);
    }//GEN-LAST:event_menuVerEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    public static javax.swing.JMenuItem menuCliente;
    public static javax.swing.JMenuItem menuCultura;
    public static javax.swing.JMenuItem menuFerramenta;
    public static javax.swing.JMenuItem menuFuncionario;
    public static javax.swing.JMenuItem menuPedido;
    public static javax.swing.JMenuItem menuProduto;
    public static javax.swing.JMenuItem menuReboque;
    public static javax.swing.JMenuItem menuRoca;
    private javax.swing.JMenuItem menuSair;
    public static javax.swing.JMenuItem menuUser;
    public static javax.swing.JMenuItem menuVeiculo;
    public static javax.swing.JMenuItem menuVerEstoque;
    public static javax.swing.JMenuItem menuVerPedidos;
    // End of variables declaration//GEN-END:variables
}
