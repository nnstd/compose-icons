package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InboxArrowUpOutline: ImageVector
    get() {
        if (_InboxArrowUpOutline != null) {
            return _InboxArrowUpOutline!!
        }
        _InboxArrowUpOutline = ImageVector.Builder(
            name = "InboxArrowUpOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(5f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(8.13f)
                arcTo(4.13f, 4.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.4f, 19f)
                moveTo(19f, 19f)
                horizontalLineTo(14.6f)
                arcTo(4.13f, 4.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.87f, 17f)
                horizontalLineTo(19f)
                moveTo(19f, 15f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 16f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(8f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                lineTo(12f, 7f)
            }
        }.build()

        return _InboxArrowUpOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InboxArrowUpOutline: ImageVector? = null
