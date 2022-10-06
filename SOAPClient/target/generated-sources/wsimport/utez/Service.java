
package utez;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Service", targetNamespace = "utez")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Service {


    /**
     * 
     * @param palabra
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Consonantes")
    @WebResult(partName = "return")
    @Action(input = "utez/Service/ConsonantesRequest", output = "utez/Service/ConsonantesResponse")
    public String consonantes(
        @WebParam(name = "palabra", partName = "palabra")
        String palabra);

    /**
     * 
     * @param apellidomaterno
     * @param apellidopaterno
     * @param añodenacimiento
     * @param mesdenacimiento
     * @param nombre
     * @param diadenacimiento
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RFC")
    @WebResult(partName = "return")
    @Action(input = "utez/Service/RFCRequest", output = "utez/Service/RFCResponse")
    public String rfc(
        @WebParam(name = "Nombre", partName = "Nombre")
        String nombre,
        @WebParam(name = "Apellidopaterno", partName = "Apellidopaterno")
        String apellidopaterno,
        @WebParam(name = "Apellidomaterno", partName = "Apellidomaterno")
        String apellidomaterno,
        @WebParam(name = "A\u00f1odenacimiento", partName = "A\u00f1odenacimiento")
        String añodenacimiento,
        @WebParam(name = "Mesdenacimiento", partName = "Mesdenacimiento")
        String mesdenacimiento,
        @WebParam(name = "Diadenacimiento", partName = "Diadenacimiento")
        String diadenacimiento);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "Vocal")
    @WebResult(partName = "return")
    @Action(input = "utez/Service/VocalRequest", output = "utez/Service/VocalResponse")
    public boolean vocal(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

    /**
     * 
     * @param num
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "NumRandom")
    @WebResult(partName = "return")
    @Action(input = "utez/Service/NumRandomRequest", output = "utez/Service/NumRandomResponse")
    public String numRandom(
        @WebParam(name = "num", partName = "num")
        int num);

}
