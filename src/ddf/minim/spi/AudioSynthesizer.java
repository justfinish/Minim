/*
 *  Copyright (c) 2007 - 2008 by Damien Di Fede <ddf@compartmental.net>
 *
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU Library General Public License as published
 *   by the Free Software Foundation; either version 2 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Library General Public License for more details.
 *
 *   You should have received a copy of the GNU Library General Public
 *   License along with this program; if not, write to the Free Software
 *   Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

package ddf.minim.spi;

import ddf.minim.AudioEffect;
import ddf.minim.AudioSignal;

/**
 * An <code>AudioSythesizer</code> is an <code>AudioStream</code> that
 * generates sound, rather than reading sound. It uses the attached
 * <code>AudioSignal</code> and <code>AudioEffect</code> to generate a
 * signal.
 * 
 * @author Damien Di Fede
 * 
 */
public interface AudioSynthesizer extends AudioStream
{
  /**
   * Sets the AudioSignal used by this sythesizer.
   * 
   * @param signal
   *          the AudioSignal used to generate sound
   */
  void setAudioSignal(AudioSignal signal);

  /**
   * Sets the AudioEffect to apply to the signal.
   * 
   * @param effect
   *          the AudioEffect to apply to the signal
   */
  void setAudioEffect(AudioEffect effect);
}
