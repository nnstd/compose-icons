package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InboxArrowUp: ImageVector
    get() {
        if (_InboxArrowUp != null) {
            return _InboxArrowUp!!
        }
        _InboxArrowUp = ImageVector.Builder(
            name = "InboxArrowUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                lineTo(12f, 7f)
                lineTo(16f, 11f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                moveTo(16f, 11f)
                moveTo(5f, 15f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 15f)
                horizontalLineTo(5f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
            }
        }.build()

        return _InboxArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _InboxArrowUp: ImageVector? = null
