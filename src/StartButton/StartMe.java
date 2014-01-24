package StartButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ScrollPaneConstants;

public class StartMe extends JDialog implements Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	private static JTextField searchText;
	private static JLabel searchIcon;
	private static JToggleButton toggleButton;
	private static JLabel timeLabel;
	public static boolean exist=false;

	/**
	 * Create the frame.
	 */
	
	public static void main(String[] args) {
		try {
			StartMe frame = new StartMe();
			frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public StartMe() {
		
//		Graphics g = ;
//		g.drawString("Hello", 10,10);
		
		exist = true;
		setIconImage(Toolkit.getDefaultToolkit().getImage(StartMe.class.getResource("/Images/bin-full.png")));
		setTitle("My Start Button");		
		
		Thread t1 = new Thread(this);
		t1.start();
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception EE) {
			JOptionPane.showMessageDialog(this, new String(EE.toString()));
		}
		
		setMinimumSize(new Dimension(100, 500));
		addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				System.gc();
				dispose();
			}
			@Override
			public void focusGained(FocusEvent arg0) {
			}
		});
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setFocusable(false);
		mainPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
		);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBorder(null);
		GroupLayout gl_mainPanel = new GroupLayout(mainPanel);
		gl_mainPanel.setHorizontalGroup(
			gl_mainPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
		);
		gl_mainPanel.setVerticalGroup(
			gl_mainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
		);
		
		JTextPane txtpnEcstasyInside = new JTextPane();
		txtpnEcstasyInside.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		txtpnEcstasyInside.setText("Ecstasy Inside\nChandra Prakash\nTOSHIBA - L750, X5317");
		txtpnEcstasyInside.setEditable(false);
		
		timeLabel = new JLabel(" ");
		timeLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					Runtime.getRuntime().exec("shutdown /s");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					
				}
			}
		});
		label_1.setIcon(new ImageIcon(StartMe.class.getResource("/Images/logout2.png")));
		
		JLabel label_2 = new JLabel(" ");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Runtime.getRuntime().exec("shutdown /l");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					
				}
			}
		});
		label_2.setIcon(new ImageIcon(StartMe.class.getResource("/Images/logoff1.png")));
		
		JLabel lblR = new JLabel("R");
		lblR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Runtime.getRuntime().exec("shutdown /r");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					
				}
			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnEcstasyInside, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblR, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_1))
						.addComponent(timeLabel, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtpnEcstasyInside, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
								.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblR, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addComponent(label_2)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(timeLabel)))
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		final JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		
		JPanel appsPanel = new JPanel();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(null);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		
		JLabel lblRecentApps = new JLabel("Recent Apps");
		lblRecentApps.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		GroupLayout gl_appsPanel = new GroupLayout(appsPanel);
		gl_appsPanel.setHorizontalGroup(
			gl_appsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_appsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblRecentApps)
					.addContainerGap(340, Short.MAX_VALUE))
		);
		gl_appsPanel.setVerticalGroup(
			gl_appsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_appsPanel.createSequentialGroup()
					.addComponent(lblRecentApps)
					.addContainerGap(216, Short.MAX_VALUE))
		);
		appsPanel.setLayout(gl_appsPanel);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(appsPanel, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(10)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(appsPanel, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		scrollPane_1.setViewportView(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setToolTipText("6.7114096 % Free.");
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(94);
		progressBar.setStringPainted(true);
		progressBar.setBorderPainted(false);
		progressBar.setBorder(null);
		
		JLabel label = new JLabel("");
		
		JLabel label_3 = new JLabel("Total: <dynamic> GB.");
		label_3.setFont(new Font("Segoe UI Light", Font.BOLD, 11));
		
		JLabel label_4 = new JLabel("Free: <dynamic> GB.");
		label_4.setFont(new Font("Segoe UI Light", Font.BOLD, 11));
		
		JLabel label_5 = new JLabel("E:\\  --  Legacy");
		label_5.setFont(new Font("Segoe UI Light", Font.BOLD, 11));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(progressBar, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel_4.createSequentialGroup()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(label_4, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(label_3, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(label_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(107))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(label_5)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_4)
							.addGap(8))
						.addComponent(label))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(15, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setToolTipText("16.803278 % Free.");
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(84);
		progressBar_1.setStringPainted(true);
		
		JLabel label_7 = new JLabel("F:\\  --  Leisure");
		label_7.setFont(new Font("Segoe UI Light", Font.BOLD, 11));
		
		JLabel label_8 = new JLabel("Total: <dynamic> GB.");
		label_8.setFont(new Font("Segoe UI Light", Font.BOLD, 11));
		
		JLabel label_9 = new JLabel("Free: <dynamic> GB.");
		label_9.setFont(new Font("Segoe UI Light", Font.BOLD, 11));
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(progressBar_1, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(label_9, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(label_8, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(label_7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(120))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(progressBar_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(203, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		panel_1.setLayout(gl_panel_1);
		
		searchIcon = new JLabel("");
		searchIcon.setIcon(new ImageIcon(StartMe.class.getResource("/Images/Search2.png")));
		
		searchText = new JTextField();
		searchText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				int flag=0;
				if ((searchText.getCaretPosition() == 0)) {
					searchText.setText("");
					flag=1;
				}
				
				if (searchText.getText().isEmpty() && flag==0) {
					
					searchText.setText("Search");
					searchText.setCaretPosition(0);
				}
			}
		});
		searchText.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		searchText.setBorder(null);
		searchText.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
					if (searchText.isFocusable()) {
						System.gc();
						dispose();
					}
			}
		});
		searchText.setColumns(10);
		searchText.setText("Search");
		searchText.setCaretPosition(0);
				
		toggleButton = new JToggleButton("");
		toggleButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// Generate Pop Up Menu
				
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
//				toggleButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				toggleButton.setBorder(new LineBorder(Color.GRAY));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				toggleButton.setBorder(new LineBorder(new Color(255, 255, 255)));
			}
		});
		toggleButton.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				searchText.setFocusable(false);
			}
		});
		toggleButton.setContentAreaFilled(false);
		toggleButton.setForeground(Color.WHITE);
		toggleButton.setIcon(new ImageIcon(StartMe.class.getResource("/Images/settingsIcon.png")));
		toggleButton.setBorder(new LineBorder(new Color(255, 255, 255)));
