package de.johni0702.replaystudio;

import de.johni0702.replaystudio.api.Replay;
import de.johni0702.replaystudio.api.ReplayMetaData;
import de.johni0702.replaystudio.api.ReplayPart;
import de.johni0702.replaystudio.io.ReplayWriter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Delegate;

import java.io.*;

@AllArgsConstructor
public class StudioDelegatingReplay implements Replay {

    @Getter
    @Setter
    private ReplayMetaData metaData;

    @Delegate
    private final ReplayPart delegate;

    @Override
    public void save(File file) throws IOException {
        save(new BufferedOutputStream(new FileOutputStream(file)), false);
    }

    @Override
    public void save(OutputStream output, boolean raw) throws IOException {
        ReplayWriter.writeReplay(output, this, raw);
    }

}
