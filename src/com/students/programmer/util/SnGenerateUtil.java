package com.students.programmer.util;


public class SnGenerateUtil {
	public static String generateSn(int classId){
		String sn = "";
		sn = "S" + classId + System.currentTimeMillis();
		return sn;
	}
	public static String generateTeacherSn(int classId){
		String sn = "";
		sn = "T" + classId + System.currentTimeMillis();
		return sn;
	}
}

