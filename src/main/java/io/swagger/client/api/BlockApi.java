/**
 * Bitcoind
 * The REST API can be enabled with the `-rest` option. The interface runs on the same port as the JSON-RPC interface, by default port `8332` for **mainnet**, port `18332` for **testnet**, and port `18443` for **regtest**.
 *
 * OpenAPI spec version: 0.16
 * Contact: johan@lepetitbloc.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.Block;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class BlockApi {
  String basePath = "http://localhost:3000/rest";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Get block by hash.
  * Given a block hash: returns a block, in binary, hex-encoded binary or JSON formats. The HTTP request and response are both handled entirely in-memory, thus making maximum memory usage at least 2.66MB (1 MB max block, plus hex encoding) per request. With the /notxdetails/ option JSON response will only contain the transaction hash instead of the complete transaction details. The option only affects the JSON response.
   * @param blockHash the block hash
   * @return Block
  */
  public Block restBlockExtended (String blockHash) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'blockHash' is set
    if (blockHash == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'blockHash' when calling restBlockExtended",
        new ApiException(400, "Missing the required parameter 'blockHash' when calling restBlockExtended"));
    }

    // create path and map variables
    String path = "/block/{blockHash}".replaceAll("\\{" + "blockHash" + "\\}", apiInvoker.escapeString(blockHash.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Block) ApiInvoker.deserialize(localVarResponse, "", Block.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get block by hash.
   * Given a block hash: returns a block, in binary, hex-encoded binary or JSON formats. The HTTP request and response are both handled entirely in-memory, thus making maximum memory usage at least 2.66MB (1 MB max block, plus hex encoding) per request. With the /notxdetails/ option JSON response will only contain the transaction hash instead of the complete transaction details. The option only affects the JSON response.
   * @param blockHash the block hash
  */
  public void restBlockExtended (String blockHash, final Response.Listener<Block> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'blockHash' is set
    if (blockHash == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'blockHash' when calling restBlockExtended",
        new ApiException(400, "Missing the required parameter 'blockHash' when calling restBlockExtended"));
    }

    // create path and map variables
    String path = "/block/{blockHash}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "blockHash" + "\\}", apiInvoker.escapeString(blockHash.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Block) ApiInvoker.deserialize(localVarResponse,  "", Block.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get block by hash.
  * Given a block hash: returns a block, in binary, hex-encoded binary or JSON formats. The HTTP request and response are both handled entirely in-memory, thus making maximum memory usage at least 2.66MB (1 MB max block, plus hex encoding) per request. With the /notxdetails/ option JSON response will only contain the transaction hash instead of the complete transaction details. The option only affects the JSON response.
   * @param blockHash The block hash
   * @param format The expected format
   * @return Block
  */
  public Block restBlockNotxdetails (String blockHash, String format) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'blockHash' is set
    if (blockHash == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'blockHash' when calling restBlockNotxdetails",
        new ApiException(400, "Missing the required parameter 'blockHash' when calling restBlockNotxdetails"));
    }
    // verify the required parameter 'format' is set
    if (format == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'format' when calling restBlockNotxdetails",
        new ApiException(400, "Missing the required parameter 'format' when calling restBlockNotxdetails"));
    }

    // create path and map variables
    String path = "/block/notxdetails/{blockHash}.{format}".replaceAll("\\{" + "blockHash" + "\\}", apiInvoker.escapeString(blockHash.toString())).replaceAll("\\{" + "format" + "\\}", apiInvoker.escapeString(format.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Block) ApiInvoker.deserialize(localVarResponse, "", Block.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get block by hash.
   * Given a block hash: returns a block, in binary, hex-encoded binary or JSON formats. The HTTP request and response are both handled entirely in-memory, thus making maximum memory usage at least 2.66MB (1 MB max block, plus hex encoding) per request. With the /notxdetails/ option JSON response will only contain the transaction hash instead of the complete transaction details. The option only affects the JSON response.
   * @param blockHash The block hash   * @param format The expected format
  */
  public void restBlockNotxdetails (String blockHash, String format, final Response.Listener<Block> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'blockHash' is set
    if (blockHash == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'blockHash' when calling restBlockNotxdetails",
        new ApiException(400, "Missing the required parameter 'blockHash' when calling restBlockNotxdetails"));
    }
    // verify the required parameter 'format' is set
    if (format == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'format' when calling restBlockNotxdetails",
        new ApiException(400, "Missing the required parameter 'format' when calling restBlockNotxdetails"));
    }

    // create path and map variables
    String path = "/block/notxdetails/{blockHash}.{format}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "blockHash" + "\\}", apiInvoker.escapeString(blockHash.toString())).replaceAll("\\{" + "format" + "\\}", apiInvoker.escapeString(format.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Block) ApiInvoker.deserialize(localVarResponse,  "", Block.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
