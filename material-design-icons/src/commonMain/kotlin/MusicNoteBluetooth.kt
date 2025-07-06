package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicNoteBluetooth: ImageVector
    get() {
        if (_MusicNoteBluetooth != null) {
            return _MusicNoteBluetooth!!
        }
        _MusicNoteBluetooth = ImageVector.Builder(
            name = "MusicNoteBluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9.85f)
                lineTo(19.14f, 7f)
                horizontalLineTo(18.64f)
                verticalLineTo(10.79f)
                lineTo(16.35f, 8.5f)
                lineTo(15.64f, 9.21f)
                lineTo(18.43f, 12f)
                lineTo(15.64f, 14.79f)
                lineTo(16.35f, 15.5f)
                lineTo(18.64f, 13.21f)
                verticalLineTo(17f)
                horizontalLineTo(19.14f)
                lineTo(22f, 14.15f)
                lineTo(19.85f, 12f)
                lineTo(22f, 9.85f)
                moveTo(19.64f, 8.91f)
                lineTo(20.58f, 9.85f)
                lineTo(19.64f, 10.79f)
                verticalLineTo(8.91f)
                moveTo(20.58f, 14.15f)
                lineTo(19.64f, 15.09f)
                verticalLineTo(13.21f)
                lineTo(20.58f, 14.15f)
                moveTo(9.64f, 3f)
                verticalLineTo(13.55f)
                curveTo(9.05f, 13.21f, 8.37f, 13f, 7.64f, 13f)
                curveTo(5.43f, 13f, 3.64f, 14.79f, 3.64f, 17f)
                reflectiveCurveTo(5.43f, 21f, 7.64f, 21f)
                reflectiveCurveTo(11.64f, 19.21f, 11.64f, 17f)
                verticalLineTo(7f)
                horizontalLineTo(15.64f)
                verticalLineTo(3f)
                horizontalLineTo(9.64f)
                close()
            }
        }.build()

        return _MusicNoteBluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteBluetooth: ImageVector? = null
