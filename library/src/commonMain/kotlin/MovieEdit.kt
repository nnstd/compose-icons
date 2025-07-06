package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieEdit: ImageVector
    get() {
        if (_MovieEdit != null) {
            return _MovieEdit!!
        }
        _MovieEdit = ImageVector.Builder(
            name = "MovieEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.04f, 11.13f)
                curveTo(20.9f, 11.13f, 20.76f, 11.19f, 20.65f, 11.3f)
                lineTo(19.65f, 12.3f)
                lineTo(21.7f, 14.35f)
                lineTo(22.7f, 13.35f)
                curveTo(22.92f, 13.14f, 22.92f, 12.79f, 22.7f, 12.58f)
                lineTo(21.42f, 11.3f)
                curveTo(21.31f, 11.19f, 21.18f, 11.13f, 21.04f, 11.13f)
                moveTo(19.07f, 12.88f)
                lineTo(13f, 18.94f)
                verticalLineTo(21f)
                horizontalLineTo(15.06f)
                lineTo(21.12f, 14.93f)
                lineTo(19.07f, 12.88f)
                moveTo(11f, 20f)
                horizontalLineTo(3f)
                curveTo(1.9f, 20f, 1f, 19.11f, 1f, 18f)
                verticalLineTo(6f)
                curveTo(1f, 4.89f, 1.9f, 4f, 3f, 4f)
                horizontalLineTo(4f)
                lineTo(6f, 8f)
                horizontalLineTo(9f)
                lineTo(7f, 4f)
                horizontalLineTo(9f)
                lineTo(11f, 8f)
                horizontalLineTo(14f)
                lineTo(12f, 4f)
                horizontalLineTo(14f)
                lineTo(16f, 8f)
                horizontalLineTo(19f)
                lineTo(17f, 4f)
                horizontalLineTo(21f)
                verticalLineTo(8.12f)
                lineTo(11f, 18.11f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _MovieEdit!!
    }

@Suppress("ObjectPropertyName")
private var _MovieEdit: ImageVector? = null
