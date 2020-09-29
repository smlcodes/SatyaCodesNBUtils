/**
 * 
 */
package javaswing.javaapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author KavetiS
 *
 */
public class DashBoardGUI extends JFrame {

  private JPanel contentPane;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          DashBoardGUI frame = new DashBoardGUI();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public DashBoardGUI() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 1140, 683);
    
    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);
    
    JMenu mnNewMenu = new JMenu("File");
    menuBar.add(mnNewMenu);
    
    JMenuItem mntmNewMenuItem = new JMenuItem("Logout");
    mntmNewMenuItem.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		

            LoginGUI sf = new LoginGUI();
            sf.setVisible(true);
    	}
    });
    mnNewMenu.add(mntmNewMenuItem);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JButton btnNewButton = new JButton("Jasper Util");
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
            JasperUtilGUI sf = new JasperUtilGUI();
            sf.setVisible(true);
    	}
    });
    btnNewButton.setBounds(322, 102, 219, 65);
    contentPane.add(btnNewButton);
    
    JButton btnInvoiceutil = new JButton("Invoice Util");
    btnInvoiceutil.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		

            InvoiceUtilGUI sf = new InvoiceUtilGUI();
            sf.setVisible(true);
    		
    	}
    });
    btnInvoiceutil.setBounds(38, 102, 219, 65);
    contentPane.add(btnInvoiceutil);
  }
}
