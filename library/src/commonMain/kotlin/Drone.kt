package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Drone: ImageVector
    get() {
        if (_Drone != null) {
            return _Drone!!
        }
        _Drone = ImageVector.Builder(
            name = "Drone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 11f)
                horizontalLineTo(21f)
                lineTo(20f, 9f)
                horizontalLineTo(13.75f)
                lineTo(16f, 12.5f)
                horizontalLineTo(14f)
                lineTo(10.75f, 9f)
                horizontalLineTo(4f)
                curveTo(3.45f, 9f, 2f, 8.55f, 2f, 8f)
                curveTo(2f, 7.45f, 3.5f, 5.5f, 5.5f, 5.5f)
                curveTo(7.5f, 5.5f, 7.67f, 6.5f, 9f, 7f)
                horizontalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 8f)
                verticalLineTo(9f)
                lineTo(22f, 11f)
                moveTo(10.75f, 6.5f)
                lineTo(14f, 3f)
                horizontalLineTo(16f)
                lineTo(13.75f, 6.5f)
                horizontalLineTo(10.75f)
                moveTo(18f, 11f)
                verticalLineTo(9.5f)
                horizontalLineTo(19.75f)
                lineTo(19f, 11f)
                horizontalLineTo(18f)
                moveTo(3f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 19f)
                moveTo(11f, 21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 21f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 21f)
                close()
            }
        }.build()

        return _Drone!!
    }

@Suppress("ObjectPropertyName")
private var _Drone: ImageVector? = null
