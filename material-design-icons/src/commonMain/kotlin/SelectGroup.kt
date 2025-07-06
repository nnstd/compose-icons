package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SelectGroup: ImageVector
    get() {
        if (_SelectGroup != null) {
            return _SelectGroup!!
        }
        _SelectGroup = ImageVector.Builder(
            name = "SelectGroup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                horizontalLineTo(5f)
                moveTo(7f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                moveTo(11f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                moveTo(15f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                moveTo(19f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(3f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                moveTo(7f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                moveTo(13f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                moveTo(19f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                moveTo(3f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                moveTo(19f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                moveTo(7f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                moveTo(13f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                moveTo(3f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                moveTo(19f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                moveTo(3f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                verticalLineTo(19f)
                moveTo(7f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                moveTo(11f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                moveTo(15f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                moveTo(19f, 19f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                close()
            }
        }.build()

        return _SelectGroup!!
    }

@Suppress("ObjectPropertyName")
private var _SelectGroup: ImageVector? = null
