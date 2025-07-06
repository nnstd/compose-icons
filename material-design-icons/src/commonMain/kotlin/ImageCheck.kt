package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageCheck: ImageVector
    get() {
        if (_ImageCheck != null) {
            return _ImageCheck!!
        }
        _ImageCheck = ImageVector.Builder(
            name = "ImageCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 21f)
                curveTo(12.18f, 20.23f, 12f, 19.39f, 12f, 18.5f)
                curveTo(12f, 18.33f, 12f, 18.17f, 12.03f, 18f)
                horizontalLineTo(5f)
                lineTo(8.5f, 13.5f)
                lineTo(11f, 16.5f)
                lineTo(14.5f, 12f)
                lineTo(15.19f, 12.92f)
                curveTo(16.16f, 12.34f, 17.29f, 12f, 18.5f, 12f)
                curveTo(19.39f, 12f, 20.23f, 12.18f, 21f, 12.5f)
                verticalLineTo(5f)
                curveTo(21f, 4.47f, 20.79f, 3.96f, 20.41f, 3.59f)
                curveTo(20.04f, 3.21f, 19.53f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 19.53f, 3.21f, 20.04f, 3.59f, 20.41f)
                curveTo(3.96f, 20.79f, 4.47f, 21f, 5f, 21f)
                horizontalLineTo(12.5f)
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

        return _ImageCheck!!
    }

@Suppress("ObjectPropertyName")
private var _ImageCheck: ImageVector? = null
