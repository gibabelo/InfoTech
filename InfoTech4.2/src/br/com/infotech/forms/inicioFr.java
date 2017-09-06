package br.com.infotech.forms;


import br.com.infotech.forms.DataGrid;
import br.com.infotech.forms.frmCadastraClientes;
import br.com.infotech.functions.acesso;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class inicioFr extends javax.swing.JFrame {

    
    private static String LogIn;
   
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
   
    //inicializador simples sem parametros para a inicialização so itens de tela
    public inicioFr() {
        initComponents();        
        autenticar();
       
    }   
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    //inicializador com parametro de login
    public inicioFr(String login) {
        initComponents();
        LogIn = login;
        autenticar();
       
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
public void closeFrm(){

this.dispose();
dispose();
}    


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 

    
    //autenticador de login e nivel de acesso
    private  void autenticar(){
    
       boolean autenticador =acesso.configAcesso(LogIn);
    
       if(autenticador == false ){
       JOptionPane.showMessageDialog(null,"Voce nao tem acesso de login contate seu administrador para mais informações \n");
       closeFrm();
       login novo = new login();
       novo.setVisible(true);
       
       
       }
       else{
       
           int id = acesso.getId(LogIn);
           
           ResultSet valor = acesso.acesso(id);
      try{  
          
       if(!valor.next()){
       JOptionPane.showMessageDialog(null,"Voce nao tem acesso de login contate seu administrador para mais informações \n");
       
       closeFrm();
       login novo = new login();
       novo.setVisible(true);
       
       
       }
       else{
       
           
            while(valor.next()){
            
                int acesso =  valor.getInt("acessCliente");
            //////////////////////////////////////////////////////////////////////////////    
            int cadastrarCliente =  valor.getInt("cadastrarCliente");
            if(cadastrarCliente == 1){
                btnCadastrarClientes.setEnabled(true);
            }
            else{
                btnCadastrarClientes.setEnabled(false);
            }
            ////////////////////////////////////////////////////////////////////////////////
                int todosClientes =  valor.getInt("todosClientes");
                if(todosClientes == 1){
                btnTodosCLientes.setEnabled(true);
            }
            else{
                btnTodosCLientes.setEnabled(false);
            }
            ////////////////////////////////////////////////////////////////////////////////
                
                int clietenesContratos =  valor.getInt("clietenesContratos");
                if(cadastrarCliente == 1){
                btnClientesContratos.setEnabled(true);
            }
            else{
                btnClientesContratos.setEnabled(false);
            }
            ////////////////////////////////////////////////////////////////////////////////
                
                int clientesInativos =  valor.getInt("clientesInativos");
                int novoContratoo =  valor.getInt("novoContrato");
                int contratosAtivos =  valor.getInt("contratosAtivos");
                int contratosConcluidos =  valor.getInt("contratosConcluidos");
                int contratosInativos =  valor.getInt("contratosInativos");
                int contratosHaVencer =  valor.getInt("contratosHaVencer");
                int todosContratos =  valor.getInt("todosContratos");
                int solicitacaoOrcamento =  valor.getInt("solicitacaoOrcamento");
                int servicoEmAndamento =  valor.getInt("servicoEmAndamento");
                int servicoConcluido =  valor.getInt("servicoConcluido");
                int servicoCancelado =  valor.getInt("servicoCancelado");
                int acetodosServicossso =  valor.getInt("todosServicos");
                int adicionarFuncionario =  valor.getInt("adicionarFuncionario");
                int todosFuncionarios =  valor.getInt("todosFuncionarios");
                int funcionariosInativos =  valor.getInt("funcionariosInativos");
                int autorizacaoDeAcesso =  valor.getInt("autorizacaoDeAcesso");
                int adiministracao =  valor.getInt("adiministracao");
                int estoque =  valor.getInt("estoque");
            }
            

            
            
           }
         }
           catch(SQLException erro){
           JOptionPane.showMessageDialog(null,"VErro ao carregar diretrizes de acesso  \n"+ erro);
           
           }
       
       }
    
    
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
        contratos = new javax.swing.JMenu();
        contratoAtivo = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        contratoInativo = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        procimosVencimento = new javax.swing.JMenuItem();
        jSeparator20 = new javax.swing.JPopupMenu.Separator();
        novoContrato = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        solicitacaoAberta = new javax.swing.JMenu();
        aguardandoResposta = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        aguardandoAgendamento = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        aguardandoCotacaoo = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        aguardandoAprovacao = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        serviAndamento = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        serviConcluidos = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        cancelados = new javax.swing.JMenu();
        canceladoPelaInfo = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        canceladoPeloCliente = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        todosCliente = new javax.swing.JMenuItem();
        funcionarios = new javax.swing.JMenu();
        cadastrarFuncionarios = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        checarFuncionarios = new javax.swing.JMenu();
        funcAtivos = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        funcInativos = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        todosFunc = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
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

        jMenuBar1.add(btnClientes);

        contratos.setText("Contratos");

        contratoAtivo.setText("Contrato Ativos");
        contratos.add(contratoAtivo);
        contratos.add(jSeparator18);

        contratoInativo.setText("Contrato Inativos");
        contratos.add(contratoInativo);
        contratos.add(jSeparator19);

        procimosVencimento.setText("Proximos Ao Vencimeto");
        contratos.add(procimosVencimento);
        contratos.add(jSeparator20);

        novoContrato.setText("Novo Contrato");
        contratos.add(novoContrato);

        jMenuBar1.add(contratos);

        jMenu4.setText("Solicitações");

        solicitacaoAberta.setText("Solicitação Aberta");

        aguardandoResposta.setText("Aguardando Resposta");
        solicitacaoAberta.add(aguardandoResposta);
        solicitacaoAberta.add(jSeparator11);

        aguardandoAgendamento.setText("Aguardando Agendamento");
        solicitacaoAberta.add(aguardandoAgendamento);
        solicitacaoAberta.add(jSeparator10);

        aguardandoCotacaoo.setText("Aguardando Cotação");
        solicitacaoAberta.add(aguardandoCotacaoo);
        solicitacaoAberta.add(jSeparator12);

        aguardandoAprovacao.setText("Aguardando Aprovação");
        solicitacaoAberta.add(aguardandoAprovacao);

        jMenu4.add(solicitacaoAberta);
        jMenu4.add(jSeparator7);

        serviAndamento.setText("Serviços Em Andamento");
        jMenu4.add(serviAndamento);
        jMenu4.add(jSeparator8);

        serviConcluidos.setText("Serviços Concluidos");
        jMenu4.add(serviConcluidos);
        jMenu4.add(jSeparator9);

        cancelados.setText("Cancelados");

        canceladoPelaInfo.setText("Cancelado Pela Infotech");
        cancelados.add(canceladoPelaInfo);
        cancelados.add(jSeparator13);

        canceladoPeloCliente.setText("Cancelado Pelo Cliente");
        cancelados.add(canceladoPeloCliente);
        cancelados.add(jSeparator14);

        todosCliente.setText("Todos");
        cancelados.add(todosCliente);

        jMenu4.add(cancelados);

        jMenuBar1.add(jMenu4);

        funcionarios.setText("Funcionarios");

        cadastrarFuncionarios.setText("Cadastrar Funcionarios");
        cadastrarFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cadastrarFuncionariosMousePressed(evt);
            }
        });
        funcionarios.add(cadastrarFuncionarios);
        funcionarios.add(jSeparator15);

        checarFuncionarios.setText("Checar Funcionarios");

        funcAtivos.setText("Funcionarios Ativos");
        checarFuncionarios.add(funcAtivos);
        checarFuncionarios.add(jSeparator16);

        funcInativos.setText("Funcionarios Inativos");
        checarFuncionarios.add(funcInativos);
        checarFuncionarios.add(jSeparator17);

        todosFunc.setText("Todos Funcionarios");
        checarFuncionarios.add(todosFunc);

        funcionarios.add(checarFuncionarios);

        jMenuBar1.add(funcionarios);

        jMenu1.setText("Administração");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Estoque");
        jMenuBar1.add(jMenu2);

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

    private void cadastrarFuncionariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarFuncionariosMousePressed
        // TODO add your handling code here:
        frmFuncionarioCadastro frm = new frmFuncionarioCadastro();
         jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_cadastrarFuncionariosMousePressed
   
    
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
    private javax.swing.JMenuItem btnCadastrarClientes;
    private javax.swing.JMenu btnClientes;
    private javax.swing.JMenuItem btnClientesContratos;
    private javax.swing.JMenuItem btnTodosCLientes;
    private javax.swing.JMenuItem cadastrarFuncionarios;
    private javax.swing.JMenuItem canceladoPelaInfo;
    private javax.swing.JMenuItem canceladoPeloCliente;
    private javax.swing.JMenu cancelados;
    private javax.swing.JMenu checarFuncionarios;
    private javax.swing.JMenuItem comando;
    private javax.swing.JMenuItem contratoAtivo;
    private javax.swing.JMenuItem contratoInativo;
    private javax.swing.JMenu contratos;
    private javax.swing.JMenu editar;
    private javax.swing.JMenuItem funcAtivos;
    private javax.swing.JMenuItem funcInativos;
    private javax.swing.JMenu funcionarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
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
    private javax.swing.JMenuItem novoContrato;
    private javax.swing.JMenuItem procimosVencimento;
    private javax.swing.JMenuItem serviAndamento;
    private javax.swing.JMenuItem serviConcluidos;
    private javax.swing.JMenu solicitacaoAberta;
    private javax.swing.JMenuItem todosCliente;
    private javax.swing.JMenuItem todosFunc;
    // End of variables declaration//GEN-END:variables
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



}
