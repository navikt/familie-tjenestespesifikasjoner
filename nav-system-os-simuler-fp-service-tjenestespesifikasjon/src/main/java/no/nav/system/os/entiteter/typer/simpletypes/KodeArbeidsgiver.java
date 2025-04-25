
package no.nav.system.os.entiteter.typer.simpletypes;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Typen beskriver formatet og begrensningene til kodeArbeidsgiver.
 * 
 * <p>Java class for kodeArbeidsgiver</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="kodeArbeidsgiver">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="A"/>
 *     <enumeration value="S"/>
 *     <enumeration value="P"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "kodeArbeidsgiver", namespace = "http://nav.no/system/os/entiteter/typer/simpleTypes")
@XmlEnum
public enum KodeArbeidsgiver {

    A,
    S,
    P;

    public String value() {
        return name();
    }

    public static KodeArbeidsgiver fromValue(String v) {
        return valueOf(v);
    }

}
