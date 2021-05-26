package refactoring;

import java.util.Date;

public class Lloguer {
	
	private static final double UNIDADES_DE_COSTE_BASIC = 3;
	private static final double DIAS_COSTE_STANDARD_BASIC = 3;
	private static final double AUMENTO_COSTE_BASIC_POR_ALQUILER_LARGO = 1.5;
	private static final double UNIDADES_DE_COSTE_GENERAL = 4;
	private static final double DIAS_COSTE_STANDARD_GENERAL = 2;
	private static final double AUMENTO_COSTE_GENERAL_POR_ALQUILER_LARGO = 2.5;
	private static final double UNIDADES_DE_COSTE_LUXE = 6;
	
	private Date data;
	private int dies;
	private Vehicle vehicle;
	
	public Lloguer(Date data, int dies, Vehicle vehicleBasic) {
		this.data = data;
		this.dies = dies;
		this.vehicle = vehicleBasic;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getDies() {
		return dies;
	}
	public void setDies(int dies) {
		this.dies = dies;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicles(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
    public double quantitat() {
    	double quantitat = 0;
        switch (getVehicle().getCategoria()) {
            case Vehicle.BASIC:
            	quantitat += UNIDADES_DE_COSTE_BASIC;
                if (getDies() > DIAS_COSTE_STANDARD_BASIC) {
                    quantitat += (getDies() - DIAS_COSTE_STANDARD_BASIC) * 
                    		AUMENTO_COSTE_BASIC_POR_ALQUILER_LARGO;
                }
                break;
            case Vehicle.GENERAL:
                quantitat += UNIDADES_DE_COSTE_GENERAL;
                if (getDies() > DIAS_COSTE_STANDARD_GENERAL) {
                    quantitat += (getDies() - DIAS_COSTE_STANDARD_GENERAL) *
                    		AUMENTO_COSTE_GENERAL_POR_ALQUILER_LARGO ;
                }
                break;
            case Vehicle.LUXE:
                quantitat += getDies() * UNIDADES_DE_COSTE_LUXE;
                break;
        }
        return quantitat;
    }

    public int bonificacions() {
    	int bonificacions = 0;
    	bonificacions++;
    	if (this.getVehicle().getCategoria() == Vehicle.LUXE &&
    			this.getDies() > 1) {
    		bonificacions++;
    	}
    	return bonificacions;
    }
}
