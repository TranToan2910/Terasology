/*
 * Copyright 2013 Moving Blocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.world.block.loader;

import org.terasology.asset.Asset;
import org.terasology.asset.AssetData;
import org.terasology.asset.AssetUri;
import org.terasology.asset.CompatibilityHackAsset;

import java.awt.image.BufferedImage;

/**
 * @author Immortius
 */
public class Tile extends CompatibilityHackAsset implements Asset<AssetData> {
    private BufferedImage image;


    public Tile(AssetUri uri, BufferedImage image) {
        super(uri);
        this.image = image;
    }

    @Override
    public void dispose() {
    }

    public BufferedImage getImage() {
        return image;
    }
}
