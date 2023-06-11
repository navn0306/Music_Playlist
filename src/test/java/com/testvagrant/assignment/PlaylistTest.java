package com.testvagrant.assignment;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PlaylistTest {

	@Test
	public void A_givenSizeOfPlaylistWithSongsShouldCreatePlaylist() throws SongsException {
		Songs songsObj = new Songs();
		String[] songs = new String[] { "New world", "High on Mind", "On My Own" };
		songsObj.createPlaylist(3, songs);
		assertTrue(true);
	}

	@Test
	public void B_playedNewSongPlaylistShouldGetUpdatedWithLatestSongs() throws SongsException {
		Songs songsObj = new Songs();
		String[] actualResult = songsObj.playSong("songx");
		String[] expectedResult = { "High on Mind", "On My Own", "songx" };
		assertTrue(Arrays.equals(expectedResult, actualResult));
	}

	@Test
	public void C_givenEmptySongStringShouldNotBeAccepted() throws SongsException {
		Songs songsObj = new Songs();
		songsObj.playSong("");
		assertTrue(true);
	}

	@Test
	public void D_givenSizeOfPlaylistWithEmptyStringsShouldNotCreatePlaylist() throws SongsException {
		Songs songsObj = new Songs();
		String[] songs = new String[] { "", "", "" };
		songsObj.createPlaylist(3, songs);
		assertTrue(false);
	}
}
