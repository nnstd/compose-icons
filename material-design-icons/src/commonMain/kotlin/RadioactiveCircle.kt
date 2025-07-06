package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RadioactiveCircle: ImageVector
    get() {
        if (_RadioactiveCircle != null) {
            return _RadioactiveCircle!!
        }
        _RadioactiveCircle = ImageVector.Builder(
            name = "RadioactiveCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                moveTo(20f, 12f)
                horizontalLineTo(16f)
                curveTo(16f, 10.5f, 15.2f, 9.2f, 14f, 8.6f)
                lineTo(16f, 5.1f)
                curveTo(18.4f, 6.5f, 20f, 9f, 20f, 12f)
                moveTo(12f, 10f)
                curveTo(13.1f, 10f, 14f, 10.9f, 14f, 12f)
                reflectiveCurveTo(13.1f, 14f, 12f, 14f)
                reflectiveCurveTo(10f, 13.1f, 10f, 12f)
                reflectiveCurveTo(10.9f, 10f, 12f, 10f)
                moveTo(8f, 5.1f)
                curveTo(8.6f, 6.1f, 9.3f, 7.4f, 10f, 8.6f)
                curveTo(8.8f, 9.3f, 8f, 10.6f, 8f, 12f)
                horizontalLineTo(4f)
                curveTo(4f, 9f, 5.6f, 6.5f, 8f, 5.1f)
                moveTo(8f, 18.9f)
                curveTo(8.6f, 17.9f, 9.3f, 16.6f, 10f, 15.4f)
                curveTo(10.6f, 15.7f, 11.3f, 16f, 12f, 16f)
                reflectiveCurveTo(13.4f, 15.8f, 14f, 15.4f)
                lineTo(16f, 18.9f)
                curveTo(14.8f, 19.6f, 13.5f, 20f, 12f, 20f)
                curveTo(10.5f, 20f, 9.2f, 19.6f, 8f, 18.9f)
                close()
            }
        }.build()

        return _RadioactiveCircle!!
    }

@Suppress("ObjectPropertyName")
private var _RadioactiveCircle: ImageVector? = null
