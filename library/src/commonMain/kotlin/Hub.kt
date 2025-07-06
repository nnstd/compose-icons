package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hub: ImageVector
    get() {
        if (_Hub != null) {
            return _Hub!!
        }
        _Hub = ImageVector.Builder(
            name = "Hub",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.4f, 18.2f)
                curveTo(8.8f, 18.7f, 9f, 19.3f, 9f, 20f)
                curveTo(9f, 21.7f, 7.7f, 23f, 6f, 23f)
                reflectiveCurveTo(3f, 21.7f, 3f, 20f)
                reflectiveCurveTo(4.3f, 17f, 6f, 17f)
                curveTo(6.4f, 17f, 6.8f, 17.1f, 7.2f, 17.3f)
                lineTo(8.6f, 15.5f)
                curveTo(7.7f, 14.5f, 7.3f, 13.1f, 7.5f, 11.8f)
                lineTo(5.5f, 11.1f)
                curveTo(5f, 11.9f, 4.1f, 12.5f, 3f, 12.5f)
                curveTo(1.3f, 12.5f, 0f, 11.2f, 0f, 9.5f)
                reflectiveCurveTo(1.3f, 6.5f, 3f, 6.5f)
                reflectiveCurveTo(6f, 7.8f, 6f, 9.5f)
                verticalLineTo(9.7f)
                lineTo(8f, 10.4f)
                curveTo(8.6f, 9.2f, 9.8f, 8.3f, 11.2f, 8.1f)
                verticalLineTo(5.9f)
                curveTo(10f, 5.6f, 9f, 4.4f, 9f, 3f)
                curveTo(9f, 1.3f, 10.3f, 0f, 12f, 0f)
                reflectiveCurveTo(15f, 1.3f, 15f, 3f)
                curveTo(15f, 4.4f, 14f, 5.6f, 12.8f, 5.9f)
                verticalLineTo(8.1f)
                curveTo(14.2f, 8.3f, 15.4f, 9.2f, 16f, 10.4f)
                lineTo(18f, 9.7f)
                verticalLineTo(9.5f)
                curveTo(18f, 7.8f, 19.3f, 6.5f, 21f, 6.5f)
                reflectiveCurveTo(24f, 7.8f, 24f, 9.5f)
                reflectiveCurveTo(22.7f, 12.5f, 21f, 12.5f)
                curveTo(19.9f, 12.5f, 19f, 11.9f, 18.5f, 11.1f)
                lineTo(16.5f, 11.8f)
                curveTo(16.7f, 13.1f, 16.3f, 14.5f, 15.4f, 15.5f)
                lineTo(16.8f, 17.3f)
                curveTo(17.2f, 17.1f, 17.6f, 17f, 18f, 17f)
                curveTo(19.7f, 17f, 21f, 18.3f, 21f, 20f)
                reflectiveCurveTo(19.7f, 23f, 18f, 23f)
                reflectiveCurveTo(15f, 21.7f, 15f, 20f)
                curveTo(15f, 19.3f, 15.2f, 18.7f, 15.6f, 18.2f)
                lineTo(14.2f, 16.4f)
                curveTo(12.8f, 17.2f, 11.2f, 17.2f, 9.8f, 16.4f)
                lineTo(8.4f, 18.2f)
                close()
            }
        }.build()

        return _Hub!!
    }

@Suppress("ObjectPropertyName")
private var _Hub: ImageVector? = null
