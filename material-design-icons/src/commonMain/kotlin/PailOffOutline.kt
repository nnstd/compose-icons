package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PailOffOutline: ImageVector
    get() {
        if (_PailOffOutline != null) {
            return _PailOffOutline!!
        }
        _PailOffOutline = ImageVector.Builder(
            name = "PailOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(17.35f, 19.24f)
                lineTo(17f, 21f)
                horizontalLineTo(7f)
                lineTo(5.9f, 15.5f)
                lineTo(7.73f, 14.43f)
                lineTo(8.64f, 19f)
                horizontalLineTo(15.36f)
                lineTo(15.65f, 17.54f)
                lineTo(9.31f, 11.2f)
                lineTo(4.27f, 14.11f)
                curveTo(3.79f, 14.39f, 3.18f, 14.23f, 2.9f, 13.75f)
                curveTo(2.62f, 13.27f, 2.79f, 12.66f, 3.27f, 12.38f)
                lineTo(7.85f, 9.74f)
                lineTo(6.38f, 8.27f)
                lineTo(4.65f, 9.27f)
                lineTo(4f, 6f)
                horizontalLineTo(3f)
                verticalLineTo(4.89f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(17.96f, 6f)
                lineTo(16.5f, 13.3f)
                lineTo(18.2f, 15f)
                lineTo(20f, 6f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                horizontalLineTo(7.2f)
                lineTo(9.2f, 6f)
                horizontalLineTo(17.96f)
                moveTo(11.5f, 7.63f)
                lineTo(11.08f, 7.88f)
                lineTo(12.53f, 9.33f)
                curveTo(12.97f, 9.05f, 13.13f, 8.46f, 12.86f, 8f)
                curveTo(12.58f, 7.5f, 11.97f, 7.35f, 11.5f, 7.63f)
                close()
            }
        }.build()

        return _PailOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PailOffOutline: ImageVector? = null
