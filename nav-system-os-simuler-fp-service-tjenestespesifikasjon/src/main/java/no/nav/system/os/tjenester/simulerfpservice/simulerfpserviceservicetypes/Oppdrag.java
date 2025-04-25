
package no.nav.system.os.tjenester.simulerfpservice.simulerfpserviceservicetypes;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.system.os.entiteter.oppdragskjema.Avstemmingsnokkel;
import no.nav.system.os.entiteter.oppdragskjema.Bilagstype;
import no.nav.system.os.entiteter.oppdragskjema.Ompostering;


/**
 * <p>Java class for oppdrag complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="oppdrag">
 *   <complexContent>
 *     <extension base="{http://nav.no/system/os/entiteter/oppdragSkjema}oppdrag">
 *       <sequence>
 *         <element ref="{http://nav.no/system/os/entiteter/oppdragSkjema}bilagstype" maxOccurs="50" minOccurs="0"/>
 *         <element ref="{http://nav.no/system/os/entiteter/oppdragSkjema}avstemmingsnokkel" maxOccurs="50" minOccurs="0"/>
 *         <element ref="{http://nav.no/system/os/entiteter/oppdragSkjema}ompostering" minOccurs="0"/>
 *         <element name="oppdragslinje" type="{http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceServiceTypes}oppdragslinje" maxOccurs="1400" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oppdrag", propOrder = {
    "bilagstype",
    "avstemmingsnokkel",
    "ompostering",
    "oppdragslinje"
})
public class Oppdrag
    extends no.nav.system.os.entiteter.oppdragskjema.Oppdrag
{

    /**
     * Referanse ID 113
     * 
     */
    @XmlElement(namespace = "http://nav.no/system/os/entiteter/oppdragSkjema")
    protected List<Bilagstype> bilagstype;
    /**
     * Referanse ID 115
     * 
     */
    @XmlElement(namespace = "http://nav.no/system/os/entiteter/oppdragSkjema")
    protected List<Avstemmingsnokkel> avstemmingsnokkel;
    /**
     * Referanse ID 116
     * 
     */
    @XmlElement(namespace = "http://nav.no/system/os/entiteter/oppdragSkjema")
    protected Ompostering ompostering;
    protected List<Oppdragslinje> oppdragslinje;

    /**
     * Referanse ID 113
     * 
     * Gets the value of the bilagstype property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bilagstype property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBilagstype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bilagstype }
     * </p>
     * 
     * 
     * @return
     *     The value of the bilagstype property.
     */
    public List<Bilagstype> getBilagstype() {
        if (bilagstype == null) {
            bilagstype = new ArrayList<>();
        }
        return this.bilagstype;
    }

    /**
     * Referanse ID 115
     * 
     * Gets the value of the avstemmingsnokkel property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avstemmingsnokkel property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAvstemmingsnokkel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Avstemmingsnokkel }
     * </p>
     * 
     * 
     * @return
     *     The value of the avstemmingsnokkel property.
     */
    public List<Avstemmingsnokkel> getAvstemmingsnokkel() {
        if (avstemmingsnokkel == null) {
            avstemmingsnokkel = new ArrayList<>();
        }
        return this.avstemmingsnokkel;
    }

    /**
     * Referanse ID 116
     * 
     * @return
     *     possible object is
     *     {@link Ompostering }
     *     
     */
    public Ompostering getOmpostering() {
        return ompostering;
    }

    /**
     * Sets the value of the ompostering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ompostering }
     *     
     * @see #getOmpostering()
     */
    public void setOmpostering(Ompostering value) {
        this.ompostering = value;
    }

    /**
     * Gets the value of the oppdragslinje property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oppdragslinje property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOppdragslinje().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Oppdragslinje }
     * </p>
     * 
     * 
     * @return
     *     The value of the oppdragslinje property.
     */
    public List<Oppdragslinje> getOppdragslinje() {
        if (oppdragslinje == null) {
            oppdragslinje = new ArrayList<>();
        }
        return this.oppdragslinje;
    }

}
