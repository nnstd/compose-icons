package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileImageMinusOutline: ImageVector
    get() {
        if (_FileImageMinusOutline != null) {
            return _FileImageMinusOutline!!
        }
        _FileImageMinusOutline = ImageVector.Builder(
            name = "FileImageMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 19f)
                lineTo(12f, 14f)
                lineTo(13.88f, 15.88f)
                curveTo(13.33f, 16.79f, 13f, 17.86f, 13f, 19f)
                horizontalLineTo(7f)
                moveTo(10f, 10.5f)
                curveTo(10f, 9.67f, 9.33f, 9f, 8.5f, 9f)
                reflectiveCurveTo(7f, 9.67f, 7f, 10.5f)
                reflectiveCurveTo(7.67f, 12f, 8.5f, 12f)
                reflectiveCurveTo(10f, 11.33f, 10f, 10.5f)
                moveTo(13.09f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(13.09f)
                curveTo(18.33f, 13.04f, 18.66f, 13f, 19f, 13f)
                curveTo(19.34f, 13f, 19.67f, 13.04f, 20f, 13.09f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(13.81f)
                curveTo(13.46f, 21.39f, 13.21f, 20.72f, 13.09f, 20f)
                moveTo(15f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _FileImageMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileImageMinusOutline: ImageVector? = null
