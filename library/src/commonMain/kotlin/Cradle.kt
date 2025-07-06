package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cradle: ImageVector
    get() {
        if (_Cradle != null) {
            return _Cradle!!
        }
        _Cradle = ImageVector.Builder(
            name = "Cradle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 9f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                curveTo(5.8f, 4f, 4f, 5.8f, 4f, 8f)
                verticalLineTo(14f)
                curveTo(4f, 15.1f, 4.9f, 16f, 6f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(18.9f)
                curveTo(7.4f, 18.5f, 6.8f, 18.1f, 6.3f, 17.6f)
                lineTo(4.9f, 19f)
                curveTo(6.7f, 20.9f, 9.2f, 22f, 12f, 22f)
                reflectiveCurveTo(17.3f, 20.9f, 19.1f, 19.1f)
                lineTo(17.7f, 17.7f)
                curveTo(17.2f, 18.2f, 16.7f, 18.6f, 16.1f, 19f)
                verticalLineTo(16f)
                horizontalLineTo(18.1f)
                curveTo(19.2f, 16f, 20.1f, 15.1f, 20.1f, 14f)
                verticalLineTo(11f)
                curveTo(20f, 9.9f, 19.1f, 9f, 18f, 9f)
                moveTo(14f, 19.8f)
                curveTo(13.4f, 20f, 12.7f, 20f, 12f, 20f)
                reflectiveCurveTo(10.6f, 19.9f, 10f, 19.8f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(19.8f)
                close()
            }
        }.build()

        return _Cradle!!
    }

@Suppress("ObjectPropertyName")
private var _Cradle: ImageVector? = null
