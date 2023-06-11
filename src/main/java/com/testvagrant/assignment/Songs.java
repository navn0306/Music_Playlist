package com.testvagrant.assignment;

import java.util.Deque;
import java.util.ArrayDeque;

public class Songs {

	static Deque<String> playList = new ArrayDeque<String>();

	// Method to create a Playlist with Array of String of Songs
	protected String[] createPlaylist(int size, String[] songs) throws SongsException {
		try {
			if (size <= 0) {
				System.out.println("Invalid Length");
				System.exit(0);
			}
			for (int i = 0; i < size; i++) {
				if (songs[i].length() > 0) {
					playList.addLast(songs[i]);
				} else {
					System.out.print("Empty string encountered");
					System.exit(0);
				}
			}
		} catch (NullPointerException e) { // Exception handling for Empty String
			throw new SongsException("Empty string encountered", SongsException.ExceptionType.NULL);
		}
		System.out.println("Playlist is : " + playList);
		String[] playListArray = playList.toArray(new String[playList.size()]);
		return playListArray;
	}

	// Method to play a new song and insert it into playlist by replacing the first
	// song in the playlist
	protected String[] playSong(String song) throws SongsException {
		try {
			if (song.length() == 0) {
				System.out.println("Empty string encountered");
			} else if (playList.size() >= 3) {
				playList.removeFirst();
				playList.addLast(song);
				System.out.println("Current Playlist is : " + playList);
			} else {
				playList.addLast(song);
				System.out.println("Current Playlist is : " + playList);
			}
		} catch (NullPointerException e) { // Exception handling for Empty String
			throw new SongsException("Empty string encountered", SongsException.ExceptionType.NULL);
		}
		String[] playListArray = playList.toArray(new String[playList.size()]);
		return playListArray;
	}

	public static void main(String[] args) throws SongsException {
		Songs songObj = new Songs();
		String[] listOfSongs = { "s1", "s2", "s3" };
		songObj.createPlaylist(3, listOfSongs);
		songObj.playSong("s4");
		songObj.playSong("s5");
		songObj.playSong("s1");
		songObj.playSong("");
	}
}