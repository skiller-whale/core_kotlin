package table.forwarding

import java.util.Hashtable

// TODO: define a wrapper class that uses delegation to implement `MutableMap<K, V>`
open class ForwardingTable<K, V>

// // TODO: uncomment these function signatures to use for delegation
// open override val entries                          = internalTable.entries
// open override val size: Int                        = internalTable.size
// open override val keys: MutableSet<K>              = internalTable.keys
// open override val values: MutableCollection<V>     = internalTable.values
// open override fun clear(): Unit                    = internalTable.clear()
// open override fun containsKey(key: K): Boolean     = internalTable.contains(key)
// open override fun isEmpty(): Boolean               = internalTable.isEmpty()
// open override fun containsValue(value: V): Boolean = internalTable.containsValue(value)
// open override fun get(key: K): V?                  = internalTable.get(key)
// open override fun put(key: K, value: V): V?        = internalTable.put(key, value)
// open override fun remove(key: K): V?               = internalTable.remove(key)
// open override fun putAll(from: Map<out K, V>)      = internalTable.putAll(from)
