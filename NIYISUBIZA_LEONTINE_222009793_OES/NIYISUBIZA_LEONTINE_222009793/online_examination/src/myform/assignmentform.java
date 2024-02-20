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

public class assignmentform implements ActionListener {
	JFrame frame;
    JLabel id_lb = new JLabel("ID");
    JLabel name_lb = new JLabel("name");
    JLabel course_lb = new JLabel("course");
    JLabel title_lb = new JLabel("title");
    JLabel deadline_lb = new JLabel("deadline");
    JLabel maximum_score_lb = new JLabel("maximum_score");

    JTextField id_txf = new JTextField();
    JTextField name_txf = new JTextField();
    JTextField course_txf = new JTextField();
    JTextField title_txf = new JTextField();
    JTextField deadline_txf = new JTextField();
    JTextField maximum_score_texField =new JTextField();
    

    JButton insert_btn = new JButton("Insert");
    JButton read_btn = new JButton("Read");
    JButton update_btn = new JButton("Update");
    JButton delete_btn = new JButton("Delete");
    
    

    Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    int w = (int) screensize.getWidth();
    int h = (int) screensize.getHeight();

    public  assignmentform() {
        createForm();
    }

    
    
    
    private void createForm() {
        frame = new JFrame();
        frame.setTitle("ASSIGNMENT FORM");
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
        name_lb.setBounds(10, 50, 160, 30);
        course_lb.setBounds(10, 90, 160, 30);
        title_lb.setBounds(10, 130, 160, 30);
        deadline_lb.setBounds(10, 170, 160, 30);
        maximum_score_lb.setBounds(10, 210, 160, 30);
        
        
        

        id_txf.setBounds(200, 10, 180, 30);
        name_txf.setBounds(200, 50, 180, 30);
        course_txf.setBounds(200, 90, 180, 30);
        title_txf.setBounds(200, 130, 180, 30);
        deadline_txf.setBounds(200, 170, 180, 30);
        maximum_score_texField.setBounds(200, 210, 180, 30);

        
        
        
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
        name_lb.setFont(font);
        course_lb.setFont(font);
        
        title_lb.setFont(font);
        deadline_lb.setFont(font);
       maximum_score_lb.setFont(font);
        
        

        id_txf.setFont(font);
        name_txf.setFont(font);
        course_txf.setFont(font);
        title_txf.setFont(font);
        deadline_txf.setFont(font);
        maximum_score_texField.setFont(font);
        
        

        insert_btn.setFont(fonti);
        read_btn.setFont(fonti);
        update_btn.setFont(fonti);
        delete_btn.setFont(fonti);
    }

    private void addComponentsForFrame() {
        frame.add(id_lb);
        frame.add(name_lb);
        frame.add(course_lb);       
        frame.add(title_lb);
        frame.add(deadline_lb);       
        frame.add(maximum_score_lb);
        

        frame.add(id_txf);
        frame.add(name_txf);
        frame.add(course_txf);     
        frame.add(title_txf);
        frame.add(deadline_txf);      
        frame.add(maximum_score_texField);
        
        

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
    				String query=("INSERT INTO assignment values(?,?,?,?,?,?)");
    				PreparedStatement pStatement=connection.prepareStatement(query);
    				pStatement.setInt(1,Integer.parseInt(id_txf.getText()));
    				pStatement.setString(2, name_txf.getText());
    				pStatement.setString(3, course_txf.getText());
    				pStatement.setString(4, title_txf.getText());
    				pStatement.setString(5, deadline_txf.getText());
    				pStatement.setString(6, maximum_score_texField.getText());
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
        				String sql="UPDATE assignment SET name=?,score=?,title=?, maximum_score=? deadline=? ,WHERE id=?";
        				PreparedStatement stm=connection.prepareStatement(sql);
        				stm.setString(1, name_txf.getText());
        				stm.setString(2, course_txf.getText());
        				stm.setString(3, title_txf.getText());
        				stm.setString(4, deadline_txf.getText());
        				stm.setString(5, maximum_score_texField.getText());
        				stm.setInt(6,Integer.parseInt(id_txf.getText()));
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
        			String sql="DELETE FROM assignment  WHERE id=?";
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
        new assignmentform();
    }
}



	