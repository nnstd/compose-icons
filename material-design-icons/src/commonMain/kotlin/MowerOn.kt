package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MowerOn: ImageVector
    get() {
        if (_MowerOn != null) {
            return _MowerOn!!
        }
        _MowerOn = ImageVector.Builder(
            name = "MowerOn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(2f)
                moveTo(22f, 6.3f)
                lineTo(20.6f, 4.9f)
                lineTo(17f, 8.4f)
                lineTo(18.4f, 9.8f)
                curveTo(18.4f, 9.8f, 21.9f, 6.3f, 22f, 6.3f)
                moveTo(18.5f, 14f)
                curveTo(17.5f, 14f, 16.7f, 14.4f, 16.1f, 15f)
                horizontalLineTo(9.4f)
                lineTo(5.7f, 3f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(4.3f)
                lineTo(7f, 14f)
                horizontalLineTo(6.5f)
                curveTo(4.6f, 14f, 3f, 15.6f, 3f, 17.5f)
                reflectiveCurveTo(4.6f, 21f, 6.5f, 21f)
                curveTo(7.9f, 21f, 9.1f, 20.2f, 9.7f, 19f)
                horizontalLineTo(15.4f)
                curveTo(16f, 20.2f, 17.2f, 21f, 18.6f, 21f)
                curveTo(20.5f, 21f, 22.1f, 19.4f, 22.1f, 17.5f)
                reflectiveCurveTo(20.4f, 14f, 18.5f, 14f)
                moveTo(6.5f, 19f)
                curveTo(5.7f, 19f, 5f, 18.3f, 5f, 17.5f)
                reflectiveCurveTo(5.7f, 16f, 6.5f, 16f)
                reflectiveCurveTo(8f, 16.7f, 8f, 17.5f)
                reflectiveCurveTo(7.3f, 19f, 6.5f, 19f)
                moveTo(18.5f, 19f)
                curveTo(17.7f, 19f, 17f, 18.3f, 17f, 17.5f)
                reflectiveCurveTo(17.7f, 16f, 18.5f, 16f)
                reflectiveCurveTo(20f, 16.7f, 20f, 17.5f)
                reflectiveCurveTo(19.3f, 19f, 18.5f, 19f)
                moveTo(9.5f, 12f)
                lineTo(10.1f, 14f)
                horizontalLineTo(15f)
                lineTo(14.6f, 13.1f)
                curveTo(14.3f, 12.4f, 13.5f, 12f, 12.8f, 12f)
                horizontalLineTo(9.5f)
                close()
            }
        }.build()

        return _MowerOn!!
    }

@Suppress("ObjectPropertyName")
private var _MowerOn: ImageVector? = null
