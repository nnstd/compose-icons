package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Broadcast: ImageVector
    get() {
        if (_Broadcast != null) {
            return _Broadcast!!
        }
        _Broadcast = ImageVector.Builder(
            name = "Broadcast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                curveTo(10.9f, 10f, 10f, 10.9f, 10f, 12f)
                reflectiveCurveTo(10.9f, 14f, 12f, 14f)
                reflectiveCurveTo(14f, 13.1f, 14f, 12f)
                reflectiveCurveTo(13.1f, 10f, 12f, 10f)
                moveTo(18f, 12f)
                curveTo(18f, 8.7f, 15.3f, 6f, 12f, 6f)
                reflectiveCurveTo(6f, 8.7f, 6f, 12f)
                curveTo(6f, 14.2f, 7.2f, 16.1f, 9f, 17.2f)
                lineTo(10f, 15.5f)
                curveTo(8.8f, 14.8f, 8f, 13.5f, 8f, 12.1f)
                curveTo(8f, 9.9f, 9.8f, 8.1f, 12f, 8.1f)
                reflectiveCurveTo(16f, 9.9f, 16f, 12.1f)
                curveTo(16f, 13.6f, 15.2f, 14.9f, 14f, 15.5f)
                lineTo(15f, 17.2f)
                curveTo(16.8f, 16.2f, 18f, 14.2f, 18f, 12f)
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 15.7f, 4f, 18.9f, 7f, 20.6f)
                lineTo(8f, 18.9f)
                curveTo(5.6f, 17.5f, 4f, 14.9f, 4f, 12f)
                curveTo(4f, 7.6f, 7.6f, 4f, 12f, 4f)
                reflectiveCurveTo(20f, 7.6f, 20f, 12f)
                curveTo(20f, 15f, 18.4f, 17.5f, 16f, 18.9f)
                lineTo(17f, 20.6f)
                curveTo(20f, 18.9f, 22f, 15.7f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _Broadcast!!
    }

@Suppress("ObjectPropertyName")
private var _Broadcast: ImageVector? = null
