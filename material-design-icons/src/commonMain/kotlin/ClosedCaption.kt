package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClosedCaption: ImageVector
    get() {
        if (_ClosedCaption != null) {
            return _ClosedCaption!!
        }
        _ClosedCaption = ImageVector.Builder(
            name = "ClosedCaption",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 11f)
                horizontalLineTo(16.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 15f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 14f)
                verticalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 9f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10f)
                moveTo(11f, 11f)
                horizontalLineTo(9.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 15f)
                horizontalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 14f)
                verticalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 9f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 10f)
                moveTo(19f, 4f)
                horizontalLineTo(5f)
                curveTo(3.89f, 4f, 3f, 4.89f, 3f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18f)
                verticalLineTo(6f)
                curveTo(21f, 4.89f, 20.1f, 4f, 19f, 4f)
                close()
            }
        }.build()

        return _ClosedCaption!!
    }

@Suppress("ObjectPropertyName")
private var _ClosedCaption: ImageVector? = null
