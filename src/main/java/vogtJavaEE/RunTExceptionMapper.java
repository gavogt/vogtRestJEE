/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vogtJavaEE;

/**
 *
 * @author AQLMAOBCQ
 */

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class RunTExceptionMapper
  implements ExceptionMapper<RuntimeException>
{

    /**
     *
     * @param exception
     * @return
     */
    @Override
  public Response toResponse(RuntimeException exception)
  {
    return Response.status(Response.Status.OK).header("~~~~~~~EXPLAIN:", exception.getMessage()).build();
  }
}