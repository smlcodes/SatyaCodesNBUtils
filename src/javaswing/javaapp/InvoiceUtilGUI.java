/**
 * 
 */
package javaswing.javaapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.springframework.util.ResourceUtils;

import javax.swing.JLabel;
import javax.swing.JToolBar;
import java.awt.Font;
import javax.swing.JTextField;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Component;
import javax.swing.Box;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import javaswing.javaapp.bean.InvoiceBean;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author KavetiS
 *
 */


/**
 * 
 * REF:
 * http://refermycode.com/jaspertutorial/chapter-5-generating-report-with-java-pojo-classes/
 * 
 * **/
public class InvoiceUtilGUI extends JFrame {

  private JPanel contentPane;
  private JTextField invTxt;
  private JTextField txtLine1;
  private JTextField txtCompanyName;
  private JTextField dateTxt1;
  private JTextField txtLine2;
  private JTextField txtPhno;
  private JTextField txtWebsite;
  private JTextField txtCustname;
  private JTextField txtCustcompany;
  private JTextField txtCustline1;
  private JTextField txtCustline2;
  private JLabel lblNewLabel_1;
  private JLabel lblNewLabel_1_2;
  private JLabel lblNewLabel_1_4;
  private JLabel lblNewLabel_1_5;
  private JLabel lblNewLabel_1_6;
  private JTextField sno1;
  private JTextField sno2;
  private JTextField sno3;
  private JTextField sno4;
  private JTextField i1;
  private JTextField i2;
  private JTextField i3;
  private JTextField i4;
  private JLabel lblNewLabel_1_7;
  private JTextField p1;
  private JTextField p2;
  private JTextField p3;
  private JTextField p4;
  private JTextField q1;
  private JTextField q2;
  private JTextField q3;
  private JTextField q4;
  private JTextField t1;
  private JTextField t2;
  private JTextField t3;
  private JTextField t4;
  private JTextField etctxt;
  private JTextField etctotal;
  private JLabel lblNewLabel_1_8;
  private JLabel lblNewLabel_1_9;
  private JTextField total;
  private JLabel lblNewLabel_1_10;
  private JTextField txtFooter;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          InvoiceUtilGUI frame = new InvoiceUtilGUI();
          frame.setVisible(true);
          
          
          
          
          
          //************************* Jasper Report **************************** Start 
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          //************************* Jasper Report **************************** End 
          
       
          
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public InvoiceUtilGUI() {
    setTitle("Invoice Util");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 1259, 877);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblNewLabel_1_1 = new JLabel("S.No");
    lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_1_1.setForeground(Color.BLUE);
    lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
    lblNewLabel_1_1.setBounds(12, 269, 146, 38);
    contentPane.add(lblNewLabel_1_1);
    
    JLabel lblNewLabel_1_3 = new JLabel("InvNo\r\n");
    lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
    lblNewLabel_1_3.setBounds(0, 13, 62, 38);
    contentPane.add(lblNewLabel_1_3);
    
    invTxt = new JTextField();
    invTxt.setFont(new Font("Tahoma", Font.BOLD, 18));
    invTxt.setBounds(62, 20, 86, 33);
    contentPane.add(invTxt);
    invTxt.setColumns(10);
    
