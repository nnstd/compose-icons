package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MiddlewareOutline: ImageVector
    get() {
        if (_MiddlewareOutline != null) {
            return _MiddlewareOutline!!
        }
        _MiddlewareOutline = ImageVector.Builder(
            name = "MiddlewareOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 12f)
                lineTo(19f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(15.86f)
                curveTo(15.41f, 9.28f, 13.86f, 8f, 12f, 8f)
                reflectiveCurveTo(8.59f, 9.28f, 8.14f, 11f)
                horizontalLineTo(5f)
                lineTo(2f, 8f)
                verticalLineTo(16f)
                lineTo(5f, 13f)
                horizontalLineTo(8.14f)
                curveTo(8.59f, 14.72f, 10.14f, 16f, 12f, 16f)
                reflectiveCurveTo(15.41f, 14.72f, 15.86f, 13f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                lineTo(23f, 12f)
                moveTo(12f, 14f)
                curveTo(10.9f, 14f, 10f, 13.1f, 10f, 12f)
                curveTo(10f, 10.9f, 10.9f, 10f, 12f, 10f)
                reflectiveCurveTo(14f, 10.9f, 14f, 12f)
                curveTo(14f, 13.1f, 13.1f, 14f, 12f, 14f)
                close()
            }
        }.build()

        return _MiddlewareOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MiddlewareOutline: ImageVector? = null
