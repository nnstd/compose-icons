package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PailOutline: ImageVector
    get() {
        if (_PailOutline != null) {
            return _PailOutline!!
        }
        _PailOutline = ImageVector.Builder(
            name = "PailOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 7.63f)
                curveTo(11.97f, 7.35f, 12.58f, 7.5f, 12.86f, 8f)
                curveTo(13.14f, 8.47f, 12.97f, 9.09f, 12.5f, 9.36f)
                lineTo(4.27f, 14.11f)
                curveTo(3.79f, 14.39f, 3.18f, 14.23f, 2.9f, 13.75f)
                reflectiveCurveTo(2.79f, 12.66f, 3.27f, 12.38f)
                lineTo(11.5f, 7.63f)
                moveTo(3f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                lineTo(4.65f, 9.27f)
                lineTo(6.5f, 8.22f)
                lineTo(6.04f, 6f)
                horizontalLineTo(17.96f)
                lineTo(15.36f, 19f)
                horizontalLineTo(8.64f)
                lineTo(7.73f, 14.43f)
                lineTo(5.9f, 15.5f)
                lineTo(7f, 21f)
                horizontalLineTo(17f)
                lineTo(20f, 6f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _PailOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PailOutline: ImageVector? = null
