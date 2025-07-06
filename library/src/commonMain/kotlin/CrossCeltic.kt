package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CrossCeltic: ImageVector
    get() {
        if (_CrossCeltic != null) {
            return _CrossCeltic!!
        }
        _CrossCeltic = ImageVector.Builder(
            name = "CrossCeltic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.8f, 8f)
                curveTo(17.26f, 5.89f, 15.61f, 4.24f, 13.5f, 3.7f)
                verticalLineTo(2f)
                horizontalLineTo(10.5f)
                verticalLineTo(3.7f)
                curveTo(8.39f, 4.24f, 6.74f, 5.89f, 6.2f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(6.2f)
                curveTo(6.74f, 13.11f, 8.39f, 14.76f, 10.5f, 15.3f)
                verticalLineTo(22f)
                horizontalLineTo(13.5f)
                verticalLineTo(15.3f)
                curveTo(15.61f, 14.76f, 17.26f, 13.11f, 17.8f, 11f)
                horizontalLineTo(19.97f)
                verticalLineTo(8f)
                horizontalLineTo(17.8f)
                moveTo(12.04f, 9.53f)
                lineTo(14.5f, 11f)
                horizontalLineTo(15.76f)
                curveTo(15.35f, 12.03f, 14.53f, 12.84f, 13.5f, 13.26f)
                verticalLineTo(12f)
                lineTo(12.06f, 9.56f)
                lineTo(12f, 9.5f)
                lineTo(11.94f, 9.56f)
                lineTo(10.5f, 12f)
                verticalLineTo(13.26f)
                curveTo(9.47f, 12.84f, 8.66f, 12.03f, 8.24f, 11f)
                horizontalLineTo(9.5f)
                lineTo(11.96f, 9.53f)
                lineTo(12f, 9.5f)
                horizontalLineTo(11.96f)
                lineTo(9.5f, 8f)
                horizontalLineTo(8.24f)
                curveTo(8.65f, 6.97f, 9.47f, 6.16f, 10.5f, 5.74f)
                verticalLineTo(7f)
                lineTo(11.94f, 9.44f)
                lineTo(12f, 9.5f)
                lineTo(12.06f, 9.44f)
                lineTo(13.5f, 7f)
                verticalLineTo(5.74f)
                curveTo(14.53f, 6.16f, 15.35f, 6.97f, 15.76f, 8f)
                horizontalLineTo(14.5f)
                lineTo(12.04f, 9.5f)
                horizontalLineTo(12f)
                lineTo(12.04f, 9.53f)
                close()
            }
        }.build()

        return _CrossCeltic!!
    }

@Suppress("ObjectPropertyName")
private var _CrossCeltic: ImageVector? = null
