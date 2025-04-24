
package no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Attestant complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Attestant">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="attestantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ugyldigFom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attestant", propOrder = {
    "attestantId",
    "ugyldigFom"
})
public class Attestant {

    /**
     * Attestant (funksjonærid)
     * 
     */
    protected String attestantId;
    /**
     * Dato for når attestasjonen ikke er gyldig lengre.  Format åååå-mm-dd
     * 
     */
    protected String ugyldigFom;

    /**
     * Attestant (funksjonærid)
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
     * @see #getAttestantId()
     */
    public void setAttestantId(String value) {
        this.attestantId = value;
    }

    /**
     * Dato for når attestasjonen ikke er gyldig lengre.  Format åååå-mm-dd
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUgyldigFom() {
        return ugyldigFom;
    }

    /**
     * Sets the value of the ugyldigFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUgyldigFom()
     */
    public void setUgyldigFom(String value) {
        this.ugyldigFom = value;
    }

}
