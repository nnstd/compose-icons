package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicAccidentalDoubleSharp: ImageVector
    get() {
        if (_MusicAccidentalDoubleSharp != null) {
            return _MusicAccidentalDoubleSharp!!
        }
        _MusicAccidentalDoubleSharp = ImageVector.Builder(
            name = "MusicAccidentalDoubleSharp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.41f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(8.59f)
                lineTo(12f, 10.59f)
                lineTo(10f, 8.59f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(8.59f)
                lineTo(10.59f, 12f)
                lineTo(8.59f, 14f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(15.41f)
                lineTo(12f, 13.41f)
                lineTo(14f, 15.41f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(15.41f)
                lineTo(13.41f, 12f)
                lineTo(15.41f, 10f)
                close()
            }
        }.build()

        return _MusicAccidentalDoubleSharp!!
    }

@Suppress("ObjectPropertyName")
private var _MusicAccidentalDoubleSharp: ImageVector? = null
