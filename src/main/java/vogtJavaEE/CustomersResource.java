/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vogtJavaEE;

import vogtJavaEE.Customer;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

@Path("customers")
public class CustomersResource
{

    /**
     *
     * @param http
     * @return
     */
    @GET
  public JsonArray Customer(@Context HttpHeaders http)
  {
    JsonObject object = Json.createObjectBuilder().add("firstname", "Gabey").build();
    
    throw new RuntimeException("ERROR MESSAGE");
  }
  
    /**
     *
     * @param first
     * @param last
     * @return
     */
    @GET
  @Path("{first}-{last}")
  public Customer customer(@PathParam("first") String first, @PathParam("last") String last)
  {
    return new Customer(first, last);
  }
}