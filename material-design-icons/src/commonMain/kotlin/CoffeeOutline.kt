package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CoffeeOutline: ImageVector
    get() {
        if (_CoffeeOutline != null) {
            return _CoffeeOutline!!
        }
        _CoffeeOutline = ImageVector.Builder(
            name = "CoffeeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                moveTo(20f, 8f)
                verticalLineTo(5f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(20f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 10f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 17f)
                horizontalLineTo(8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 13f)
                verticalLineTo(3f)
                horizontalLineTo(20f)
                moveTo(16f, 5f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 15f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 13f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _CoffeeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CoffeeOutline: ImageVector? = null
