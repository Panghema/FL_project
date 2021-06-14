package fl.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class UI_TEST {
	public static void main( String[] args ) {
		JFrame jf = new JFrame("UI_TEST");
		
		//创建菜单条组件
		MenuBar menubar = new MenuBar();
		//创建文件菜单组件
		Menu fileMenu = new Menu("文件");
		//创建设置菜单组件
		Menu setMenu = new Menu("设置");
		//创建启动菜单组件
		Menu startMenu = new Menu("启动");
		//创建新建菜单项
	    MenuItem newItem = new MenuItem("新建");
	    MenuItem startItem = new MenuItem("运行");
	    
	    //合并菜单组件
	    fileMenu.add(newItem);
	    startMenu.add(startItem);
	    menubar.add(fileMenu);
	    menubar.add(startMenu);
	    menubar.add(setMenu);
	    
	    //下面的config窗口和result窗口
	    JPanel down = new JPanel();
	    
		//左边所有部件
		JPanel left = new JPanel();
		
		//创建JTabbedPane
		JTabbedPane jt = new JTabbedPane();
		jt.setPreferredSize(new Dimension(150,200));
		//创建选项卡
		JLabel l1 = new JLabel("方法1");
		JLabel l2 = new JLabel("方法2");
		JLabel l3 = new JLabel("方法3");
		
		//添加选项卡
		jt.addTab("1", l1);
		jt.addTab("2", l2);
		jt.addTab("3", l3);
		
		left.add(jt);
		//创建存放文本框和滑轮的Panel
		JPanel right = new JPanel();
		right.setPreferredSize(new Dimension(150,200));
		//创建文本框 及滑轮的框
		JTextArea text = new JTextArea("aa");
		//.setSize(110, 150);//大小
		JScrollPane js = new JScrollPane(text);
		js.setPreferredSize(new Dimension(150,170));//大小
		
		Border lb = BorderFactory.createLineBorder(Color.black, 1);
		TitledBorder tb = new TitledBorder(lb,"测试标题",TitledBorder.LEFT,TitledBorder.TOP);
		right.setBorder(tb);
		
		//把结果输出框放入JPanel
		right.add(js);
		
		down.add(left,BorderLayout.WEST);
		down.add(right);
		
		jf.setMenuBar(menubar);
		//jf.add(down);
		jf.add(left,BorderLayout.WEST);
		jf.add(right);
		jf.pack();
		jf.setSize(350,265);
		jf.setVisible(true);
	}
	
}
