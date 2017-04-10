/* LanguageTool, a natural language style checker 
 * Copyright (C) 2014 Daniel Naber (http://www.danielnaber.de)
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package org.languagetool.language.tagging;

import org.languagetool.tagging.BaseTagger;

/**
 * Hindi Part-of-speech tagger.
 * The POS tagset is described in
 * <a href="https://github.com/languagetool-org/languagetool/blob/master/languagetool-language-modules/hi/src/main/resources/org/languagetool/resource/hi/tagset.txt">tagset.txt</a>
 * @since 2.7
 */
public class HindiTagger extends BaseTagger {

  @Override
  public String getManualAdditionsFileName() {
    return "/hi/added.txt";
  }

  public HindiTagger() {
    super("/hi/hindi.dict");
  }

}
