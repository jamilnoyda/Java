import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class BorderLayoutExample implements ActionListener{
		
		public static JFrame jf;
		public static JPanel panel1 ;
		public static  JPanel panel2,panel3,panel4,panel5;
		public static  int top=1, bottom=1, right=1, left=1, center=1;
		
		public static void main(String [] agrs){
		//setting jframe properties
		jf=new JFrame();
		jf.setTitle("BorderLayout Example");
		Dimension d=new Dimension(1080,720);
		jf.setSize(d);
		Container con = jf.getContentPane();
		con.setLayout(new BorderLayout(5, 5));
		
		 panel1=new JPanel();	
		 panel2=new JPanel();
		panel3=new JPanel();
		panel4=new JPanel();
		panel5=new JPanel();
		
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel1.setPreferredSize(new Dimension(200, 200));
		panel2.setBorder(BorderFactory.createLineBorder(Color.black));
		panel2.setPreferredSize(new Dimension(200, 200));
		panel3.setBorder(BorderFactory.createLineBorder(Color.black));
		panel3.setPreferredSize(new Dimension(200, 200));
		panel4.setBorder(BorderFactory.createLineBorder(Color.black));
		panel4.setPreferredSize(new Dimension(200, 200));
		panel5.setBorder(BorderFactory.createLineBorder(Color.black));
		panel5.setPreferredSize(new Dimension(200, 200));
	
		
		
		//buttons
		JButton btn1=new JButton("button1");
		btn1.setName("btn1");
		btn1.setBounds(0,350,100,50);
		btn1.addActionListener(new BorderLayoutExample());
		panel3.add(btn1);
		
		JButton btn2=new JButton("button2");
		
		btn2.setName("btn2");
		btn2.setBounds(0,350,100,50);
		btn2.addActionListener(new BorderLayoutExample());
		
		panel3.add(btn2);
		
		JButton btn3=new JButton("button3");
		btn3.setName("btn3");
		
		btn3.setBounds(0,350,100,50);
		btn3.addActionListener(new BorderLayoutExample());
		panel3.add(btn3);
		
		JButton btn4=new JButton("button4");
		btn4.setBounds(0,350,100,50);
		btn4.addActionListener(new BorderLayoutExample());
		
		btn4.setName("btn4");
		panel3.add(btn4);
		
		
		JButton btn5=new JButton("button5");
		btn5.setBounds(0,350,100,50);
		btn5.addActionListener(new BorderLayoutExample());
		
		btn5.setName("btn5");
		panel3.add(btn5);
		
		
		
		
		//checkboxes
		JCheckBox chk1=new JCheckBox("chK1");
		chk1.setName("chk1");
		chk1.setBounds(10, 10, 20, 20);
		chk1.addActionListener(new BorderLayoutExample());
		panel2.add(chk1);
	
		JCheckBox chk2=new JCheckBox("chK2");
		chk2.setName("chk2");
		chk2.setBounds(10, 10, 20, 20);
		chk2.addActionListener(new BorderLayoutExample());
		panel3.add(chk2);
	
		
		
		JCheckBox chk3=new JCheckBox("chk3");
		chk3.setName("chk3");
		chk3.setBounds(10, 10, 20, 20);
		chk3.addActionListener(new BorderLayoutExample());
		panel4.add(chk3);
	
		
		JCheckBox chk4=new JCheckBox("chk4");
		chk4.setName("chk4");
		chk4.setBounds(10, 10, 20, 20);
		chk4.addActionListener(new BorderLayoutExample());
		panel5.add(chk4);
	
		JCheckBox chk5=new JCheckBox("chk5");
		chk5.setName("chk5");
		chk5.setBounds(10, 10, 20, 20);
		chk5.addActionListener(new BorderLayoutExample());
		panel1.add(chk5);
		con.add(panel1,BorderLayout.EAST);
		con.add(panel2,BorderLayout.SOUTH);
		con.add(panel3,BorderLayout.WEST);
		con.add(panel4,BorderLayout.NORTH);
		con.add(panel5,BorderLayout.CENTER);
		jf.setVisible(true);
		
	}
	
	
	
	
	public void  actionPerformed(ActionEvent al){
		JComponent comp = (JComponent)al.getSource();
		
		if(al.getSource() instanceof JButton)
		{
			JButton b = (JButton)al.getSource();
			System.out.println (b.getText());
			Color selectedColor = Color.GREEN;
			
			
			if(b.getText().equals("button1")){
				selectedColor = Color.YELLOW;
				System.out.println ("hello");
				}
			else if(b.getText().equals("button2"))
				selectedColor = Color.BLUE;
			else if(b.getText().equals("button3"))
				selectedColor = Color.GREEN;
			else if(b.getText().equals("button4"))
				selectedColor = Color.ORANGE;
			else if(b.getText().equals("button5"))
				selectedColor = Color.PINK;
			
			
			if(top == 1)
			 	panel1.setBackground(selectedColor);
			
			if(left == 1)
			 	panel2.setBackground(selectedColor);
			
			if(center == 1)
			 	panel3.setBackground(selectedColor);
			
			if(right == 1)
			 	panel4.setBackground(selectedColor);
			
			if(bottom == 1)
			 	panel5.setBackground(selectedColor);
		
		}
		
		
		
		else if(al.getSource() instanceof JCheckBox)
		{
			JCheckBox chk = (JCheckBox)al.getSource();
		    System.out.println (chk.getName());        	
			if(chk.getName().equals("chk1"))
			{
				if(chk.isSelected())
					top = 1;
				else
					top = 0;
					panel1.setBackground(jf.getBackground());
			}
			
			else if(chk.getName().equals("chk2"))
			{
				if(chk.isSelected())
					left = 1;
				else
					left = 0;
					panel2.setBackground(jf.getBackground());
			}
			
			else if(chk.getName().equals("chk3"))
			{
				if(chk.isSelected())
					center = 1;
				else
					center = 0;
					panel3.setBackground(jf.getBackground());
			}
			
			else if(chk.getName().equals("chk4"))
			{
				if(chk.isSelected())
					right = 1;
				else
					right = 0;
					panel4.setBackground(jf.getBackground());
			}
			
			else if(chk.getName().equals("chk5"))
			{
				if(chk.isSelected())
					bottom = 1;
				else
					bottom = 0;
					panel5.setBackground(jf.getBackground());
			}
		}
		
	}
	
	
}