    JLabel lblNewLabel_1_3_1 = new JLabel("Date");
    lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));
    lblNewLabel_1_3_1.setBounds(0, 61, 71, 38);
    contentPane.add(lblNewLabel_1_3_1);
    
    txtCompanyName = new JTextField();
    txtCompanyName.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        txtCompanyName.selectAll();
      }
    });
    txtCompanyName.setText("Company Name");
    txtCompanyName.setFont(new Font("Tahoma", Font.BOLD, 18));
    txtCompanyName.setBounds(163, 13, 451, 38);
    contentPane.add(txtCompanyName);
    txtCompanyName.setColumns(10);
    
    dateTxt1 = new JTextField();
    dateTxt1.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent arg0) {
        dateTxt1 .selectAll();
      }
    });
    dateTxt1.setText("date");
    dateTxt1.setFont(new Font("Tahoma", Font.BOLD, 18));
    dateTxt1.setColumns(10);
    dateTxt1.setBounds(62, 64, 86, 33);
    contentPane.add(dateTxt1);
    
    txtLine2 = new JTextField();
    txtLine2.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        txtLine2.selectAll();
      }
    });
    txtLine2.setText("Line 2");
    txtLine2.setFont(new Font("Tahoma", Font.BOLD, 18));
    txtLine2.setColumns(10);
    txtLine2.setBounds(629, 63, 458, 39);
    contentPane.add(txtLine2);
    
    txtPhno = new JTextField();
    txtPhno.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        txtPhno.selectAll();
      }
    });
    txtPhno.setText("Ph.no");
    txtPhno.setFont(new Font("Tahoma", Font.BOLD, 18));
    txtPhno.setColumns(10);
    txtPhno.setBounds(629, 13, 215, 38);
    contentPane.add(txtPhno);
    
    txtWebsite = new JTextField();
    txtWebsite.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        txtWebsite.selectAll();
      }
    });
    txtWebsite.setText("website/email");
    txtWebsite.setFont(new Font("Tahoma", Font.BOLD, 18));
    txtWebsite.setColumns(10);
    txtWebsite.setBounds(849, 13, 238, 38);
    contentPane.add(txtWebsite);
    
    txtLine1 = new JTextField();
    txtLine1.setText("Line1");
    txtLine1.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        txtLine1.selectAll();
      }
    });
    txtLine1.setFont(new Font("Tahoma", Font.BOLD, 18));
    txtLine1.setColumns(10);
    txtLine1.setBounds(163, 61, 451, 38);
    contentPane.add(txtLine1);
    
    txtCustname = new JTextField();
    txtCustname.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent arg0) {
        txtCustname.selectAll();
      }
    });
    txtCustname.setText("custName");
    txtCustname.setBounds(12, 159, 254, 26);
    contentPane.add(txtCustname);
    txtCustname.setColumns(10);
    
    txtCustcompany = new JTextField();
    txtCustcompany.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        txtCustcompany.selectAll();
      }
    });
    txtCustcompany.setText("custCompany");
    txtCustcompany.setColumns(10);
    txtCustcompany.setBounds(278, 159, 254, 26);
    contentPane.add(txtCustcompany);
    
    txtCustline1 = new JTextField();
    txtCustline1.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        txtCustline1.selectAll();
      }
    });
    txtCustline1.setText("custLine1");
    txtCustline1.setColumns(10);
    txtCustline1.setBounds(547, 159, 254, 26);
    contentPane.add(txtCustline1);
    
    txtCustline2 = new JTextField();
    txtCustline2.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        txtCustline2.selectAll();
      }
    });
    txtCustline2.setText("custLine2");
    txtCustline2.setColumns(10);
    txtCustline2.setBounds(816, 159, 271, 26);
    contentPane.add(txtCustline2);
    
    lblNewLabel_1 = new JLabel("Customer ");
    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
    lblNewLabel_1.setBounds(10, 125, 146, 38);
    contentPane.add(lblNewLabel_1);
    
    lblNewLabel_1_2 = new JLabel("Invoice Details");
    lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
    lblNewLabel_1_2.setBounds(20, 232, 146, 38);
    contentPane.add(lblNewLabel_1_2);
    
    lblNewLabel_1_4 = new JLabel("Item Name");
    lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_1_4.setForeground(Color.BLUE);
    lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 18));
    lblNewLabel_1_4.setBounds(217, 269, 146, 38);
    contentPane.add(lblNewLabel_1_4);
    
    lblNewLabel_1_5 = new JLabel("Qty\r\n");
    lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_1_5.setForeground(Color.BLUE);
    lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 18));
    lblNewLabel_1_5.setBounds(795, 269, 146, 38);
    contentPane.add(lblNewLabel_1_5);
    
    lblNewLabel_1_6 = new JLabel("Price");
    lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_1_6.setForeground(Color.BLUE);
    lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 18));
    lblNewLabel_1_6.setBounds(634, 269, 146, 38);
    contentPane.add(lblNewLabel_1_6);
    
    sno1 = new JTextField();
    sno1.setText("1");
    sno1.setBounds(50, 335, 95, 26);
    contentPane.add(sno1);
    sno1.setColumns(10);
    
    sno2 = new JTextField();
    sno2.setText("2");
    sno2.setColumns(10);
    sno2.setBounds(50, 377, 95, 26);
    contentPane.add(sno2);
    
    sno3 = new JTextField();
    sno3.setText("3");
    sno3.setColumns(10);
    sno3.setBounds(50, 419, 95, 26);
    contentPane.add(sno3);
    
    sno4 = new JTextField();
    sno4.setText("4");
    sno4.setColumns(10);
    sno4.setBounds(50, 464, 95, 26);
    contentPane.add(sno4);
    
    i1 = new JTextField();
    i1.setBounds(196, 335, 418, 26);
    contentPane.add(i1);
    i1.setColumns(10);
    
    i2 = new JTextField();
    i2.setColumns(10);
    i2.setBounds(196, 377, 418, 26);
    contentPane.add(i2);
    
    i3 = new JTextField();
    i3.setColumns(10);
    i3.setBounds(196, 419, 418, 26);
    contentPane.add(i3);
    
    i4 = new JTextField();
    i4.setColumns(10);
    i4.setBounds(196, 464, 418, 26);
    contentPane.add(i4);
    
    lblNewLabel_1_7 = new JLabel("Total\r\n");
    lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_1_7.setForeground(Color.BLUE);
    lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 18));
    lblNewLabel_1_7.setBounds(956, 269, 146, 38);
    contentPane.add(lblNewLabel_1_7);
    
    p1 = new JTextField();
    p1.setText("0");
    p1.setColumns(10);
    p1.setBounds(663, 335, 95, 26);
    contentPane.add(p1);
    
    p2 = new JTextField();
    p2.setText("0");
    p2.setColumns(10);
    p2.setBounds(663, 377, 95, 26);
    contentPane.add(p2);
    
    p3 = new JTextField();
    p3.setText("0");
    p3.setColumns(10);
    p3.setBounds(663, 419, 95, 26);
    contentPane.add(p3);
    
    p4 = new JTextField();
    p4.setText("0");
    p4.setColumns(10);
    p4.setBounds(663, 464, 95, 26);
    contentPane.add(p4);
    
    q1 = new JTextField();
    q1.setText("1");
    q1.addKeyListener(new KeyAdapter() {
      @Override
      public void keyReleased(KeyEvent arg0) {
        
        if(!p1.getText().isEmpty() && !q1.getText().isEmpty()) {
        double d = ( Double.parseDouble(p1.getText()) * Integer.parseInt(q1.getText()));        
        t1.setText(d+"");
        }
        
        
      }
    });
    q1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
    
      }
    });
    q1.setColumns(10);
    q1.setBounds(816, 335, 95, 26);
    contentPane.add(q1);
    
    q2 = new JTextField();
    q2.setText("1");
    q2.addKeyListener(new KeyAdapter() {
      @Override
      public void keyReleased(KeyEvent e) {
        
        if(!p2.getText().isEmpty() && !q2.getText().isEmpty()) {
        double d = ( Double.parseDouble(p2.getText()) * Integer.parseInt(q2.getText()));        
        t2.setText(d+"");
        }
        
        
      }
    });
    q2.setColumns(10);
    q2.setBounds(816, 377, 95, 26);
    contentPane.add(q2);
    
    q3 = new JTextField();
    q3.setText("1");
    q3.addKeyListener(new KeyAdapter() {
      @Override
      public void keyReleased(KeyEvent e) {
        
        if(!p3.getText().isEmpty() && !q3.getText().isEmpty()) {
          double d = ( Double.parseDouble(p3.getText()) * Integer.parseInt(q3.getText()));        
          t3.setText(d+"");
          }
        
        
        
      }
    });
    q3.setColumns(10);
    q3.setBounds(816, 419, 95, 26);
    contentPane.add(q3);
    
    q4 = new JTextField();
    q4.setText("1");
    q4.addKeyListener(new KeyAdapter() {
      @Override
      public void keyReleased(KeyEvent e) {
      
        if(!p4.getText().isEmpty() && !q4.getText().isEmpty()) {
          double d = ( Double.parseDouble(p4.getText()) * Integer.parseInt(q4.getText()));        
          t4.setText(d+"");
          }
      
      
      
      
      }
      
      
    });
    q4.setColumns(10);
    q4.setBounds(816, 464, 95, 26);
    contentPane.add(q4);
    
    t1 = new JTextField();
    t1.addKeyListener(new KeyAdapter() {
      @Override
      public void keyReleased(KeyEvent e) {
      }
    });
    t1.setText("0");
    t1.setColumns(10);
    t1.setBounds(966, 335, 121, 26);
    contentPane.add(t1);
    
    t2 = new JTextField();
    t2.setText("0");
    t2.setColumns(10);
    t2.setBounds(966, 377, 121, 26);
    contentPane.add(t2);
    
    t3 = new JTextField();
    t3.setText("0");
    t3.setColumns(10);
    t3.setBounds(966, 419, 121, 26);
    contentPane.add(t3);
    
    t4 = new JTextField();
    t4.setText("0");
    t4.setColumns(10);
    t4.setBounds(966, 464, 121, 26);
    contentPane.add(t4);
    
    etctxt = new JTextField();
    etctxt.setColumns(10);
    etctxt.setBounds(816, 506, 95, 26);
    contentPane.add(etctxt);
    
    etctotal = new JTextField();
    etctotal.setText("0");
    etctotal.setColumns(10);
    etctotal.setBounds(966, 506, 121, 26);
    contentPane.add(etctotal);
    
    lblNewLabel_1_8 = new JLabel("Etc.,");
    lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_1_8.setForeground(Color.BLUE);
    lblNewLabel_1_8.setFont(new Font("Tahoma", Font.BOLD, 18));
    lblNewLabel_1_8.setBounds(736, 499, 71, 38);
    contentPane.add(lblNewLabel_1_8);
    
    lblNewLabel_1_9 = new JLabel("TOTAL");
    lblNewLabel_1_9.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_1_9.setForeground(Color.RED);
    lblNewLabel_1_9.setFont(new Font("Tahoma", Font.BOLD, 28));
    lblNewLabel_1_9.setBounds(684, 548, 121, 54);
    contentPane.add(lblNewLabel_1_9);
    
    total = new JTextField();
    total.setText("0.0");
    total.setForeground(Color.RED);
    total.setFont(new Font("Tahoma", Font.BOLD, 28));
    total.setColumns(10);
    total.setBounds(816, 548, 271, 54);
    contentPane.add(total);
    
    lblNewLabel_1_10 = new JLabel("Our Services");
    lblNewLabel_1_10.setFont(new Font("Tahoma", Font.BOLD, 18));
    lblNewLabel_1_10.setBounds(12, 520, 146, 38);
    contentPane.add(lblNewLabel_1_10);
    
    TextArea services = new TextArea();
    services.setBounds(12, 567, 517, 228);
    contentPane.add(services);
    
    txtFooter = new JTextField();
    txtFooter.setText("Footer\r\n");
    txtFooter.setColumns(10);
    txtFooter.setBounds(547, 646, 638, 26);
    contentPane.add(txtFooter);
    
    JButton printbtn = new JButton("PRINT");
    printbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        
        
        System.out.println(" =======================  Print Start ===============================");
       
        InvoiceBean i = getInvoiceBean();
        try {
          printInvoice(i);
        } catch (Exception e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        
        
        
        
        
        
        System.out.println(" =======================  Print End ===============================");
              
        
        
      }
    });
    printbtn.setForeground(new Color(0, 128, 0));
    printbtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 32));
    printbtn.setBounds(817, 688, 270, 72);
    contentPane.add(printbtn);
    
    JButton btnSum = new JButton("SUM");
    btnSum.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        
        
        
        double d = ( Double.parseDouble( t1.getText()) + Double.parseDouble(t2.getText()) + Double.parseDouble(t3.getText()) +Double.parseDouble(t4.getText()) + Double.parseDouble(etctotal.getText())  );        
        total.setText(d+"");
        
        
        
        
      }
    });
    btnSum.setForeground(new Color(165, 42, 42));
    btnSum.setFont(new Font("Tahoma", Font.BOLD, 22));
    btnSum.setBounds(1101, 489, 121, 47);
    contentPane.add(btnSum);
  }
  
  
  
  
  
  private InvoiceBean getInvoiceBean() {
    
    InvoiceBean i = new InvoiceBean();
    
    i.setInvTxt((invTxt.getText()));
    i.setTxtLine1(txtLine1.getText());
    i.setTxtCompanyName(txtCompanyName.getText());
    i.setDateTxt1(dateTxt1.getText());
    i.setTxtLine2(txtLine2.getText());
    i.setTxtPhno(txtPhno.getText());
    i.setTxtWebsite(txtWebsite.getText());
    i.setTxtCustname(txtCustname.getText());
    i.setTxtCustcompany(txtCustcompany.getText());
    i.setTxtCustline1(txtCustline1.getText());
    i.setTxtCustline2(txtCustline2.getText());
    i.setSno1((Integer.parseInt(sno1.getText())));
    i.setSno2((Integer.parseInt(sno2.getText())));
    i.setSno3((Integer.parseInt(sno3.getText())));
    i.setSno4((Integer.parseInt(sno4.getText())));
    i.setI1(i1.getText());
    i.setI2(i2.getText());
    i.setI3(i3.getText());
    i.setI4(i4.getText());
    i.setP1(Double.parseDouble(p1.getText()));
    i.setP2(Double.parseDouble(p2.getText()));
    i.setP3(Double.parseDouble(p3.getText()));
    i.setP4(Double.parseDouble(p4.getText()));
    i.setQ1((Integer.parseInt(q1.getText())));
    i.setQ2((Integer.parseInt(q2.getText())));
    i.setQ3((Integer.parseInt(q3.getText())));
    i.setQ4((Integer.parseInt(q4.getText())));
    i.setT1(Double.parseDouble(t1.getText()));
    i.setT2(Double.parseDouble(t2.getText()));
    i.setT3(Double.parseDouble(t3.getText()));
    i.setT4(Double.parseDouble(t4.getText()));
    i.setEtctxt(etctxt.getText());
    i.setEtctotal(Double.parseDouble(etctotal.getText()));
    i.setTotal((Double.parseDouble(total.getText())));
    i.setTxtFooter(txtFooter.getText());
    
    return i;
    
  }

  
  private void printInvoice(InvoiceBean i) throws Exception {

    try {
      InputStream inputStream = new FileInputStream("reports/InvoiceReport.jrxml");
      JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
      JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

      HashMap parameters = new HashMap();
      List<InvoiceBean> invList = new ArrayList<InvoiceBean>();
      invList.add(i);

      JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(invList);
      JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanColDataSource);
      JasperExportManager.exportReportToPdfFile(jasperPrint, "reports/inovice.pdf");
    } catch (JRException ex) {
      ex.printStackTrace();
    }
  }
  
}


