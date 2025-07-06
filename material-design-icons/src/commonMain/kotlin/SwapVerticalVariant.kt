package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SwapVerticalVariant: ImageVector
    get() {
        if (_SwapVerticalVariant != null) {
            return _SwapVerticalVariant!!
        }
        _SwapVerticalVariant = ImageVector.Builder(
            name = "SwapVerticalVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 4f)
                lineTo(14f, 8f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 16f)
                verticalLineTo(8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(2f)
                lineTo(6f, 20f)
                lineTo(10f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 8f)
                verticalLineTo(16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 20f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 16f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                lineTo(18f, 4f)
                close()
            }
        }.build()

        return _SwapVerticalVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SwapVerticalVariant: ImageVector? = null
