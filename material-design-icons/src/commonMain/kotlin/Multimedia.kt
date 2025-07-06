package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Multimedia: ImageVector
    get() {
        if (_Multimedia != null) {
            return _Multimedia!!
        }
        _Multimedia = ImageVector.Builder(
            name = "Multimedia",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 13f)
                verticalLineTo(5f)
                curveTo(9f, 3.9f, 9.9f, 3f, 11f, 3f)
                horizontalLineTo(20f)
                curveTo(21.1f, 3f, 22f, 3.9f, 22f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(18.57f)
                lineTo(17.29f, 9.26f)
                curveTo(17.23f, 9.17f, 17.11f, 9.17f, 17.05f, 9.26f)
                lineTo(15.06f, 12f)
                curveTo(15f, 12.06f, 14.88f, 12.07f, 14.82f, 12f)
                lineTo(13.39f, 10.25f)
                curveTo(13.33f, 10.18f, 13.22f, 10.18f, 13.16f, 10.25f)
                lineTo(11.05f, 12.91f)
                curveTo(10.97f, 13f, 11.04f, 13.15f, 11.16f, 13.15f)
                horizontalLineTo(17.5f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                curveTo(9.89f, 15f, 9f, 14.11f, 9f, 13f)
                moveTo(6f, 22f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                horizontalLineTo(8.39f)
                curveTo(7.54f, 2.74f, 7f, 3.8f, 7f, 5f)
                verticalLineTo(13f)
                curveTo(7f, 15.21f, 8.79f, 17f, 11f, 17f)
                horizontalLineTo(15.7f)
                curveTo(14.67f, 17.83f, 14f, 19.08f, 14f, 20.5f)
                curveTo(14f, 21.03f, 14.11f, 21.53f, 14.28f, 22f)
                horizontalLineTo(6f)
                moveTo(4f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                moveTo(4f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                moveTo(4f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                moveTo(6f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                moveTo(23f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(20.5f)
                curveTo(21f, 21.88f, 19.88f, 23f, 18.5f, 23f)
                reflectiveCurveTo(16f, 21.88f, 16f, 20.5f)
                reflectiveCurveTo(17.12f, 18f, 18.5f, 18f)
                curveTo(18.86f, 18f, 19.19f, 18.07f, 19.5f, 18.21f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                close()
            }
        }.build()

        return _Multimedia!!
    }

@Suppress("ObjectPropertyName")
private var _Multimedia: ImageVector? = null
