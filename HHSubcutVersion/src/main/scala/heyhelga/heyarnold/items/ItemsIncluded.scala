package heyhelga.heyarnold.items

import com.escalatesoft.subcut.inject.Injectable
import heyhelga.common.heyarnold.items.ItemsIncludedProto
import heyhelga.common.heyarnold.items.snacks.Snack

trait ItemsIncluded extends ItemsIncludedProto with Injectable {

	val snack: Snack = inject[Snack]

}
