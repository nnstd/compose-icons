package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LedOutline: ImageVector
    get() {
        if (_LedOutline != null) {
            return _LedOutline!!
        }
        _LedOutline = ImageVector.Builder(
            name = "LedOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 10f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(23f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(23f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                moveTo(12f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                close()
            }
        }.build()

        return _LedOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LedOutline: ImageVector? = null
