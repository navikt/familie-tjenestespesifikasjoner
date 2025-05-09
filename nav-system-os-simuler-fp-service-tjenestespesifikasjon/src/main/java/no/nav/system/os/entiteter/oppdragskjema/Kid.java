
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
 *         <element name="kid" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}kid"/>
 *         <element name="datoKidFom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato"/>
 *         <element name="tidspktReg" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}tidspktReg"/>
 *         <element name="saksbehId" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}saksbehId"/>
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
    "kid",
    "datoKidFom",
    "tidspktReg",
    "saksbehId"
})
@XmlRootElement(name = "kid")
public class Kid {

    @XmlElement(required = true)
    protected String kid;
    @XmlElement(required = true)
    protected String datoKidFom;
    @XmlElement(required = true)
    protected String tidspktReg;
    @XmlElement(required = true)
    protected String saksbehId;

    /**
     * Gets the value of the kid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKid() {
        return kid;
    }

    /**
     * Sets the value of the kid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKid(String value) {
        this.kid = value;
    }

    /**
     * Gets the value of the datoKidFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoKidFom() {
        return datoKidFom;
    }

    /**
     * Sets the value of the datoKidFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoKidFom(String value) {
        this.datoKidFom = value;
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
