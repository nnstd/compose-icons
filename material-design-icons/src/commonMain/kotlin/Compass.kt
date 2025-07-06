package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Compass: ImageVector
    get() {
        if (_Compass != null) {
            return _Compass!!
        }
        _Compass = ImageVector.Builder(
            name = "Compass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.19f, 14.19f)
                lineTo(6f, 18f)
                lineTo(9.81f, 9.81f)
                lineTo(18f, 6f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(12f, 10.9f)
                arcTo(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.9f, 12f)
                arcTo(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13.1f)
                arcTo(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.1f, 12f)
                arcTo(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10.9f)
                close()
            }
        }.build()

        return _Compass!!
    }

@Suppress("ObjectPropertyName")
private var _Compass: ImageVector? = null
