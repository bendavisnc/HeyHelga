package heyhelga

import heyhelga.app.HeyHelgaApp
import utest._

object BasicTests extends TestSuite {

	val expectedResult: String = """
		 |Today's Episodes -------------------------------------------------------
		 |
		 |"A Pataki Palooza"
		 |Helga - angry and annoyed, shouts "Outta my way you negation to humanity!"
		 |
		 |"Helga's Stalker"
		 |Helga - <punches Brainy on the nose.>
		 |""".stripMargin


	val tests = this {

		'simple_test {
			val result = HeyHelgaApp.todaysEpisodes
			assert(result == expectedResult)
			result
		}
	}

}