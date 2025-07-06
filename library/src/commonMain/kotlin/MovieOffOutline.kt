package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieOffOutline: ImageVector
    get() {
        if (_MovieOffOutline != null) {
            return _MovieOffOutline!!
        }
        _MovieOffOutline = ImageVector.Builder(
            name = "MovieOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(2.65f, 4.54f)
                curveTo(2.25f, 4.9f, 2f, 5.42f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(18.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(4f, 18f)
                verticalLineTo(6.47f)
                lineTo(5.76f, 10f)
                horizontalLineTo(8.11f)
                lineTo(16.11f, 18f)
                horizontalLineTo(4f)
                moveTo(8.8f, 5.6f)
                lineTo(8f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 8f)
                horizontalLineTo(15f)
                lineTo(13f, 4f)
                horizontalLineTo(15f)
                lineTo(17f, 8f)
                horizontalLineTo(20f)
                lineTo(18f, 4f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                curveTo(22f, 18.24f, 21.96f, 18.47f, 21.88f, 18.68f)
                lineTo(20f, 16.8f)
                verticalLineTo(10f)
                horizontalLineTo(13.2f)
                lineTo(8.8f, 5.6f)
                close()
            }
        }.build()

        return _MovieOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MovieOffOutline: ImageVector? = null
