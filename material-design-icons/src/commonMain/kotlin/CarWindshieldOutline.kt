package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarWindshieldOutline: ImageVector
    get() {
        if (_CarWindshieldOutline != null) {
            return _CarWindshieldOutline!!
        }
        _CarWindshieldOutline = ImageVector.Builder(
            name = "CarWindshieldOutline",
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
                moveTo(12f, 16f)
                arcTo(63.33f, 63.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.44f, 15.5f)
                lineTo(5.5f, 7.18f)
                curveTo(7f, 7.32f, 10.16f, 7.5f, 12f, 7.5f)
                reflectiveCurveTo(17f, 7.32f, 18.5f, 7.18f)
                lineTo(20.56f, 15.5f)
                arcTo(63.33f, 63.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                close()
            }
        }.build()

        return _CarWindshieldOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CarWindshieldOutline: ImageVector? = null
