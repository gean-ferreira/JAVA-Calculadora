package app_calculadora;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gean-ferreira
 */
public class calculadora extends javax.swing.JFrame {
    
    // num = variável que armazenará na memória números inputador pelos botões
    // ans = resposta quando o usuário apertar o botão de igual
    double num, ans; 
    int calculation; // Variável que seta as operações lógicas
    boolean isStarting = true;
    
    /**
     * Creates new form calculator
     */
    public calculadora() {
        initComponents();
        disable();
    }
    
    // Desliga a calculadora desabilitando todos os botões, menos o on
    public void disable() {
        btnRadioOn.setEnabled(true); // ON button
        btnRadioOff.setEnabled(false); // OFF button
        
        lblResultado.setEnabled(false);
        
        btnNum0.setEnabled(false);
        btnNum1.setEnabled(false);
        btnNum2.setEnabled(false);
        btnNum3.setEnabled(false);
        btnNum4.setEnabled(false);
        btnNum5.setEnabled(false);
        btnNum6.setEnabled(false);
        btnNum7.setEnabled(false);
        btnNum8.setEnabled(false);
        btnNum9.setEnabled(false);
        btnCancel.setEnabled(false);
        btnDot.setEnabled(false);
        btnPlus.setEnabled(false);
        btnMinus.setEnabled(false);
        btnMultiplication.setEnabled(false);
        btnSplit.setEnabled(false);
        btnEqual.setEnabled(false);
        btnDelete.setEnabled(false);
    }
    
    // Liga a calculadora habilitando todos os botões e desabilita o on
    public void enable() {
        btnRadioOn.setEnabled(false); // ON button
        btnRadioOff.setEnabled(true); // OFF button
        
        lblResultado.setEnabled(true);
        
        btnNum0.setEnabled(true);
        btnNum1.setEnabled(true);
        btnNum2.setEnabled(true);
        btnNum3.setEnabled(true);
        btnNum4.setEnabled(true);
        btnNum5.setEnabled(true);
        btnNum6.setEnabled(true);
        btnNum7.setEnabled(true);
        btnNum8.setEnabled(true);
        btnNum9.setEnabled(true);
        btnCancel.setEnabled(true);
        btnDot.setEnabled(true);
        btnPlus.setEnabled(true);
        btnMinus.setEnabled(true);
        btnMultiplication.setEnabled(true);
        btnSplit.setEnabled(true);
        btnEqual.setEnabled(true);
        btnDelete.setEnabled(true);
    }
    
    // Método possui o parâmetro que irá setar o valor da tela da calculadora
    public void cancel(String hasResult) {
        lblResultado.setText(hasResult);
        lblValueMemory.setText("");
        lblOperationMemory.setText("");
        num = 0;
        ans = 0;
        isStarting = true;
        calculation = 0;
    }
    
    public void arithmetic_operation() {
        switch(calculation) {
            case 1: // Sum
                ans = num + Double.parseDouble(lblResultado.getText());
                break;
            case 2: // Sub
                ans = num - Double.parseDouble(lblResultado.getText());
                break;
            case 3: // Mult
                ans = num * Double.parseDouble(lblResultado.getText());
                break;
            case 4: // Div
                ans = num / Double.parseDouble(lblResultado.getText());
                break;
        }
        cancel(Double.toString(ans));
    }
    
    // Método verifica se há valores em memória e adiciona em memória a operação aritmética clicada
    public void set_lblOperationMemory(String strArithmeticOperation) {
        if (!lblValueMemory.getText().isEmpty()) {
            lblOperationMemory.setText(strArithmeticOperation);
        }
    }
    
