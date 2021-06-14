package fl.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import fl.FaultLocation;

public class mainUI_old{
	//需要传出的参数
	int mode = 0;//选择的模式
	int strategy = 0;//怀疑度策略
	int m = 0;//模糊度
	int bmax = 0;//最大迭代次数
	int numOfCluster = 0;//错误个数
	String result = "";
	int numOfResult = 0;
	//返回的列表
    static List<List<Integer>> linesList = new ArrayList<>();
    static List<List<Double>> susesList = new ArrayList<>();
    
	//创建窗口对象
	JFrame jf = new JFrame("FaultLocation");
	
//	//存放读入文件按钮的Panel
//	JPanel readFile = new JPanel();
//	
//	//待测文件输入
//	JButton codePath = new JButton("打开待测文件");
//	class codeListener implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("打开待测文件被点了");
//			//显示一个文件选择器
//			JFileChooser fileChooser = new JFileChooser(".");
//			fileChooser.showOpenDialog(jf);
//			//获取选择的文件
//			File codeFile = fileChooser.getSelectedFile();
//		}
//	}
//	
//	//测试代码文件输入
//	JButton testPath = new JButton("打开测试数据");
//	class testListener implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("打开测试数据被点了");
//			//显示一个文件选择器
//			JFileChooser fileChooser = new JFileChooser(".");
//			fileChooser.showOpenDialog(jf);
//			//获取选择的文件
//			File testFile = fileChooser.getSelectedFile();
//		}
//	}
	//创建水平的BOX放错误数和启动按钮
	Box config = Box.createHorizontalBox();
	//创建水平的BOX放三个选项
	Box choice = Box.createHorizontalBox();
	//创建垂直的BOX放两个水平BOX
	Box all = Box.createVerticalBox();
	//存放聚类相关信息
	JPanel wrongNumAll = new JPanel(); //不在需要 直接放入hbox
	
	//下拉选项框 选择错误数量
	JLabel wrongNumLabel = new JLabel("错误数:");
	JComboBox wrongNum = new JComboBox();//需要添加2-5个数字
	
