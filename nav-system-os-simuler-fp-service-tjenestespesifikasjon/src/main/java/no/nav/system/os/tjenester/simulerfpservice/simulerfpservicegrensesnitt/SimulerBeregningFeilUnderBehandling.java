
package no.nav.system.os.tjenester.simulerfpservice.simulerfpservicegrensesnitt;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.0
 * 2023-03-17T15:51:46.062+01:00
 * Generated source version: 4.0.0
 */

@WebFault(name = "simulerBeregningFeilUnderBehandling", targetNamespace = "http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceGrensesnitt")
public class SimulerBeregningFeilUnderBehandling extends Exception {

    private no.nav.system.os.tjenester.simulerfpservice.feil.FeilUnderBehandling faultInfo;

    public SimulerBeregningFeilUnderBehandling() {
        super();
    }

    public SimulerBeregningFeilUnderBehandling(String message) {
        super(message);
    }

    public SimulerBeregningFeilUnderBehandling(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public SimulerBeregningFeilUnderBehandling(String message, no.nav.system.os.tjenester.simulerfpservice.feil.FeilUnderBehandling simulerBeregningFeilUnderBehandling) {
        super(message);
        this.faultInfo = simulerBeregningFeilUnderBehandling;
    }

    public SimulerBeregningFeilUnderBehandling(String message, no.nav.system.os.tjenester.simulerfpservice.feil.FeilUnderBehandling simulerBeregningFeilUnderBehandling, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = simulerBeregningFeilUnderBehandling;
    }

    public no.nav.system.os.tjenester.simulerfpservice.feil.FeilUnderBehandling getFaultInfo() {
        return this.faultInfo;
    }
}