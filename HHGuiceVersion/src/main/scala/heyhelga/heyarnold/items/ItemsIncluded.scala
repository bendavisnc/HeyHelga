package heyhelga.heyarnold.items

import com.google.inject.Inject
import heyhelga.common.heyarnold.items.ItemsIncludedProto
import heyhelga.common.heyarnold.items.snacks.Snack

trait ItemsIncluded extends ItemsIncludedProto {


	@Inject
	var snack: Snack = null

}
