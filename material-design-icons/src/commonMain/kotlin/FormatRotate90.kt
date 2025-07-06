package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatRotate90: ImageVector
    get() {
        if (_FormatRotate90 != null) {
            return _FormatRotate90!!
        }
        _FormatRotate90 = ImageVector.Builder(
            name = "FormatRotate90",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.34f, 6.41f)
                lineTo(0.86f, 12.9f)
                lineTo(7.35f, 19.38f)
                lineTo(13.84f, 12.9f)
                lineTo(7.34f, 6.41f)
                moveTo(3.69f, 12.9f)
                lineTo(7.35f, 9.24f)
                lineTo(11f, 12.9f)
                lineTo(7.34f, 16.56f)
                lineTo(3.69f, 12.9f)
                moveTo(19.36f, 6.64f)
                curveTo(17.61f, 4.88f, 15.3f, 4f, 13f, 4f)
                verticalLineTo(0.76f)
                lineTo(8.76f, 5f)
                lineTo(13f, 9.24f)
                verticalLineTo(6f)
                curveTo(14.79f, 6f, 16.58f, 6.68f, 17.95f, 8.05f)
                curveTo(20.68f, 10.78f, 20.68f, 15.22f, 17.95f, 17.95f)
                curveTo(16.58f, 19.32f, 14.79f, 20f, 13f, 20f)
                curveTo(12.03f, 20f, 11.06f, 19.79f, 10.16f, 19.39f)
                lineTo(8.67f, 20.88f)
                curveTo(10f, 21.62f, 11.5f, 22f, 13f, 22f)
                curveTo(15.3f, 22f, 17.61f, 21.12f, 19.36f, 19.36f)
                curveTo(22.88f, 15.85f, 22.88f, 10.15f, 19.36f, 6.64f)
                close()
            }
        }.build()

        return _FormatRotate90!!
    }

@Suppress("ObjectPropertyName")
private var _FormatRotate90: ImageVector? = null
