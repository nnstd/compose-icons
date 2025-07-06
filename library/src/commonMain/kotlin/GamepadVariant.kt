package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GamepadVariant: ImageVector
    get() {
        if (_GamepadVariant != null) {
            return _GamepadVariant!!
        }
        _GamepadVariant = ImageVector.Builder(
            name = "GamepadVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 6f)
                horizontalLineTo(17f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 18f)
                curveTo(15.22f, 18f, 13.63f, 17.23f, 12.53f, 16f)
                horizontalLineTo(11.47f)
                curveTo(10.37f, 17.23f, 8.78f, 18f, 7f, 18f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 6f)
                moveTo(6f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                moveTo(15.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 12f)
                moveTo(18.5f, 9f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 9f)
                close()
            }
        }.build()

        return _GamepadVariant!!
    }

@Suppress("ObjectPropertyName")
private var _GamepadVariant: ImageVector? = null
