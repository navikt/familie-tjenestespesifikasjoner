
package no.nav.system.os.entiteter.typer.simpletypes;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Typen beskriver formatet og begrensningene til kodeStatus.
 * 
 * <p>Java class for kodeStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="kodeStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NY"/>
 *     <enumeration value="LOPE"/>
 *     <enumeration value="HVIL"/>
 *     <enumeration value="SPER"/>
 *     <enumeration value="IKAT"/>
 *     <enumeration value="ATTE"/>
 *     <enumeration value="ANNU"/>
 *     <enumeration value="OPPH"/>
 *     <enumeration value="FBER"/>
 *     <enumeration value="REAK"/>
 *     <enumeration value="KORR"/>
 *     <enumeration value="FEIL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "kodeStatus", namespace = "http://nav.no/system/os/entiteter/typer/simpleTypes")
@XmlEnum
public enum KodeStatus {

    NY,
    LOPE,
    HVIL,
    SPER,
    IKAT,
    ATTE,
    ANNU,
    OPPH,
    FBER,
    REAK,
    KORR,
    FEIL;

    public String value() {
        return name();
    }

    public static KodeStatus fromValue(String v) {
        return valueOf(v);
    }

}
