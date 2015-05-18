/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sharedwhiteboard;

import io.vertx.core.Vertx;

/**
 *
 * @author yassine
 */
public class MainProg {
     // Convenience method so you can run it in your IDE
  public static void main(String[] args) {
   Vertx vertx= Vertx.vertx();
   vertx.deployVerticle(new Server());
  }
}
