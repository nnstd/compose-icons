package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiStrength2Alert: ImageVector
    get() {
        if (_WifiStrength2Alert != null) {
            return _WifiStrength2Alert!!
        }
        _WifiStrength2Alert = ImageVector.Builder(
            name = "WifiStrength2Alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(7.8f, 3f, 3.7f, 4.4f, 0.4f, 7f)
                curveTo(4.4f, 12.1f, 7.9f, 16.4f, 12f, 21.5f)
                curveTo(14.4f, 18.5f, 16.7f, 15.7f, 19f, 12.8f)
                verticalLineTo(9.6f)
                lineTo(17.5f, 11.4f)
                curveTo(16.3f, 10.7f, 14.4f, 10f, 12f, 10f)
                curveTo(9.6f, 10f, 7.7f, 10.8f, 6.5f, 11.4f)
                lineTo(3.3f, 7.4f)
                curveTo(5.9f, 5.8f, 8.9f, 5f, 12f, 5f)
                reflectiveCurveTo(18.1f, 5.9f, 20.7f, 7.4f)
                lineTo(20.3f, 8f)
                horizontalLineTo(22.9f)
                curveTo(23.1f, 7.7f, 23.5f, 7.3f, 23.7f, 7f)
                curveTo(20.3f, 4.4f, 16.2f, 3f, 12f, 3f)
                moveTo(21f, 10f)
                verticalLineTo(16f)
                horizontalLineTo(23f)
                verticalLineTo(10f)
                moveTo(21f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
            }
        }.build()

        return _WifiStrength2Alert!!
    }

@Suppress("ObjectPropertyName")
private var _WifiStrength2Alert: ImageVector? = null
