/*
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2008 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mucommander.file.impl;

import com.mucommander.file.AbstractFile;
import com.mucommander.file.DummyFile;
import com.mucommander.file.FileURL;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * TestFile is an {@link AbstractFile} that is used in unit tests.
 * This is an implementation of virtual file. Several methods are overriden to
 * return data passed in constructor.
 * @author Mariusz Jakubowski
 *
 */
public class TestFile extends DummyFile {
    
    private boolean isDir;
    private long size;
    private long date;
    private AbstractFile parent;

    public TestFile(String name, boolean isdir, long size, long date, AbstractFile parent) throws MalformedURLException {
        super(new FileURL(name));
        this.isDir = isdir;
        this.size = size;
        this.date = date;
        this.parent = parent;
    }
    
    public boolean isDirectory() {
        return isDir;
    }
    
    public long getSize() {
        return size;
    }
 
    public long getDate() {
        return date;
    }
    
    public AbstractFile getParent() throws IOException {
        return parent;
    }
    
}