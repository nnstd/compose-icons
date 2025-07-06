package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BagPersonalOff: ImageVector
    get() {
        if (_BagPersonalOff != null) {
            return _BagPersonalOff!!
        }
        _BagPersonalOff = ImageVector.Builder(
            name = "BagPersonalOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19.35f)
                lineTo(2.38f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(4.77f, 6.66f)
                curveTo(4.27f, 7.34f, 4f, 8.16f, 4f, 9f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(18.56f, 22f, 19.08f, 21.76f, 19.46f, 21.35f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20f, 19.35f)
                moveTo(9f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(13.11f)
                lineTo(14.11f, 16f)
                horizontalLineTo(9f)
                moveTo(20f, 9f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 5f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 2f)
                horizontalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 4f)
                verticalLineTo(4.8f)
                lineTo(20f, 16.8f)
                verticalLineTo(9f)
                moveTo(14f, 5f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _BagPersonalOff!!
    }

@Suppress("ObjectPropertyName")
private var _BagPersonalOff: ImageVector? = null
