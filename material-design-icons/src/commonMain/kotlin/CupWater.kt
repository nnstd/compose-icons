package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CupWater: ImageVector
    get() {
        if (_CupWater != null) {
            return _CupWater!!
        }
        _CupWater = ImageVector.Builder(
            name = "CupWater",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.32f, 8f)
                horizontalLineTo(5.67f)
                lineTo(5.23f, 4f)
                horizontalLineTo(18.77f)
                moveTo(12f, 19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 16f)
                curveTo(9f, 14f, 12f, 10.6f, 12f, 10.6f)
                curveTo(12f, 10.6f, 15f, 14f, 15f, 16f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                moveTo(3f, 2f)
                lineTo(5f, 20.23f)
                curveTo(5.13f, 21.23f, 5.97f, 22f, 7f, 22f)
                horizontalLineTo(17f)
                curveTo(18f, 22f, 18.87f, 21.23f, 19f, 20.23f)
                lineTo(21f, 2f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _CupWater!!
    }

@Suppress("ObjectPropertyName")
private var _CupWater: ImageVector? = null
