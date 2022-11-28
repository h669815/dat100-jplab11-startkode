package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	// TODO: objektvariable 

	public Blogg() {
		this.nesteledig = 0;
		this.innleggtabell = new Innlegg[10];
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		this.nesteledig = 0;
	}
	
	public int getAntall() {
        int antallInnlegg = 0;
        for (int i = 0; i < this.innleggtabell.length; i ++)
            if (this.innleggtabell[i] != null) {
                antallInnlegg++;
            }
        return antallInnlegg;
	}
	
	public Innlegg[] getSamling() {
		innleggtabell = new Innlegg[40];
		nesteledig = 0;
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		if (innlegg == null) return -1;
		for (int i = 0; i < this.innleggtabell.length; i++) {
			if (innleggtabell[i] != null && innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		if (innlegg == null) return false;
		for (Innlegg value : this.innleggtabell) {
			if (value != null && value.erLik(innlegg)) {
				return true;
			}
		}
		return false;
	}
	

	public boolean ledigPlass() {
		return this.nesteledig < this.innleggtabell.length;
		}
	
	public boolean leggTil(Innlegg innlegg) {
		if (innlegg != null && this.ledigPlass()) {
			this.innleggtabell[this.nesteledig] = innlegg;
			this.nesteledig++;
			return true;
		}
		return false;
	}
	
	public String toString() {
        String B = "";
        for(int i=0; i< innleggtabell.length;i++) {
        	B = B + innleggtabell[i].toString();
        }
        return getAntall() + "\n" + B;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}