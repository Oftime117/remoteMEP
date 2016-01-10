package mep;

import java.util.HashMap;

public class PolytechPSUD {
    private HashMap<Integer, Promotion> promotionHT;
    private boolean hasCTI;
    
    
    private PolytechPSUD() {
    	/* Initialiser la hashtable */
    	promotionHT = new HashMap<Integer, Promotion> ();
        hasCTI = true;
    }
    
    /* Méthode du Holder qui permet de créer un singleton sécurisé */
    private static class SingletonHolder{
    	private final static PolytechPSUD instance = new PolytechPSUD();
    }
    
    public static PolytechPSUD getInstance() {
    	return SingletonHolder.instance;
    }
    

	/**
	 * @return the promotionHT
	 */
	public HashMap<Integer, Promotion> getPromotionHT() {
		return promotionHT;
	}

	/**
	 * @return the hasCTI
	 */
	public boolean isHasCTI() {
		return hasCTI;
	}
    
    public void addPromotion(Promotion p) {
    	promotionHT.computeIfAbsent(p.getAnneeSortie(), k -> p);
    }
    
}
