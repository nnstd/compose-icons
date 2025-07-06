package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MowerBagOn: ImageVector
    get() {
        if (_MowerBagOn != null) {
            return _MowerBagOn!!
        }
        _MowerBagOn = ImageVector.Builder(
            name = "MowerBagOn",
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
                moveTo(10.8f, 12f)
                lineTo(11.9f, 14f)
                horizontalLineTo(17f)
                lineTo(16.5f, 13.1f)
                curveTo(16.2f, 12.4f, 15.5f, 12f, 14.7f, 12f)
                horizontalLineTo(10.8f)
                moveTo(20f, 15f)
                horizontalLineTo(11.4f)
                lineTo(4.6f, 3f)
                horizontalLineTo(1f)
                verticalLineTo(5f)
                horizontalLineTo(3.4f)
                lineTo(7.4f, 12.1f)
                lineTo(2.3f, 10.1f)
                curveTo(2.1f, 10f, 1.7f, 10f, 1.4f, 10.2f)
                curveTo(1.2f, 10.4f, 1f, 10.7f, 1f, 11f)
                verticalLineTo(18f)
                curveTo(1f, 18.5f, 1.5f, 19f, 2f, 19f)
                horizontalLineTo(5.3f)
                curveTo(5.9f, 20.2f, 7.1f, 21f, 8.5f, 21f)
                reflectiveCurveTo(11.1f, 20.2f, 11.7f, 19f)
                horizontalLineTo(17.2f)
                curveTo(17.6f, 20.2f, 18.7f, 21f, 20f, 21f)
                curveTo(21.7f, 21f, 23f, 19.7f, 23f, 18f)
                reflectiveCurveTo(21.7f, 15f, 20f, 15f)
                moveTo(5f, 17f)
                horizontalLineTo(3f)
                verticalLineTo(12.5f)
                lineTo(7.3f, 14.2f)
                curveTo(6.1f, 14.6f, 5.2f, 15.7f, 5f, 17f)
                moveTo(8.5f, 19f)
                curveTo(7.7f, 19f, 7f, 18.3f, 7f, 17.5f)
                reflectiveCurveTo(7.7f, 16f, 8.5f, 16f)
                reflectiveCurveTo(10f, 16.7f, 10f, 17.5f)
                reflectiveCurveTo(9.3f, 19f, 8.5f, 19f)
                moveTo(20f, 19f)
                curveTo(19.5f, 19f, 19f, 18.5f, 19f, 18f)
                reflectiveCurveTo(19.5f, 17f, 20f, 17f)
                reflectiveCurveTo(21f, 17.5f, 21f, 18f)
                reflectiveCurveTo(20.5f, 19f, 20f, 19f)
                close()
            }
        }.build()

        return _MowerBagOn!!
    }

@Suppress("ObjectPropertyName")
private var _MowerBagOn: ImageVector? = null
