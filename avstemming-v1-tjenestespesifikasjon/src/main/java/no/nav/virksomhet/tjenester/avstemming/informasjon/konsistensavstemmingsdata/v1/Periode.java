
package no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Periode complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Periode">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Periode", propOrder = {
    "fom",
    "tom"
})
public class Periode {

    /**
     * Format åååå-mm-dd
     * 
     */
    protected String fom;
    /**
     * Format åååå-mm-dd
     * 
     */
    protected String tom;

    /**
     * Format åååå-mm-dd
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFom() {
        return fom;
    }

    /**
     * Sets the value of the fom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFom()
     */
    public void setFom(String value) {
        this.fom = value;
    }

    /**
     * Format åååå-mm-dd
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTom() {
        return tom;
    }

    /**
     * Sets the value of the tom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTom()
     */
    public void setTom(String value) {
        this.tom = value;
    }

}
