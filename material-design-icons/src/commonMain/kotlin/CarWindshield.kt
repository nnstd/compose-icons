package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarWindshield: ImageVector
    get() {
        if (_CarWindshield != null) {
            return _CarWindshield!!
        }
        _CarWindshield = ImageVector.Builder(
            name = "CarWindshield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.63f, 15.5f)
                lineTo(20.21f, 5.85f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.14f, 5.1f)
                curveTo(17.8f, 5.24f, 14.14f, 5.5f, 12f, 5.5f)
                reflectiveCurveTo(6.2f, 5.24f, 4.86f, 5.1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.79f, 5.85f)
                lineTo(1.37f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.55f, 17.36f)
                arcTo(61.5f, 61.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                arcTo(61.5f, 61.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.45f, 17.36f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.63f, 15.5f)
                close()
            }
        }.build()

        return _CarWindshield!!
    }

@Suppress("ObjectPropertyName")
private var _CarWindshield: ImageVector? = null
