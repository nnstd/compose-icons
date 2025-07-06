package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ApplicationBracketsOutline: ImageVector
    get() {
        if (_ApplicationBracketsOutline != null) {
            return _ApplicationBracketsOutline!!
        }
        _ApplicationBracketsOutline = ImageVector.Builder(
            name = "ApplicationBracketsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 8.5f)
                lineTo(11f, 10f)
                lineTo(8f, 13f)
                lineTo(11f, 16f)
                lineTo(9.5f, 17.5f)
                lineTo(5f, 13f)
                lineTo(9.5f, 8.5f)
                moveTo(14.5f, 17.5f)
                lineTo(13f, 16f)
                lineTo(16f, 13f)
                lineTo(13f, 10f)
                lineTo(14.5f, 8.5f)
                lineTo(19f, 13f)
                lineTo(14.5f, 17.5f)
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 22f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 2f)
                moveTo(21f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _ApplicationBracketsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ApplicationBracketsOutline: ImageVector? = null
