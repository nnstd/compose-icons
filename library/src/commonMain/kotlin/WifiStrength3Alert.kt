package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiStrength3Alert: ImageVector
    get() {
        if (_WifiStrength3Alert != null) {
            return _WifiStrength3Alert!!
        }
        _WifiStrength3Alert = ImageVector.Builder(
            name = "WifiStrength3Alert",
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
                lineTo(18.8f, 9.9f)
                curveTo(17.3f, 9f, 14.9f, 8f, 12f, 8f)
                curveTo(9f, 8f, 6.7f, 9f, 5.2f, 9.8f)
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

        return _WifiStrength3Alert!!
    }

@Suppress("ObjectPropertyName")
private var _WifiStrength3Alert: ImageVector? = null
