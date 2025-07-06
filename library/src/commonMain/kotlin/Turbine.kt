package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Turbine: ImageVector
    get() {
        if (_Turbine != null) {
            return _Turbine!!
        }
        _Turbine = ImageVector.Builder(
            name = "Turbine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                reflectiveCurveTo(2f, 6.5f, 2f, 12f)
                moveTo(20f, 12f)
                curveTo(20f, 16.4f, 16.4f, 20f, 12f, 20f)
                reflectiveCurveTo(4f, 16.4f, 4f, 12f)
                reflectiveCurveTo(7.6f, 4f, 12f, 4f)
                reflectiveCurveTo(20f, 7.6f, 20f, 12f)
                moveTo(12.5f, 7f)
                lineTo(12.2f, 8.3f)
                lineTo(11.3f, 5f)
                curveTo(10.3f, 5.3f, 9.7f, 6.3f, 9.9f, 7.4f)
                lineTo(10.2f, 8.7f)
                lineTo(7.9f, 6.3f)
                curveTo(7.2f, 7f, 7.2f, 8.3f, 7.9f, 9f)
                lineTo(8.9f, 10f)
                lineTo(5.6f, 9.1f)
                curveTo(5.3f, 10.1f, 5.9f, 11.2f, 7f, 11.5f)
                lineTo(8.3f, 11.8f)
                lineTo(5f, 12.7f)
                curveTo(5.3f, 13.7f, 6.3f, 14.3f, 7.4f, 14.1f)
                lineTo(8.7f, 13.8f)
                lineTo(6.3f, 16.2f)
                curveTo(7.1f, 16.9f, 8.3f, 16.9f, 9f, 16.2f)
                lineTo(9.9f, 15.3f)
                lineTo(9f, 18.6f)
                curveTo(10f, 18.9f, 11.1f, 18.3f, 11.4f, 17.2f)
                lineTo(11.7f, 15.9f)
                lineTo(12.6f, 19.2f)
                curveTo(13.6f, 18.9f, 14.2f, 17.9f, 14f, 16.8f)
                lineTo(13.7f, 15.5f)
                lineTo(16.1f, 17.9f)
                curveTo(16.8f, 17.1f, 16.8f, 15.9f, 16.1f, 15.2f)
                lineTo(15.1f, 14f)
                lineTo(18.4f, 14.9f)
                curveTo(18.7f, 13.9f, 18.1f, 12.8f, 17f, 12.5f)
                lineTo(15.7f, 12.2f)
                lineTo(19f, 11.3f)
                curveTo(18.7f, 10.3f, 17.7f, 9.7f, 16.6f, 9.9f)
                lineTo(15.3f, 10.2f)
                lineTo(17.7f, 7.8f)
                curveTo(16.9f, 7.1f, 15.7f, 7.1f, 15f, 7.8f)
                lineTo(14.1f, 8.8f)
                lineTo(15f, 5.5f)
                curveTo(13.9f, 5.3f, 12.8f, 5.9f, 12.5f, 7f)
                moveTo(13.5f, 12f)
                curveTo(13.5f, 12.8f, 12.8f, 13.5f, 12f, 13.5f)
                reflectiveCurveTo(10.5f, 12.8f, 10.5f, 12f)
                reflectiveCurveTo(11.2f, 10.5f, 12f, 10.5f)
                reflectiveCurveTo(13.5f, 11.2f, 13.5f, 12f)
                close()
            }
        }.build()

        return _Turbine!!
    }

@Suppress("ObjectPropertyName")
private var _Turbine: ImageVector? = null
