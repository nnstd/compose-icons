package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeleteClockOutline: ImageVector
    get() {
        if (_DeleteClockOutline != null) {
            return _DeleteClockOutline!!
        }
        _DeleteClockOutline = ImageVector.Builder(
            name = "DeleteClockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 13f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.82f)
                lineTo(18.94f, 17.23f)
                lineTo(18.19f, 18.53f)
                lineTo(15f, 16.69f)
                verticalLineTo(13f)
                moveTo(23f, 16f)
                curveTo(23f, 19.87f, 19.87f, 23f, 16f, 23f)
                curveTo(14.09f, 23f, 12.36f, 22.24f, 11.1f, 21f)
                horizontalLineTo(8f)
                curveTo(6.9f, 21f, 6f, 20.1f, 6f, 19f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(9.29f)
                curveTo(20.89f, 10.15f, 23f, 12.83f, 23f, 16f)
                moveTo(9f, 16f)
                curveTo(9f, 12.13f, 12.13f, 9f, 16f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(9.67f)
                curveTo(9.24f, 18.09f, 9f, 17.07f, 9f, 16f)
                moveTo(16f, 11f)
                curveTo(13.24f, 11f, 11f, 13.24f, 11f, 16f)
                curveTo(11f, 18.76f, 13.24f, 21f, 16f, 21f)
                curveTo(18.76f, 21f, 21f, 18.76f, 21f, 16f)
                curveTo(21f, 13.24f, 18.76f, 11f, 16f, 11f)
                moveTo(15.5f, 4f)
                horizontalLineTo(19f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(8.5f)
                lineTo(9.5f, 3f)
                horizontalLineTo(14.5f)
                lineTo(15.5f, 4f)
                close()
            }
        }.build()

        return _DeleteClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DeleteClockOutline: ImageVector? = null
