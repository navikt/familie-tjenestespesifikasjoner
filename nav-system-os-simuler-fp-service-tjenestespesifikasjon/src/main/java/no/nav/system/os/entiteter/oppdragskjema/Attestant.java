
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
 *         &lt;element name="attestantId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="datoUgyldigFom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato" minOccurs="0"/&gt;
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
    "attestantId",
    "datoUgyldigFom"
})
@XmlRootElement(name = "attestant")
public class Attestant {

    @XmlElement(required = true)
    protected String attestantId;
    protected String datoUgyldigFom;

    /**
     * Gets the value of the attestantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttestantId() {
        return attestantId;
    }

    /**
     * Sets the value of the attestantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttestantId(String value) {
        this.attestantId = value;
    }

    /**
     * Gets the value of the datoUgyldigFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoUgyldigFom() {
        return datoUgyldigFom;
    }

    /**
     * Sets the value of the datoUgyldigFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoUgyldigFom(String value) {
        this.datoUgyldigFom = value;
    }

}
