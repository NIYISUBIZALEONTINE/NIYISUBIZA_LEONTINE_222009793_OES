package myform;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class enrollmentform implements ActionListener {
	JFrame frame;
    JLabel id_lb = new JLabel("ID");
    JLabel user_lb = new JLabel("user");
    JLabel course_lb = new JLabel("course");
  
    JTextField id_txf = new JTextField();
    JTextField user_txf = new JTextField();
    JTextField course_txf = new JTextField();
   
    JButton insert_btn = new JButton("Insert");
    JButton read_btn = new JButton("Read");
    JButton update_btn = new JButton("Update");
    JButton delete_btn = new JButton("Delete");
    
    Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    int w = (int) screensize.getWidth();
    int h = (int) screensize.getHeight();

    public  enrollmentform() {
        createForm();
    }
    private void createForm() {
        frame = new JFrame();
        frame.setTitle("ENROLLMENT FORM");
        frame.setBounds(350, 100, 600, 425);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        setLocationAndSize();
    }
    private void setLocationAndSize() {
        id_lb.setBounds(10, 10, 160, 30);
        user_lb.setBounds(10, 50, 160, 30);
        course_lb.setBounds(10, 90, 160, 30);
       
        id_txf.setBounds(200, 10, 180, 30);
        user_txf.setBounds(200, 50, 180, 30);
        course_txf.setBounds(200, 90, 180, 30);
      
        insert_btn.setBounds(10, 350, 85, 30);
        read_btn.setBounds(100, 350, 85, 30);
        update_btn.setBounds(190, 350, 85, 30);
        delete_btn.setBounds(280, 350, 85, 30);

        setFontForAll();
        addComponentsForFrame();
    }
    private void setFontForAll() {
        Font font = new Font("Georgia", Font.BOLD, 17);
        Font fonti = new Font("Georgia", Font.ITALIC, 12);

        id_lb.setFont(font);
        user_lb.setFont(font);
        course_lb.setFont(font);
     
        id_txf.setFont(font);
        user_txf.setFont(font);
        course_txf.setFont(font);
      
        insert_btn.setFont(fonti);
        read_btn.setFont(fonti);
        update_btn.setFont(fonti);
        delete_btn.setFont(fonti);
    }

    private void addComponentsForFrame() {
        frame.add(id_lb);
        frame.add(user_lb);
        frame.add(course_lb);       
       
        frame.add(id_txf);
        frame.add(user_txf);
        frame.add(course_txf);     
      
        frame.add(insert_btn);
        frame.add(read_btn);
        frame.add(update_btn);
        frame.add(delete_btn);

   
    insert_btn.addActionListener(this);
    insert_btn.addActionListener(new ActionListener() {
    		
    		public void actionPerformed(java.awt.event.ActionEvent e) {
    			try {
    				Class.forName("com.mysql.cj.jdbc.Driver");	
    				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_examination","root","");
    				String query=("INSERT INTO enrollment values(?,?,?)");
    				PreparedStatement pStatement=connection.prepareStatement(query);
    				pStatement.setInt(1,Integer.parseInt(id_txf.getText()));
    				pStatement.setString(2, user_txf.getText());
    				pStatement.setString(3, course_txf.getText());	
    				pStatement.executeUpdate();
    				JOptionPane.showMessageDialog(insert_btn, "data inserted well");
    				pStatement.close();
    				connection.close();	
    			} catch (Exception e2) {
    				System.out.println(e2.getMessage());
    			}
    			
    		}
    	});	
    	
        
        read_btn.addActionListener(this);
        update_btn.addActionListener(this);
        update_btn.addActionListener(new ActionListener() {

        	public void actionPerformed(java.awt.event.ActionEvent e) {
        			try {
        				Class.forName("com.mysql.cj.jdbc.Driver");	
        				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_examination","root","");
        				String sql="UPDATE enrollment SET  user=?,course=?,WHERE id=?";
        				PreparedStatement stm=connection.prepareStatement(sql);
        				stm.setString(1, user_txf.getText());
        				stm.setString(2,course_txf.getText());
        				stm.setInt(3,Integer.parseInt(id_txf.getText()));
        				stm.executeUpdate();
        				JOptionPane.showMessageDialog(update_btn, "update data!");
        				stm.close();
        				connection.close();	
        			} catch (Exception e2) {
        				System.out.println(e2.getMessage());
        			}
        			
        		}
        				});
        
        delete_btn.addActionListener(this);
    delete_btn.addActionListener(new ActionListener() {
        	
        	
        	public void actionPerformed(java.awt.event.ActionEvent e) {
        		try {
        			Class.forName("com.mysql.cj.jdbc.Driver");	
        			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_examination","root","");
        			String sql="DELETE FROM enrollment  WHERE id=?";
        			int brtxf=Integer.parseInt(JOptionPane.showInputDialog("Enter id to delete:"));
        			
        			
        			PreparedStatement stm=connection.prepareStatement(sql);
        			
        			
        			
        			
        			stm.setInt(1,brtxf);
        			
        			JOptionPane.showMessageDialog(delete_btn, "recorded out!!!!!!!!!");
        			//Component delete;
        			stm.executeUpdate();
        			stm.close();
        			
        			connection.close();	
        		} catch (Exception e2) {
        			System.out.println(e2.getMessage());
        		}
        		
        	}
        });
    }
       
            
       
    public void actionPerformed(ActionEvent e) {
       
            
        }
    

    public static void main(String[] args) {
        new enrollmentform();
    }
}



	