package com.EnumDemo;

import java.util.Scanner;

public class ClassroomArrayUtility {
	public static void acceptClassroomDetails(Classroom[] clArr) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<clArr.length;i++) {
			System.out.println("Enter classroom Id:");
			int cid = sc.nextInt();
			System.out.println("Enter Classroom Name: ");
			String cname = sc.next();
			System.out.println("Enter teacher Id: ");
			int tid = sc.nextInt();
			System.out.println("Enter teacher Name: ");
			String tname=sc.next();
			System.out.println("Enter 1.Assistant 2.ProfessorAssisant");
			int dcode = sc.nextInt();
			DesignationCodes descode=null;
			switch(dcode){
			case 1:
				descode=DesignationCodes.professor;
				break;
			case 2:
				descode=DesignationCodes.assistantProfessor;
				break;
			}
	//		Classroom cl 
			
			clArr[i]=new Classroom(cid, cname, new Teacher(tid,tname,descode));
		}
	}
	
	public static void displayClassroomDetails(Classroom[] clArr) {
//		System.out.println("Class room Id: "+this.cid+" Classroom name:"+this.cname+"");
		for(int i=0;i<clArr.length;i++) {
			System.out.println(clArr[i]);
		}
	}
}
