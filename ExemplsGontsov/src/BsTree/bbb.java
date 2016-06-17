package BsTree;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
public class bbb extends JFrame
{
 DefaultMutableTreeNode level0 =  new DefaultMutableTreeNode("Корень дерева");
 JTree jt = new JTree(level0);

 public bbb()
 {
  enableEvents(AWTEvent.WINDOW_EVENT_MASK);
  try
  {
   init();
  }
  catch(Exception e)
  {
   e.printStackTrace();
  }
 }
 private void init() throws Exception
 {
  this.setSize(new Dimension(400, 300));
  this.setTitle("Tree Sample");
  DefaultMutableTreeNode level1a;
  DefaultMutableTreeNode level1b;
  DefaultMutableTreeNode level1c;
  level1a = new DefaultMutableTreeNode("Первая ветвь");
  DefaultMutableTreeNode level1a_1=new DefaultMutableTreeNode("Ветвь первой ветви");
  level1a_1.add(new DefaultMutableTreeNode("Отросточек"));
  level1a.add(level1a_1);
  level1a.add(new DefaultMutableTreeNode("Отросточек"));
  level0.add(level1a);
  level1b = new DefaultMutableTreeNode("Вторая ветвь");
  DefaultMutableTreeNode level1b_1=new DefaultMutableTreeNode("Первая ветвь второй ветви");
  level1b_1.add(new DefaultMutableTreeNode("Первый отросточек"));
  level1b_1.add(new DefaultMutableTreeNode("Второй отросточек"));
  level1b.add(level1b_1);
  DefaultMutableTreeNode level1b_2=new DefaultMutableTreeNode("Вторая ветвь второй ветви");
  level1b_2.add(new DefaultMutableTreeNode("Отросточек"));
  level1b.add(level1b_2);
  level0.add(level1b);
  level1c = new DefaultMutableTreeNode("Отросточек");
  level0.add(level1c);
  this.getContentPane().add(jt);
 }
 protected void processWindowEvent(WindowEvent e)
 {
  super.processWindowEvent(e);
  if (e.getID() == WindowEvent.WINDOW_CLOSING)
  {
   System.exit(0);
  }
 }
}