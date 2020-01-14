package com.gyj.n2d.dao;

import org.apache.ibatis.annotations.Param;

import com.gyj.n2d.entity.Appointment;

public interface AppointmentDao {

	int insertAppointment(@Param("bookId") long bookId, @Param("studentId") long studentId);
	Appointment queryByKeyWithBook(@Param("bookId") long bookId, @Param("studentId") long studentId);
	
}
