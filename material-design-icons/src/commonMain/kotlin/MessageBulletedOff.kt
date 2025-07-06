package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageBulletedOff: ImageVector
    get() {
        if (_MessageBulletedOff != null) {
            return _MessageBulletedOff!!
        }
        _MessageBulletedOff = ImageVector.Builder(
            name = "MessageBulletedOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.27f, 1.73f)
                lineTo(0f, 3f)
                lineTo(2f, 5f)
                verticalLineTo(22f)
                lineTo(6f, 18f)
                horizontalLineTo(15f)
                lineTo(20.73f, 23.73f)
                lineTo(22f, 22.46f)
                lineTo(1.27f, 1.73f)
                moveTo(8f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                moveTo(6f, 11f)
                verticalLineTo(9f)
                lineTo(8f, 11f)
                horizontalLineTo(6f)
                moveTo(20f, 2f)
                horizontalLineTo(4.08f)
                lineTo(10f, 7.92f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(10.08f)
                lineTo(11.08f, 9f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(13.08f)
                lineTo(20.07f, 18f)
                curveTo(21.14f, 17.95f, 22f, 17.08f, 22f, 16f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2f)
                close()
            }
        }.build()

        return _MessageBulletedOff!!
    }

@Suppress("ObjectPropertyName")
private var _MessageBulletedOff: ImageVector? = null