    public void set_lblResultado(String numeroString) {
        lblResultado.setText(lblResultado.getText() + numeroString);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lblResultado = new javax.swing.JTextField();
        btnRadioOn = new javax.swing.JRadioButton();
        btnRadioOff = new javax.swing.JRadioButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnNum7 = new javax.swing.JButton();
        btnNum8 = new javax.swing.JButton();
        btnNum9 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btnNum4 = new javax.swing.JButton();
        btnNum5 = new javax.swing.JButton();
        btnNum6 = new javax.swing.JButton();
        btnSplit = new javax.swing.JButton();
        btnNum2 = new javax.swing.JButton();
        btnNum1 = new javax.swing.JButton();
        btnNum3 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnNum0 = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        lblValueMemory = new javax.swing.JLabel();
        lblOperationMemory = new javax.swing.JLabel();

        jButton3.setFont(new java.awt.Font("Fira Code Medium", 1, 13)); // NOI18N
        jButton3.setText("C");
        jButton3.setToolTipText("");

        jButton5.setFont(new java.awt.Font("Fira Code Medium", 1, 13)); // NOI18N
        jButton5.setText("+");
        jButton5.setToolTipText("");

        jButton10.setFont(new java.awt.Font("Fira Code Medium", 1, 13)); // NOI18N
        jButton10.setText("1");
        jButton10.setToolTipText("");

        jButton15.setFont(new java.awt.Font("Fira Code Medium", 1, 13)); // NOI18N
        jButton15.setText("1");
        jButton15.setToolTipText("");

        jToggleButton3.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        lblResultado.setEditable(false);
        lblResultado.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lblResultado.setToolTipText(null);
        lblResultado.setFocusable(false);
        lblResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblResultadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnRadioOn);
        btnRadioOn.setFont(new java.awt.Font("Fira Code Medium", 1, 10)); // NOI18N
        btnRadioOn.setText("ON");
        btnRadioOn.setToolTipText(null);
        btnRadioOn.setEnabled(false);
        btnRadioOn.setFocusable(false);
        btnRadioOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadioOnActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnRadioOff);
        btnRadioOff.setFont(new java.awt.Font("Fira Code Medium", 1, 10)); // NOI18N
        btnRadioOff.setText("OFF");
        btnRadioOff.setToolTipText(null);
        btnRadioOff.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRadioOff.setEnabled(false);
        btnRadioOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadioOffActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnDelete.setText("<");
        btnDelete.setToolTipText(null);
        btnDelete.setMaximumSize(new java.awt.Dimension(24, 24));
        btnDelete.setMinimumSize(new java.awt.Dimension(24, 24));
        btnDelete.setPreferredSize(new java.awt.Dimension(24, 24));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnCancel.setText("C");
        btnCancel.setToolTipText(null);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnPlus.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnPlus.setText("+");
        btnPlus.setToolTipText(null);
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnNum7.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnNum7.setText("7");
        btnNum7.setToolTipText(null);
        btnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum7ActionPerformed(evt);
            }
        });

        btnNum8.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnNum8.setText("8");
        btnNum8.setToolTipText(null);
        btnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum8ActionPerformed(evt);
            }
        });

        btnNum9.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnNum9.setText("9");
        btnNum9.setToolTipText(null);
        btnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum9ActionPerformed(evt);
            }
        });

        btnMinus.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnMinus.setText("-");
        btnMinus.setToolTipText(null);
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnMultiplication.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnMultiplication.setText("*");
        btnMultiplication.setToolTipText(null);
        btnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationActionPerformed(evt);
            }
        });

        btnNum4.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnNum4.setText("4");
        btnNum4.setToolTipText(null);
        btnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum4ActionPerformed(evt);
            }
        });

        btnNum5.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnNum5.setText("5");
        btnNum5.setToolTipText(null);
        btnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum5ActionPerformed(evt);
            }
        });

        btnNum6.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnNum6.setText("6");
        btnNum6.setToolTipText(null);
        btnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum6ActionPerformed(evt);
            }
        });

        btnSplit.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnSplit.setText("/");
        btnSplit.setToolTipText(null);
        btnSplit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSplitActionPerformed(evt);
            }
        });

        btnNum2.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnNum2.setText("2");
        btnNum2.setToolTipText(null);
        btnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum2ActionPerformed(evt);
            }
        });

        btnNum1.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnNum1.setText("1");
        btnNum1.setToolTipText(null);
        btnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum3.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnNum3.setText("3");
        btnNum3.setToolTipText(null);
        btnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum3ActionPerformed(evt);
            }
        });

        btnDot.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnDot.setText(".");
        btnDot.setToolTipText(null);
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        btnNum0.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnNum0.setText("0");
        btnNum0.setToolTipText(null);
        btnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum0ActionPerformed(evt);
            }
        });

        btnEqual.setFont(new java.awt.Font("Fira Code Medium", 1, 24)); // NOI18N
        btnEqual.setText("=");
        btnEqual.setToolTipText(null);
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        lblValueMemory.setFont(new java.awt.Font("Fira Code Medium", 1, 13)); // NOI18N
        lblValueMemory.setForeground(new java.awt.Color(204, 51, 0));
        lblValueMemory.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblValueMemory.setToolTipText("");

        lblOperationMemory.setFont(new java.awt.Font("Fira Code Medium", 1, 13)); // NOI18N
        lblOperationMemory.setForeground(new java.awt.Color(204, 51, 0));
        lblOperationMemory.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOperationMemory.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(btnRadioOn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnNum8, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnSplit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnRadioOff)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblResultado))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblValueMemory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOperationMemory)))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOperationMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValueMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRadioOn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRadioOff)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSplit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int length = lblResultado.getText().length();
        int number = lblResultado.getText().length() - 1;
        String store; // Variável que armazenará o valor formatado
        
        if (length > 0) {
            // StringBuilder cria strings, porém objetos da classe StringBuilder, e que podem ser modificadas
            StringBuilder back = new StringBuilder(lblResultado.getText());
            back.deleteCharAt(number); // Deleta um character na posição retornada como parâmetro
            store = back.toString(); // tornar tipo primitivo (string)
            lblResultado.setText(store);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        // TODO add your handling code here:
        calculation = 1;
        if (!lblResultado.getText().isEmpty()) { // Varifica se há algum valor no label antes de fazer alguma operação
            if(isStarting){ // Caso a aplicação esteja iniciando
            System.out.println();
                num = Double.parseDouble(lblResultado.getText());
                isStarting = false;
            } else {
                num = num + Double.parseDouble(lblResultado.getText());
            }
            lblValueMemory.setText(String.valueOf(num));
            lblResultado.setText("");
        }
        set_lblOperationMemory("+");
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum7ActionPerformed
        // TODO add your handling code here:
        set_lblResultado("7");
    }//GEN-LAST:event_btnNum7ActionPerformed

    private void btnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum8ActionPerformed
        // TODO add your handling code here:
        set_lblResultado("8");
    }//GEN-LAST:event_btnNum8ActionPerformed

    private void btnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum9ActionPerformed
        // TODO add your handling code here:
        set_lblResultado("9");
    }//GEN-LAST:event_btnNum9ActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        // TODO add your handling code here:
        calculation = 2;
        if (!lblResultado.getText().isEmpty()) {
            if(isStarting){ // Caso a aplicação esteja iniciando
                num = Double.parseDouble(lblResultado.getText());
                isStarting = false;
            } else {
                num = num - Double.parseDouble(lblResultado.getText());
            }
            lblValueMemory.setText(String.valueOf(num));
            lblResultado.setText("");
        }
        set_lblOperationMemory("-");
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicationActionPerformed
        // TODO add your handling code here:
        calculation = 3;
        if (!lblResultado.getText().isEmpty()) {
            if(isStarting){ // Caso a aplicação esteja iniciando
                num = Double.parseDouble(lblResultado.getText());
                isStarting = false;
            } else {
                num = num * Double.parseDouble(lblResultado.getText());
            }
            lblValueMemory.setText(String.valueOf(num));
            lblResultado.setText("");
        }
        set_lblOperationMemory("*");
    }//GEN-LAST:event_btnMultiplicationActionPerformed

    private void btnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum4ActionPerformed
        // TODO add your handling code here:
        set_lblResultado("4");
    }//GEN-LAST:event_btnNum4ActionPerformed

    private void btnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum5ActionPerformed
        // TODO add your handling code here:
        set_lblResultado("5");
    }//GEN-LAST:event_btnNum5ActionPerformed

    private void btnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum6ActionPerformed
        // TODO add your handling code here:
        set_lblResultado("6");
    }//GEN-LAST:event_btnNum6ActionPerformed

    private void btnSplitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSplitActionPerformed
        // TODO add your handling code here:
        calculation = 4;
        if (!lblResultado.getText().isEmpty()) {
            if(isStarting){ // Caso a aplicação esteja iniciando
                num = Double.parseDouble(lblResultado.getText());
                isStarting = false;
            } else {
                num = num / Double.parseDouble(lblResultado.getText());
            }
            lblValueMemory.setText(String.valueOf(num));
            lblResultado.setText("");
        }
        set_lblOperationMemory("/");
    }//GEN-LAST:event_btnSplitActionPerformed

    private void btnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum2ActionPerformed
        // TODO add your handling code here:
        set_lblResultado("2");
    }//GEN-LAST:event_btnNum2ActionPerformed

    private void btnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum1ActionPerformed
        // TODO add your handling code here:
        set_lblResultado("1");
    }//GEN-LAST:event_btnNum1ActionPerformed

    private void btnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum3ActionPerformed
        // TODO add your handling code here:
        set_lblResultado("3");
    }//GEN-LAST:event_btnNum3ActionPerformed

    // Caso haja um ponto na tela o botão não retornará nada
    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        System.out.println(lblResultado.getText().length());
        if (!lblResultado.getText().contains(".") && lblResultado.getText().length() > 0) {
            set_lblResultado(".");
        }
    }//GEN-LAST:event_btnDotActionPerformed

    private void btnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum0ActionPerformed
        // TODO add your handling code here:
        set_lblResultado("0");
    }//GEN-LAST:event_btnNum0ActionPerformed

    // O botão de igual apenas funcionará caso haja valor na tela e em memória
    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        if (!lblValueMemory.getText().isEmpty() && !lblResultado.getText().isEmpty()) {
            arithmetic_operation();
            num = 0;
        }
    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnRadioOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadioOffActionPerformed
        // TODO add your handling code here:
        disable(); // Desativa todos os botões
    }//GEN-LAST:event_btnRadioOffActionPerformed

    private void btnRadioOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadioOnActionPerformed
        // TODO add your handling code here:
        enable(); // Ativa todos os botões
    }//GEN-LAST:event_btnRadioOnActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        cancel("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void lblResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblResultadoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblResultadoActionPerformed

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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnNum0;
    private javax.swing.JButton btnNum1;
    private javax.swing.JButton btnNum2;
    private javax.swing.JButton btnNum3;
    private javax.swing.JButton btnNum4;
    private javax.swing.JButton btnNum5;
    private javax.swing.JButton btnNum6;
    private javax.swing.JButton btnNum7;
    private javax.swing.JButton btnNum8;
    private javax.swing.JButton btnNum9;
    private javax.swing.JButton btnPlus;
    private javax.swing.JRadioButton btnRadioOff;
    private javax.swing.JRadioButton btnRadioOn;
    private javax.swing.JButton btnSplit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JLabel lblOperationMemory;
    private javax.swing.JTextField lblResultado;
    private javax.swing.JLabel lblValueMemory;
    // End of variables declaration//GEN-END:variables
}
