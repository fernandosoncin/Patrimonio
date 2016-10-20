/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.UsuarioM;

/**
 * UNIVERSIDADE DO ESTADO DE MINAS GERAIS - Unidade Frutal
 * @author NUPSI - Núcle de Práticas em Sistemas de Informação
 * Equipe: Gustavo Pinoti,Leopoldo Ferreira, Marlon Moro, Murillo Cuervo
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    UsuarioM usuarioAtivo = new UsuarioM();
    public PrincipalView(UsuarioM usuario) {
        initComponents();
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        usuarioAtivo = usuario;
        if(usuario.isAdmin() == false){
             mnuCadastrar.setEnabled(false);
             mniAdicionarUsuario.setEnabled(false);
        }
        URL url = this.getClass().getResource("/view/icones/icon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
      //  mniMinhaConta.setEnabled(false);
        
        
    }

    PrincipalView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        pnlPrincipal = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        mnbPrincipal = new javax.swing.JMenuBar();
        mnuCadastrar = new javax.swing.JMenu();
        mniOrgao = new javax.swing.JMenuItem();
        mnuLocalizacao = new javax.swing.JMenu();
        mniUnidade = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniBloco = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniPiso = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniSala = new javax.swing.JMenuItem();
        mnuPatrimonio = new javax.swing.JMenu();
        mniIncluirPatrimonio = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniTipoSubtipo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniConservacaoStatus = new javax.swing.JMenuItem();
        mnuMovimentacoes = new javax.swing.JMenu();
        mniConsulta = new javax.swing.JMenu();
        mnuRelatorios = new javax.swing.JMenu();
        mniRelatorioSala = new javax.swing.JMenuItem();
        mniRelatorioDescricao = new javax.swing.JMenuItem();
        mnuUsuario = new javax.swing.JMenu();
        mniMinhaConta = new javax.swing.JMenuItem();
        mniAdicionarUsuario = new javax.swing.JMenuItem();
        mnuSobre = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patrimônio - UEMG");

        pnlPrincipal.setName("NUPSI"); // NOI18N

        foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/LOGO.png"))); // NOI18N
        foto.setAlignmentY(0.0F);
        foto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, 1117, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
        );

        mnuCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/Crystal_Clear_action_edit_add.png"))); // NOI18N
        mnuCadastrar.setText("Cadastrar");

        mniOrgao.setText("Orgão");
        mniOrgao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOrgaoActionPerformed(evt);
            }
        });
        mnuCadastrar.add(mniOrgao);

        mnuLocalizacao.setText("Localização");

        mniUnidade.setText("Unidade");
        mniUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUnidadeActionPerformed(evt);
            }
        });
        mnuLocalizacao.add(mniUnidade);
        mnuLocalizacao.add(jSeparator3);

        mniBloco.setText("Bloco");
        mniBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBlocoActionPerformed(evt);
            }
        });
        mnuLocalizacao.add(mniBloco);
        mnuLocalizacao.add(jSeparator4);

        mniPiso.setText("Piso");
        mniPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPisoActionPerformed(evt);
            }
        });
        mnuLocalizacao.add(mniPiso);
        mnuLocalizacao.add(jSeparator5);

        mniSala.setText("Sala");
        mniSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalaActionPerformed(evt);
            }
        });
        mnuLocalizacao.add(mniSala);

        mnuCadastrar.add(mnuLocalizacao);

        mnuPatrimonio.setText("Patrimônio");

        mniIncluirPatrimonio.setText("Incluir Patrimônio");
        mniIncluirPatrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniIncluirPatrimonioActionPerformed(evt);
            }
        });
        mnuPatrimonio.add(mniIncluirPatrimonio);
        mnuPatrimonio.add(jSeparator1);

        mniTipoSubtipo.setText("Incluir Tipo ou Subtipo");
        mniTipoSubtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTipoSubtipoActionPerformed(evt);
            }
        });
        mnuPatrimonio.add(mniTipoSubtipo);
        mnuPatrimonio.add(jSeparator2);

        mniConservacaoStatus.setText("Incluir Grau de Conservação ou Status");
        mniConservacaoStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConservacaoStatusActionPerformed(evt);
            }
        });
        mnuPatrimonio.add(mniConservacaoStatus);

        mnuCadastrar.add(mnuPatrimonio);

        mnbPrincipal.add(mnuCadastrar);

        mnuMovimentacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/movimentacao.fw.png"))); // NOI18N
        mnuMovimentacoes.setText("Movimentações");
        mnuMovimentacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuMovimentacoesMouseClicked(evt);
            }
        });
        mnbPrincipal.add(mnuMovimentacoes);

        mniConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/lupa.png"))); // NOI18N
        mniConsulta.setText("Consulta");
        mniConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mniConsultaMouseClicked(evt);
            }
        });
        mnbPrincipal.add(mniConsulta);

        mnuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/relatorio48.fw.png"))); // NOI18N
        mnuRelatorios.setText("Relatórios");
        mnuRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuRelatoriosMouseClicked(evt);
            }
        });
        mnuRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatoriosActionPerformed(evt);
            }
        });

        mniRelatorioSala.setText("Salas");
        mniRelatorioSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mniRelatorioSalaMouseClicked(evt);
            }
        });
        mniRelatorioSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelatorioSalaActionPerformed(evt);
            }
        });
        mnuRelatorios.add(mniRelatorioSala);

        mniRelatorioDescricao.setText("Patrimônio");
        mniRelatorioDescricao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mniRelatorioDescricaoMouseClicked(evt);
            }
        });
        mniRelatorioDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelatorioDescricaoActionPerformed(evt);
            }
        });
        mnuRelatorios.add(mniRelatorioDescricao);

        mnbPrincipal.add(mnuRelatorios);

        mnuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/user.png"))); // NOI18N
        mnuUsuario.setText("Usuário");

        mniMinhaConta.setText("Minha Conta");
        mniMinhaConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mniMinhaContaMouseClicked(evt);
            }
        });
        mniMinhaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMinhaContaActionPerformed(evt);
            }
        });
        mnuUsuario.add(mniMinhaConta);

        mniAdicionarUsuario.setText("Gerenciar Usuarios");
        mniAdicionarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mniAdicionarUsuarioMouseClicked(evt);
            }
        });
        mniAdicionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAdicionarUsuarioActionPerformed(evt);
            }
        });
        mnuUsuario.add(mniAdicionarUsuario);

        mnbPrincipal.add(mnuUsuario);

        mnuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/sobre.fw.png"))); // NOI18N
        mnuSobre.setText("Sobre");
        mnuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSobreMouseClicked(evt);
            }
        });
        mnbPrincipal.add(mnuSobre);

        setJMenuBar(mnbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniOrgaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOrgaoActionPerformed
        // TODO add your handling code here:
        OrgaoView entidade = new OrgaoView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(entidade);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniOrgaoActionPerformed

    private void mniIncluirPatrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniIncluirPatrimonioActionPerformed
        // TODO add your handling code here:
        PatrimonioView patrimonio = new PatrimonioView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(patrimonio);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniIncluirPatrimonioActionPerformed

    private void mniTipoSubtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTipoSubtipoActionPerformed
        // TODO add your handling code here:
        TipoSubtipoView tipoSubtipo = new TipoSubtipoView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(tipoSubtipo);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniTipoSubtipoActionPerformed

    private void mniConservacaoStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConservacaoStatusActionPerformed
        ConservacaoStatusView conservacaoStatus = new ConservacaoStatusView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(conservacaoStatus);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniConservacaoStatusActionPerformed

    private void mniUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUnidadeActionPerformed
        // TODO add your handling code here:
        UnidadeView unidade = new UnidadeView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(unidade);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniUnidadeActionPerformed

    private void mniBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBlocoActionPerformed
        // TODO add your handling code here:
        BlocoView bloco = new BlocoView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(bloco);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniBlocoActionPerformed

    private void mniPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPisoActionPerformed
        // TODO add your handling code here:
        PisoView piso = new PisoView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(piso);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniPisoActionPerformed

    private void mniSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalaActionPerformed
        // TODO add your handling code here:
        SalaView sala = new SalaView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(sala);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniSalaActionPerformed

    private void mnuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSobreMouseClicked
        SobreView sobre = new SobreView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(sobre);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mnuSobreMouseClicked

    private void mniAdicionarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mniAdicionarUsuarioMouseClicked
        //sem uso 
    }//GEN-LAST:event_mniAdicionarUsuarioMouseClicked

    private void mniAdicionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAdicionarUsuarioActionPerformed
        UsuarioView usuario = new UsuarioView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(usuario);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniAdicionarUsuarioActionPerformed

    private void mnuRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatoriosActionPerformed
       //sem uso
    }//GEN-LAST:event_mnuRelatoriosActionPerformed

    private void mnuRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuRelatoriosMouseClicked
        
    }//GEN-LAST:event_mnuRelatoriosMouseClicked

    private void mniConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mniConsultaMouseClicked
        ConsultaView consulta = new ConsultaView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(consulta);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniConsultaMouseClicked

    private void mniRelatorioSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mniRelatorioSalaMouseClicked
        
    }//GEN-LAST:event_mniRelatorioSalaMouseClicked

    private void mniRelatorioDescricaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mniRelatorioDescricaoMouseClicked
        
    }//GEN-LAST:event_mniRelatorioDescricaoMouseClicked

    private void mniRelatorioSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelatorioSalaActionPerformed
        RelatorioSalaView relatorio = new RelatorioSalaView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(relatorio);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniRelatorioSalaActionPerformed

    private void mniRelatorioDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelatorioDescricaoActionPerformed
        RelatorioDescricaoView relatorio = new RelatorioDescricaoView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(relatorio);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniRelatorioDescricaoActionPerformed

    private void mniMinhaContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mniMinhaContaMouseClicked
        
    }//GEN-LAST:event_mniMinhaContaMouseClicked

    private void mniMinhaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMinhaContaActionPerformed
        MinhaContaView minhaConta = new MinhaContaView(usuarioAtivo);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(minhaConta);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniMinhaContaActionPerformed

    private void mnuMovimentacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuMovimentacoesMouseClicked
        MovimentacaoView movimentacao = new MovimentacaoView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(movimentacao);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mnuMovimentacoesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel foto;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenuBar mnbPrincipal;
    private javax.swing.JMenuItem mniAdicionarUsuario;
    private javax.swing.JMenuItem mniBloco;
    private javax.swing.JMenuItem mniConservacaoStatus;
    private javax.swing.JMenu mniConsulta;
    private javax.swing.JMenuItem mniIncluirPatrimonio;
    private javax.swing.JMenuItem mniMinhaConta;
    private javax.swing.JMenuItem mniOrgao;
    private javax.swing.JMenuItem mniPiso;
    private javax.swing.JMenuItem mniRelatorioDescricao;
    private javax.swing.JMenuItem mniRelatorioSala;
    private javax.swing.JMenuItem mniSala;
    private javax.swing.JMenuItem mniTipoSubtipo;
    private javax.swing.JMenuItem mniUnidade;
    private javax.swing.JMenu mnuCadastrar;
    private javax.swing.JMenu mnuLocalizacao;
    private javax.swing.JMenu mnuMovimentacoes;
    private javax.swing.JMenu mnuPatrimonio;
    private javax.swing.JMenu mnuRelatorios;
    private javax.swing.JMenu mnuSobre;
    private javax.swing.JMenu mnuUsuario;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
