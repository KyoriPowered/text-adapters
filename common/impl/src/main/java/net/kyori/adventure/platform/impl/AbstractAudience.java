/*
 * This file is part of adventure-platform, licensed under the MIT License.
 *
 * Copyright (c) 2018-2020 KyoriPowered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.kyori.adventure.platform.impl;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.bossbar.BossBar;
import net.kyori.adventure.inventory.Book;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.platform.AudienceInfo;
import net.kyori.adventure.sound.Sound;
import net.kyori.adventure.sound.SoundStop;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.title.Title;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Locale;
import java.util.UUID;

public abstract class AbstractAudience implements Audience, AudienceInfo {
    @Override
    public @Nullable Locale getLocale() {
        return null;
    }

    @Override
    public @Nullable UUID getId() {
        return null;
    }

    @Override
    public @Nullable Key getWorld() {
        return null;
    }

    @Override
    public @Nullable String getServer() {
        return null;
    }

    @Override
    public boolean hasPermission(@NonNull String permission) {
        return false;
    }

    @Override
    public boolean isConsole() {
        return false;
    }

    @Override
    public boolean isPlayer() {
        return false;
    }

    @Override
    public void sendMessage(@NonNull Component message) {}

    @Override
    public void sendActionBar(@NonNull Component message) {}

    @Override
    public void showTitle(@NonNull Title title) {}

    @Override
    public void clearTitle() {}

    @Override
    public void resetTitle() {}

    @Override
    public void showBossBar(@NonNull BossBar bar) {}

    @Override
    public void hideBossBar(@NonNull BossBar bar) {}

    @Override
    public void playSound(@NonNull Sound sound) {}

    @Override
    public void playSound(@NonNull Sound sound, double x, double y, double z) {}

    @Override
    public void stopSound(@NonNull SoundStop stop) {}

    @Override
    public void openBook(@NonNull Book book) {}
}