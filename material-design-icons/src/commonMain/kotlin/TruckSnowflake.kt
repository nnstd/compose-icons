package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TruckSnowflake: ImageVector
    get() {
        if (_TruckSnowflake != null) {
            return _TruckSnowflake!!
        }
        _TruckSnowflake = ImageVector.Builder(
            name = "TruckSnowflake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 4f)
                horizontalLineTo(3f)
                curveTo(1.9f, 4f, 1f, 4.9f, 1f, 6f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                curveTo(3f, 18.7f, 4.3f, 20f, 6f, 20f)
                reflectiveCurveTo(9f, 18.7f, 9f, 17f)
                horizontalLineTo(15f)
                curveTo(15f, 18.7f, 16.3f, 20f, 18f, 20f)
                reflectiveCurveTo(21f, 18.7f, 21f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(12f)
                lineTo(20f, 8f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                moveTo(10.2f, 5.3f)
                horizontalLineTo(10.5f)
                curveTo(11f, 5.4f, 11.3f, 5.9f, 11.2f, 6.4f)
                lineTo(10.7f, 8.4f)
                lineTo(12.7f, 7.9f)
                curveTo(13.2f, 7.8f, 13.7f, 8.1f, 13.8f, 8.6f)
                curveTo(13.9f, 9.1f, 13.6f, 9.6f, 13.2f, 9.7f)
                lineTo(11.2f, 10.2f)
                lineTo(12.6f, 11.6f)
                curveTo(13f, 11.9f, 13f, 12.5f, 12.6f, 12.9f)
                curveTo(12.3f, 13.3f, 11.7f, 13.3f, 11.3f, 12.9f)
                lineTo(9.8f, 11.5f)
                lineTo(9.3f, 13.5f)
                curveTo(9.2f, 14f, 8.7f, 14.3f, 8.2f, 14.1f)
                curveTo(7.7f, 14f, 7.4f, 13.5f, 7.6f, 13f)
                lineTo(8.1f, 11f)
                lineTo(6.1f, 11.5f)
                curveTo(5.6f, 11.6f, 5.1f, 11.3f, 5f, 10.9f)
                curveTo(4.9f, 10.4f, 5.2f, 9.9f, 5.6f, 9.8f)
                lineTo(7.6f, 9.3f)
                lineTo(6.2f, 7.7f)
                curveTo(5.9f, 7.4f, 5.9f, 6.8f, 6.2f, 6.4f)
                curveTo(6.5f, 6.1f, 7.1f, 6.1f, 7.5f, 6.4f)
                lineTo(8.9f, 7.8f)
                lineTo(9.4f, 5.8f)
                curveTo(9.5f, 5.6f, 9.8f, 5.3f, 10.2f, 5.3f)
                moveTo(17f, 9.5f)
                horizontalLineTo(19.5f)
                lineTo(21.5f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(9.5f)
                moveTo(6f, 15.5f)
                curveTo(6.8f, 15.5f, 7.5f, 16.2f, 7.5f, 17f)
                reflectiveCurveTo(6.8f, 18.5f, 6f, 18.5f)
                reflectiveCurveTo(4.5f, 17.8f, 4.5f, 17f)
                reflectiveCurveTo(5.2f, 15.5f, 6f, 15.5f)
                moveTo(18f, 15.5f)
                curveTo(18.8f, 15.5f, 19.5f, 16.2f, 19.5f, 17f)
                reflectiveCurveTo(18.8f, 18.5f, 18f, 18.5f)
                reflectiveCurveTo(16.5f, 17.8f, 16.5f, 17f)
                reflectiveCurveTo(17.2f, 15.5f, 18f, 15.5f)
                close()
            }
        }.build()

        return _TruckSnowflake!!
    }

@Suppress("ObjectPropertyName")
private var _TruckSnowflake: ImageVector? = null
