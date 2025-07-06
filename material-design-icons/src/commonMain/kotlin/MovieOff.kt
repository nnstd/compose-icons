package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieOff: ImageVector
    get() {
        if (_MovieOff != null) {
            return _MovieOff!!
        }
        _MovieOff = ImageVector.Builder(
            name = "MovieOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(18.11f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 5.42f, 2.25f, 4.9f, 2.65f, 4.54f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(21.88f, 18.68f)
                curveTo(21.96f, 18.47f, 22f, 18.24f, 22f, 18f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                lineTo(20f, 8f)
                horizontalLineTo(17f)
                lineTo(15f, 4f)
                horizontalLineTo(13f)
                lineTo(15f, 8f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                horizontalLineTo(8f)
                lineTo(8.8f, 5.6f)
                lineTo(21.88f, 18.68f)
                close()
            }
        }.build()

        return _MovieOff!!
    }

@Suppress("ObjectPropertyName")
private var _MovieOff: ImageVector? = null
