
package no.nav.system.os.entiteter.oppdragskjema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="typeValuta"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="FAKT"/&gt;
 *               &lt;enumeration value="FRAM"/&gt;
 *               &lt;enumeration value="UTB"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="valuta"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="datoValutaFom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato"/&gt;
 *         &lt;element name="feilreg" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}feilreg" minOccurs="0"/&gt;
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
    "typeValuta",
    "valuta",
    "datoValutaFom",
    "feilreg"
})
@XmlRootElement(name = "valuta")
public class Valuta {

    @XmlElement(required = true)
    protected String typeValuta;
    @XmlElement(required = true)
    protected String valuta;
    @XmlElement(required = true)
    protected String datoValutaFom;
    protected String feilreg;

    /**
     * Gets the value of the typeValuta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeValuta() {
        return typeValuta;
    }

    /**
     * Sets the value of the typeValuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeValuta(String value) {
        this.typeValuta = value;
    }

    /**
     * Gets the value of the valuta property.
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
     */
    public void setValuta(String value) {
        this.valuta = value;
    }

    /**
     * Gets the value of the datoValutaFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoValutaFom() {
        return datoValutaFom;
    }

    /**
     * Sets the value of the datoValutaFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoValutaFom(String value) {
        this.datoValutaFom = value;
    }

    /**
     * Gets the value of the feilreg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeilreg() {
        return feilreg;
    }

    /**
     * Sets the value of the feilreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeilreg(String value) {
        this.feilreg = value;
    }

}
