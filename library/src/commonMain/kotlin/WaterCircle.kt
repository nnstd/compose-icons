package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterCircle: ImageVector
    get() {
        if (_WaterCircle != null) {
            return _WaterCircle!!
        }
        _WaterCircle = ImageVector.Builder(
            name = "WaterCircle",
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
                moveTo(12f, 19f)
                curveTo(9.24f, 19f, 7f, 16.76f, 7f, 14f)
                curveTo(7f, 10.67f, 12f, 5.04f, 12f, 5.04f)
                reflectiveCurveTo(17f, 10.67f, 17f, 14f)
                curveTo(17f, 16.76f, 14.76f, 19f, 12f, 19f)
                close()
            }
        }.build()

        return _WaterCircle!!
    }

@Suppress("ObjectPropertyName")
private var _WaterCircle: ImageVector? = null
