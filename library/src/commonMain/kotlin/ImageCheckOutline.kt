package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageCheckOutline: ImageVector
    get() {
        if (_ImageCheckOutline != null) {
            return _ImageCheckOutline!!
        }
        _ImageCheckOutline = ImageVector.Builder(
            name = "ImageCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.18f, 17f)
                curveTo(12.54f, 15.5f, 13.43f, 14.16f, 14.68f, 13.25f)
                lineTo(13.96f, 12.29f)
                lineTo(11.21f, 15.83f)
                lineTo(9.25f, 13.47f)
                lineTo(6.5f, 17f)
                horizontalLineTo(12.18f)
                moveTo(5f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(12.03f)
                curveTo(12.09f, 19.7f, 12.24f, 20.38f, 12.5f, 21f)
                horizontalLineTo(5f)
                curveTo(4.47f, 21f, 3.96f, 20.79f, 3.59f, 20.41f)
                curveTo(3.21f, 20.04f, 3f, 19.53f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(19.53f, 3f, 20.04f, 3.21f, 20.41f, 3.59f)
                curveTo(20.79f, 3.96f, 21f, 4.47f, 21f, 5f)
                verticalLineTo(12.5f)
                curveTo(20.38f, 12.24f, 19.7f, 12.09f, 19f, 12.03f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                moveTo(17.75f, 22f)
                lineTo(15f, 19f)
                lineTo(16.16f, 17.84f)
                lineTo(17.75f, 19.43f)
                lineTo(21.34f, 15.84f)
                lineTo(22.5f, 17.25f)
                lineTo(17.75f, 22f)
                close()
            }
        }.build()

        return _ImageCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ImageCheckOutline: ImageVector? = null
