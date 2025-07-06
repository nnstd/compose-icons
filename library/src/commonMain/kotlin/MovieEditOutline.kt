package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieEditOutline: ImageVector
    get() {
        if (_MovieEditOutline != null) {
            return _MovieEditOutline!!
        }
        _MovieEditOutline = ImageVector.Builder(
            name = "MovieEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4f)
                verticalLineTo(8.12f)
                lineTo(19.12f, 10f)
                horizontalLineTo(4.76f)
                lineTo(3f, 6.47f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
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
                moveTo(21.42f, 12.3f)
                lineTo(22.7f, 13.58f)
                curveTo(22.92f, 13.79f, 22.92f, 14.14f, 22.7f, 14.35f)
                lineTo(21.7f, 15.35f)
                lineTo(19.65f, 13.3f)
                lineTo(20.65f, 12.3f)
                curveTo(20.76f, 12.19f, 20.9f, 12.13f, 21.04f, 12.13f)
                curveTo(21.18f, 12.13f, 21.31f, 12.19f, 21.42f, 12.3f)
                moveTo(21.12f, 15.93f)
                lineTo(15.06f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(19.94f)
                lineTo(19.07f, 13.88f)
                lineTo(21.12f, 15.93f)
                close()
            }
        }.build()

        return _MovieEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MovieEditOutline: ImageVector? = null
