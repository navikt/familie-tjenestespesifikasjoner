//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.16 at 09:20:59 PM CET 
//


package no.trygdeetaten.skjema.oppdrag;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Inneholder elementene som skal være med i en input 113-rekord: Bilagstype
 * 
 * <p>Java class for bilagstype-113 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bilagstype-113"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bilagsType" type="{http://www.trygdeetaten.no/skjema/oppdrag}TbilagsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bilagstype-113", propOrder = {
    "bilagsType"
})
public class Bilagstype113 {

    @XmlElement(required = true)
    protected String bilagsType;

    /**
     * Gets the value of the bilagsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilagsType() {
        return bilagsType;
    }

    /**
     * Sets the value of the bilagsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilagsType(String value) {
        this.bilagsType = value;
    }

}
