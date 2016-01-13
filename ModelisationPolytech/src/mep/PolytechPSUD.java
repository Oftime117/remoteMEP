package mep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.Collectors;

public class PolytechPSUD {
	private HashMap<Integer, Promotion> promotionsCouranteHM;
	private boolean hasCTI;

	private PolytechPSUD() {
		/* Initialiser la hashtable */
		promotionsCouranteHM = new HashMap<Integer, Promotion>(5);
		hasCTI = true;
	}

	/*
	 * Méthode du Holder qui permet de créer un singleton sécurisé (en
	 * multithreading)
	 */
	private static class SingletonHolder {
		private final static PolytechPSUD instance = new PolytechPSUD();
	}

	public static PolytechPSUD getInstance() {
		return SingletonHolder.instance;
	}

	public void changementDAnnee(ArrayList<Etudiant>[] nonRedoublant, String nomBapteme) {
		int lastyear = 0;
		/* Calcul de la plus grande année = 5A */
		Iterator<Integer> it = promotionsCouranteHM.keySet().iterator();
		while(it.hasNext()) {
			int buff = it.next();
			if (buff > lastyear) lastyear = buff;
		}
		
		promotionsCouranteHM.put(lastyear+4, new Promotion(lastyear+1, 0, nomBapteme));
		
		
		
		/* Année des 5A */
		lastyear -= 4;
		HashMap<String, Etudiant> buff1, buff2, buff = promotionsCouranteHM.get(lastyear).getEtudiantsHM();
		/* On retire les 5 A diplomés */
		buff.values().removeAll(nonRedoublant[4]);
		/* On vire les redoublants */
		buff.values().removeIf(etudiant -> etudiant.isRedoublant());
		buff1 = promotionsCouranteHM.get(lastyear+1).getEtudiantsHM();
		
		
		buff.values().forEach(etudiant -> {
			etudiant.setPromotion(promotionsCouranteHM.get(buff1));
			etudiant.setRedoublant(true);
		});
		
		promotionsCouranteHM.remove(lastyear);
		
		HashMap<String, Etudiant>[]	buffTab = new HashMap[5], buffTabRed = new HashMap [5];
		
		HashMap<String, Etudiant> buffRedoublant = new HashMap<String, Etudiant>();
		for(int i = 1; i <3; ++i) {
			
			HashMap<String, Etudiant> promoBuff = new HashMap<String, Etudiant>();
			promoBuff = promotionsCouranteHM.get(lastyear+i).getEtudiantsHM();
			
			buffRedoublant = (HashMap<String, Etudiant>) promoBuff.clone();
			buffRedoublant.values().removeAll(nonRedoublant[4-i]);
			
			
			promoBuff.values().retainAll(nonRedoublant[4-i]); 
		
    		/* On vire les redoublants */
    		buffRedoublant.values().removeIf(etudiant -> etudiant.isRedoublant());
    		
    		buffRedoublant.values().forEach(etudiant -> etudiant.setRedoublant(true));
    		
    		buffTab[i-1] = promotionsCouranteHM.get(lastyear+i).getEtudiantsHM();
    		buffTabRed[i-1] =buffRedoublant; 
    		
		}
		/* On ajoute les redoublants à la prochaine promotion */
		
		for(int i = 0; i < 2; ++i) {
			buffTab[i].putAll(buffTabRed[i]);
		}
//		promotionsCouranteHM.get(lastyear+2).getEtudiantsHM().putAll(buffRedoublant);
//		buff1.putAll(buff);
	}

	/**
	 * @return the promotionsCouranteHM
	 */
	public HashMap<Integer, Promotion> getpromotionsCouranteHM() {
		return promotionsCouranteHM;
	}

	/**
	 * @return the hasCTI
	 */
	public boolean isHasCTI() {
		return hasCTI;
	}

	public void addPromotion(Promotion p) {
		promotionsCouranteHM.computeIfAbsent(p.getAnneeSortie(), k -> p);
	}

	public ArrayList<Etudiant> rechercheEtudiants(Statut statut) {
		ArrayList<Etudiant> res = new ArrayList<Etudiant>();

		promotionsCouranteHM
				.values()
				.forEach(
						promo -> {
							res.addAll(promo
									.getEtudiantsHM()
									.values()
									.stream()
									.filter(e -> e.getStatut()
											.estCompatibleAvec(statut))
									.collect(
											Collectors
													.toCollection(ArrayList<Etudiant>::new)));
						});

		return res;
	}

	public ArrayList<Etudiant> rechercheEtudiants(Promotion promo, Statut statut) {
		ArrayList<Etudiant> res = new ArrayList<Etudiant>();

		res.addAll(promotionsCouranteHM.get(promo.getAnneeSortie())
				.getEtudiantsHM().values().stream()
				.filter(e -> e.getStatut().estCompatibleAvec(statut))
				.collect(Collectors.toCollection(ArrayList<Etudiant>::new)));

		return res;
	}

	public ArrayList<Etudiant> rechercheEtudiants(Promotion promo,
			Departement dep) {
		ArrayList<Etudiant> res = new ArrayList<Etudiant>();

		// res.addAll(promotionsCouranteHM.get(promo.getAnneeSortie()).getEtudiantsHM().values().stream()
		// .filter(e -> {
		//
		// try{
		// if()
		// }
		// })
		// .collect(Collectors.toCollection(ArrayList<Etudiant>::new)) );
		//
		return res;
	}

}
