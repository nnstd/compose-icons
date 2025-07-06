package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookMusicOutline: ImageVector
    get() {
        if (_BookMusicOutline != null) {
            return _BookMusicOutline!!
        }
        _BookMusicOutline = ImageVector.Builder(
            name = "BookMusicOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 20.5f)
                curveTo(13f, 21.03f, 13.09f, 21.53f, 13.26f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.11f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.89f, 2f, 6f, 2f)
                horizontalLineTo(18f)
                curveTo(19.11f, 2f, 20f, 2.9f, 20f, 4f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                lineTo(10.5f, 9.75f)
                lineTo(8f, 12f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(13.04f)
                curveTo(13.03f, 20.17f, 13f, 20.33f, 13f, 20.5f)
                moveTo(20f, 13f)
                horizontalLineTo(18.5f)
                verticalLineTo(18.21f)
                curveTo(18.19f, 18.07f, 17.86f, 18f, 17.5f, 18f)
                curveTo(16.12f, 18f, 15f, 19.12f, 15f, 20.5f)
                reflectiveCurveTo(16.12f, 23f, 17.5f, 23f)
                reflectiveCurveTo(20f, 21.88f, 20f, 20.5f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _BookMusicOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookMusicOutline: ImageVector? = null
