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

package io.swagger.client.model;

import io.swagger.client.model.Transaction;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponseDefault {
  
  @SerializedName("txid")
  private Transaction txid = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Transaction getTxid() {
    return txid;
  }
  public void setTxid(Transaction txid) {
    this.txid = txid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponseDefault inlineResponseDefault = (InlineResponseDefault) o;
    return (this.txid == null ? inlineResponseDefault.txid == null : this.txid.equals(inlineResponseDefault.txid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.txid == null ? 0: this.txid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponseDefault {\n");
    
    sb.append("  txid: ").append(txid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
