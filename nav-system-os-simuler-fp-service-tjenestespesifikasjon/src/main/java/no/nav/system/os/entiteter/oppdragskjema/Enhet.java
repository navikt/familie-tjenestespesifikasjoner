
package no.nav.system.os.entiteter.oppdragskjema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="typeEnhet" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}typeEnhet"/>
 *         <element name="enhet" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}enhet" minOccurs="0"/>
 *         <element name="datoEnhetFom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "typeEnhet",
    "enhet",
    "datoEnhetFom"
})
@XmlRootElement(name = "enhet")
public class Enhet {

    @XmlElement(required = true)
    protected String typeEnhet;
    protected String enhet;
    @XmlElement(required = true)
    protected String datoEnhetFom;

    /**
     * Gets the value of the typeEnhet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeEnhet() {
        return typeEnhet;
    }

    /**
     * Sets the value of the typeEnhet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeEnhet(String value) {
        this.typeEnhet = value;
    }

    /**
     * Gets the value of the enhet property.
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
     */
    public void setEnhet(String value) {
        this.enhet = value;
    }

    /**
     * Gets the value of the datoEnhetFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoEnhetFom() {
        return datoEnhetFom;
    }

    /**
     * Sets the value of the datoEnhetFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoEnhetFom(String value) {
        this.datoEnhetFom = value;
    }

}
