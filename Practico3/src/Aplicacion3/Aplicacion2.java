
package Aplicacion3;

/**
 *prueba de juego
 * @author Español
 */
public class Aplicacion2 extends javax.swing.JFrame {

    
    int x=0; int y=0;
    
    
    
    public Aplicacion2() {
        initComponents();
        
        jLabel1.setLocation(x, y); 

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Español\\Desktop\\final mario.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        
        
        if(evt.getKeyCode()==37)
         {
            x=x-1;
        jLabel1.setLocation(x,y);
         }
        
        
            else if(evt.getKeyCode()==38)
    {
            y=y-1;
        jLabel1.setLocation(x,y);
            }
            else if(evt.getKeyCode()==39)
        {
            x=x+1;
        jLabel1.setLocation(x,y);
    }
        else if(evt.getKeyCode()==40)
    {
    y=y+1;
    jLabel1.setLocation(x,y);
        }
        
    }//GEN-LAST:event_formKeyPressed

    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
