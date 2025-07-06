package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterRemove: ImageVector
    get() {
        if (_WaterRemove != null) {
            return _WaterRemove!!
        }
        _WaterRemove = ImageVector.Builder(
            name = "WaterRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                curveTo(12f, 18.7f, 12.12f, 19.36f, 12.34f, 20f)
                curveTo(12.23f, 20f, 12.12f, 20f, 12f, 20f)
                curveTo(8.69f, 20f, 6f, 17.31f, 6f, 14f)
                curveTo(6f, 10f, 12f, 3.25f, 12f, 3.25f)
                reflectiveCurveTo(16.31f, 8.1f, 17.62f, 12f)
                curveTo(14.5f, 12.22f, 12f, 14.82f, 12f, 18f)
                moveTo(21.54f, 15.88f)
                lineTo(20.13f, 14.47f)
                lineTo(18f, 16.59f)
                lineTo(15.88f, 14.47f)
                lineTo(14.47f, 15.88f)
                lineTo(16.59f, 18f)
                lineTo(14.47f, 20.12f)
                lineTo(15.88f, 21.53f)
                lineTo(18f, 19.41f)
                lineTo(20.12f, 21.53f)
                lineTo(21.53f, 20.12f)
                lineTo(19.41f, 18f)
                lineTo(21.54f, 15.88f)
                close()
            }
        }.build()

        return _WaterRemove!!
    }

@Suppress("ObjectPropertyName")
private var _WaterRemove: ImageVector? = null
