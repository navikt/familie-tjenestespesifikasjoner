
package no.nav.okonomi.tilbakekrevingservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.tilbakekreving.kravgrunnlag.hentliste.v1.HentKravgrunnlagListeDto;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hentKravgrunnlagListe" type="{urn:no:nav:tilbakekreving:kravgrunnlag:hentliste:v1}HentKravgrunnlagListeDto"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hentKravgrunnlagListe"
})
@XmlRootElement(name = "kravgrunnlagHentListeRequest")
public class KravgrunnlagHentListeRequest {

    @XmlElement(required = true)
    protected HentKravgrunnlagListeDto hentKravgrunnlagListe;

    /**
     * Gets the value of the hentKravgrunnlagListe property.
     * 
     * @return
     *     possible object is
     *     {@link HentKravgrunnlagListeDto }
     *     
     */
    public HentKravgrunnlagListeDto getHentKravgrunnlagListe() {
        return hentKravgrunnlagListe;
    }

    /**
     * Sets the value of the hentKravgrunnlagListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link HentKravgrunnlagListeDto }
     *     
     */
    public void setHentKravgrunnlagListe(HentKravgrunnlagListeDto value) {
        this.hentKravgrunnlagListe = value;
    }

}
