package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyedropperVariant: ImageVector
    get() {
        if (_EyedropperVariant != null) {
            return _EyedropperVariant!!
        }
        _EyedropperVariant = ImageVector.Builder(
            name = "EyedropperVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.92f, 19f)
                lineTo(5f, 17.08f)
                lineTo(13.06f, 9f)
                lineTo(15f, 10.94f)
                moveTo(20.71f, 5.63f)
                lineTo(18.37f, 3.29f)
                curveTo(18f, 2.9f, 17.35f, 2.9f, 16.96f, 3.29f)
                lineTo(13.84f, 6.41f)
                lineTo(11.91f, 4.5f)
                lineTo(10.5f, 5.91f)
                lineTo(11.92f, 7.33f)
                lineTo(3f, 16.25f)
                verticalLineTo(21f)
                horizontalLineTo(7.75f)
                lineTo(16.67f, 12.08f)
                lineTo(18.09f, 13.5f)
                lineTo(19.5f, 12.09f)
                lineTo(17.58f, 10.17f)
                lineTo(20.7f, 7.05f)
                curveTo(21.1f, 6.65f, 21.1f, 6f, 20.71f, 5.63f)
                close()
            }
        }.build()

        return _EyedropperVariant!!
    }

@Suppress("ObjectPropertyName")
private var _EyedropperVariant: ImageVector? = null
