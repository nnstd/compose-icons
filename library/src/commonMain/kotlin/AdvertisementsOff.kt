package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AdvertisementsOff: ImageVector
    get() {
        if (_AdvertisementsOff != null) {
            return _AdvertisementsOff!!
        }
        _AdvertisementsOff = ImageVector.Builder(
            name = "AdvertisementsOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.2f, 9f)
                lineTo(10.2f, 7f)
                horizontalLineTo(13f)
                curveTo(14.1f, 7f, 15f, 7.9f, 15f, 9f)
                verticalLineTo(11.8f)
                lineTo(13f, 9.8f)
                verticalLineTo(9f)
                horizontalLineTo(12.2f)
                moveTo(23f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                curveTo(17.9f, 7f, 17f, 7.9f, 17f, 9f)
                verticalLineTo(11f)
                curveTo(17f, 12.1f, 17.9f, 13f, 19f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(18.2f)
                lineTo(20.2f, 17f)
                horizontalLineTo(21f)
                curveTo(22.1f, 17f, 23f, 16.1f, 23f, 15f)
                verticalLineTo(13f)
                curveTo(23f, 11.9f, 22.1f, 11f, 21f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(23f)
                moveTo(22.1f, 21.5f)
                lineTo(20.8f, 22.8f)
                lineTo(14.4f, 16.4f)
                curveTo(14.1f, 16.7f, 13.6f, 17f, 13f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(10.9f)
                lineTo(7f, 8.9f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(1f)
                verticalLineTo(9f)
                curveTo(1f, 7.9f, 1.9f, 7f, 3f, 7f)
                horizontalLineTo(5.1f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.5f)
                moveTo(5f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                moveTo(13f, 14.9f)
                lineTo(11f, 12.9f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(14.9f)
                close()
            }
        }.build()

        return _AdvertisementsOff!!
    }

@Suppress("ObjectPropertyName")
private var _AdvertisementsOff: ImageVector? = null
