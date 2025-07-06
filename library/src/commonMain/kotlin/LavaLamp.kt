package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LavaLamp: ImageVector
    get() {
        if (_LavaLamp != null) {
            return _LavaLamp!!
        }
        _LavaLamp = ImageVector.Builder(
            name = "LavaLamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 3f)
                lineTo(8f, 16f)
                horizontalLineTo(16f)
                lineTo(14f, 3f)
                horizontalLineTo(10f)
                moveTo(11.5f, 5.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.25f, 6.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 7.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.75f, 6.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 5.75f)
                moveTo(12.5f, 8.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 9.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 10.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 9.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 8.5f)
                moveTo(11.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 12f)
                moveTo(8f, 17f)
                lineTo(10f, 19f)
                lineTo(8f, 21f)
                horizontalLineTo(16f)
                lineTo(14f, 19f)
                lineTo(16f, 17f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _LavaLamp!!
    }

@Suppress("ObjectPropertyName")
private var _LavaLamp: ImageVector? = null
