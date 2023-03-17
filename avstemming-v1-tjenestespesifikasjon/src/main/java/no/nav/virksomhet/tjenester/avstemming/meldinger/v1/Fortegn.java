
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fortegn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Fortegn"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Fortegn")
@XmlEnum
public enum Fortegn {


    /**
     * Tillegg
     * 
     */
    T,

    /**
     * Fradrag
     * 
     */
    F;

    public String value() {
        return name();
    }

    public static Fortegn fromValue(String v) {
        return valueOf(v);
    }

}