//		toggleButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE));
		toggleButton.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(21)
					.addComponent(searchIcon)
					.addGap(18)
					.addComponent(searchText, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(toggleButton)
					.addContainerGap(34, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(searchText, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
								.addComponent(searchIcon, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(20)
							.addComponent(toggleButton)))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		mainPanel.setLayout(gl_mainPanel);
		contentPane.setLayout(gl_contentPane);
		setUndecorated(true);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(0, (int) (screenSize.getHeight()-this.getHeight())-40);//40 for taskbar
		
		File[] f = File.listRoots();
		
		//  E Drive
		int eTot = (int) (f[2].getTotalSpace()/(1024*1024*1024));
		int eFre = (int) (f[2].getFreeSpace()/(1024*1024*1024));
		if (100-progressBar.getValue() < 15) {
			progressBar.setForeground(Color.RED);
		}
		
		
		// F Drive
		int fTot = (int) (f[3].getTotalSpace()/(1024*1024*1024));
		int fFre = (int) (f[3].getFreeSpace()/(1024*1024*1024));
		if (progressBar_1.getValue() < 15) {
			progressBar_1.setForeground(Color.RED);
		}
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String now;
		try {
			Thread.sleep(2000);
			while (true) {
				now = (new Date()).toString();
				StartMe.timeLabel.setText(now);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void disposeMe() {
		if (exist == true) {
			dispose();
		}
	}
}