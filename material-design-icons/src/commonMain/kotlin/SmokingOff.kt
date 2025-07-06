package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SmokingOff: ImageVector
    get() {
        if (_SmokingOff != null) {
            return _SmokingOff!!
        }
        _SmokingOff = ImageVector.Builder(
            name = "SmokingOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 6f)
                lineTo(9f, 13f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                horizontalLineTo(12f)
                lineTo(19f, 23f)
                lineTo(20.25f, 21.75f)
                lineTo(3.25f, 4.75f)
                lineTo(2f, 6f)
                moveTo(20.5f, 13f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                horizontalLineTo(20.5f)
                verticalLineTo(13f)
                moveTo(18f, 13f)
                horizontalLineTo(19.5f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                moveTo(18.85f, 4.88f)
                curveTo(19.47f, 4.27f, 19.85f, 3.43f, 19.85f, 2.5f)
                horizontalLineTo(18.35f)
                curveTo(18.35f, 3.5f, 17.5f, 4.35f, 16.5f, 4.35f)
                verticalLineTo(5.85f)
                curveTo(18.74f, 5.85f, 20.5f, 7.68f, 20.5f, 9.92f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                verticalLineTo(9.92f)
                curveTo(22f, 7.69f, 20.72f, 5.77f, 18.85f, 4.88f)
                moveTo(14.5f, 8.7f)
                horizontalLineTo(16.03f)
                curveTo(17.08f, 8.7f, 18f, 9.44f, 18f, 10.75f)
                verticalLineTo(12f)
                horizontalLineTo(19.5f)
                verticalLineTo(10.41f)
                curveTo(19.5f, 8.61f, 17.9f, 7.25f, 16.03f, 7.25f)
                horizontalLineTo(14.5f)
                curveTo(13.5f, 7.25f, 12.65f, 6.27f, 12.65f, 5.25f)
                curveTo(12.65f, 4.23f, 13.5f, 3.5f, 14.5f, 3.5f)
                verticalLineTo(2f)
                arcTo(3.35f, 3.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.15f, 5.35f)
                arcTo(3.35f, 3.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 8.7f)
                moveTo(17f, 15.93f)
                verticalLineTo(13f)
                horizontalLineTo(14.07f)
                lineTo(17f, 15.93f)
                close()
            }
        }.build()

        return _SmokingOff!!
    }

@Suppress("ObjectPropertyName")
private var _SmokingOff: ImageVector? = null
