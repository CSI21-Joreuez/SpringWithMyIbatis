package DAO;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface Mapper {

	@Select("SELECT * FROM \"Ejemplo4\".\"Empleados\"\r\n"
			+ "ORDER BY id ASC")
	public List<empleado> SeleccionarEmpleado();
	
	@Select("SELECT * FROM \"Ejemplo4\".\"Empleados\"\r\n"
			+ "WHERE id = {id}")
	public empleado SeleccionarEmpleadoPorId(@Param("id")int id);
	
	@Insert("INSERT INTO \"Ejemplo4\".\"Empleados\"(\r\n"
			+ " nombre, apellidos, area_id)\r\n"
			+ "	VALUES (#{nombre}, #{apellidos}, #{area_id}); ")
	public int InsertaEmpleado(empleado empleado);
	
}
