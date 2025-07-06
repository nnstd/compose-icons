package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatListCheckbox: ImageVector
    get() {
        if (_FormatListCheckbox != null) {
            return _FormatListCheckbox!!
        }
        _FormatListCheckbox = ImageVector.Builder(
            name = "FormatListCheckbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                moveTo(21f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                moveTo(8f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                moveTo(4f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                moveTo(3f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 5f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 7f)
                verticalLineTo(5f)
                moveTo(4f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                moveTo(3f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 10f)
                horizontalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 11f)
                verticalLineTo(13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 14f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13f)
                verticalLineTo(11f)
                moveTo(4f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                moveTo(3f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 16f)
                horizontalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 17f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 20f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _FormatListCheckbox!!
    }

@Suppress("ObjectPropertyName")
private var _FormatListCheckbox: ImageVector? = null
