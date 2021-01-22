package Estadisticas;

import java.io.Serializable;

public abstract class estadisticas implements Serializable 
{
	int doblesConvert; // 1		
	int doblesErrados; // 2	
	int triplesConvert; // 3	
	int triplesErrados; // 4	
	int simpleConvert; // 5	
	int simpleErrado; //6	
	int falta;  // 7	
	int faltaTecnica; //8	
	int asistencias; // 9	
	int perdidas; // 10	
	int robo;  //11	
	int rebotesDef; //12	
	int rebotesAt; // 13	
	int tapa; //14
	
	// CONSTRUCTOR
	
		public estadisticas() 
		{ 				
			doblesConvert = 0; // 1				
			doblesErrados = 0; // 2			
			triplesConvert = 0; // 3			
			triplesErrados = 0; // 4			
			simpleConvert = 0; // 5			
			simpleErrado = 0; //6			
			falta = 0;  // 7			
			faltaTecnica = 0; //8			
			asistencias = 0; // 9			
			perdidas = 0; // 10			
			robo = 0;  //11			
			rebotesDef = 0; //12			
			rebotesAt = 0; // 13			
			tapa = 0; //14		
		}

	// METODOS 									// metodos que cargan los atributos de las estadisticas

		public void CargaDobleConvertido() {   // 1 			
			doblesConvert ++ ; 	
		}
		
		public void CargaDobleErrado() {	// 2 			
			doblesErrados ++ ; 			
		}

		public void CargaTripleConvertido(){   // 3 			
			triplesConvert ++ ; 		
		}
		
		public void CargaTripleErrado(){	  	// 4			
			triplesErrados ++ ; 		
		}
		
		public void CargaSimpleConvertido() {   // 5 			
			simpleConvert ++ ; 		
		}
				
		public void CargaSimpleErrado() {   // 6 			
			simpleErrado ++ ; 		
		}
		
		public void CargaFalta() {	// 7 			
			falta ++ ; 			
		}
		
		public void CargaFaltaTecnica() {	// 8			
			faltaTecnica++;			
		}
		
		public void CargaAsistencias(){  // 9			
			asistencias ++ ; 			
		}
		
		public void CargaPerdida(){ 		// 10 			
			perdidas ++ ; 			
		}
		
		public void CargaRobo () {		//11			
			robo++;			
		}
		
		public void CargaReboteDefensa(){	// 12 			
			rebotesDef ++ ; 			
		}	
		
		public void CargaReboteAtaque(){ // 13 			
			rebotesAt ++ ; 			
		}

		public void CargaTapa() {	//14			
			tapa++;			
		}
	
	
	// GEY Y SET 
	
		public int getDoblesConvert() {
			return doblesConvert;
		}

		public void setDoblesConvert(int doblesConvert) {
			this.doblesConvert = doblesConvert;
		}

		public int getDoblesErrados() {
			return doblesErrados;
		}

		public void setDoblesErrados(int doblesErrados) {
			this.doblesErrados = doblesErrados;
		}

		public int getTriplesConvert() {
			return triplesConvert;
		}

		public void setTriplesConvert(int triplesConvert) {
			this.triplesConvert = triplesConvert;
		}

		public int getTriplesErrados() {
			return triplesErrados;
		}

		public void setTriplesErrados(int triplesErrados) {
			this.triplesErrados = triplesErrados;
		}

		public int getSimpleConvert() {
			return simpleConvert;
		}

		public void setSimpleConvert(int simpleConvert) {
			this.simpleConvert = simpleConvert;
		}

		public int getSimpleErrado() {
			return simpleErrado;
		}

		public void setSimpleErrado(int simpleErrado) {
			this.simpleErrado = simpleErrado;
		}

		public int getFalta() {
			return falta;
		}

		public void setFalta(int falta) {
			this.falta = falta;
		}

		public int getFaltaTecnica() {
			return faltaTecnica;
		}

		public void setFaltaTecnica(int faltaTecnica) {
			this.faltaTecnica = faltaTecnica;
		}

		public int getAsistencias() {
			return asistencias;
		}

		public void setAsistencias(int asistencias) {
			this.asistencias = asistencias;
		}

		public int getPerdidas() {
			return perdidas;
		}

		public void setPerdidas(int perdidas) {
			this.perdidas = perdidas;
		}

		public int getRobo() {
			return robo;
		}

		public void setRobo(int robo) {
			this.robo = robo;
		}

		public int getRebotesDef() {
			return rebotesDef;
		}

		public void setRebotesDef(int rebotesDef) {
			this.rebotesDef = rebotesDef;
		}

		public int getRebotesAt() {
			return rebotesAt;
		}

		public void setRebotesAt(int rebotesAt) {
			this.rebotesAt = rebotesAt;
		}

		public int getTapa() {
			return tapa;
		}

		public void setTapa(int tapa) {
			this.tapa = tapa;
		}

}

