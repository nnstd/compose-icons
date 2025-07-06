package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeMinusOutline: ImageVector
    get() {
        if (_EyeMinusOutline != null) {
            return _EyeMinusOutline!!
        }
        _EyeMinusOutline = ImageVector.Builder(
            name = "EyeMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4.5f)
                arcTo(11.8f, 11.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 12f)
                arcTo(11.8f, 11.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19.5f)
                horizontalLineTo(13.1f)
                arcTo(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 18.5f)
                arcTo(4.1f, 4.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.1f, 17.4f)
                horizontalLineTo(12f)
                arcTo(9.6f, 9.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.2f, 12f)
                arcTo(9.6f, 9.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6.5f)
                arcTo(9.6f, 9.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.8f, 12f)
                lineTo(20.4f, 12.7f)
                arcTo(4.6f, 4.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.3f, 13.5f)
                arcTo(10.1f, 10.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 12f)
                arcTo(11.8f, 11.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4.5f)
                moveTo(12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15f, 12f)
                arcTo(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                moveTo(15f, 17.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(23f)
                verticalLineTo(17.5f)
                close()
            }
        }.build()

        return _EyeMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EyeMinusOutline: ImageVector? = null
