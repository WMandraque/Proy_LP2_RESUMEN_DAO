package com.proyecto.interfaces;

import java.util.ArrayList;

import com.proyecto.beans.VentaDTO;

public interface VentaDAO {
	
	
	
	int registrarVenta(String idVendedor, double monto);
	
	
	ArrayList<VentaDTO> listarVentas();

}
