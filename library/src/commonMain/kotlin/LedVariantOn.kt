package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LedVariantOn: ImageVector
    get() {
        if (_LedVariantOn != null) {
            return _LedVariantOn!!
        }
        _LedVariantOn = ImageVector.Builder(
            name = "LedVariantOn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                close()
            }
        }.build()

        return _LedVariantOn!!
    }

@Suppress("ObjectPropertyName")
private var _LedVariantOn: ImageVector? = null
