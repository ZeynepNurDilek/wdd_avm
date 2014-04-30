/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package avm;

/**
 *
 * @author zeynep
 */
public enum Sezonlar {
    ILKBAHAR(10),
    YAZ(15),
    SONBAHAR(20),
    KIS(30);
    
    // Constructor
	private Sezonlar(final int indirim) {
		this.indirim = indirim;
	}

	// Internal state
	private int indirim;

	public int getIndirim() {
		return indirim;
	}
}
