package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicRestQuarter: ImageVector
    get() {
        if (_MusicRestQuarter != null) {
            return _MusicRestQuarter!!
        }
        _MusicRestQuarter = ImageVector.Builder(
            name = "MusicRestQuarter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.71f, 16.81f)
                curveTo(10.91f, 17.6f, 10.88f, 18.84f, 11.64f, 19.58f)
                lineTo(10.19f, 21f)
                curveTo(8.66f, 19.5f, 8.72f, 17.03f, 10.32f, 15.46f)
                curveTo(10.85f, 14.94f, 11.5f, 14.61f, 12.16f, 14.42f)
                lineTo(9f, 11.34f)
                lineTo(10.45f, 9.92f)
                lineTo(10.82f, 9.57f)
                curveTo(11.82f, 8.59f, 11.85f, 7.04f, 10.9f, 6.11f)
                lineTo(9.16f, 4.42f)
                lineTo(10.62f, 3f)
                lineTo(14.78f, 7.06f)
                curveTo(15.54f, 7.81f, 15.5f, 9.05f, 14.71f, 9.83f)
                lineTo(12.53f, 11.95f)
                lineTo(16f, 15.33f)
                lineTo(15.61f, 15.72f)
                curveTo(15.11f, 16.21f, 14.38f, 16.46f, 13.72f, 16.28f)
                curveTo(13.04f, 16.1f, 12.26f, 16.28f, 11.71f, 16.81f)
                close()
            }
        }.build()

        return _MusicRestQuarter!!
    }

@Suppress("ObjectPropertyName")
private var _MusicRestQuarter: ImageVector? = null
