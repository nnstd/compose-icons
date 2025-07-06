package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardBulletedOffOutline: ImageVector
    get() {
        if (_CardBulletedOffOutline != null) {
            return _CardBulletedOffOutline!!
        }
        _CardBulletedOffOutline = ImageVector.Builder(
            name = "CardBulletedOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.59f, 20.87f)
                lineTo(19.17f, 22.29f)
                lineTo(16.88f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 5.74f, 2.05f, 5.5f, 2.14f, 5.26f)
                lineTo(1.17f, 4.29f)
                lineTo(2.59f, 2.87f)
                lineTo(3.73f, 4f)
                lineTo(20.59f, 20.87f)
                verticalLineTo(20.87f)
                moveTo(6.54f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(18f)
                curveTo(22f, 18.41f, 21.87f, 18.8f, 21.66f, 19.12f)
                lineTo(20f, 17.46f)
                verticalLineTo(6f)
                horizontalLineTo(8.54f)
                lineTo(6.54f, 4f)
                moveTo(4f, 18f)
                horizontalLineTo(14.88f)
                lineTo(11.88f, 15f)
                horizontalLineTo(10f)
                verticalLineTo(13.12f)
                lineTo(7.88f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(9.12f)
                lineTo(4f, 7.12f)
                verticalLineTo(18f)
                moveTo(18f, 15f)
                horizontalLineTo(17.54f)
                lineTo(15.54f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                moveTo(18f, 11f)
                horizontalLineTo(13.54f)
                lineTo(11.54f, 9f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _CardBulletedOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardBulletedOffOutline: ImageVector? = null
