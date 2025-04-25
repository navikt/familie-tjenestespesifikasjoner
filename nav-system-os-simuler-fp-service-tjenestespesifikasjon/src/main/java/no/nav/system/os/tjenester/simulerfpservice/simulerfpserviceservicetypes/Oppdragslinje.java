
package no.nav.system.os.tjenester.simulerfpservice.simulerfpserviceservicetypes;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.system.os.entiteter.oppdragskjema.Attestant;
import no.nav.system.os.entiteter.oppdragskjema.Enhet;
import no.nav.system.os.entiteter.oppdragskjema.Grad;
import no.nav.system.os.entiteter.oppdragskjema.RefusjonsInfo;
import no.nav.system.os.entiteter.oppdragskjema.Tekst;
import no.nav.system.os.entiteter.oppdragskjema.Valuta;


/**
 * <p>Java class for oppdragslinje complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="oppdragslinje">
 *   <complexContent>
 *     <extension base="{http://nav.no/system/os/entiteter/oppdragSkjema}oppdragslinje">
 *       <sequence>
 *         <element ref="{http://nav.no/system/os/entiteter/oppdragSkjema}refusjonsInfo" minOccurs="0"/>
 *         <element ref="{http://nav.no/system/os/entiteter/oppdragSkjema}tekst" maxOccurs="50" minOccurs="0"/>
 *         <element ref="{http://nav.no/system/os/entiteter/oppdragSkjema}enhet" maxOccurs="50" minOccurs="0"/>
 *         <element ref="{http://nav.no/system/os/entiteter/oppdragSkjema}grad" maxOccurs="50" minOccurs="0"/>
 *         <element ref="{http://nav.no/system/os/entiteter/oppdragSkjema}attestant" maxOccurs="50" minOccurs="0"/>
 *         <element ref="{http://nav.no/system/os/entiteter/oppdragSkjema}valuta" maxOccurs="50" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oppdragslinje", propOrder = {
    "refusjonsInfo",
    "tekst",
    "enhet",
    "grad",
    "attestant",
    "valuta"
})
public class Oppdragslinje
    extends no.nav.system.os.entiteter.oppdragskjema.Oppdragslinje
{

    /**
     * Referanse ID 156
     * 
     */
    @XmlElement(namespace = "http://nav.no/system/os/entiteter/oppdragSkjema")
    protected RefusjonsInfo refusjonsInfo;
    /**
     * Referanse ID 158 dersom tekst tihørende oppdragslinje
     * 
     */
    @XmlElement(namespace = "http://nav.no/system/os/entiteter/oppdragSkjema")
    protected List<Tekst> tekst;
    /**
     * Referanse ID 160 dersom enhet på nivå oppdragslinje
     * 
     */
    @XmlElement(namespace = "http://nav.no/system/os/entiteter/oppdragSkjema")
    protected List<Enhet> enhet;
    /**
     * Referanse ID 170
     * 
     */
    @XmlElement(namespace = "http://nav.no/system/os/entiteter/oppdragSkjema")
    protected List<Grad> grad;
    /**
     * Referanse ID 180
     * 
     */
    @XmlElement(namespace = "http://nav.no/system/os/entiteter/oppdragSkjema")
    protected List<Attestant> attestant;
    /**
     * Referanse ID 190
     * 
     */
    @XmlElement(namespace = "http://nav.no/system/os/entiteter/oppdragSkjema")
    protected List<Valuta> valuta;

    /**
     * Referanse ID 156
     * 
     * @return
     *     possible object is
     *     {@link RefusjonsInfo }
     *     
     */
    public RefusjonsInfo getRefusjonsInfo() {
        return refusjonsInfo;
    }

    /**
     * Sets the value of the refusjonsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefusjonsInfo }
     *     
     * @see #getRefusjonsInfo()
     */
    public void setRefusjonsInfo(RefusjonsInfo value) {
        this.refusjonsInfo = value;
    }

    /**
     * Referanse ID 158 dersom tekst tihørende oppdragslinje
     * 
     * Gets the value of the tekst property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tekst property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTekst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tekst }
     * </p>
     * 
     * 
     * @return
     *     The value of the tekst property.
     */
    public List<Tekst> getTekst() {
        if (tekst == null) {
            tekst = new ArrayList<>();
        }
        return this.tekst;
    }

    /**
     * Referanse ID 160 dersom enhet på nivå oppdragslinje
     * 
     * Gets the value of the enhet property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enhet property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEnhet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Enhet }
     * </p>
     * 
     * 
     * @return
     *     The value of the enhet property.
     */
    public List<Enhet> getEnhet() {
        if (enhet == null) {
            enhet = new ArrayList<>();
        }
        return this.enhet;
    }

    /**
     * Referanse ID 170
     * 
     * Gets the value of the grad property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grad property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGrad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Grad }
     * </p>
     * 
     * 
     * @return
     *     The value of the grad property.
     */
    public List<Grad> getGrad() {
        if (grad == null) {
            grad = new ArrayList<>();
        }
        return this.grad;
    }

    /**
     * Referanse ID 180
     * 
     * Gets the value of the attestant property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attestant property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttestant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attestant }
     * </p>
     * 
     * 
     * @return
     *     The value of the attestant property.
     */
    public List<Attestant> getAttestant() {
        if (attestant == null) {
            attestant = new ArrayList<>();
        }
        return this.attestant;
    }

    /**
     * Referanse ID 190
     * 
     * Gets the value of the valuta property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valuta property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getValuta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Valuta }
     * </p>
     * 
     * 
     * @return
     *     The value of the valuta property.
     */
    public List<Valuta> getValuta() {
        if (valuta == null) {
            valuta = new ArrayList<>();
        }
        return this.valuta;
    }

}
