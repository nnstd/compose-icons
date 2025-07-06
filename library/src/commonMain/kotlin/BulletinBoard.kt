package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BulletinBoard: ImageVector
    get() {
        if (_BulletinBoard != null) {
            return _BulletinBoard!!
        }
        _BulletinBoard = ImageVector.Builder(
            name = "BulletinBoard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.04f, 2.5f)
                lineTo(9.53f, 5f)
                horizontalLineTo(14.53f)
                lineTo(12.04f, 2.5f)
                moveTo(4f, 7f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                moveTo(12f, 0f)
                lineTo(17f, 5f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 7f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                lineTo(12f, 0f)
                moveTo(7f, 18f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                moveTo(14f, 17f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                moveTo(6f, 12f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _BulletinBoard!!
    }

@Suppress("ObjectPropertyName")
private var _BulletinBoard: ImageVector? = null
