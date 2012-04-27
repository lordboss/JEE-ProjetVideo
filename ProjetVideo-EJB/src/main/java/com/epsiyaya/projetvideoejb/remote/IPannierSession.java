package com.epsiyaya.projetvideoejb.remote;

import com.epsiyaya.projetvideoejb.model.ElementPanier;
import java.util.Map;
import javax.ejb.Remote;

@Remote
public interface IPannierSession {
	public Map<Integer, ElementPanier> getPannier(int id_cli);
	
	public void addProduit(int idProduit, int quantitee);
	
	public void removeProduit(int idProduit, int quantitee);
	
	public void validerPanier();
}
