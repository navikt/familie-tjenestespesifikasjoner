
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
 *         &lt;element name="omPostering"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="J"/&gt;
 *               &lt;enumeration value="N"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="datoOmposterFom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato" minOccurs="0"/&gt;
 *         &lt;element name="feilreg" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}feilreg" minOccurs="0"/&gt;
 *         &lt;element name="tidspktReg" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}tidspktReg"/&gt;
 *         &lt;element name="saksbehId" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}saksbehId"/&gt;
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
    "omPostering",
    "datoOmposterFom",
    "feilreg",
    "tidspktReg",
    "saksbehId"
})
@XmlRootElement(name = "ompostering")
public class Ompostering {

    @XmlElement(required = true)
    protected String omPostering;
    protected String datoOmposterFom;
    protected String feilreg;
    @XmlElement(required = true)
    protected String tidspktReg;
    @XmlElement(required = true)
    protected String saksbehId;

    /**
     * Gets the value of the omPostering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmPostering() {
        return omPostering;
    }

    /**
     * Sets the value of the omPostering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmPostering(String value) {
        this.omPostering = value;
    }

    /**
     * Gets the value of the datoOmposterFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoOmposterFom() {
        return datoOmposterFom;
    }

    /**
     * Sets the value of the datoOmposterFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoOmposterFom(String value) {
        this.datoOmposterFom = value;
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

    /**
     * Gets the value of the tidspktReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTidspktReg() {
        return tidspktReg;
    }

    /**
     * Sets the value of the tidspktReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTidspktReg(String value) {
        this.tidspktReg = value;
    }

    /**
     * Gets the value of the saksbehId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaksbehId() {
        return saksbehId;
    }

    /**
     * Sets the value of the saksbehId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaksbehId(String value) {
        this.saksbehId = value;
    }

}
