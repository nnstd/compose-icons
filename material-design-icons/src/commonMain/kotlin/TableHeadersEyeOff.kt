package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableHeadersEyeOff: ImageVector
    get() {
        if (_TableHeadersEyeOff != null) {
            return _TableHeadersEyeOff!!
        }
        _TableHeadersEyeOff = ImageVector.Builder(
            name = "TableHeadersEyeOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.38f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(2.26f, 4.15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 6f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(9.11f)
                lineTo(12.72f, 14.61f)
                arcTo(6.21f, 6.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 17f)
                arcTo(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 21f)
                arcTo(6.55f, 6.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.84f, 20.73f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.58f, 19.93f)
                moveTo(7f, 19f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                moveTo(7f, 14f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                moveTo(7f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(4.11f)
                lineTo(7f, 8.89f)
                moveTo(17f, 19.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.56f, 16.45f)
                lineTo(17.56f, 19.45f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 19.5f)
                moveTo(16.24f, 13f)
                lineTo(17.85f, 14.61f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.35f, 16.11f)
                lineTo(21.94f, 18.7f)
                arcTo(6.44f, 6.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 17f)
                arcTo(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 13f)
                horizontalLineTo(16.24f)
                moveTo(13f, 6f)
                verticalLineTo(9f)
                horizontalLineTo(12.2f)
                lineTo(14.2f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 4f)
                horizontalLineTo(7.2f)
                lineTo(9.2f, 6f)
                moveTo(15f, 6f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _TableHeadersEyeOff!!
    }

@Suppress("ObjectPropertyName")
private var _TableHeadersEyeOff: ImageVector? = null
