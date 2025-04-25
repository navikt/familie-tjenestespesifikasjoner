
package no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Valuta complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Valuta">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="valutaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="valuta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="valutaFom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="feilregistrering" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Valuta", propOrder = {
    "valutaType",
    "valuta",
    "valutaFom",
    "feilregistrering"
})
public class Valuta {

    /**
     * Valutatype
     * 
     */
    protected String valutaType;
    /**
     * Valuta
     * 
     */
    protected String valuta;
    /**
     * Når ny valuta gjelder fra.  Format åååå-mm-dd
     * 
     */
    protected String valutaFom;
    /**
     * Settes til J hvis valutaen var en feilregistrering
     * 
     */
    protected String feilregistrering;

    /**
     * Valutatype
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValutaType() {
        return valutaType;
    }

    /**
     * Sets the value of the valutaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValutaType()
     */
    public void setValutaType(String value) {
        this.valutaType = value;
    }

    /**
     * Valuta
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuta() {
        return valuta;
    }

    /**
     * Sets the value of the valuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValuta()
     */
    public void setValuta(String value) {
        this.valuta = value;
    }

    /**
     * Når ny valuta gjelder fra.  Format åååå-mm-dd
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValutaFom() {
        return valutaFom;
    }

    /**
     * Sets the value of the valutaFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValutaFom()
     */
    public void setValutaFom(String value) {
        this.valutaFom = value;
    }

    /**
     * Settes til J hvis valutaen var en feilregistrering
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeilregistrering() {
        return feilregistrering;
    }

    /**
     * Sets the value of the feilregistrering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFeilregistrering()
     */
    public void setFeilregistrering(String value) {
        this.feilregistrering = value;
    }

}
