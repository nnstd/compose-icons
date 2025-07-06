package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardBulletedSettingsOutline: ImageVector
    get() {
        if (_CardBulletedSettingsOutline != null) {
            return _CardBulletedSettingsOutline!!
        }
        _CardBulletedSettingsOutline = ImageVector.Builder(
            name = "CardBulletedSettingsOutline",
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

        return _CardBulletedSettingsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardBulletedSettingsOutline: ImageVector? = null
