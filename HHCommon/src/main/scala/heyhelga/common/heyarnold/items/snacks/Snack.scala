package heyhelga.common.heyarnold.items.snacks


trait Snack {

}

case object Oatmeal extends Snack

case object PorkRinds extends Snack

abstract class FudgeSicleProto extends Snack {
	def isHalfMelted: Boolean
}


