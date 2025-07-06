package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BellCancel: ImageVector
    get() {
        if (_BellCancel != null) {
            return _BellCancel!!
        }
        _BellCancel = ImageVector.Builder(
            name = "BellCancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 13f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 17.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 22f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 13f)
                moveTo(17.5f, 14.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 17.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.08f, 19f)
                lineTo(16f, 14.92f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 14.5f)
                moveTo(14.92f, 16f)
                lineTo(19f, 20.08f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 20.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 17.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.92f, 16f)
                moveTo(12f, 2f)
                curveTo(10.9f, 2f, 10f, 2.9f, 10f, 4f)
                curveTo(10f, 4.1f, 10f, 4.19f, 10f, 4.29f)
                curveTo(7.12f, 5.14f, 5f, 7.82f, 5f, 11f)
                verticalLineTo(17f)
                lineTo(3f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(11.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 17.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 11f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 11.18f)
                verticalLineTo(11f)
                curveTo(19f, 7.82f, 16.88f, 5.14f, 14f, 4.29f)
                curveTo(14f, 4.19f, 14f, 4.1f, 14f, 4f)
                curveTo(14f, 2.9f, 13.11f, 2f, 12f, 2f)
                moveTo(10f, 21f)
                curveTo(10f, 22.11f, 10.9f, 23f, 12f, 23f)
                curveTo(12.5f, 23f, 12.97f, 22.81f, 13.33f, 22.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.03f, 21f)
                close()
            }
        }.build()

        return _BellCancel!!
    }

@Suppress("ObjectPropertyName")
private var _BellCancel: ImageVector? = null
