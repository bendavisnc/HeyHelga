package heyhelga.heyarnold.items.snacks

import com.google.inject.Inject
import com.google.inject.name.Named
import heyhelga.common.heyarnold.items.snacks.FudgeSicleProto

case object FudgeSicle extends FudgeSicleProto {


	@Inject
	@Named("isHalfMelted")
	var isHalfMelted: Boolean = false

}

