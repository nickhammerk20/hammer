package HW1_Functions;
// ������ ����� (0�999), �������� ������ � �������� �����.

import java.util.Stack;

public class HW_1_4_2_network{
	
	private static enum Ranges {UNITS, DECADES, HUNDREDS, THOUSANDS, MILLIONS, BILLIONS};

	private static Stack <ThreeChar> threeChars;

	private static class ThreeChar {
	    char h, d, u;
	    Ranges range;
	}   

	public static String digits2Text(Double d){
	    if(d == null || d < 0.0) {
	    	return null;
	    } else if (d == 0) {
	    	return "����";
	    }
	    else{
	    String s = d.toString();
	    int n = s.length() - s.lastIndexOf('.');
	    if(n > 3) return null;
	    if(n == 2) s += "0";
	    String[] sa = s.split("\\.");
	    threeChars = new Stack <ThreeChar> ();
	    threeChars.push(new ThreeChar());
	    threeChars.peek().range = Ranges.UNITS;
	    StringBuilder sb = new StringBuilder(sa[0]).reverse();
	    for(int i = 0; i < sb.length(); i++){
	      if(i > 0 && i % 3 == 0){
	       threeChars.push(new ThreeChar()); 
	      } 
	      ThreeChar threeChar = threeChars.peek();
	      switch(i){
	           case 0: 
	               threeChar.u = sb.charAt(i);
	               System.out.println(threeChar.u);
	               break;
	           case 3: 
	               threeChar.range = Ranges.THOUSANDS; 
	               threeChar.u = sb.charAt(i);
	               System.out.println(threeChar.u);
	               break;
	           case 6: 
	               threeChar.range = Ranges.MILLIONS;  
	               threeChar.u = sb.charAt(i);
	               System.out.println(threeChar.u);
	               break;
	           case 9: 
	               threeChar.range = Ranges.BILLIONS;  
	               threeChar.u = sb.charAt(i);
	               System.out.println(threeChar.u);
	               break;
	           case 2: 
	           case 5: 
	           case 8: 
	               threeChar.h = sb.charAt(i);
	               System.out.println(threeChar.h);
	               break;
	           default:
	               threeChar.d = sb.charAt(i);
	               System.out.println(threeChar.d);
	      }    
	      System.out.println(threeChar.h+" // " +threeChar.d+" // "+threeChar.u);
	    }
	    StringBuilder result = new StringBuilder();
	    while(!threeChars.isEmpty()){
	    	ThreeChar thch = threeChars.pop();
	    	System.out.println("0.1 "+thch);
	        if(thch.h > 0  ){
	        	System.out.println("0.2 "+thch.h);
	            result.append(getHundreds(thch.h));
	            System.out.println("0.3 "+thch.h);
	            result.append(' ');
	        }
	        System.out.println("0 "+thch.d+" ������ ��������� "+d );
	        if(thch.d > '0'){
	        	System.out.println("1 "+thch.d+" ������ ��������� "+d);
	            if(thch.d > '1' || (thch.d == '1' && thch.u == '0')) {result.append(getDecades(thch.d));
	            System.out.println("2 "+thch.d+" ������ ��������� "+d);}
	            else if(thch.d > '0') {result.append(getTeens(thch.d));
	            System.out.println("3 "+thch.d+" ������ ��������� "+d);}
	            result.append(' ');
	        }
	        if(thch.u > '0' && thch.d != '1'){
	            result.append(getUnits(thch.u, thch.range == Ranges.THOUSANDS));
	        //    result.append(' ');  // ������� � ����� ���� ����� ������
	        }
	        switch(thch.range){
	            case BILLIONS:
	                if(thch.d == '1' || thch.u == '0') result.append("����������");
	                else if(thch.u > '4')result.append("����������");
	                else if(thch.u > '1')result.append("���������");
	                else result.append("��������");
	                break;
	            case MILLIONS:
	                if(thch.d == '1' || thch.u == '0') result.append("���������");
	                else if(thch.u > '4')result.append("���������");
	                else if(thch.u > '1')result.append("��������");
	                else result.append("�������");
	                break;
	            case THOUSANDS:
	                if(thch.d == '1' || thch.u == '0') result.append("�����");
	                else if(thch.u > '4')result.append("�����");
	                else if(thch.u > '1')result.append("������");
	                else result.append("������");
	                break;
	            default:
	                if(thch.d == '1' || thch.u == '0' || thch.u > '4')result.append(""); // ������ - ������
	                else if(thch.u > '1')result.append(""); // ������ - �����
	                else result.append(""); // ������ - �����
	        }
	        //result.append(' '); // ��������� � ����� ������� ����� ���������
	    }   
	    // ���������� ������
//	    result.append(sa[1] + ' ');
//	    switch(sa[1].charAt(1)){
//	        case '1': 
//	            result.append(sa[1].charAt(0) != '1' ? "�������" : "������");
//	            break;
//	        case '2': 
//	        case '3': 
//	        case '4': 
//	            result.append(sa[1].charAt(0) != '1' ? "�������" : "������");
//	            break;
//	        default:
//	            result.append("������");
//	    }
	  //  char first = Character.toUpperCase(result.charAt(0));
	 //   result.setCharAt(0, first); // ������ ��������� �����
	    return result.toString();
	    }
	}

	private static String getHundreds(char dig){
	 switch(dig){
	     case '1': 
	         return "���";
	     case '2': 
	         return "������";
	     case '3': 
	         return "������";
	     case '4': 
	         return "���������";
	     case '5': 
	         return "�������";
	     case '6': 
	         return "��������";
	     case '7': 
	         return "������";
	     case '8': 
	         return "��������";
	     case '9': 
	         return "���������";
	     default: return null;
	 }      
	}

	private static String getDecades(char dig){
	 switch(dig){
	     case '1': 
	         return "������";
	     case '2': 
	         return "��������";
	     case '3': 
	         return "��������";
	     case '4': 
	         return "�����";
	     case '5': 
	         return "���������";
	     case '6': 
	         return "����������";
	     case '7': 
	         return "���������";
	     case '8': 
	         return "�����������";
	     case '9': 
	         return "���������";
	     default: return null;
	 }      
	}

	private static String getUnits(char dig, boolean female){
	 switch(dig){
	     case '1': 
	         return female ? "����" : "����";
	     case '2': 
	         return female ? "���"  : "���";
	     case '3': 
	         return "���";
	     case '4': 
	         return "������";
	     case '5': 
	         return "����";
	     case '6': 
	         return "�����";
	     case '7': 
	         return "����";
	     case '8': 
	         return "������";
	     case '9': 
	         return "������";
	     default: return null;
	 }      
	}

	private static String getTeens(char dig){
	 System.out.println(dig);
		String s = "";     
	 switch(dig){
	     case '1':
	         s = "����"; break;
	     case '2':
	         s = "���"; break;
	     case '3':
	         s = "���"; break;
	     case '4':
	         s = "�����"; break;
	     case '5':
	         s = "���"; break;
	     case '6':
	         s = "����"; break;
	     case '7':
	         s = "���"; break;
	     case '8':
	         s = "�����"; break;
	     case '9':
	         s = "�����"; break;
	 }
	 return s + "�������";
	}       

	public static void main(String[] args){
		double r=15;
		String res=digits2Text(r);
		System.out.println(res);
	// System.out.println(new HW_1_4_2_network().digits2Text(new Double(args[0])));
	}       
	}