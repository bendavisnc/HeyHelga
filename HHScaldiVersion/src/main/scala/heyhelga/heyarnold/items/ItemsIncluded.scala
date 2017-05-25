package heyhelga.heyarnold.items

import heyhelga.common.heyarnold.items.ItemsIncludedProto
import heyhelga.common.heyarnold.items.snacks.Snack
import heyhelga.scaldi.moduleincluded.DynamicModuleIncluded

trait ItemsIncluded extends ItemsIncludedProto with DynamicModuleIncluded {

	import scaldi.Injectable._

	val snack: Snack = inject[Snack]

}
