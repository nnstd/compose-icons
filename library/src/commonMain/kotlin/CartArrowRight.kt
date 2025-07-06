package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CartArrowRight: ImageVector
    get() {
        if (_CartArrowRight != null) {
            return _CartArrowRight!!
        }
        _CartArrowRight = ImageVector.Builder(
            name = "CartArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 20f)
                moveTo(17f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 18f)
                moveTo(7.2f, 14.63f)
                curveTo(7.19f, 14.67f, 7.19f, 14.71f, 7.2f, 14.75f)
                arcTo(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.45f, 15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 15f)
                curveTo(5f, 14.65f, 5.07f, 14.31f, 5.24f, 14f)
                lineTo(6.6f, 11.59f)
                lineTo(3f, 4f)
                horizontalLineTo(1f)
                verticalLineTo(2f)
                horizontalLineTo(4.27f)
                lineTo(5.21f, 4f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                curveTo(21f, 5.17f, 20.95f, 5.34f, 20.88f, 5.5f)
                lineTo(17.3f, 12f)
                curveTo(16.94f, 12.62f, 16.27f, 13f, 15.55f, 13f)
                horizontalLineTo(8.1f)
                lineTo(7.2f, 14.63f)
                moveTo(9f, 9.5f)
                horizontalLineTo(13f)
                verticalLineTo(11.5f)
                lineTo(16f, 8.5f)
                lineTo(13f, 5.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(9f)
                verticalLineTo(9.5f)
                close()
            }
        }.build()

        return _CartArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _CartArrowRight: ImageVector? = null
