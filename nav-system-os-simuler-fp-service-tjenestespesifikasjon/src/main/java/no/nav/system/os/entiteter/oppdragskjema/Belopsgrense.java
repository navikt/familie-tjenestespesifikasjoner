
package no.nav.system.os.entiteter.oppdragskjema;

import java.math.BigDecimal;
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
 *         &lt;element name="typeGrense"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="belopGrense" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}belop"/&gt;
 *         &lt;element name="datoGrenseFom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato"/&gt;
 *         &lt;element name="datoGrenseTom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato" minOccurs="0"/&gt;
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
    "typeGrense",
    "belopGrense",
    "datoGrenseFom",
    "datoGrenseTom",
    "feilreg"
})
@XmlRootElement(name = "belopsgrense")
public class Belopsgrense {

    @XmlElement(required = true)
    protected String typeGrense;
    @XmlElement(required = true)
    protected BigDecimal belopGrense;
    @XmlElement(required = true)
    protected String datoGrenseFom;
    protected String datoGrenseTom;
    protected String feilreg;

    /**
     * Gets the value of the typeGrense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeGrense() {
        return typeGrense;
    }

    /**
     * Sets the value of the typeGrense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeGrense(String value) {
        this.typeGrense = value;
    }

    /**
     * Gets the value of the belopGrense property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBelopGrense() {
        return belopGrense;
    }

    /**
     * Sets the value of the belopGrense property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBelopGrense(BigDecimal value) {
        this.belopGrense = value;
    }

    /**
     * Gets the value of the datoGrenseFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoGrenseFom() {
        return datoGrenseFom;
    }

    /**
     * Sets the value of the datoGrenseFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoGrenseFom(String value) {
        this.datoGrenseFom = value;
    }

    /**
     * Gets the value of the datoGrenseTom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoGrenseTom() {
        return datoGrenseTom;
    }

    /**
     * Sets the value of the datoGrenseTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoGrenseTom(String value) {
        this.datoGrenseTom = value;
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
