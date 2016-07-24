import javax.swing.*;
public abstract class WhatIsYouName {

	public static void main(String[] args) {
		String Name;
		Name=JOptionPane.showInputDialog ("Добрый день! Как Вас зовут?");
				JOptionPane.showMessageDialog(null, "Приятного познакомиться, \n"+Name+"!");

	}

}