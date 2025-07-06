package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicAccidentalSharp: ImageVector
    get() {
        if (_MusicAccidentalSharp != null) {
            return _MusicAccidentalSharp!!
        }
        _MusicAccidentalSharp = ImageVector.Builder(
            name = "MusicAccidentalSharp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 9.5f)
                verticalLineTo(7.5f)
                lineTo(15f, 8.1f)
                verticalLineTo(5.5f)
                horizontalLineTo(13f)
                verticalLineTo(8.7f)
                lineTo(11f, 9.3f)
                verticalLineTo(6.5f)
                horizontalLineTo(9f)
                verticalLineTo(9.9f)
                lineTo(7f, 10.5f)
                verticalLineTo(12.5f)
                lineTo(9f, 11.9f)
                verticalLineTo(13.9f)
                lineTo(7f, 14.5f)
                verticalLineTo(16.5f)
                lineTo(9f, 15.9f)
                verticalLineTo(18.5f)
                horizontalLineTo(11f)
                verticalLineTo(15.3f)
                lineTo(13f, 14.7f)
                verticalLineTo(17.5f)
                horizontalLineTo(15f)
                verticalLineTo(14.1f)
                lineTo(17f, 13.5f)
                verticalLineTo(11.5f)
                lineTo(15f, 12.1f)
                verticalLineTo(10.1f)
                lineTo(17f, 9.5f)
                moveTo(13f, 12.7f)
                lineTo(11f, 13.3f)
                verticalLineTo(11.3f)
                lineTo(13f, 10.7f)
                verticalLineTo(12.7f)
                close()
            }
        }.build()

        return _MusicAccidentalSharp!!
    }

@Suppress("ObjectPropertyName")
private var _MusicAccidentalSharp: ImageVector? = null
