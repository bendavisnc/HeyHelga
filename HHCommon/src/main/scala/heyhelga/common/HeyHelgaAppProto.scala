package heyhelga.common

import heyhelga.common.heyarnold.episode.Episode


trait HeyHelgaAppProto {

	def firstEpisode: Episode

	def secondEpisode: Episode

	def todaysEpisodes: String = {
		s"""
			|Today's Episodes -------------------------------------------------------
			|
			|"${firstEpisode.title}"
			|
			|${firstEpisode.script}
			|
			|
			|"${secondEpisode.title}"
			|
			|${secondEpisode.script}
			|""".stripMargin
	}


	def main(args: Array[String]) = {
		print(todaysEpisodes)
	}
}
