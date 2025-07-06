package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicNoteQuarter: ImageVector
    get() {
        if (_MusicNoteQuarter != null) {
            return _MusicNoteQuarter!!
        }
        _MusicNoteQuarter = ImageVector.Builder(
            name = "MusicNoteQuarter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 3f)
                verticalLineTo(13.56f)
                curveTo(13.41f, 13.21f, 12.73f, 13f, 12f, 13f)
                curveTo(9.79f, 13f, 8f, 14.79f, 8f, 17f)
                reflectiveCurveTo(9.79f, 21f, 12f, 21f)
                reflectiveCurveTo(16f, 19.21f, 16f, 17f)
                verticalLineTo(3f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _MusicNoteQuarter!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteQuarter: ImageVector? = null
