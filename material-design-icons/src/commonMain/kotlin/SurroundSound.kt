package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SurroundSound: ImageVector
    get() {
        if (_SurroundSound != null) {
            return _SurroundSound!!
        }
        _SurroundSound = ImageVector.Builder(
            name = "SurroundSound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4f)
                moveTo(7.76f, 16.24f)
                lineTo(6.35f, 17.65f)
                curveTo(4.78f, 16.1f, 4f, 14.05f, 4f, 12f)
                curveTo(4f, 9.95f, 4.78f, 7.9f, 6.34f, 6.34f)
                lineTo(7.75f, 7.75f)
                curveTo(6.59f, 8.93f, 6f, 10.46f, 6f, 12f)
                curveTo(6f, 13.54f, 6.59f, 15.07f, 7.76f, 16.24f)
                moveTo(12f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                moveTo(17.66f, 17.66f)
                lineTo(16.25f, 16.25f)
                curveTo(17.41f, 15.07f, 18f, 13.54f, 18f, 12f)
                curveTo(18f, 10.46f, 17.41f, 8.93f, 16.24f, 7.76f)
                lineTo(17.65f, 6.35f)
                curveTo(19.22f, 7.9f, 20f, 9.95f, 20f, 12f)
                curveTo(20f, 14.05f, 19.22f, 16.1f, 17.66f, 17.66f)
                moveTo(12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                close()
            }
        }.build()

        return _SurroundSound!!
    }

@Suppress("ObjectPropertyName")
private var _SurroundSound: ImageVector? = null
