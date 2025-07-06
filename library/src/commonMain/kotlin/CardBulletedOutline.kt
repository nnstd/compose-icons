package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardBulletedOutline: ImageVector
    get() {
        if (_CardBulletedOutline != null) {
            return _CardBulletedOutline!!
        }
        _CardBulletedOutline = ImageVector.Builder(
            name = "CardBulletedOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                moveTo(18f, 15f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                moveTo(8f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                moveTo(18f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                moveTo(20f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                moveTo(4f, 6f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _CardBulletedOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardBulletedOutline: ImageVector? = null
