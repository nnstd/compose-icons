package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DivingHelmet: ImageVector
    get() {
        if (_DivingHelmet != null) {
            return _DivingHelmet!!
        }
        _DivingHelmet = ImageVector.Builder(
            name = "DivingHelmet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12f)
                moveTo(19.45f, 7.89f)
                lineTo(18.07f, 8.58f)
                lineTo(18.32f, 9f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18.33f)
                curveTo(17.84f, 16.03f, 17.11f, 16.92f, 16.21f, 17.6f)
                curveTo(17.85f, 18.11f, 19.1f, 18.91f, 19.67f, 19.86f)
                curveTo(18.69f, 21.1f, 15.62f, 22f, 12f, 22f)
                curveTo(8.38f, 22f, 5.31f, 21.1f, 4.33f, 19.86f)
                curveTo(4.9f, 18.91f, 6.15f, 18.11f, 7.79f, 17.6f)
                curveTo(6.89f, 16.92f, 6.16f, 16.03f, 5.67f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(5.68f)
                curveTo(6.37f, 7.54f, 7.54f, 6.37f, 9f, 5.68f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineTo(5.68f)
                curveTo(15.68f, 6f, 16.29f, 6.46f, 16.82f, 7f)
                lineTo(18.55f, 6.14f)
                curveTo(19.93f, 5.42f, 20f, 4.1f, 20f, 2f)
                horizontalLineTo(22f)
                curveTo(22f, 4.06f, 22f, 6.62f, 19.45f, 7.89f)
                moveTo(17f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 12f)
                close()
            }
        }.build()

        return _DivingHelmet!!
    }

@Suppress("ObjectPropertyName")
private var _DivingHelmet: ImageVector? = null
