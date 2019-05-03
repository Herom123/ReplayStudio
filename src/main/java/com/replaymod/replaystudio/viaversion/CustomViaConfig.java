/*
 * This file is part of ReplayStudio, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2016 johni0702 <https://github.com/johni0702>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.replaymod.replaystudio.viaversion;

import com.replaymod.replaystudio.us.myles.ViaVersion.api.ViaVersionConfig;

import java.util.List;

// Configured as per recommendations at https://docs.viaversion.com/display/VIAVERSION/Configuration
public class CustomViaConfig implements ViaVersionConfig {
    @Override
    public boolean isCheckForUpdates() {
        return false;
    }

    @Override
    public boolean isPreventCollision() {
        return false;
    }

    @Override
    public boolean isNewEffectIndicator() {
        return false;
    }

    @Override
    public boolean isShowNewDeathMessages() {
        return false;
    }

    @Override
    public boolean isSuppressMetadataErrors() {
        return true;
    }

    @Override
    public boolean isShieldBlocking() {
        return false;
    }

    @Override
    public boolean isHologramPatch() {
        return true;
    }

    @Override
    public boolean isPistonAnimationPatch() {
        return false;
    }

    @Override
    public boolean isBossbarPatch() {
        return true;
    }

    @Override
    public boolean isBossbarAntiflicker() {
        return false;
    }

    @Override
    public boolean isUnknownEntitiesSuppressed() {
        return true;
    }

    @Override
    public double getHologramYOffset() {
        return -0.96;
    }

    @Override
    public boolean isAutoTeam() {
        return false;
    }

    @Override
    public boolean isBlockBreakPatch() {
        return false;
    }

    @Override
    public int getMaxPPS() {
        return -1;
    }

    @Override
    public String getMaxPPSKickMessage() {
        return null;
    }

    @Override
    public int getTrackingPeriod() {
        return -1;
    }

    @Override
    public int getWarningPPS() {
        return -1;
    }

    @Override
    public int getMaxWarnings() {
        return -1;
    }

    @Override
    public String getMaxWarningsKickMessage() {
        return null;
    }

    @Override
    public boolean isAntiXRay() {
        return false;
    }

    @Override
    public boolean isSendSupportedVersions() {
        return false;
    }

    @Override
    public boolean isStimulatePlayerTick() {
        return false;
    }

    @Override
    public boolean isItemCache() {
        return false;
    }

    @Override
    public boolean isNMSPlayerTicking() {
        return false;
    }

    @Override
    public boolean isReplacePistons() {
        return false;
    }

    @Override
    public int getPistonReplacementId() {
        return -1;
    }

    @Override
    public boolean isForceJsonTransform() {
        return false;
    }

    @Override
    public boolean is1_12NBTArrayFix() {
        return true;
    }

    @Override
    public boolean is1_13TeamColourFix() {
        return true;
    }

    @Override
    public boolean is1_12QuickMoveActionFix() {
        return false;
    }

    @Override
    public List<Integer> getBlockedProtocols() {
        return null;
    }

    @Override
    public String getBlockedDisconnectMsg() {
        return null;
    }

    @Override
    public String getReloadDisconnectMsg() {
        return null;
    }

    @Override
    public boolean isSuppress1_13ConversionErrors() {
        return false;
    }

    @Override
    public boolean isDisable1_13AutoComplete() {
        return false;
    }

    @Override
    public boolean isMinimizeCooldown() {
        return true;
    }

    @Override
    public boolean isServersideBlockConnections() {
        return true;
    }

    @Override
    public String getBlockConnectionMethod() {
        return "packet";
    }

    @Override
    public boolean isReduceBlockStorageMemory() {
        return false;
    }

    @Override
    public boolean isStemWhenBlockAbove() {
        return true;
    }

    @Override
    public boolean isSnowCollisionFix() {
        return false;
    }

    @Override
    public int get1_13TabCompleteDelay() {
        return 0;
    }

    @Override
    public boolean isTruncate1_14Books() {
        return false;
    }

    @Override
    public boolean isLeftHandedHandling() {
        return true;
    }

    @Override
    public boolean is1_9HitboxFix() {
        return true;
    }

    @Override
    public boolean is1_14HitboxFix() {
        return true;
    }
}