	//选项框选项改变事件
	class wrongNumListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			numOfCluster = (int) e.getItem();
		}
	}
	
	//创建三个模式对话框 选择三种结果模式
	JDialog sbfl = new JDialog(jf,"SBFL",false);
	JDialog singleFCM = new JDialog(jf,"singleFCM",false);
	JDialog multiFCM = new JDialog(jf,"multiFCM",false);
	

     
	//三种模式结合的Panel
	JPanel model = new JPanel();
	
	JButton sbflB = new JButton("基于频谱怀疑度序列");
	JButton sFCMB = new JButton(" FCM单怀疑度序列 ");
	JButton mFCMB = new JButton("FCM复合怀疑度序列");
	
	class sbListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("**打开sbfl模式窗口");
			sbfl.setVisible(true);
		}
	}
	class sfListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("**打开singleFCM模式窗口");
			singleFCM.setVisible(true);
		}
	}
	class mfListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("**打开multiFCM模式窗口");
			multiFCM.setVisible(true);
		}
	}
	
	//sbfl的窗口组件
	JPanel choice1 = new JPanel();
	
	ButtonGroup sus_sb  = new ButtonGroup();

	JRadioButton Wong1_sb = new JRadioButton("Wong1",true);
	JRadioButton Naish1_sb = new JRadioButton("Naish1",false);
	JRadioButton Ochiai_sb = new JRadioButton("Ochiai",false);
	JRadioButton Tarantula_sb = new JRadioButton("Tarantula",false);
	
	JButton sbOk = new JButton("确定");
	class sb2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(Wong1_sb.isSelected()) {
				strategy = 1;
				System.out.println("**完成SB模式设置，确定公式使用Wong1");
			}
			if(Naish1_sb.isSelected()) {
				strategy = 2;
				System.out.println("**完成SB模式设置，确定公式使用Naish1");
			}
			if(Ochiai_sb.isSelected()) {
				strategy = 3;
				System.out.println("**完成SB模式设置，确定公式使用Ochiai");
			}
			if(Tarantula_sb.isSelected()) {
				strategy = 4;
				System.out.println("**完成SB模式设置，确定公式使用Tarantula");
			}
			mode = 1;
			sbfl.setVisible(false);
		}
	}
	
	//sfcm的窗口组件
	JPanel choice2 = new JPanel();//sf的第一行
	
	ButtonGroup sus_sf  = new ButtonGroup();

	JRadioButton Wong1_sf = new JRadioButton("Wong1",true);
	JRadioButton Naish1_sf = new JRadioButton("Naish1",false);
	JRadioButton Ochiai_sf = new JRadioButton("Ochiai",false);
	JRadioButton Tarantula_sf = new JRadioButton("Tarantula",false);
	
	JPanel choice2_1 = new JPanel();//sf的第二行
	JPanel choice2_1_1 = new JPanel();//sf的第二行的左边
	JPanel choice2_1_2 = new JPanel();//sf的第二行的右边
	
	JLabel mLabel = new JLabel("m:");
	JTextField m1 = new JTextField(10);
	JLabel bmaxLabel = new JLabel("bmax:");
	JTextField bmax1 = new JTextField(10);
	
	JButton sfOk = new JButton("确定");
	class sf2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(Wong1_sf.isSelected()) {
				strategy = 1;
				System.out.println("**完成singleFCM模式设置，确定公式使用Wong1");
			}
			if(Naish1_sf.isSelected()) {
				strategy = 2;
				System.out.println("**完成singleFCM模式设置，确定公式使用Naish1");
			}
			if(Ochiai_sf.isSelected()) {
				strategy = 3;
				System.out.println("**完成singleFCM模式设置，确定公式使用Ochiai");
			}
			if(Tarantula_sf.isSelected()) {
				strategy = 4;
				System.out.println("**完成singleFCM模式设置，确定公式使用Tarantula");
			}
			m = Integer.parseInt(m1.getText());
			bmax = Integer.parseInt(bmax1.getText());
			mode = 2;
			singleFCM.setVisible(false);
		}
	}
	
	//mfcm的组件
	JPanel choice3 = new JPanel();//mf第一行
	JPanel choice3_1 = new JPanel();//mf第一行左边
	JPanel choice3_2 = new JPanel();//mf第一行右边
	
	JLabel m2Label = new JLabel("m:");
	JTextField m2 = new JTextField(10);
	JLabel bmax2Label = new JLabel("bmax:");
	JTextField bmax2 = new JTextField(10);
	
	JButton mfOk = new JButton("确定");
	class mf2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//int i=0;
			//int j=0;
			m = Integer.parseInt(m2.getText());
			bmax = Integer.parseInt(bmax2.getText());
			mode = 3;
			System.out.println("**完成multiFCM模式设置，关闭窗口");
			multiFCM.setVisible(false);
		}
	}
	
	//弄一个Panel把开始按钮和模式选择放在一起
	JPanel p1 = new JPanel();
	
	//执行代码按钮
	JButton start = new JButton("启动");
	class startListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("本次启动参数如下 strategy:"+strategy+" m:"+m+" bmax:"+bmax+" numOfCluster:"+numOfCluster);
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
			result = ListToString(linesList);
			res.setText(result);
			resultDialog.setSize(173*numOfResult,500);
			resultDialog.setVisible(true);
			
			
		}
	}
	
	//右边弄一个JSccrollPane存放结果 每行的结果用
	JTextArea res = new JTextArea();
	JScrollPane resAll = new JScrollPane();
	JDialog resultDialog = new JDialog(jf,"result",false);
	
	//JLeft 存放所有左边组件
	JPanel jLeft = new JPanel();
	
	//JRight 存放所有右边组件
	JPanel jRight = new JPanel();
	Border rightborder = BorderFactory.createEmptyBorder(10,5,20,10);
	
	public void init() {
//		//为两个按键添加事件
//		codePath.addActionListener(new codeListener());
//		testPath.addActionListener(new testListener());
//		readFile.setLayout(new BorderLayout());
//		//将两个按键合并为一个Panel
//		readFile.add(codePath,BorderLayout.WEST);
//		readFile.add(testPath,BorderLayout.EAST);
		
		//为两个文本框添加事件
		wrongNum.setFont(new Font("宋体",Font.BOLD,20));
		wrongNumLabel.setFont(new Font("宋体",Font.BOLD,20));
		wrongNum.addItemListener(new wrongNumListener());
		wrongNum.addItem(2);
		wrongNum.addItem(3);
		wrongNum.addItem(4);
		wrongNum.addItem(5);
		
		//合错误数量组件为为一
		//wrongNumAll.setLayout(null);
		wrongNumAll.add(wrongNumLabel);
		wrongNumAll.add(wrongNum);
		
		//sbfl的窗口组合
		sbfl.setSize(577, 150);
		sbfl.setLocationRelativeTo(null);

		Wong1_sb.setFont(new Font("宋体",Font.BOLD,20));
		Naish1_sb.setFont(new Font("宋体",Font.BOLD,20));
		Tarantula_sb.setFont(new Font("宋体",Font.BOLD,20));
		Ochiai_sb.setFont(new Font("宋体",Font.BOLD,20));
		
		sus_sb.add(Wong1_sb);
		sus_sb.add(Naish1_sb);
		sus_sb.add(Tarantula_sb);
		sus_sb.add(Ochiai_sb);
		
		choice1.add(Wong1_sb);
		choice1.add(Naish1_sb);
		choice1.add(Tarantula_sb);
		choice1.add(Ochiai_sb);
		
		sbOk.setFont(new Font("宋体",Font.BOLD,20));;
		sbOk.addActionListener(new sb2Listener());
		
		sbfl.add(choice1,BorderLayout.NORTH);
		sbfl.add(sbOk,BorderLayout.SOUTH);
		
		//sFCM的窗口组合
		singleFCM.setSize(577, 177);
		singleFCM.setLocationRelativeTo(null);
		
		Wong1_sf.setFont(new Font("宋体",Font.BOLD,20));
		Naish1_sf.setFont(new Font("宋体",Font.BOLD,20));
		Tarantula_sf.setFont(new Font("宋体",Font.BOLD,20));
		Ochiai_sf.setFont(new Font("宋体",Font.BOLD,20));
		
		sus_sf.add(Wong1_sf);//四种怀疑度选项加入互斥列表
		sus_sf.add(Naish1_sf);
		sus_sf.add(Tarantula_sf);
		sus_sf.add(Ochiai_sf);
		
		choice2.add(Wong1_sf);//sf窗口第一行内容
		choice2.add(Naish1_sf);
		choice2.add(Tarantula_sf);
		choice2.add(Ochiai_sf);
		
		mLabel.setFont(new Font("宋体",Font.BOLD,20));
		m1.setFont(new Font("宋体",Font.BOLD,20));
		bmaxLabel.setFont(new Font("宋体",Font.BOLD,20));
		bmax1.setFont(new Font("宋体",Font.BOLD,20));
		
		choice2_1_1.add(mLabel,BorderLayout.WEST);//sf窗口第二行左边提示
		choice2_1_1.add(m1,BorderLayout.EAST);//sf窗口第二行左边输入框
		choice2_1_2.add(bmaxLabel,BorderLayout.WEST);//sf窗口第二行右边提示
		choice2_1_2.add(bmax1,BorderLayout.EAST);//sf窗口第二行右边输入框
		
		choice2_1.add(choice2_1_1,BorderLayout.WEST);
		choice2_1.add(choice2_1_2,BorderLayout.EAST);
		
		sfOk.setFont(new Font("宋体",Font.BOLD,20));
		sfOk.addActionListener(new sf2Listener());
		
		singleFCM.add(choice2,BorderLayout.NORTH);
		singleFCM.add(choice2_1);
		singleFCM.add(sfOk,BorderLayout.SOUTH);
		
		//mFCM的窗口组合
		multiFCM.setSize(400, 150);
		multiFCM.setLocationRelativeTo(null);
		
		m2Label.setFont(new Font("宋体",Font.BOLD,20));
		m2.setFont(new Font("宋体",Font.BOLD,20));
		bmax2Label.setFont(new Font("宋体",Font.BOLD,20));
		bmax2.setFont(new Font("宋体",Font.BOLD,20));
		
		choice3_1.add(m2Label,BorderLayout.WEST);
		choice3_1.add(m2);
		choice3_2.add(bmax2Label,BorderLayout.WEST);
		choice3_2.add(bmax2);
		
		choice3.add(choice3_1,BorderLayout.WEST);
		choice3.add(choice3_2,BorderLayout.EAST);
		
		mfOk.setFont(new Font("宋体",Font.BOLD,20));
		mfOk.addActionListener(new mf2Listener());
		
		multiFCM.add(choice3,BorderLayout.NORTH);
		multiFCM.add(mfOk,BorderLayout.SOUTH);
		
		//模式选择
		sbflB.setFont(new Font("宋体",Font.BOLD,20));
		sFCMB.setFont(new Font("宋体",Font.BOLD,20));
		mFCMB.setFont(new Font("宋体",Font.BOLD,20));
		sbflB.addActionListener(new sbListener());
		sFCMB.addActionListener(new sfListener());
		mFCMB.addActionListener(new mfListener());
		
		choice.add(sbflB);
		choice.add(Box.createHorizontalStrut(20));
		choice.add(sFCMB);
		choice.add(Box.createHorizontalStrut(20));
		choice.add(mFCMB);
		
		start.setFont(new Font("宋体",Font.BOLD,20));;
		start.addActionListener(new startListener());
		
		//组件第一行合并
		config.add(wrongNumAll,BorderLayout.WEST);
		config.add(start);
		
		//结果输出
		res.setFont(new Font("宋体",Font.BOLD,20));
		resAll.setViewportView(res);
		resultDialog.add(resAll);
		resultDialog.setLocationRelativeTo(null);
		
		jf.add(config,BorderLayout.NORTH);
		jf.add(choice,BorderLayout.SOUTH);
		//jf.pack();
		jf.setSize(697, 150);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
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
    
	public static void main(String[] args) {
		new mainUI_old().init();
		
	}
}
