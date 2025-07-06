package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterSync: ImageVector
    get() {
        if (_WaterSync != null) {
            return _WaterSync!!
        }
        _WaterSync = ImageVector.Builder(
            name = "WaterSync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3.2f)
                curveTo(12f, 3.2f, 6f, 10f, 6f, 14f)
                curveTo(6f, 17.3f, 8.7f, 20f, 12f, 20f)
                reflectiveCurveTo(18f, 17.3f, 18f, 14f)
                curveTo(18f, 10f, 12f, 3.2f, 12f, 3.2f)
                moveTo(12f, 8.5f)
                verticalLineTo(10f)
                curveTo(14.2f, 10f, 16f, 11.8f, 16f, 14f)
                curveTo(16f, 14.8f, 15.8f, 15.6f, 15.3f, 16.2f)
                lineTo(14.2f, 15.1f)
                curveTo(14.4f, 14.8f, 14.5f, 14.4f, 14.5f, 14f)
                curveTo(14.5f, 12.6f, 13.4f, 11.5f, 12f, 11.5f)
                verticalLineTo(13f)
                lineTo(9.8f, 10.8f)
                lineTo(12f, 8.5f)
                moveTo(8.7f, 11.8f)
                lineTo(9.8f, 12.9f)
                curveTo(9.6f, 13.2f, 9.5f, 13.6f, 9.5f, 14f)
                curveTo(9.5f, 15.4f, 10.6f, 16.5f, 12f, 16.5f)
                verticalLineTo(15f)
                lineTo(14.2f, 17.2f)
                lineTo(12f, 19.5f)
                verticalLineTo(18f)
                curveTo(9.8f, 18f, 8f, 16.2f, 8f, 14f)
                curveTo(8f, 13.2f, 8.2f, 12.4f, 8.7f, 11.8f)
                close()
            }
        }.build()

        return _WaterSync!!
    }

@Suppress("ObjectPropertyName")
private var _WaterSync: ImageVector? = null
