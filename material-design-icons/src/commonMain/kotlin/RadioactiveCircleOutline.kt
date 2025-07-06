package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RadioactiveCircleOutline: ImageVector
    get() {
        if (_RadioactiveCircleOutline != null) {
            return _RadioactiveCircleOutline!!
        }
        _RadioactiveCircleOutline = ImageVector.Builder(
            name = "RadioactiveCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveTo(16.4f, 4f, 20f, 7.6f, 20f, 12f)
                reflectiveCurveTo(16.4f, 20f, 12f, 20f)
                reflectiveCurveTo(4f, 16.4f, 4f, 12f)
                reflectiveCurveTo(7.6f, 4f, 12f, 4f)
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                moveTo(15f, 17.2f)
                lineTo(13.2f, 14.2f)
                curveTo(12.8f, 14.4f, 12.4f, 14.5f, 12f, 14.5f)
                reflectiveCurveTo(11.1f, 14.4f, 10.8f, 14.2f)
                curveTo(10.3f, 15.1f, 9.6f, 16.2f, 9f, 17.2f)
                curveTo(9.9f, 17.7f, 10.9f, 18f, 12f, 18f)
                reflectiveCurveTo(14.1f, 17.7f, 15f, 17.2f)
                moveTo(15f, 6.8f)
                lineTo(13.2f, 9.8f)
                curveTo(13.9f, 10.2f, 14.5f, 11f, 14.5f, 12f)
                horizontalLineTo(18f)
                curveTo(18f, 9.8f, 16.8f, 7.8f, 15f, 6.8f)
                moveTo(12f, 13f)
                curveTo(12.6f, 13f, 13f, 12.6f, 13f, 12f)
                reflectiveCurveTo(12.6f, 11f, 12f, 11f)
                reflectiveCurveTo(11f, 11.4f, 11f, 12f)
                reflectiveCurveTo(11.4f, 13f, 12f, 13f)
                moveTo(6f, 12f)
                horizontalLineTo(9.5f)
                curveTo(9.5f, 11.1f, 10f, 10.3f, 10.8f, 9.8f)
                curveTo(10.3f, 8.9f, 9.6f, 7.8f, 9f, 6.8f)
                curveTo(7.2f, 7.8f, 6f, 9.8f, 6f, 12f)
                close()
            }
        }.build()

        return _RadioactiveCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _RadioactiveCircleOutline: ImageVector? = null
