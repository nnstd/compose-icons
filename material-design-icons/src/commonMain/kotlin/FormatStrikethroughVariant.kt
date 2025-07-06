package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatStrikethroughVariant: ImageVector
    get() {
        if (_FormatStrikethroughVariant != null) {
            return _FormatStrikethroughVariant!!
        }
        _FormatStrikethroughVariant = ImageVector.Builder(
            name = "FormatStrikethroughVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.2f, 9.8f)
                curveTo(6f, 7.5f, 7.7f, 4.8f, 10.1f, 4.3f)
                curveTo(13.2f, 3.3f, 17.7f, 4.7f, 17.6f, 8.5f)
                horizontalLineTo(14.6f)
                curveTo(14.6f, 8.2f, 14.5f, 7.9f, 14.5f, 7.7f)
                curveTo(14.3f, 7.1f, 13.9f, 6.8f, 13.3f, 6.6f)
                curveTo(12.5f, 6.3f, 11.2f, 6.4f, 10.5f, 6.9f)
                curveTo(9f, 8.2f, 10.4f, 9.5f, 12f, 10f)
                horizontalLineTo(7.4f)
                curveTo(7.3f, 9.9f, 7.3f, 9.8f, 7.2f, 9.8f)
                moveTo(21f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(12.6f)
                curveTo(12.8f, 13.1f, 13f, 13.1f, 13.2f, 13.2f)
                curveTo(13.8f, 13.5f, 14.3f, 13.7f, 14.5f, 14.3f)
                curveTo(14.6f, 14.7f, 14.7f, 15.2f, 14.5f, 15.6f)
                curveTo(14.3f, 16.1f, 13.9f, 16.3f, 13.4f, 16.5f)
                curveTo(11.6f, 17f, 9.4f, 16.3f, 9.5f, 14.1f)
                horizontalLineTo(6.5f)
                curveTo(6.4f, 16.7f, 8.6f, 18.5f, 11f, 18.8f)
                curveTo(14.8f, 19.6f, 19.3f, 17.2f, 17.3f, 12.9f)
                lineTo(21f, 13f)
                close()
            }
        }.build()

        return _FormatStrikethroughVariant!!
    }

@Suppress("ObjectPropertyName")
private var _FormatStrikethroughVariant: ImageVector? = null
