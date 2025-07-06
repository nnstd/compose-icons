package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterCheckOutline: ImageVector
    get() {
        if (_WaterCheckOutline != null) {
            return _WaterCheckOutline!!
        }
        _WaterCheckOutline = ImageVector.Builder(
            name = "WaterCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.75f, 16.25f)
                lineTo(17f, 21f)
                lineTo(14.25f, 18f)
                lineTo(15.41f, 16.84f)
                lineTo(17f, 18.43f)
                lineTo(20.59f, 14.84f)
                lineTo(21.75f, 16.25f)
                moveTo(8f, 14f)
                curveTo(8f, 12.23f, 10f, 8.96f, 12f, 6.39f)
                curveTo(13.5f, 8.33f, 15f, 10.67f, 15.67f, 12.47f)
                curveTo(16.27f, 12.21f, 16.93f, 12.06f, 17.62f, 12f)
                curveTo(16.31f, 8.1f, 12f, 3.25f, 12f, 3.25f)
                reflectiveCurveTo(6f, 10f, 6f, 14f)
                curveTo(6f, 17.31f, 8.69f, 20f, 12f, 20f)
                curveTo(12.12f, 20f, 12.23f, 20f, 12.34f, 20f)
                curveTo(12.12f, 19.36f, 12f, 18.7f, 12f, 18f)
                curveTo(9.79f, 18f, 8f, 16.21f, 8f, 14f)
                close()
            }
        }.build()

        return _WaterCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WaterCheckOutline: ImageVector? = null
