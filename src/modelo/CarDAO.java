package modelo;

import java.util.List;

public interface CarDAO {

	List<CarDTO> getAll();
	CarDTO getMatricula(String Matricula);
	
	void insertCar(CarDTO car);
	void modifyCar(CarDTO car);
	void deleteCar(CarDTO car);

	
    
    
}
