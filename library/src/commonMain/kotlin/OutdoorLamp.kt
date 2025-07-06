package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OutdoorLamp: ImageVector
    get() {
        if (_OutdoorLamp != null) {
            return _OutdoorLamp!!
        }
        _OutdoorLamp = ImageVector.Builder(
            name = "OutdoorLamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 22f)
                horizontalLineTo(13f)
                curveTo(11.9f, 22f, 11f, 21.1f, 11f, 20f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                curveTo(17f, 21.1f, 16.1f, 22f, 15f, 22f)
                moveTo(7f, 14f)
                horizontalLineTo(21f)
                lineTo(15f, 9.71f)
                verticalLineTo(6f)
                curveTo(15f, 4.39f, 13.94f, 2f, 11f, 2f)
                reflectiveCurveTo(7f, 4.39f, 7f, 6f)
                curveTo(7f, 6.45f, 6.81f, 7f, 6f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                curveTo(8.2f, 9f, 9f, 7.21f, 9f, 6f)
                curveTo(9f, 5.67f, 9.1f, 4f, 11f, 4f)
                curveTo(12.83f, 4f, 13f, 5.54f, 13f, 6f)
                verticalLineTo(9.71f)
                lineTo(7f, 14f)
                close()
            }
        }.build()

        return _OutdoorLamp!!
    }

@Suppress("ObjectPropertyName")
private var _OutdoorLamp: ImageVector? = null
