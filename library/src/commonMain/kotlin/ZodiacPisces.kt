package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ZodiacPisces: ImageVector
    get() {
        if (_ZodiacPisces != null) {
            return _ZodiacPisces!!
        }
        _ZodiacPisces = ImageVector.Builder(
            name = "ZodiacPisces",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 11f)
                horizontalLineTo(18f)
                curveTo(18.11f, 8.19f, 18.73f, 5.42f, 19.81f, 2.82f)
                lineTo(18f, 2.06f)
                curveTo(16.81f, 4.9f, 16.13f, 7.92f, 16f, 11f)
                horizontalLineTo(8f)
                curveTo(7.87f, 7.92f, 7.19f, 4.9f, 6f, 2.06f)
                lineTo(4.14f, 2.82f)
                curveTo(5.24f, 5.41f, 5.87f, 8.18f, 6f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                curveTo(5.89f, 15.81f, 5.27f, 18.58f, 4.19f, 21.18f)
                lineTo(6f, 21.94f)
                curveTo(7.19f, 19.1f, 7.87f, 16.08f, 8f, 13f)
                horizontalLineTo(16f)
                curveTo(16.13f, 16.08f, 16.81f, 19.1f, 18f, 21.94f)
                lineTo(19.86f, 21.18f)
                curveTo(18.76f, 18.59f, 18.13f, 15.82f, 18f, 13f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _ZodiacPisces!!
    }

@Suppress("ObjectPropertyName")
private var _ZodiacPisces: ImageVector? = null
