
package no.nav.okonomi.tilbakekrevingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import no.nav.tilbakekreving.kravgrunnlag.hentliste.v1.HentKravgrunnlagListeDto;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hentKravgrunnlagListe" type="{urn:no:nav:tilbakekreving:kravgrunnlag:hentliste:v1}HentKravgrunnlagListeDto"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
