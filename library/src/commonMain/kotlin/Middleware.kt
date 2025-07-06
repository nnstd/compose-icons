package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Middleware: ImageVector
    get() {
        if (_Middleware != null) {
            return _Middleware!!
        }
        _Middleware = ImageVector.Builder(
            name = "Middleware",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 12f)
                lineTo(19f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 9.84f, 13.3f, 9f, 12f, 9f)
                reflectiveCurveTo(9.6f, 9.84f, 9.18f, 11f)
                horizontalLineTo(5f)
                lineTo(2f, 8f)
                verticalLineTo(16f)
                lineTo(5f, 13f)
                horizontalLineTo(9.18f)
                curveTo(9.6f, 14.16f, 10.7f, 15f, 12f, 15f)
                reflectiveCurveTo(14.4f, 14.16f, 14.82f, 13f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                lineTo(23f, 12f)
                close()
            }
        }.build()

        return _Middleware!!
    }

@Suppress("ObjectPropertyName")
private var _Middleware: ImageVector? = null
