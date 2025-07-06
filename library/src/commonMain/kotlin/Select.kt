package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Select: ImageVector
    get() {
        if (_Select != null) {
            return _Select!!
        }
        _Select = ImageVector.Builder(
            name = "Select",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 3f)
                moveTo(20f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 4f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                horizontalLineTo(20f)
                moveTo(15f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                moveTo(11f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                moveTo(7f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                moveTo(21f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 21f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                moveTo(15f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                moveTo(11f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                moveTo(7f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                moveTo(4f, 21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                moveTo(3f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                moveTo(21f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                moveTo(3f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                moveTo(21f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                moveTo(3f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                moveTo(21f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _Select!!
    }

@Suppress("ObjectPropertyName")
private var _Select: ImageVector? = null
