package heyhelga.heyarnold.items.snacks

import heyhelga.common.heyarnold.items.snacks.FudgeSicleProto
import heyhelga.scaldi.moduleincluded.DynamicModuleIncluded

case object FudgeSicle extends FudgeSicleProto with DynamicModuleIncluded {

	import scaldi.Injectable._

	val isHalfMelted: Boolean = inject[Boolean]('isHalfMelted)
}

