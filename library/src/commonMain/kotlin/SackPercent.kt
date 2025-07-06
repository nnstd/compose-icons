package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SackPercent: ImageVector
    get() {
        if (_SackPercent != null) {
            return _SackPercent!!
        }
        _SackPercent = ImageVector.Builder(
            name = "SackPercent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 7f)
                lineTo(6f, 2f)
                lineTo(10f, 4f)
                lineTo(12f, 2f)
                lineTo(14f, 4f)
                lineTo(18f, 2f)
                lineTo(16f, 7f)
                horizontalLineTo(8f)
                moveTo(16f, 22f)
                curveTo(10f, 22f, 8f, 22f, 8f, 22f)
                curveTo(2f, 22f, 3f, 18f, 3f, 18f)
                curveTo(3f, 18f, 4f, 11f, 8f, 9f)
                horizontalLineTo(16f)
                curveTo(20f, 11f, 21f, 18f, 21f, 18f)
                curveTo(21f, 18f, 22f, 22f, 16f, 22f)
                moveTo(7.5f, 12.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 14f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 12.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 12.5f)
                moveTo(16.5f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 20f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 18.5f)
                moveTo(16.5f, 12.35f)
                lineTo(15.15f, 11f)
                lineTo(7.5f, 18.65f)
                lineTo(8.87f, 20f)
                lineTo(16.5f, 12.35f)
                close()
            }
        }.build()

        return _SackPercent!!
    }

@Suppress("ObjectPropertyName")
private var _SackPercent: ImageVector? = null
