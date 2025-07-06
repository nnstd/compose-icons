package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardBulletedOff: ImageVector
    get() {
        if (_CardBulletedOff != null) {
            return _CardBulletedOff!!
        }
        _CardBulletedOff = ImageVector.Builder(
            name = "CardBulletedOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.35f, 3.58f)
                lineTo(20.65f, 20.87f)
                lineTo(19.23f, 22.29f)
                lineTo(16.94f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 5.72f, 2.06f, 5.46f, 2.16f, 5.22f)
                lineTo(1.23f, 4.29f)
                lineTo(2.65f, 2.87f)
                lineTo(3.35f, 3.58f)
                moveTo(6.6f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(18f)
                curveTo(22f, 18.4f, 21.88f, 18.77f, 21.68f, 19.08f)
                lineTo(17.6f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(15.6f)
                lineTo(13.6f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(11.6f)
                lineTo(6.6f, 4f)
                moveTo(9.94f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(14.06f)
                lineTo(9.94f, 13f)
                moveTo(5.94f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(10.06f)
                lineTo(5.94f, 9f)
                close()
            }
        }.build()

        return _CardBulletedOff!!
    }

@Suppress("ObjectPropertyName")
private var _CardBulletedOff: ImageVector? = null
