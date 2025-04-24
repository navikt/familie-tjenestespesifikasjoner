
package no.nav.system.os.entiteter.oppdragskjema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element name="refunderesId" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}fnrOrgnr" minOccurs="0"/>
 *         <element name="maksDato" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato" minOccurs="0"/>
 *         <element name="datoFom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato" minOccurs="0"/>
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
    "refunderesId",
    "maksDato",
    "datoFom"
})
@XmlRootElement(name = "refusjonsInfo")
public class RefusjonsInfo {

    protected String refunderesId;
    protected String maksDato;
    protected String datoFom;

    /**
     * Gets the value of the refunderesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefunderesId() {
        return refunderesId;
    }

    /**
     * Sets the value of the refunderesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefunderesId(String value) {
        this.refunderesId = value;
    }

    /**
     * Gets the value of the maksDato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaksDato() {
        return maksDato;
    }

    /**
     * Sets the value of the maksDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaksDato(String value) {
        this.maksDato = value;
    }

    /**
     * Gets the value of the datoFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoFom() {
        return datoFom;
    }

    /**
     * Sets the value of the datoFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoFom(String value) {
        this.datoFom = value;
    }

}
