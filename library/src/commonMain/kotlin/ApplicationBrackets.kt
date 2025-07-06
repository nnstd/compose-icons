package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ApplicationBrackets: ImageVector
    get() {
        if (_ApplicationBrackets != null) {
            return _ApplicationBrackets!!
        }
        _ApplicationBrackets = ImageVector.Builder(
            name = "ApplicationBrackets",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 22f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 2f)
                moveTo(11f, 17.5f)
                lineTo(9.5f, 19f)
                lineTo(5f, 14.5f)
                lineTo(9.5f, 10f)
                lineTo(11f, 11.5f)
                lineTo(8f, 14.5f)
                lineTo(11f, 17.5f)
                moveTo(14.5f, 19f)
                lineTo(13f, 17.5f)
                lineTo(16f, 14.5f)
                lineTo(13f, 11.5f)
                lineTo(14.5f, 10f)
                lineTo(19f, 14.5f)
                lineTo(14.5f, 19f)
                moveTo(21f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _ApplicationBrackets!!
    }

@Suppress("ObjectPropertyName")
private var _ApplicationBrackets: ImageVector? = null
