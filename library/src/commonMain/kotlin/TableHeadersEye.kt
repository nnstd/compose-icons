package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableHeadersEye: ImageVector
    get() {
        if (_TableHeadersEye != null) {
            return _TableHeadersEye!!
        }
        _TableHeadersEye = ImageVector.Builder(
            name = "TableHeadersEye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 6f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 4f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 6f)
                moveTo(3f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                moveTo(7f, 19f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                moveTo(7f, 14f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                moveTo(9f, 9f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                moveTo(19f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                moveTo(17f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 16f)
                moveTo(17f, 13f)
                arcTo(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 17f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 17f)
                arcTo(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 13f)
                moveTo(17f, 14.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 19.5f, 17f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 14.5f)
            }
        }.build()

        return _TableHeadersEye!!
    }

@Suppress("ObjectPropertyName")
private var _TableHeadersEye: ImageVector? = null
