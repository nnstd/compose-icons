package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyRial: ImageVector
    get() {
        if (_CurrencyRial != null) {
            return _CurrencyRial!!
        }
        _CurrencyRial = ImageVector.Builder(
            name = "CurrencyRial",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                moveTo(14f, 17f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                moveTo(9f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 19f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 17f)
                horizontalLineTo(7f)
                curveTo(8.11f, 17f, 9f, 16.11f, 9f, 15f)
                verticalLineTo(4f)
                moveTo(12f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                curveTo(19f, 14.11f, 18.11f, 15f, 17f, 15f)
                horizontalLineTo(14f)
                curveTo(12.89f, 15f, 12f, 14.11f, 12f, 13f)
                verticalLineTo(4f)
                moveTo(20f, 10f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 20f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 17f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _CurrencyRial!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyRial: ImageVector? = null
