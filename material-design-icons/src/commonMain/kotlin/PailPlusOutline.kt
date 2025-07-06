package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PailPlusOutline: ImageVector
    get() {
        if (_PailPlusOutline != null) {
            return _PailPlusOutline!!
        }
        _PailPlusOutline = ImageVector.Builder(
            name = "PailPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                lineTo(18.6f, 13f)
                curveTo(17.83f, 13.07f, 17.11f, 13.26f, 16.45f, 13.58f)
                lineTo(17.96f, 6f)
                horizontalLineTo(6.04f)
                lineTo(6.5f, 8.22f)
                lineTo(4.65f, 9.27f)
                lineTo(4f, 6f)
                moveTo(12.86f, 8f)
                curveTo(12.58f, 7.5f, 11.97f, 7.35f, 11.5f, 7.63f)
                lineTo(3.27f, 12.38f)
                curveTo(2.79f, 12.66f, 2.62f, 13.27f, 2.9f, 13.75f)
                curveTo(3.18f, 14.23f, 3.79f, 14.39f, 4.27f, 14.11f)
                lineTo(12.5f, 9.36f)
                curveTo(12.97f, 9.09f, 13.14f, 8.47f, 12.86f, 8f)
                moveTo(13f, 19f)
                horizontalLineTo(8.64f)
                lineTo(7.73f, 14.43f)
                lineTo(5.9f, 15.5f)
                lineTo(7f, 21f)
                horizontalLineTo(13.35f)
                curveTo(13.13f, 20.37f, 13f, 19.7f, 13f, 19f)
                moveTo(18f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _PailPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PailPlusOutline: ImageVector? = null
