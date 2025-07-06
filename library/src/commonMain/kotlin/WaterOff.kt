package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterOff: ImageVector
    get() {
        if (_WaterOff != null) {
            return _WaterOff!!
        }
        _WaterOff = ImageVector.Builder(
            name = "WaterOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(16.29f, 18.18f)
                curveTo(15.2f, 19.3f, 13.69f, 20f, 12f, 20f)
                curveTo(8.69f, 20f, 6f, 17.31f, 6f, 14f)
                curveTo(6f, 12.67f, 6.67f, 11.03f, 7.55f, 9.44f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(18f, 14f)
                curveTo(18f, 10f, 12f, 3.25f, 12f, 3.25f)
                reflectiveCurveTo(10.84f, 4.55f, 9.55f, 6.35f)
                lineTo(17.95f, 14.75f)
                curveTo(18f, 14.5f, 18f, 14.25f, 18f, 14f)
                close()
            }
        }.build()

        return _WaterOff!!
    }

@Suppress("ObjectPropertyName")
private var _WaterOff: ImageVector? = null
