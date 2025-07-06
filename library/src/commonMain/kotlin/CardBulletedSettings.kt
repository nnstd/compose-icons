package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardBulletedSettings: ImageVector
    get() {
        if (_CardBulletedSettings != null) {
            return _CardBulletedSettings!!
        }
        _CardBulletedSettings = ImageVector.Builder(
            name = "CardBulletedSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 22f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                moveTo(13f, 22f)
                verticalLineTo(24f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                moveTo(17f, 22f)
                verticalLineTo(24f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                moveTo(20f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                moveTo(11f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                moveTo(19f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                moveTo(7f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                moveTo(19f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _CardBulletedSettings!!
    }

@Suppress("ObjectPropertyName")
private var _CardBulletedSettings: ImageVector? = null
