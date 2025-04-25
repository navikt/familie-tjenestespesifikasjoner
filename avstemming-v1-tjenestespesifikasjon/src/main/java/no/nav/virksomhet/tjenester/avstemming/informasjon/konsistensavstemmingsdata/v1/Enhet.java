
package no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Enhet complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Enhet">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="enhetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="enhet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="enhetFom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Enhet", propOrder = {
    "enhetType",
    "enhet",
    "enhetFom"
})
public class Enhet {

    /**
     * Enhetstype angir hva slags type enhet som mottas. Kodeverk for enhet, for eks BEH eller BOS.
     * 
     */
    protected String enhetType;
    /**
     * Enhet identifiserer den aktuelle enheten
     * 
     */
    protected String enhet;
    /**
     * Dato-enhet-fom angir når denne gjelder fra (åååå-mm-dd)
     * 
     */
    protected String enhetFom;

    /**
     * Enhetstype angir hva slags type enhet som mottas. Kodeverk for enhet, for eks BEH eller BOS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhetType() {
        return enhetType;
    }

    /**
     * Sets the value of the enhetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEnhetType()
     */
    public void setEnhetType(String value) {
        this.enhetType = value;
    }

    /**
     * Enhet identifiserer den aktuelle enheten
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhet() {
        return enhet;
    }

    /**
     * Sets the value of the enhet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEnhet()
     */
    public void setEnhet(String value) {
        this.enhet = value;
    }

    /**
     * Dato-enhet-fom angir når denne gjelder fra (åååå-mm-dd)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhetFom() {
        return enhetFom;
    }

    /**
     * Sets the value of the enhetFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEnhetFom()
     */
    public void setEnhetFom(String value) {
        this.enhetFom = value;
    }

}
