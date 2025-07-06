package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GamepadVariantOutline: ImageVector
    get() {
        if (_GamepadVariantOutline != null) {
            return _GamepadVariantOutline!!
        }
        _GamepadVariantOutline = ImageVector.Builder(
            name = "GamepadVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                moveTo(18.5f, 9f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 9f)
                moveTo(15.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 12f)
                moveTo(17f, 5f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 19f)
                curveTo(15.04f, 19f, 13.27f, 18.2f, 12f, 16.9f)
                curveTo(10.73f, 18.2f, 8.96f, 19f, 7f, 19f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 5f)
                horizontalLineTo(17f)
                moveTo(7f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 17f)
                curveTo(8.64f, 17f, 10.09f, 16.21f, 11f, 15f)
                horizontalLineTo(13f)
                curveTo(13.91f, 16.21f, 15.36f, 17f, 17f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 7f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _GamepadVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _GamepadVariantOutline: ImageVector? = null
