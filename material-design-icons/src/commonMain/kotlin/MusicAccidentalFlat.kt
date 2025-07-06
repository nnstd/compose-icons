package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicAccidentalFlat: ImageVector
    get() {
        if (_MusicAccidentalFlat != null) {
            return _MusicAccidentalFlat!!
        }
        _MusicAccidentalFlat = ImageVector.Builder(
            name = "MusicAccidentalFlat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 19f)
                curveTo(13.36f, 16.26f, 15.5f, 13.91f, 15.5f, 12f)
                curveTo(15.5f, 10.59f, 14.79f, 9f, 12.5f, 9f)
                curveTo(11.8f, 9f, 11.11f, 9.28f, 10.5f, 9.67f)
                verticalLineTo(5f)
                horizontalLineTo(8.5f)
                moveTo(10.5f, 15.38f)
                verticalLineTo(12.26f)
                curveTo(11.12f, 11.59f, 11.95f, 11f, 12.5f, 11f)
                curveTo(13.09f, 11f, 13.5f, 11.07f, 13.5f, 12f)
                curveTo(13.5f, 12.15f, 13.4f, 13.3f, 10.5f, 15.38f)
                close()
            }
        }.build()

        return _MusicAccidentalFlat!!
    }

@Suppress("ObjectPropertyName")
private var _MusicAccidentalFlat: ImageVector? = null
