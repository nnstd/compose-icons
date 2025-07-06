package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SwapHorizontalVariant: ImageVector
    get() {
        if (_SwapHorizontalVariant != null) {
            return _SwapHorizontalVariant!!
        }
        _SwapHorizontalVariant = ImageVector.Builder(
            name = "SwapHorizontalVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                lineTo(8f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 11f)
                horizontalLineTo(8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 19f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                lineTo(20f, 18f)
                lineTo(16f, 14f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 13f)
                horizontalLineTo(16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 9f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 5f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                lineTo(4f, 6f)
                close()
            }
        }.build()

        return _SwapHorizontalVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SwapHorizontalVariant: ImageVector? = null
