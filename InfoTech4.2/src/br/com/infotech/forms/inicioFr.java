package br.com.infotech.forms;


import br.com.infotech.forms.DataGrid;
import br.com.infotech.forms.DataGrid;
import br.com.infotech.forms.frmCadastraClientes;
import br.com.infotech.forms.frmCadastraClientes;
import br.com.infotech.forms.frmFuncionarioCadastro;
import br.com.infotech.functions.acesso;
import br.com.infotech.functions.autenticadorAcesso;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class inicioFr extends javax.swing.JFrame {

    
    private static int LogIn;
   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
   
    //inicializador simples sem parametros para a inicialização so itens de tela
    public inicioFr() {
        initComponents();               
        autenticador();
    }   
  
    public inicioFr(int valor) {
        initComponents();           
        LogIn = valor;
        autenticador();
    }       

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   

    private void autenticador(){
    
        int valor ;
        
        boolean parametro = false;
        ResultSet rsValores = acesso.acesso(LogIn);
        
        try{
            while(rsValores.next())
            {
      valor = 0;    
      valor = rsValores.getInt("cadastrarCliente");
      parametro=autenticadorAcesso.acesso(valor);
      btnCadastrarClientes.setVisible(parametro);
      
      
      valor = 0;
      valor = rsValores.getInt("todosClientes");
      btnTodosCLientes.setVisible(autenticadorAcesso.acesso(valor));
      
      valor = 0;
      valor = rsValores.getInt("clietenesContratos");
      btnClientesContratos.setVisible(autenticadorAcesso.acesso(valor));
      
      valor = 0;
      valor = rsValores.getInt("clientesInativos");
      btnClienteInativos.setVisible(autenticadorAcesso.acesso(valor));
      
      valor = 0;
      valor = rsValores.getInt("novoContrato");
      btnNovoContrato.setVisible(autenticadorAcesso.acesso(valor));
      
      valor = 0;
      valor = rsValores.getInt("contratosAtivos");
      btnContratoAtivo.setVisible(autenticadorAcesso.acesso(valor));
      
      valor = 0;
      valor = rsValores.getInt("contratosConcluidos");
      btnContratoConcluidos.setVisible(autenticadorAcesso.acesso(valor));
    
      valor = 0;
      valor = rsValores.getInt("contratosInativos");
      parametro = autenticadorAcesso.acesso(valor);
      btnContratoInativo.setVisible(parametro);
      
      valor = 0 ;
      valor = rsValores.getInt("contratosHaVencer");
      parametro = autenticadorAcesso.acesso(valor);
      btnProximosVencimento.setVisible(parametro);
      
      valor = 0;
      valor = rsValores.getInt("todosContratos");
      parametro = autenticadorAcesso.acesso(valor);
      btnTodosContratos.setVisible(parametro);      
      
      valor = 0;
      valor = rsValores.getInt("solicitacaoOrcamento");
      parametro = autenticadorAcesso.acesso(valor);
      btnSolicitacaoOrcamento.enable(parametro);
      
      valor = 0;
      valor = rsValores.getInt("servicoEmAndamento");
      parametro = autenticadorAcesso.acesso(valor);
      btnServiAndamento.setVisible(parametro);
      
      valor = 0;
      valor = rsValores.getInt("servicoConcluido");
      parametro = autenticadorAcesso.acesso(valor);
      btnServiConcluidos.setVisible(parametro);
      
      valor = 0;
      valor = rsValores.getInt("servicoCancelado");
      parametro = autenticadorAcesso.acesso(valor);
      btnCancelados.setVisible(parametro);
      
      valor = 0;
      valor = rsValores.getInt("todosServicos");
      parametro = autenticadorAcesso.acesso(valor);
      btnTodosServiços.setVisible(parametro);
      
      valor = 0;
      valor = rsValores.getInt("adicionarFuncionario");
      parametro = autenticadorAcesso.acesso(valor);
      btnCadastrarFuncionarios.setVisible(parametro);
      
      valor = 0;
      valor = rsValores.getInt("todosFuncionarios");
      parametro = autenticadorAcesso.acesso(valor);
      btnTodosFunc.setVisible(parametro);
      
      
      valor = 0;
      valor = rsValores.getInt("funcionariosInativos");
      parametro = autenticadorAcesso.acesso(valor);
      btnFuncInativos.setVisible(parametro);
      
      valor = 0;
      valor = rsValores.getInt("autorizacaoDeAcesso");
      
      valor = 0;
      valor = rsValores.getInt("adiministracao");
      parametro = autenticadorAcesso.acesso(valor);
      btnAdministracao.enable(parametro);
      
      valor = 0;
      valor = rsValores.getInt("estoque");
      parametro =  autenticadorAcesso.acesso(valor);
      btnEstoque.enable(parametro);
      
      valor = 0 ;
      valor = rsValores.getInt("clientes");
      parametro = autenticadorAcesso.acesso(valor);
      btnClientes.enable(parametro);
      
      valor = 0 ;
      valor = rsValores.getInt("Contrato");
      parametro = autenticadorAcesso.acesso(valor);
      btnContratos.enable(parametro);
      
      valor = 0 ;
      valor = rsValores.getInt("Solicitacao");
      parametro = autenticadorAcesso.acesso(valor);
      btnSolicitacaoOrcamento.enable(parametro); 

      valor = 0 ;
      valor = rsValores.getInt("funcionario");
      parametro = autenticadorAcesso.acesso(valor);
      btnfuncionarios.enable(parametro);
        
            }
        }    
        catch(SQLException ex)
        {
        JOptionPane.showMessageDialog(null, "Erro na conexão tente novamente 123447 \n"+ex);
        
        }
    
    
    }
    
    
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
public void closeFrm(){

this.dispose();
dispose();
}    


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jdPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        arquivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        editar = new javax.swing.JMenu();
        jSeparator23 = new javax.swing.JPopupMenu.Separator();
        btnClientes = new javax.swing.JMenu();
        jSeparator21 = new javax.swing.JPopupMenu.Separator();
        btnTodosCLientes = new javax.swing.JMenuItem();
        jSeparator22 = new javax.swing.JPopupMenu.Separator();
        btnClientesContratos = new javax.swing.JMenuItem();
        btnCadastrarClientes = new javax.swing.JMenuItem();
        btnClienteInativos = new javax.swing.JMenuItem();
        btnContratos = new javax.swing.JMenu();
        btnContratoAtivo = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        btnContratoInativo = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        btnProximosVencimento = new javax.swing.JMenuItem();
        jSeparator20 = new javax.swing.JPopupMenu.Separator();
        btnNovoContrato = new javax.swing.JMenuItem();
        btnContratoConcluidos = new javax.swing.JMenuItem();
        btnTodosContratos = new javax.swing.JMenuItem();
        btnSolicitacaoOrcamento = new javax.swing.JMenu();
        btnSolicitacaoAberta = new javax.swing.JMenu();
        aguardandoResposta = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        aguardandoAgendamento = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        aguardandoCotacaoo = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        aguardandoAprovacao = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        btnServiAndamento = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        btnServiConcluidos = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        btnCancelados = new javax.swing.JMenu();
        canceladoPelaInfo = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        canceladoPeloCliente = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        todosCliente = new javax.swing.JMenuItem();
        btnTodosServiços = new javax.swing.JMenuItem();
        btnfuncionarios = new javax.swing.JMenu();
        btnCadastrarFuncionarios = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        btnChecarFuncionarios = new javax.swing.JMenu();
        funcAtivos = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        btnFuncInativos = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        btnTodosFunc = new javax.swing.JMenuItem();
        btnAdministracao = new javax.swing.JMenu();
        btnEstoque = new javax.swing.JMenu();
        ajuda = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        comando = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);

        jToolBar1.setBackground(new java.awt.Color(205, 209, 255));
        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator3);
        jToolBar1.add(jSeparator4);

        jLabel2.setText("                                                                       ");
        jToolBar1.add(jLabel2);
        jToolBar1.add(jSeparator5);

        jLabel3.setText("Comando:");
        jToolBar1.add(jLabel3);

        jTextField4.setMinimumSize(new java.awt.Dimension(20, 20));
        jTextField4.setPreferredSize(new java.awt.Dimension(95, 25));
        jToolBar1.add(jTextField4);

        jButton1.setText("    Ir   ");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jdPrincipalLayout = new javax.swing.GroupLayout(jdPrincipal);
        jdPrincipal.setLayout(jdPrincipalLayout);
        jdPrincipalLayout.setHorizontalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );
        jdPrincipalLayout.setVerticalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jdPrincipal);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        arquivo.setText("Arquivo");

        jMenuItem1.setText("Sair");
        arquivo.add(jMenuItem1);
        arquivo.add(jSeparator6);

        jMenuBar1.add(arquivo);

        editar.setText("Editar");
        editar.add(jSeparator23);

        jMenuBar1.add(editar);

        btnClientes.setText("Clientes");
        btnClientes.add(jSeparator21);

        btnTodosCLientes.setText("Todos Clienstes");
        btnTodosCLientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTodosCLientesMousePressed(evt);
            }
        });
        btnClientes.add(btnTodosCLientes);
        btnClientes.add(jSeparator22);

        btnClientesContratos.setText("Clientes e Contratos");
        btnClientesContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesContratosActionPerformed(evt);
            }
        });
        btnClientes.add(btnClientesContratos);

        btnCadastrarClientes.setText("Cadastrar Clientes");
        btnCadastrarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCadastrarClientesMousePressed(evt);
            }
        });
        btnClientes.add(btnCadastrarClientes);

        btnClienteInativos.setText("Clientes inativos");
        btnClientes.add(btnClienteInativos);

        jMenuBar1.add(btnClientes);

        btnContratos.setText("Contratos");

        btnContratoAtivo.setText("Contrato Ativos");
        btnContratos.add(btnContratoAtivo);
        btnContratos.add(jSeparator18);

        btnContratoInativo.setText("Contrato Inativos");
        btnContratos.add(btnContratoInativo);
        btnContratos.add(jSeparator19);

        btnProximosVencimento.setText("Proximos Ao Vencimeto");
        btnContratos.add(btnProximosVencimento);
        btnContratos.add(jSeparator20);

        btnNovoContrato.setText("Novo Contrato");
        btnContratos.add(btnNovoContrato);

        btnContratoConcluidos.setText("Contratos Concluidos");
        btnContratos.add(btnContratoConcluidos);

        btnTodosContratos.setText("Todos contratos");
        btnContratos.add(btnTodosContratos);

        jMenuBar1.add(btnContratos);

        btnSolicitacaoOrcamento.setText("Solicitações");

        btnSolicitacaoAberta.setText("Solicitação Aberta");

        aguardandoResposta.setText("Aguardando Resposta");
        btnSolicitacaoAberta.add(aguardandoResposta);
        btnSolicitacaoAberta.add(jSeparator11);

        aguardandoAgendamento.setText("Aguardando Agendamento");
        btnSolicitacaoAberta.add(aguardandoAgendamento);
        btnSolicitacaoAberta.add(jSeparator10);

        aguardandoCotacaoo.setText("Aguardando Cotação");
        btnSolicitacaoAberta.add(aguardandoCotacaoo);
        btnSolicitacaoAberta.add(jSeparator12);

        aguardandoAprovacao.setText("Aguardando Aprovação");
        btnSolicitacaoAberta.add(aguardandoAprovacao);

        btnSolicitacaoOrcamento.add(btnSolicitacaoAberta);
        btnSolicitacaoOrcamento.add(jSeparator7);

        btnServiAndamento.setText("Serviços Em Andamento");
        btnSolicitacaoOrcamento.add(btnServiAndamento);
        btnSolicitacaoOrcamento.add(jSeparator8);

        btnServiConcluidos.setText("Serviços Concluidos");
        btnSolicitacaoOrcamento.add(btnServiConcluidos);
        btnSolicitacaoOrcamento.add(jSeparator9);

        btnCancelados.setText("Cancelados");

        canceladoPelaInfo.setText("Cancelado Pela Infotech");
        btnCancelados.add(canceladoPelaInfo);
        btnCancelados.add(jSeparator13);

        canceladoPeloCliente.setText("Cancelado Pelo Cliente");
        btnCancelados.add(canceladoPeloCliente);
        btnCancelados.add(jSeparator14);

        todosCliente.setText("Todos");
        btnCancelados.add(todosCliente);

        btnSolicitacaoOrcamento.add(btnCancelados);

        btnTodosServiços.setText("Todos Serviços");
        btnSolicitacaoOrcamento.add(btnTodosServiços);

        jMenuBar1.add(btnSolicitacaoOrcamento);

        btnfuncionarios.setText("Funcionarios");

        btnCadastrarFuncionarios.setText("Cadastrar Funcionarios");
        btnCadastrarFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCadastrarFuncionariosMousePressed(evt);
            }
        });
        btnfuncionarios.add(btnCadastrarFuncionarios);
        btnfuncionarios.add(jSeparator15);

        btnChecarFuncionarios.setText("Checar Funcionarios");

        funcAtivos.setText("Funcionarios Ativos");
        btnChecarFuncionarios.add(funcAtivos);
        btnChecarFuncionarios.add(jSeparator16);

        btnFuncInativos.setText("Funcionarios Inativos");
        btnChecarFuncionarios.add(btnFuncInativos);
        btnChecarFuncionarios.add(jSeparator17);

        btnTodosFunc.setText("Todos Funcionarios");
        btnChecarFuncionarios.add(btnTodosFunc);

        btnfuncionarios.add(btnChecarFuncionarios);

        jMenuBar1.add(btnfuncionarios);

        btnAdministracao.setText("Administração");
        jMenuBar1.add(btnAdministracao);

        btnEstoque.setText("Estoque");
        jMenuBar1.add(btnEstoque);

        ajuda.setText("Ajuda");

        Sobre.setText("Sobre");
        ajuda.add(Sobre);
        ajuda.add(jSeparator1);

        comando.setText("Comandos");
        ajuda.add(comando);

        jMenuBar1.add(ajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarClientesMousePressed
       frmCadastraClientes frm = new frmCadastraClientes();
        
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_btnCadastrarClientesMousePressed

    private void btnTodosCLientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodosCLientesMousePressed
       
         dtGrid(1);
        
    }//GEN-LAST:event_btnTodosCLientesMousePressed

    private void btnClientesContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesContratosActionPerformed
        dtGrid(2);
    }//GEN-LAST:event_btnClientesContratosActionPerformed

    private void btnCadastrarFuncionariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarFuncionariosMousePressed
        // TODO add your handling code here:
        frmFuncionarioCadastro frm = new frmFuncionarioCadastro();
         jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_btnCadastrarFuncionariosMousePressed
   
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
   
   //chama data grid passando parametros de execução de codigo 
    private  void dtGrid(int select){
    
        
        DataGrid obj = new DataGrid(select);
        
        jdPrincipal.add(obj);
        
        obj.setVisible(true);
        
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    
    /**
     * @param args the command line arguments
     */
    //não mexer esta funcionando , inicializador de objetos de tela
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
            java.util.logging.Logger.getLogger(inicioFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioFr().setVisible(true);
                
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JMenuItem aguardandoAgendamento;
    private javax.swing.JMenuItem aguardandoAprovacao;
    private javax.swing.JMenuItem aguardandoCotacaoo;
    private javax.swing.JMenuItem aguardandoResposta;
    private javax.swing.JMenu ajuda;
    private javax.swing.JMenu arquivo;
    private javax.swing.JMenu btnAdministracao;
    private javax.swing.JMenuItem btnCadastrarClientes;
    private javax.swing.JMenuItem btnCadastrarFuncionarios;
    private javax.swing.JMenu btnCancelados;
    private javax.swing.JMenu btnChecarFuncionarios;
    private javax.swing.JMenuItem btnClienteInativos;
    private javax.swing.JMenu btnClientes;
    private javax.swing.JMenuItem btnClientesContratos;
    private javax.swing.JMenuItem btnContratoAtivo;
    private javax.swing.JMenuItem btnContratoConcluidos;
    private javax.swing.JMenuItem btnContratoInativo;
    private javax.swing.JMenu btnContratos;
    private javax.swing.JMenu btnEstoque;
    private javax.swing.JMenuItem btnFuncInativos;
    private javax.swing.JMenuItem btnNovoContrato;
    private javax.swing.JMenuItem btnProximosVencimento;
    private javax.swing.JMenuItem btnServiAndamento;
    private javax.swing.JMenuItem btnServiConcluidos;
    private javax.swing.JMenu btnSolicitacaoAberta;
    private javax.swing.JMenu btnSolicitacaoOrcamento;
    private javax.swing.JMenuItem btnTodosCLientes;
    private javax.swing.JMenuItem btnTodosContratos;
    private javax.swing.JMenuItem btnTodosFunc;
    private javax.swing.JMenuItem btnTodosServiços;
    private javax.swing.JMenu btnfuncionarios;
    private javax.swing.JMenuItem canceladoPelaInfo;
    private javax.swing.JMenuItem canceladoPeloCliente;
    private javax.swing.JMenuItem comando;
    private javax.swing.JMenu editar;
    private javax.swing.JMenuItem funcAtivos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator20;
    private javax.swing.JPopupMenu.Separator jSeparator21;
    private javax.swing.JPopupMenu.Separator jSeparator22;
    private javax.swing.JPopupMenu.Separator jSeparator23;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDesktopPane jdPrincipal;
    private javax.swing.JMenuItem todosCliente;
    // End of variables declaration//GEN-END:variables
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



}
