package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileCheckOutline: ImageVector
    get() {
        if (_FileCheckOutline != null) {
            return _FileCheckOutline!!
        }
        _FileCheckOutline = ImageVector.Builder(
            name = "FileCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 17f)
                lineTo(18.5f, 22f)
                lineTo(15f, 18.5f)
                lineTo(16.5f, 17f)
                lineTo(18.5f, 19f)
                lineTo(22f, 15.5f)
                lineTo(23.5f, 17f)
                moveTo(13.09f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(13.09f)
                curveTo(18.33f, 13.04f, 18.66f, 13f, 19f, 13f)
                reflectiveCurveTo(19.67f, 13.04f, 20f, 13.09f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(13.81f)
                curveTo(13.46f, 21.39f, 13.21f, 20.72f, 13.09f, 20f)
                close()
            }
        }.build()

        return _FileCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileCheckOutline: ImageVector? = null
