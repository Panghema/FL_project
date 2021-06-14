package fl.ui;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;

import fl.FaultLocation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class mainUI {
	
	/** 参数列表 */
	
	//传出的列表
	int mode = 0;//选择的模式
	int strategy = 0;//怀疑度策略
	int m = 0;//模糊度
	int bmax = 0;//最大迭代次数
	int numOfCluster = 0;//错误个数
	String results = "";
	int numOfResult = 0;
	//返回的列表
    static List<List<Integer>> linesList = new ArrayList<>();
    static List<List<Double>> susesList = new ArrayList<>();
    
    Font titlefont = new Font("宋体",Font.BOLD,20);
    Font subtitlefont = new Font("宋体",Font.BOLD,14);
    Font contentfont = new Font("宋体",Font.BOLD,18);
    
    
	//创建主窗口
	JFrame main = new JFrame("FaultLocation");
	
	/** 主体窗口组件 */
	
	//创建菜单条组件
	MenuBar menubar = new MenuBar();
	//创建文件菜单组件
	Menu fileMenu = new Menu("文件");
	//创建设置菜单组件
	Menu setMenu = new Menu("设置");
	//创建启动菜单组件
	Menu startMenu = new Menu("启动");
	//创建新建菜单项
    MenuItem newItem = new MenuItem("新建");//归文件
    MenuItem startItem = new MenuItem("运行");//归启动
    class startItemListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(mode==1) {
				
			}
			if(mode==2) {
				m = Integer.parseInt(m1.getText());
				bmax = Integer.parseInt(bmax1.getText());
			}
			if(mode==3) {
				m = Integer.parseInt(m2.getText());
				bmax = Integer.parseInt(bmax2.getText());
			}
			System.out.println("**CONFIG// mode:" +mode + " strategy:"+strategy+" m:"+m+" bmax:"+bmax+" numOfCluster:"+numOfCluster);
			//调用函数
			FaultLocation fl = new FaultLocation(mode,numOfCluster,bmax,m,strategy);
			try {
				fl.exec();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			linesList = fl.getLines();
			susesList = fl.getSuses();
			numOfResult = linesList.size();
			results = ListToString(linesList);
			res.setText(results);
			
		}
    }
    
    //创建多窗口组件
    JTabbedPane jt = new JTabbedPane();
    
    //创建左边部分Panel
    JPanel config = new JPanel();
    //创建右边部分Panel
    JPanel result = new JPanel();
    
    //创建SBFL部分Panel
    JPanel SBFL = new JPanel();
    //创建singleFCMFL部分Panel
    JPanel sFCMFL = new JPanel();
    //创建multiFCMFL部分Panel
    JPanel mFCMFL = new JPanel();
    
    //创建结果文本窗口
    JTextArea res = new JTextArea(17,50);
    //创建滚动窗口
    JScrollPane showRes = new JScrollPane();
    //创建结果边框格式
	Border lb = BorderFactory.createLineBorder(Color.black, 1);
	TitledBorder sustb = new TitledBorder(lb,"选择怀疑公式",TitledBorder.LEFT,TitledBorder.TOP,titlefont);
	TitledBorder configtb = new TitledBorder(lb,"设置参数",TitledBorder.LEFT,TitledBorder.TOP,titlefont);
	TitledBorder restb = new TitledBorder(lb,"运行结果",TitledBorder.LEFT,TitledBorder.TOP,titlefont);
    
    /** SBFL窗口组件 */
	
	//创建整个窗口的JPanel
	JPanel sbWindow = new JPanel();
    
    //创建怀疑度内容Panel
    JPanel susSB = new JPanel();
    
    //创建怀疑度按钮组
    ButtonGroup sus_sb = new ButtonGroup();
    //创建怀疑度按钮
	JRadioButton Wong1_sb = new JRadioButton("Wong1               ",true);
	JRadioButton Naish1_sb = new JRadioButton("Naish1              ",false);
	JRadioButton Ochiai_sb = new JRadioButton("Ochiai              ",false);
	JRadioButton Tarantula_sb = new JRadioButton("Tarantula           ",false);
	
	class strategy1Listener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(Wong1_sb.isSelected()) {
				strategy = 1;
			}
			if(Naish1_sb.isSelected()) {
				strategy = 2;
			}
			if(Ochiai_sb.isSelected()) {
				strategy = 3;
			}
			if(Tarantula_sb.isSelected()) {
				strategy = 4;
			}
			mode = 1;
		}
	}
	
	/** singleFCM窗口组件 */
	
	//创建整个窗口的JPanel
	JPanel sfWindow = new JPanel();
	
	//创建怀疑度内容Panel
	JPanel susSF = new JPanel();
	
	//创建参数内容Panel
	JPanel configSF = new JPanel();
	
	//创建参数三个具体Panel
	JPanel c1Panel = new JPanel();
	JPanel m1Panel = new JPanel();
	JPanel bmax1Panel = new JPanel();
	
	
    //创建怀疑度按钮组
    ButtonGroup sus_sf = new ButtonGroup();
    //创建怀疑度按钮
	JRadioButton Wong1_sf = new JRadioButton("Wong1               ",true);
	JRadioButton Naish1_sf = new JRadioButton("Naish1              ",false);
	JRadioButton Ochiai_sf = new JRadioButton("Ochiai              ",false);
	JRadioButton Tarantula_sf = new JRadioButton("Tarantula           ",false);
	
	class strategy2Listener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(Wong1_sf.isSelected()) {
				strategy = 1;
			}
			if(Naish1_sf.isSelected()) {
				strategy = 2;
			}
			if(Ochiai_sf.isSelected()) {
				strategy = 3;
			}
			if(Tarantula_sf.isSelected()) {
				strategy = 4;
			}
			mode = 2;
		}
	}
	//创建参数c1的Label
	JLabel c1Label = new JLabel("错误数量:");
	//创建参数c1的Combobox
	JComboBox c1 = new JComboBox();
	class c1Listener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			numOfCluster = (int) e.getItem();
			mode = 2;
		}
	}
	//创建参数m1的Label
	JLabel m1Label = new JLabel("模糊因子:");
	//创建参数m1的Text
	JTextField m1 = new JTextField(5);
	//创建参数bmax1的Label
	JLabel bmax1Label = new JLabel("迭代次数:");
	//创建参数bmax1的text
	JTextField bmax1 = new JTextField(5);
	
	/** multiFCMFL的窗口组件 */
	
	//创建整个窗口的JPanel
	JPanel mfWindow = new JPanel();
	
	//创建怀疑度内容Panel
	JPanel configMF = new JPanel();
	
	//创建参数三个具体Panel
	JPanel c2Panel = new JPanel();
	JPanel m2Panel = new JPanel();
	JPanel bmax2Panel = new JPanel();
	
	//创建参数c2的Label
	JLabel c2Label = new JLabel("错误数量:");
	//创建参数c2的Combobox
	JComboBox c2 = new JComboBox();
	class c2Listener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			numOfCluster = (int) e.getItem();
			mode = 3;
		}
	}
	//创建参数m2的Label
	JLabel m2Label = new JLabel("模糊因子:");
	//创建参数m2的Text
	JTextField m2 = new JTextField(5);
	//创建参数bmax2的Label
	JLabel bmax2Label = new JLabel("迭代次数:");
	//创建参数bmax2的text
	JTextField bmax2 = new JTextField(5);
	
    
	public void init() {
		res.enable(false);
		/** SBFL框架 */
		
		//怀疑度选项组合
		susSB.setLayout(new GridLayout(4,1,0,0));
		
		Wong1_sb.setLayout(new FlowLayout(FlowLayout.LEFT));
		Naish1_sb.setLayout(new FlowLayout(FlowLayout.LEFT));
		Ochiai_sb.setLayout(new FlowLayout(FlowLayout.LEFT));
		Tarantula_sb.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		Wong1_sb.addItemListener(new strategy1Listener());
		Naish1_sb.addItemListener(new strategy1Listener());
		Ochiai_sb.addItemListener(new strategy1Listener());
		Tarantula_sb.addItemListener(new strategy1Listener());
		
		sus_sb.add(Wong1_sb);
		sus_sb.add(Naish1_sb);
		sus_sb.add(Ochiai_sb);
		sus_sb.add(Tarantula_sb);
		
		susSB.add(Wong1_sb);
		susSB.add(Naish1_sb);
		susSB.add(Ochiai_sb);
		susSB.add(Tarantula_sb);

		susSB.setBorder(sustb);
		sbWindow.add(susSB,BorderLayout.NORTH);
		/** SFCMFL框架 */
		
		//怀疑度选项组合
		susSF.setLayout(new GridLayout(4,1,0,0));
		
		Wong1_sf.setLayout(new FlowLayout(FlowLayout.LEFT));
		Naish1_sf.setLayout(new FlowLayout(FlowLayout.LEFT));
		Ochiai_sf.setLayout(new FlowLayout(FlowLayout.LEFT));
		Tarantula_sf.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		Wong1_sf.addItemListener(new strategy2Listener());
		Naish1_sf.addItemListener(new strategy2Listener());
		Ochiai_sf.addItemListener(new strategy2Listener());
		Tarantula_sf.addItemListener(new strategy2Listener());
		
		sus_sf.add(Wong1_sf);
		sus_sf.add(Naish1_sf);
		sus_sf.add(Ochiai_sf);
		sus_sf.add(Tarantula_sf);
		
		susSF.add(Wong1_sf);
		susSF.add(Naish1_sf);
		susSF.add(Ochiai_sf);
		susSF.add(Tarantula_sf);
		
		susSF.setBorder(sustb);
		
		//参数的组合
		c1.addItemListener(new c1Listener());
		
		c1.addItem(2);
		c1.addItem(3);
		c1.addItem(4);
		c1.addItem(5);
		
		c1Panel.add(c1Label,BorderLayout.WEST);
		c1Panel.add(c1);
		m1Panel.add(m1Label,BorderLayout.WEST);
		m1Panel.add(m1);
		bmax1Panel.add(bmax1Label,BorderLayout.WEST);
		bmax1Panel.add(bmax1);
		
		configSF.setLayout(new GridLayout(3,1,0,0));
		c1Panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		m1Panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		bmax1Panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		configSF.add(c1Panel);
		configSF.add(m1Panel);
		configSF.add(bmax1Panel);
		
		configSF.setBorder(configtb);
		c2Panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		m2Panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		bmax2Panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		sfWindow.setLayout(new GridLayout(2,1,0,0));
		sfWindow.add(susSF);
		sfWindow.add(configSF);
		
		/** multiFCMFL的框架 */
		
		//参数的组合
		c2.addItemListener(new c2Listener());
		
		c2.addItem(2);
		c2.addItem(3);
		c2.addItem(4);
		c2.addItem(5);
		
		c2Panel.add(c2Label,BorderLayout.WEST);
		c2Panel.add(c2);
		m2Panel.add(m2Label,BorderLayout.WEST);
		m2Panel.add(m2);
		bmax2Panel.add(bmax2Label,BorderLayout.WEST);
		bmax2Panel.add(bmax2);
		
		configMF.setLayout(new GridLayout(3,1,0,0));
		configMF.add(c2Panel);
		configMF.add(m2Panel);
		configMF.add(bmax2Panel);
		
		configMF.setBorder(configtb);
		
		mfWindow.add(configMF,BorderLayout.NORTH);
		
		/** 主体框架 */

		//菜单初始化
		startItem.addActionListener(new startItemListener());
		
	    fileMenu.add(newItem);
	    startMenu.add(startItem);
	    menubar.add(fileMenu);
	    menubar.add(startMenu);
	    menubar.add(setMenu);
	    
	    //配置组件初始化
	    jt.addTab("频谱", sbWindow);
	    jt.addTab("单怀疑度FCM", sfWindow);
	    jt.addTab("复合怀疑度FCM", mfWindow);
	    
	    config.setLayout(new GridLayout(1,1,0,0));
	    config.add(jt);
	    
	    //结果显示组件初始化
	    res.setCaretColor(Color.black);
	    res.setSize(new Dimension(594,170));
	    showRes.setViewportView(res);
		
		result.add(showRes);
		//结果窗 边框设置
		result.setBorder(restb);
		
		//字体大设置！
		Wong1_sb.setFont(contentfont);
		Naish1_sb.setFont(contentfont);
		Ochiai_sb.setFont(contentfont);
		Tarantula_sb.setFont(contentfont);
		
		Wong1_sf.setFont(contentfont);
		Naish1_sf.setFont(contentfont);
		Ochiai_sf.setFont(contentfont);
		Tarantula_sf.setFont(contentfont);
		
		c1Label.setFont(contentfont);
		c1.setFont(contentfont);
		m1Label.setFont(contentfont);
		m1.setFont(contentfont);
		bmax1Label.setFont(contentfont);
		bmax1.setFont(contentfont);
		
		c2Label.setFont(contentfont);
		c2.setFont(contentfont);
		m2Label.setFont(contentfont);
		m2.setFont(contentfont);
		bmax2Label.setFont(contentfont);
		bmax2.setFont(contentfont);
		
		fileMenu.setFont(subtitlefont);
		setMenu.setFont(subtitlefont);
		startMenu.setFont(subtitlefont);
		newItem.setFont(subtitlefont);
		startItem.setFont(subtitlefont);
		
		res.setFont(contentfont);
		jt.setFont(subtitlefont);
		
		//添加模块进主窗口
		main.setMenuBar(menubar);
		//main.setLayout(new GridLayout(1,2,0,0));
		main.add(config,BorderLayout.WEST);
		main.add(result);
		main.setSize(800,500);
		//main.pack();
		main.setVisible(true);
	}
	
    public String ListToString(List<List<Integer>> lines) {
    	int num = lines.size();
    	String s = "";
    	for(int i=0;i<lines.get(0).size();i++) {
    		s+="   ";
    		for(int j=0;j<num;j++) {
    			//s=s+"第"+String.valueOf(lines.get(j).get(i))+"行"+"  ";
    			s=s+"第";
    			if(lines.get(j).get(i)>=1 && lines.get(j).get(i)<10) {
    				s=s+"  "+String.valueOf(lines.get(j).get(i));
    			}
    			if(lines.get(j).get(i)>=10 && lines.get(j).get(i)<100) {
    				s=s+" "+String.valueOf(lines.get(j).get(i));
    			}
    			if(lines.get(j).get(i)>=100 && lines.get(j).get(i)<1000) {
    				s=s+""+String.valueOf(lines.get(j).get(i));
    			}
    			s=s+"行"+"  ";
    		}
    		s+=" \n";
    	}
    	return s;
    }
}
