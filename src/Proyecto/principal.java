package Proyecto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Archivo.archivo;
import Cronometro.cronometro;
import Estadisticas.estadisticasPartido;
import Planilla.equipo;
import Planilla.jugador;
import Planilla.partido;
import Planilla.temporada;
import Planilla.temporada;
import Swing.menu;
import Swing.partidoEnCurso;

public class principal {

	public static void main(String[] args) 
	{
		//temporada nueva= new temporada(2017, "LNB");
		/*
		equipo team= new equipo("Atenas","Nicolas Casalanguida");
		nueva.AgregaEquipoDirecto(team);
		team.AgregarJugador("Bruno","Labaque","Base",7);
		team.AgregarJugador("Diego","Gerbaudo","Alero",1);
		team.AgregarJugador("Gabriel","Mikulas","Ala-Pivot",6);
		team.AgregarJugador("Diego","Lo Grippo","Ala-Pivot",4);
		team.AgregarJugador("Lisandro","Rasio","Pivot",32);
		team.AgregarJugador("Jonatan","Basualdo","Escolta",11);
		team.AgregarJugador("Walter","Baxley","Base",23);
		team.AgregarJugador("Dwayne","Jones II","Escolta",21);
		
		team.DevuelveJugador(7).setEnCancha(true);
		team.DevuelveJugador(1).setEnCancha(true);
		team.DevuelveJugador(6).setEnCancha(true);
		team.DevuelveJugador(11).setEnCancha(true);
		team.DevuelveJugador(21).setEnCancha(true);		
		
		equipo equip2= new equipo("Estudiantes Concordia","Hernán Laginestra");
		nueva.AgregaEquipoDirecto(equip2);
		equip2.AgregarJugador("Dar","Tucker","Base",2);
		equip2.AgregarJugador("Sebastian","Orresta","Escolta",8);
		equip2.AgregarJugador("Federico","Marin","Alero",35);
		equip2.AgregarJugador("Facundo","Giorgi","Ala-Pivot",9);
		equip2.AgregarJugador("Justiz","Ferrer","Pivot",00);
		equip2.AgregarJugador("Jonatan","Slider","Alero",15);
		equip2.AgregarJugador("Leandro","Vildoza","Escolta",21);
		equip2.AgregarJugador("Fernando","Malara","Alero",7);

		equip2.DevuelveJugador(2).setEnCancha(true);
		equip2.DevuelveJugador(8).setEnCancha(true);
		equip2.DevuelveJugador(35).setEnCancha(true);
		equip2.DevuelveJugador(00).setEnCancha(true);
		equip2.DevuelveJugador(15).setEnCancha(true);
		
		equipo equip3= new equipo("San Martin","Sebastián Gonzales");
		nueva.AgregaEquipoDirecto(equip3);
		equip3.AgregarJugador("Lucas","Faggiano","Base",3);
		equip3.AgregarJugador("Reynaldo","Garcia","Alero",2);
		equip3.AgregarJugador("Federico","Aguerre","Alero",12);
		equip3.AgregarJugador("Matias","Lescano","Escolta",44);
		equip3.AgregarJugador("Damian","Tintorelli","Pivot",22);
		equip3.AgregarJugador("Jeremiah","Wood","Pivot",30);
		equip3.AgregarJugador("Leonardo","Mainoldi","Alero",19);
		equip3.AgregarJugador("Axel","Mendez","Escolta",9);

		equip3.DevuelveJugador(3).setEnCancha(true);
		equip3.DevuelveJugador(2).setEnCancha(true);
		equip3.DevuelveJugador(44).setEnCancha(true);
		equip3.DevuelveJugador(30).setEnCancha(true);
		equip3.DevuelveJugador(9).setEnCancha(true);
		
		equipo equip4= new equipo("Regatas","Gabriel Piccato");
		nueva.AgregaEquipoDirecto(equip4);
		equip4.AgregarJugador("Donald","Sims","Base",5);
		equip4.AgregarJugador("Fernando","Martina","Pivot",44);
		equip4.AgregarJugador("Pablo","Espinoza","Alero",10);
		equip4.AgregarJugador("Paolo","Quinteros","Escolta",13);
		equip4.AgregarJugador("Fabian","Ramirez Barrios","Ala-Pivote",11);
		equip4.AgregarJugador("Joshua","Duinker","Pivot",8);
		equip4.AgregarJugador("Javier","Saiz","Ala-Pivot",14);
		equip4.AgregarJugador("Juan Pablo","Arengo","Escolta",20);

		equip4.DevuelveJugador(5).setEnCancha(true);
		equip4.DevuelveJugador(44).setEnCancha(true);
		equip4.DevuelveJugador(10).setEnCancha(true);
		equip4.DevuelveJugador(13).setEnCancha(true);
		equip4.DevuelveJugador(11).setEnCancha(true);
				
		equipo equip5= new equipo("Ciclista Olimpico","Fernando Duro");
		nueva.AgregaEquipoDirecto(equip5);
		equip5.AgregarJugador("Adrian","Boccia","Alero",31);
		equip5.AgregarJugador("Maximiliano","Stanic","Base",11);
		equip5.AgregarJugador("Luciano","Massarelli","Escolta",5);
		equip5.AgregarJugador("Facundo","Vallejos","Ala-Pivot",14);
		equip5.AgregarJugador("Mauro","Cosolito","Alero",30);
		equip5.AgregarJugador("Federico","Van Lacke","Escolta",4);
		equip5.AgregarJugador("Diego","Guaita","Ala-Pivot",12);
		equip5.AgregarJugador("Justin","Williams","Pivot",2);
	
		equip5.DevuelveJugador(31).setEnCancha(true);
		equip5.DevuelveJugador(11).setEnCancha(true);
		equip5.DevuelveJugador(2).setEnCancha(true);
		equip5.DevuelveJugador(5).setEnCancha(true);
		equip5.DevuelveJugador(12).setEnCancha(true);
		
		equipo equip6= new equipo("Gimnasia y Esgrima","Gonzalo Garcia");
		nueva.AgregaEquipoDirecto(equip6);
		equip6.AgregarJugador("Nicolas","De Los Santos","Base",5);
		equip6.AgregarJugador("Diego","Cavaco","Alero",13);
		equip6.AgregarJugador("Matias","Sandes","Escolta",22);
		equip6.AgregarJugador("Leonel","Schattmann","Escolta",20);
		equip6.AgregarJugador("Samuel","Clancy","Pivot",50);
		equip6.AgregarJugador("Diego","Romero","Pivot",77);
		equip6.AgregarJugador("Juan","Fernandez Chavez","Ala-Pivot",15);
		equip6.AgregarJugador("Juan Manuel","Rivero","Base",4);

		equip6.DevuelveJugador(5).setEnCancha(true);
		equip6.DevuelveJugador(13).setEnCancha(true);
		equip6.DevuelveJugador(50).setEnCancha(true);
		equip6.DevuelveJugador(15).setEnCancha(true);
		equip6.DevuelveJugador(20).setEnCancha(true);
				
		equipo equip7= new equipo("Obras Basket","Alberto Díaz");
		nueva.AgregaEquipoDirecto(equip7);
		equip7.AgregarJugador("Walter","Herrmann","Alero",1);
		equip7.AgregarJugador("Luca","Valussi","Alero",9);
		equip7.AgregarJugador("Martin","Leiva","Pivot",11);
		equip7.AgregarJugador("Pedro","Barral","Base",13);
		equip7.AgregarJugador("Tomas","Zanzottera","Base",18);
		equip7.AgregarJugador("Denis","Horner","Ala-Pivot",19);
		equip7.AgregarJugador("Matias","Bortolin","Pivot",41);
		equip7.AgregarJugador("Tomas","Cocha","Escolta",17);
		
		equip7.DevuelveJugador(1).setEnCancha(true);
		equip7.DevuelveJugador(11).setEnCancha(true);
		equip7.DevuelveJugador(18).setEnCancha(true);
		equip7.DevuelveJugador(17).setEnCancha(true);
		equip7.DevuelveJugador(9).setEnCancha(true);
		
		equipo equip8= new equipo("Club Atlético Penarol","Marcelo Richotti");
		nueva.AgregaEquipoDirecto(equip8);
		equip8.AgregarJugador("Franco","Giorgetti","Alero",24);
		equip8.AgregarJugador("Juan Pablo","Figueroa","Base",30);
		equip8.AgregarJugador("Robert","Reed","Escolta",2);
		equip8.AgregarJugador("Alejandro","Diez","Ala-Pivot",4);
		equip8.AgregarJugador("Leonardo","Gutierrez","Ala-Pivot",10);
		equip8.AgregarJugador("Roberto","Acuña","Pivot",35);
		equip8.AgregarJugador("Nicolas","Zurschmitten","Base",17);
		equip8.AgregarJugador("Steffphon","Pettigrew","Alero",32);
		
		equip8.DevuelveJugador(24).setEnCancha(true);
		equip8.DevuelveJugador(10).setEnCancha(true);
		equip8.DevuelveJugador(4).setEnCancha(true);
		equip8.DevuelveJugador(30).setEnCancha(true);
		equip8.DevuelveJugador(2).setEnCancha(true);
		
		equipo equip9=new equipo("Ferrocarril Oeste","Álvaro Castiñeira");
		nueva.AgregaEquipoDirecto(equip9);
		equip9.AgregarJugador("Ramon","Clemente","Pivot",1);
		equip9.AgregarJugador("Franco","Balbi","Base",6);
		equip9.AgregarJugador("Ignacio","Alessio","Alero",8);
		equip9.AgregarJugador("Kevin","Hernandez","Pivot",91);
		equip9.AgregarJugador("Mauricio","Aguiar","Alero",15);
		equip9.AgregarJugador("Luciano","Tantos","Base",48);
		equip9.AgregarJugador("Ivan","Gramajo","Escolta",5);
		equip9.AgregarJugador("Jonathan","Maldonado","Alero",7);
		
		equip9.DevuelveJugador(1).setEnCancha(true);
		equip9.DevuelveJugador(6).setEnCancha(true);
		equip9.DevuelveJugador(8).setEnCancha(true);
		equip9.DevuelveJugador(5).setEnCancha(true);
		equip9.DevuelveJugador(7).setEnCancha(true);
		
		equipo equip10=new equipo("Club Atlético Quilmes","Juan Bianchelli");
		nueva.AgregaEquipoDirecto(equip10);
		equip10.AgregarJugador("Luca","Vildoza","Base",3);
		equip10.AgregarJugador("Maximiliano","Maciel","Alero",13);
		equip10.AgregarJugador("Ivory","Clark","Ala-Pivot",12);
		equip10.AgregarJugador("Ivan","Basualdo","Pivot",31);
		equip10.AgregarJugador("Bruno","Sansimoni","Alero",24);
		equip10.AgregarJugador("Eric","Flor","Escolta",5);
		equip10.AgregarJugador("Enzo","Ruiz","Alero",28);
		equip10.AgregarJugador("Ariel","Eslava","Pivot",21);
		
		equip10.DevuelveJugador(3).setEnCancha(true);
		equip10.DevuelveJugador(28).setEnCancha(true);
		equip10.DevuelveJugador(5).setEnCancha(true);
		equip10.DevuelveJugador(12).setEnCancha(true);
		equip10.DevuelveJugador(21).setEnCancha(true);
			*/
	 	archivo archivo  = new archivo();  	
	 	// creo el archivo 
	 	//archivo.GuardarTemporada(nueva, "LNB");											// metodo para guardar el archivo
		temporada auxiliar = archivo.LeerTemporada("LNB");								// metodo para leer el archivo. Devuelve la temporada	
		menu menu = new menu (auxiliar); 
		menu.setVisible(true);	
	}

}
