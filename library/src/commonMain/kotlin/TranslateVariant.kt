package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TranslateVariant: ImageVector
    get() {
        if (_TranslateVariant != null) {
            return _TranslateVariant!!
        }
        _TranslateVariant = ImageVector.Builder(
            name = "TranslateVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 1f)
                horizontalLineTo(3f)
                curveTo(1.9f, 1f, 1f, 1.9f, 1f, 3f)
                verticalLineTo(15f)
                lineTo(4f, 12f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                curveTo(9f, 8.8f, 10.79f, 7f, 13f, 7f)
                verticalLineTo(3f)
                curveTo(13f, 1.9f, 12.1f, 1f, 11f, 1f)
                moveTo(11f, 4f)
                lineTo(9.5f, 4f)
                curveTo(9.16f, 5.19f, 8.54f, 6.3f, 7.68f, 7.26f)
                lineTo(7.66f, 7.28f)
                lineTo(8.92f, 8.53f)
                lineTo(8.55f, 9.54f)
                lineTo(7f, 8f)
                lineTo(4.5f, 10.5f)
                lineTo(3.81f, 9.77f)
                lineTo(6.34f, 7.28f)
                curveTo(5.72f, 6.59f, 5.22f, 5.82f, 4.86f, 5f)
                horizontalLineTo(5.85f)
                curveTo(6.16f, 5.6f, 6.54f, 6.17f, 7f, 6.68f)
                curveTo(7.72f, 5.88f, 8.24f, 4.97f, 8.57f, 4f)
                lineTo(3f, 4f)
                verticalLineTo(3f)
                horizontalLineTo(6.5f)
                verticalLineTo(2f)
                horizontalLineTo(7.5f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                moveTo(21f, 9f)
                horizontalLineTo(13f)
                curveTo(11.9f, 9f, 11f, 9.9f, 11f, 11f)
                verticalLineTo(18f)
                curveTo(11f, 19.1f, 11.9f, 20f, 13f, 20f)
                horizontalLineTo(20f)
                lineTo(23f, 23f)
                verticalLineTo(11f)
                curveTo(23f, 9.9f, 22.1f, 9f, 21f, 9f)
                moveTo(19.63f, 19f)
                lineTo(18.78f, 16.75f)
                horizontalLineTo(15.22f)
                lineTo(14.38f, 19f)
                horizontalLineTo(12.88f)
                lineTo(16.25f, 10f)
                horizontalLineTo(17.75f)
                lineTo(21.13f, 19f)
                horizontalLineTo(19.63f)
                moveTo(17f, 12f)
                lineTo(18.22f, 15.25f)
                horizontalLineTo(15.79f)
                lineTo(17f, 12f)
                close()
            }
        }.build()

        return _TranslateVariant!!
    }

@Suppress("ObjectPropertyName")
private var _TranslateVariant: ImageVector? = null
