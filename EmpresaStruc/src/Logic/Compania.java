package Logic;

public class Compania {

	public static void main(String[] args) {		
		
		///////
		/////Codigo de comprobacion
		///////
		//System.out.println("a");
		
		LiderTecnico LTA = new LiderTecnico("Julio Bonilla");
        IngenieroSoftware iSA = new IngenieroSoftware("Manuel");
        IngenieroSoftware iSB = new IngenieroSoftware("Melvin");
        IngenieroSoftware iSC = new IngenieroSoftware("Sonia");
        LTA.asignardependiente(seA);
        LTA.asignardependiente(seB);
        LTA.asignardependiente(seC);
        System.out.println(LTA.getEstatusEquipo());

        LiderTecnico LTB = new LiderTecnico("Ramón Pérez");
        IngenieroSoftware isD = new IngenieroSoftware("Lucas");
        IngenieroSoftware isE = new IngenieroSoftware("Rosa");
        IngenieroSoftware isF = new IngenieroSoftware("Enrique");
        IngenieroSoftware isG = new IngenieroSoftware("David");
        LTB.asignardependiente(isD);
        LTB.asignardependiente(isE);
        LTB.asignardependiente(isF);
        LTB.asignardependiente(isG);
        System.out.println(LTB.getEstatusEquipo());

        LiderNegocio LN = new LiderNegocio("Camille Sánchez");
        Contador cA = new Contador("Paula");
        Contador cB = new Contador("Esther");
        LN.asignardependiente(cA, LTA);
        LN.asignardependiente(cB, LTB);
        System.out.println(LN.getEstatusEquipo());

	}

}