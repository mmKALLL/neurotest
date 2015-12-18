package neurotest
package network

import scala.collection.mutable.ArrayBuffer

/**
 * This class represents a single network and controls the nodes 
 * within, distributing and managing IDs and names, etc.
 * 
 * An important part of Network is keeping track of when the network is
 * ready to output, at which point it flushes the output nodes' data.
 * 
 */
class Network {
  // TODO: specification implementation
  
  private val nodes = ArrayBuffer[NetworkNode]()
  private var ready = false
  
  def addNode(name: String) = {
    
  }
  
  def run = ???
  
  def flush = ???
  
}
