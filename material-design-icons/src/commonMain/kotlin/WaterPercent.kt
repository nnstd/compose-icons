package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterPercent: ImageVector
    get() {
        if (_WaterPercent != null) {
            return _WaterPercent!!
        }
        _WaterPercent = ImageVector.Builder(
            name = "WaterPercent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3.25f)
                curveTo(12f, 3.25f, 6f, 10f, 6f, 14f)
                curveTo(6f, 17.32f, 8.69f, 20f, 12f, 20f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 14f)
                curveTo(18f, 10f, 12f, 3.25f, 12f, 3.25f)
                moveTo(14.47f, 9.97f)
                lineTo(15.53f, 11.03f)
                lineTo(9.53f, 17.03f)
                lineTo(8.47f, 15.97f)
                moveTo(9.75f, 10f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 11.25f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.75f, 12.5f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 11.25f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.75f, 10f)
                moveTo(14.25f, 14.5f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 15.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.25f, 17f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 15.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.25f, 14.5f)
                close()
            }
        }.build()

        return _WaterPercent!!
    }

@Suppress("ObjectPropertyName")
private var _WaterPercent: ImageVector? = null
