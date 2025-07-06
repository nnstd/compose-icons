package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Safe: ImageVector
    get() {
        if (_Safe != null) {
            return _Safe!!
        }
        _Safe = ImageVector.Builder(
            name = "Safe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 17f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 4f)
                horizontalLineTo(4f)
                moveTo(4f, 6f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                moveTo(13.5f, 7.5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 11.5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 15.5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 11.5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 7.5f)
                moveTo(5f, 9f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                moveTo(13.5f, 9.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 11.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 13.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 11.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 9.5f)
                close()
            }
        }.build()

        return _Safe!!
    }

@Suppress("ObjectPropertyName")
private var _Safe: ImageVector? = null
