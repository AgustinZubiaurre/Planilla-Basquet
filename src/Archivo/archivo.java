package Archivo;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Planilla.temporada;

public class archivo  
{
	public void GuardarTemporada(temporada tempo, String nombre) // en el parametro le pongo el objeto temporada y nombre o la ruta del archivo donde lo va a guardar
	{																				
		File archivo = new File (nombre);   																	// creo el archivo donde lo voy a guardar
		try 
		{
			ObjectOutputStream guardar = new ObjectOutputStream(new FileOutputStream(archivo));   // creo el flujo de salida de datos para guardarlo
			guardar.writeObject(tempo);	// lo guardo 
			guardar.close();		// y cierro el objeto
		} 
		catch (IOException e) 
		{			
			e.printStackTrace();
		}
	}

	public temporada LeerTemporada(String nombre) // en el parametro le pongo el nombre o la ruta del archivo que va a leer	
	{       	
		temporada tempo = null;		
		try 
		{			
			ObjectInputStream Leer = new ObjectInputStream ( new FileInputStream (nombre) );			// creo el flujo de entrada de datos para utilizarlo
			tempo = (temporada)Leer.readObject();			// lee el objeto y se lo da a "tempo" de tipo Temporada
			Leer.close();				
		} 
		catch (IOException | ClassNotFoundException e) 
		{				
			e.printStackTrace();			
		}  
		return tempo;		// retorno la temporada leida
	}
	
}